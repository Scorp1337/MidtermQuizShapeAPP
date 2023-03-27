package org.MidTermQuiz;

public class Triangle extends Shape implements MeasureFormulas {

    private  double lengthA;
    private  double lengthB;

    private  double lengthC;


    private  double height;

    private  double base;

    public Triangle(){

    }

    public Triangle(String name, double lengthA, double lengthB, double lengthC, double height, double base) {
        super(name);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.height = height;
        this.base = base;
    }


    @Override
    public void calculateArea() {
        super.calculateArea();
        this.area = (1 / 2f * this.height * this.base);
        System.out.println("Area  of triangle = " + this.area);
    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
        this.perimeter = lengthA + lengthB + lengthC;
        System.out.println("Perimeter of triangle = " + this.perimeter);
    }

}
