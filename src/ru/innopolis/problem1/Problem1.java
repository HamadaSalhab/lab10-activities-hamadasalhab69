package com.src.ru.innopolis.problem1;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();

        return null;
    }
}






public class Problem1 {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeA = shapeFactory.getShape("CIRCLE");

        shapeA.draw();

        Shape shapeB = shapeFactory.getShape("RECTANGLE");

        shapeB.draw();

        Shape shapeC = shapeFactory.getShape("SQUARE");

        shapeC.draw();
    }
}
