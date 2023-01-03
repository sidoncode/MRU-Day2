package org.example.Encapsulation;

class Employee{
    private String companyName;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
public class WriteOnly {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setCompanyName("HP");
        //System.out.println(employee.getCompanyName());
    }

}
