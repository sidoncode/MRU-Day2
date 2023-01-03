package org.example;

public class Poly {

    public static void main(String[] args) {
        Salary salary = new Salary("Mr.X","India",33333,1200);
        Employee employee = new Salary("Mr.ABC","Canada",12345,90011);

        System.out.println("\n Call Mailcheck using salary reference ---- \n");

        salary.mailCheck();
        System.out.println("\nCall mailcheck function using Employee class Reference ---- \n");

        employee.mailCheck();
    }


}
