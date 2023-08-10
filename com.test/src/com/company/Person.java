package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Person {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ubox0\\ttt.csv"));

        ArrayList<Person> people = new ArrayList<>();
        String currentLine;
        while ((currentLine = br.readLine()) != null)
        {
            String[] detailed = currentLine.split(",");

            if (detailed[0] == "\"\"")
                continue;

            String industry_code_ANZSIC = detailed[1];
            String industry_name_ANZSIC = detailed[2];

            //people.add(new Person("industry_code_ANZSIC", "industry_name_ANZSIC"));


        }

    }
}
