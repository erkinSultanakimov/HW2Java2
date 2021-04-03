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

    public int perimetr(){
        return (sideA + sideB)*2;
    }


    public void print() {
        System.out.println("♻" + " " + getName() + "\n Сторона А: " + getSideA() + " Cторона Б: " + getSideB() + " Count of sides: " +  getCountOfSides()
                + " Perimeter: " + perimetr() );
    }
}
