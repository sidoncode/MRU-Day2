package org.example.Polymorphism;
public class Poly2 {
    static void add(int x, int y){
        System.out.println( x + y);
    }
    static void add(double a,double b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        System.out.println("The below function will be called when the ints are passed as a parameter");
        add(1,2);

        System.out.println("\n");
        System.out.println("The below function will be called when the Doubles are passed as a parameter");
        add(1.0,2.2);
    }
}