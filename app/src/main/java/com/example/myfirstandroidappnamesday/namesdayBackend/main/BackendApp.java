package com.example.myfirstandroidappnamesday.namesdayBackend.main;

import com.example.myfirstandroidappnamesday.namesdayBackend.xmlElements.Day;
import com.example.myfirstandroidappnamesday.namesdayBackend.xmlElements.Namesday;
import com.example.myfirstandroidappnamesday.namesdayBackend.xmlManipulation.ReadXml;

import java.util.ArrayList;

public class BackendApp {

    private static final String FILE_NAME_FOR_NAMESDAY_FINAL_XML = "app/res/files/namesday_final.xml";

    public Day retunrDay(){
        ReadXml<Namesday> readXml = new ReadXml<>(Namesday.class);
        Namesday namesday = readXml.readXmlFile(FILE_NAME_FOR_NAMESDAY_FINAL_XML);
        System.out.println("precitany subor: " + namesday);
//        Day foundDay = namesday.getListOfDays().stream().filter(day -> day.getDate().equals("0607")).findAny().orElse(null);
        Day foundDay = null;
        ArrayList<Day> listOfDays = namesday.getListOfDays();
        for (int i = 0; i < listOfDays.size(); i++){
            if(listOfDays.get(i).getDate().equals("0501")){
                foundDay = listOfDays.get(i);
            }
        }
        System.out.println("najdeny den: " + foundDay);
        return foundDay;
    }
}
