package com.company;

public class Rectangle extends Figures implements Printable {
    private int sideA;
    private int sideB;

    public Rectangle(Names name, int counOfSides, int sideA, int sideB) {
        super(name, counOfSides);
        this.sideA = sideA;
        this.sideB = sideB;

    }


    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }


    public void print() {
        System.out.println("♻" + " " + getName() + "Сторона А: " + getSideA() + " " + getSideB() + getCountOfSides());
    }
}
