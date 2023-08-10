package com.company;

import java.io.*;

public class CSVFileRead {

    public static void main(String[] args){

        String file = "C:\\Users\\ubox0\\ttt.csv";


        BufferedReader reader = null;
        String line = "";

        try{

            reader = new BufferedReader(new FileReader(file));

            while((line = reader.readLine()) != null){

                String[] row = line.split(",");

                for(String index : row){

                    System.out.printf("%-10s", index);
                }

                System.out.println();



            }


        }
        catch(Exception e){

            e.printStackTrace();



        }
        finally{

            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }
}
