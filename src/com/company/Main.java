package com.company;

public class Main {


    public static void main(String[] args) {
        createObject("Rectangle");

    }

    public static Figures createObject(String className) {


        String[] names= {"Circle", "Square", "Rectangle"};
        switch (names[0]) {
            case "Circle":
                Circle circle = new Circle(Names.CIRCLE, 1, 4, Math.PI);
                circle.print();
                return circle;
        }

        switch (names[1]) {
            case "Square":
                Square square1 = new Square(Names.SQUARE, 4, 60);
                square1.print();

        }

        switch (names[2]) {
            case "Rectangle":
                Rectangle rectangle = new Rectangle(Names.SQUARE, 4, 6, 6);
                rectangle.print();

        }

        return createObject("");
    }
}
