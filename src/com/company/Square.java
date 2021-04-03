package com.company;

public class Square extends Figures implements Printable{
    private int side;

    public Square(Names name,int counOfSides, int side){
        super(name, counOfSides);
        this.side = side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public int getSide(){
        return side;
    }

    public int perimetr(){
        return side*4;
    }

    public void print() {
        System.out.println("⬜" + " " + getName() + "\n Стороны: "  + getSide() + " Count of sides: " + getCountOfSides() + " Perimeter: " + perimetr());
    }

}
