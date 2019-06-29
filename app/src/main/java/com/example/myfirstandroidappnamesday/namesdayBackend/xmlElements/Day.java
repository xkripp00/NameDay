package com.example.myfirstandroidappnamesday.namesdayBackend.xmlElements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "day")
@XmlType(propOrder = {"date", "sk", "cz", "skHoliday", "czHoliday"})
public class Day {

    private String date;
    private String skHoliday;
    private String czHoliday;
    private String sk;
    private String cz;

    @XmlAttribute(name = "date")
    public String getDate() {
        return date;
    }

    public Day setDate(String date) {
        this.date = date;
        return this;
    }

    @XmlElement(name = "skHoliday")
    public String getSkHoliday() {
        return skHoliday;
    }

    public Day setSkHoliday(String skHoliday) {
        this.skHoliday = skHoliday;
        return this;
    }

    @XmlElement(name = "czHoliday")
    public String getCzHoliday() {
        return czHoliday;
    }

    public Day setCzHoliday(String czHoliday) {
        this.czHoliday = czHoliday;
        return this;
    }

    @XmlElement(name = "sk")
    public String getSk() {
        return sk;
    }

    public Day setSk(String sk) {
        this.sk = sk;
        return this;
    }

    @XmlElement(name = "cz")
    public String getCz() {
        return cz;
    }

    public Day setCz(String cz) {
        this.cz = cz;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (sk != null)
            sb.append("SK: ").append(sk).append("\n");
        if (cz != null)
            sb.append("CZ: ").append(cz).append("\n");
        if (skHoliday != null)
            sb.append(skHoliday).append("\n");
        if (czHoliday != null)
            sb.append(czHoliday).append("\n");
        return sb.toString();
    }
}
