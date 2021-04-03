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

    public double perimetr(){
        return 2*pi*radius;
    }

    public void print() {
        System.out.println("⚫" + " " + getName() + "\nRadius: " + getRadius() + " Count of sides: " + getCountOfSides() + " Perimeter: " + perimetr());
    }


}
