package org.example;
public class Salary extends Employee{
    public double salary; // if this is the annual salary //
    public Salary(String name, String address, int phoneNumber,double salary) {
        super(name, address, phoneNumber);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Within mailCheck of Salary Class");
        System.out.println("Mailing check to " + getName() + "With Salary " + salary);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newsalary){
        if(newsalary >= 0.0){
            salary = newsalary;
        }
    }
    public double computePay(){
        System.out.println("Computing salary pay for " + getName());
        return salary/12;
    }

}
