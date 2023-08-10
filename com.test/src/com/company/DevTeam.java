package com.company;

public class DevTeam {

    String name;
    String empId;
    int joinYear;

    public DevTeam(String name, String empId, int joinYear){

        this.name = name;

        this.empId = empId;

        this.joinYear = joinYear;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setEmpId(String empId){

        this.empId = empId;
    }

    public void setJoinYear(int joinYear){

        this.joinYear = joinYear;

    }

    public String getName(){

        return name;
    }

    public String getEmpId(){

        return empId;
    }

    public int getJoinYear(){

        return joinYear;
    }

    @Override

    public String toString(){

        return ("Name: " + this.getName() +", Employee ID: "+ this.getEmpId() +", Joining Year: "+ this.getJoinYear());
    }
}
