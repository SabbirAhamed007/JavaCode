package com.company;

public class MMA {

    String name;
    int age;
    float weight;
    String category;


    public MMA(String name, int age, float weight, String category){

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.category = category;


    }

    public void setName(String name){


        this.name = name;

    }

    public void setAge(int age){

        this.age = age;
    }

    public void setWeight(float weight){

        this.weight = weight;

    }

    public void setCategory(String category){

        this.category = category;
    }

    public String getName(){

        return name;

    }

    public int getAge(){

        return age;
    }

    public float getWeight(){

        return weight;
    }

    public String getCategory(){

        return category;
    }


    @Override
    public String toString(){

        return ("MMA fighter name is " + this.getName()+ ", MMA fighter's age is "+getAge()+ ", MMA fighter's weight is "+getWeight()+ ", MMA fighter's category is "+ getCategory());
    }

    public static void main(String[] args){
        MMA Khabib = new MMA("Khabib", 28,187.5F,"Light weight");
        System.out.println(Khabib.toString());

    }


}
