package com.company;

public class Circle extends Figures implements Printable{
    private int radius;
    private double pi = Math.PI;

    public Circle(Names name, int counOfSides, int radius, double pi) {
        super(name,counOfSides);
        this.radius = radius;
        this.pi = pi;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setPi(double pi){
        this.pi = pi;
    }

    public int getRadius(){
        return radius;
    }

    public double getPi(){
        return pi;
    }

    public void print() {
        System.out.println("⬜" + " " + getName() + "Сторона А: " + " " + getRadius() + getCountOfSides());
    }


}
