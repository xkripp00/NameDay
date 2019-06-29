package com.example.myfirstandroidappnamesday.namesdayBackend.xmlElements;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "calendar")
@XmlAccessorType(XmlAccessType.FIELD)
public class Namesday {

    @XmlElementWrapper(name = "namesday")
    @XmlElement(name = "day")
    private ArrayList<Day> listOfdays;

    public ArrayList<Day> getListOfDays() {
        return listOfdays;
    }

    public Namesday setListOfdays(ArrayList<Day> listOfdays) {
        this.listOfdays = listOfdays;
        return this;
    }
}
