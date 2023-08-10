package com.company;

public class QATeam {

    String name;
    String team;
    int id;
    String address;


    public QATeam(String name, String team, int id, String address){

        this.name = name;
        this.team = team;
        this.id = id;
        this.address = address;

    }

    public void setName(String name){

        this.name = name;


    }

    public void setTeam(String team){
        this.team = team;
    }

    public void setId (int id){

        this.id = id;
    }

    public void setAddress(String address){

        this.address = address;
    }

    public String getName(){

        return name;
    }

    public String getTeam(){

        return name;
    }

    public int getId(){

        return id;
    }

    public String getAddress(){

        return address;
    }

    @Override
     public String toString(){

        return ("QA name is: "+ this.getName() +",QA team is: " + this.getTeam() + ", QA id is: "+ this.getId() + ", QA address is: "+ this.getAddress());
    }

    public static void main(String[] args){

        QATeam sabbir = new QATeam("Sabbir Ahamed", "Titan", 7383, "234 Hazard ave");

        System.out.println(sabbir.name);
        System.out.println(sabbir.team);
        System.out.println(sabbir.id);
        System.out.println(sabbir.address);



    }




}
