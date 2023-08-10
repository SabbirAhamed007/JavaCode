package com.company;

public class Warfarin {

    String name;
    float mg;
    String type;

    public Warfarin(String name, float mg, String type){


        this.name = name;

        this.mg = mg;

        this.type = type;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setMg(float mg){

        this.mg = mg;
    }

    public void setType(String type){

        this.type = type;
    }

    public String getName(){

        return name;
    }

    public float getMg(){

        return mg;
    }

    public String getType(){

        return type;
    }

    @Override

    public String toString(){

        return ("Drug name is: " + name +", Drug strength is: "+", Drug type is: " + type+ ".");


    }

    public static void main(String[] args){


        Warfarin warfarin = new Warfarin("Warfarin", 2.5F, "Tablet");

        System.out.println(warfarin.name);
        System.out.println(warfarin.mg);
        System.out.println(warfarin.type);


    }
}
