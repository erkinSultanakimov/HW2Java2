package com.company;

public class Main {


    public static void main(String[] args) {
        createObject("Rectangle");
        createObject("Square");
        createObject("Circle");



    }
    public static Figures createObject(String className) {
        switch (className) {
            case "Circle":
                Circle circle = new Circle(Names.CIRCLE, 1, 4, Math.PI);
                circle.print();
                return circle;
            case "Square":
                Square square1 = new Square(Names.SQUARE, 4, 60);
                square1.print();
                return square1;
            case "Rectangle":
                Rectangle rectangle = new Rectangle(Names.RECTANGLE, 4, 6, 6);
                rectangle.print();
                return rectangle;
            default:
                return null;
        }
    }







}
