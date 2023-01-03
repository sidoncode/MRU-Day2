package org.example.Encapsulation;


class Student1{

    private String college = "MRU";

    public String getCollege(){
        return college;
    }
}

public class Readonly {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.getCollege();


        // the below code will be throwing a compilation time error
        //student1.setcollege("KIIT");
    }
}
