package com.company;

public class QAAuto {

    String name;
    String idNumber;
    String team;
    int item;

    public QAAuto(String name, String idNumber, String team, int item){


        this.name = name;
        this.idNumber = idNumber;
        this.team = team;
        this.item = item;


    }

    public void setName(String name){

        this.name = name;
    }

    public void setIdNumber(String idNumber){

        this.idNumber = idNumber;
    }

    public void setTeam(String team){

        this.team = team;
    }

    public void setItem(int item){

        this.item = item;
    }

    public String getName(){

        return name;
    }

    public String getIdNumber(){

        return idNumber;
    }

    public String getTeam(){

        return team;
    }

    public int getItem(){

        return item;
    }


    @Override

    public String toString(){

        return ("Name: " + this.getName()+", ID NUmber: "+ this.getIdNumber()+", Team: "+ this.getTeam()+", Items: " + this.getItem() +".");


    }

    public static void main(String[] args){


        QAAuto sabbir = new QAAuto("Sabbir Ahamed", "EN5011", "Titan", 9);

        System.out.println(sabbir.name);
        System.out.println(sabbir.team);
        System.out.println(sabbir.idNumber);
        System.out.println(sabbir.item);

    }

}
