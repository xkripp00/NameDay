package com.example.myfirstandroidappnamesday.namesdayBackend.xmlManipulation;

import com.example.myfirstandroidappnamesday.namesdayBackend.xmlElements.Namesday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



public class ReadXml<T> {

    final Class<T> typeParameterClass;

    public ReadXml(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public T readXmlFile(String xmlFile) {

        JAXBContext jaxbContext = null;
        T xmlForReading = null;
        try {
            jaxbContext = JAXBContext.newInstance(typeParameterClass);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            xmlForReading = (T) unmarshaller.unmarshal(new InputStreamReader(
                    new FileInputStream(xmlFile), StandardCharsets.UTF_8));

        } catch (JAXBException e) {
            System.out.println("Some JAXB exception...");
            e.printStackTrace();
        } catch (FileNotFoundException e){
            System.out.println("File was not found.");
            e.printStackTrace();
        }
        return xmlForReading;
    }
}
