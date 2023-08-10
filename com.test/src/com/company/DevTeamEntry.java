package com.company;

public class DevTeamEntry {

    public static void main(String[] args){


        DevTeam Anand = new DevTeam("Anand Layer", "EN5341", 2015);

        System.out.println(Anand.getName());

        System.out.println(Anand.getEmpId());

        System.out.println(Anand.getJoinYear());
    }
}
