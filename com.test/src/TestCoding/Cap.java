package TestCoding;

public class Cap {

    String name;
    int size;

    public Cap(String name, int size){

        this.name = name;
        this.size = size;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setSize(int size){

        this.size = size;
    }

    public String getName(){

        return name;
    }

    public int getSize(){

        return size;
    }

    @Override

    public String toString(){


        return ("Cap's brand name: " + name +", Size is: "+ ".");
    }

    public static void main(String[] args){

        Cap input = new Cap("Under Amour", 14);

        System.out.println(input.name);
        System.out.println(input.size);

    }
}
