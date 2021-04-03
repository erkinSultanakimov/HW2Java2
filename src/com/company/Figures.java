package com.company;

public class Figures {
    private Names name;
    private int countOfSides;


    public Figures(Names name, int countOfSides) {
        this.name = name;
        this.countOfSides = countOfSides;

    }

    public void setName(Names name) {
        this.name = name;
    }

    public void setCountOfSides(int countOfSides) {
        this.countOfSides = countOfSides;
    }

    public Names getName() {
        return name;
    }

    public int getCountOfSides() {
        return countOfSides;
    }
}
