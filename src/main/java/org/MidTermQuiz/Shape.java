package org.MidTermQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shape implements MeasureFormulas {

    protected String name;

    protected double perimeter;

    protected double area;

    List<Shape> myShapes = new ArrayList<>();

    public Shape() {

    }
    public Shape(String name) {
        this(name, 0, 0);
        this.name = name;

    }

    public Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public void sumOfShapes(Shape shape){

        double sum = shape.area + shape.perimeter;
        System.out.println("The sum of area and perimeter of " + shape.name + " = " +  sum);
    }

    public void  addShapes(Shape shape) {
        if (myShapes.contains(shape)) {
            System.out.println("This shape is already in the list.");

        } else {
            myShapes.add(shape);
        }
    }
    public void printShape(){
        for(Shape shape : myShapes){
            System.out.println(shape);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape)) return false;

        return Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Shape["
                 + name  +
                ']';
    }
    @Override
    public void calculateArea() {

    }

    @Override
    public void calculatePerimeter() {

    }



}
