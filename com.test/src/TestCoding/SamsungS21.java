package TestCoding;

public class SamsungS21 {

    String name;
    String model;
    int year;

    public SamsungS21(String name, String model, int year){

        this.name = name;

        this.model = model;

        this.year = year;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setModel(String model){

        this.model = model;

    }

    public void setYear(int year){

        this.year = year;
    }

    public String getName(){

        return name;
    }

    public String getModel(){

        return model;
    }

    public int getYear(){

        return year;
    }

    @Override

    public String toString(){

        return ("Mobile name is: " + name +", Model is: "+ model + ", Year: " + year + ".");

    }

    public static void main(String[] args){

        SamsungS21 mobile = new SamsungS21("Samsung", "S22", 2022);

        System.out.println(mobile.name);
        System.out.println(mobile.model);
        System.out.println(mobile.year);

    }




}

