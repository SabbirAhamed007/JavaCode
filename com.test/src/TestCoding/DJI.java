package TestCoding;

import com.company.DIJMini3;

public class DJI {

    public static void main(String[] args){

        DIJMini3 pro = new DIJMini3("DJI Mini", "Pro", 2022);

        System.out.println(pro.getName());

        System.out.println(pro.getModel());

        System.out.println(pro.getYear());
    }
}
