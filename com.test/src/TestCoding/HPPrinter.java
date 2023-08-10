package TestCoding;

public class HPPrinter {

    String name;
    int year;
    String model;


    public HPPrinter(String name, int year, String model){

        this.name = name;
        this.year = year;
        this.model = model;

    }

    public void setName(String name){


        this.name = name;
    }

    public void setYear(int year){

        this.year = year;
    }

    public void setModel(String model){

        this.model = model;
    }

    public String getName(){

        return name;
    }

    public int getYear(){

        return year;
    }

    public String getModel(){

        return model;
    }


    @Override

    public String toString(){

        return ("PLease enter printer name: "+ name+", Please enter year: " + year+", Please enter model number: "+ model +".");
    }

    public static void main(String[] args){


        HPPrinter hpPrinter = new HPPrinter("HP Jet 750s", 2023, "MN- 750");

        System.out.println(hpPrinter.name);
        System.out.println(hpPrinter.year);
        System.out.println(hpPrinter.model);
    }
}


