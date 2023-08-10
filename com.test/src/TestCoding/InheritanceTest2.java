package TestCoding;

public class InheritanceTest2 extends InheritanceTest1{

    public InheritanceTest2(String name, int age) {
        super(name, age);



    }

    public static void main(String[] args){

        InheritanceTest1 qa = new InheritanceTest1("Sabbir", 42);

        System.out.println(qa.getName());

        System.out.println(qa.getAge());
    }




}
