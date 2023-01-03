package org.example.Encapsulation.SOLID.LiskovSubs;
class Student{
    private double height;
    private double weight;

    public void setHeight(double h) {
        this.height = h;
    }
    public void setWeight(double w) {
        this.weight = w;
    }
}

public class LiskovsSubstitute extends Student{

    public void setHeight(double h){
        super.setHeight(h);
    }
    public void setWeight(double w){
        super.setHeight(w);
    }

}
