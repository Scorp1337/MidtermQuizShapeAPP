package org.MidTermQuiz;

public class Rectangle extends Shape implements MeasureFormulas {

    private  double length;
    private  double width;

    public Rectangle(){

    }
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        this.area = this.length * this.width;
        System.out.println("Perimeter of rectangle =  " + this.area);
    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
        this.perimeter = 2 * (this.length + this.width);
        System.out.println("Perimeter of rectangle =  " + this.perimeter);
    }
}
