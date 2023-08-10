package com.company;

public class AC {

    protected String name;
    protected int year;
    protected int temp;

    public AC(String acName, int modelYear, int upTemp){
        name = acName;
        year = modelYear;
        temp = upTemp;


    }

    public void setName(String newName){

        name = newName;
    }

    public void setYear(int newYear){
        year = newYear;
    }

    public void setCold(int drecrement){

        temp -= drecrement;

    }

    public void setHot(int increment){

        temp += increment;
    }




}
