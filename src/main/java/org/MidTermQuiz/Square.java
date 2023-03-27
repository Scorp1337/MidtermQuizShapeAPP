package org.MidTermQuiz;

public class Square extends  Shape implements MeasureFormulas {

    private  double side;

    public Square(){

    }
    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        this.area = this.side * this.side;
                System.out.println("Area of square = " + this.area);
    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
        this.perimeter = this.side * 4;
        System.out.println("Perimeter of square = " + this.perimeter);
    }
}
