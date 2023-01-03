package org.example;

public class Employee {
    // creating variables for the class  //
    private String name;
    private String address;
    private int phoneNumber;

    // creating the constructor for the class and constructor name and class name should be same //

    public Employee(String name,String address,int phoneNumber){
        System.out.println("Constructing An Employee");
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // creating some methods - for the class Employee //

    public void mailCheck(){
        System.out.println("Mailing a check to:" + this.name + " " + this.address);
    }

    public String toString(){
        return name + "" + address + phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String setAddress(String newAddress){
        return newAddress;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

}
