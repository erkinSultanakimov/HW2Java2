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


    public void print() {
        System.out.println("⬜" + " " + getName() + "Сторона А: " + " " + getSide() + getCountOfSides());
    }

}
