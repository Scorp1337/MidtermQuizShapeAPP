package org.MidTermQuiz;

public class Circle extends Shape implements MeasureFormulas {
    private  double radius;
    private  double pi;

    public Circle(){

    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        this.pi = 3.14;
    }


    @Override
    public void calculateArea() {

        this.area = pi * (this.radius * this.radius);
        System.out.println("Area of circle = " + this.area);

    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
        this.perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle =  " + this.perimeter);
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }
}
