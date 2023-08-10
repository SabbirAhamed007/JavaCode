package com.company;

public class Lens {

    String name;
    int zoom;
    float weight;

    public Lens(String name, int zoom, float weight){

        this.name = name;
        this.zoom = zoom;
        this.weight = weight;

    }

    public void setName(String name){

        this.name= name;
    }

    public void setZoom(int zoom){

        this.zoom = zoom;
    }

    public void setWeight(float weight){

        this.weight = weight;
    }

    public String getName(){

        return name;
    }

    public int getZoom(){

        return zoom;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString(){

        return ("Name: " +this.getName() + "Zoom: " +this.getZoom() +"Weight: " + this.getWeight());
    }

    public static void main(String[] args){

        Lens nikon = new Lens("Nikon" , 70-200, 1.7F);

        System.out.println(nikon.name);
        System.out.println(nikon.zoom);
        System.out.println(nikon.weight);
    }
}
