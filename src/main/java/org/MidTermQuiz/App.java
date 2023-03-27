package org.MidTermQuiz;

/**
 * You need to design an application that allows the possibility to calculate the surface and perimeter
 * for multiple types of shape: rectangle, square, circle and triangle.
 * <p>
 * <p>
 * The tool should allow the possibility to add multiple shapes and calculate the total sum for perimeter and for surface.
 * <p>
 * <p>
 * Also, the application should make sure that 2 similar shapes couldn’t be added to the drawing tool. In case 2 similar
 * shapes are added, an appropriate message should be printed to console.
 * <p>
 * Since you want to be sure that you provide a high quality implementation, unit tests are needed to prove the main
 * functionalities described above, work correctly (add all types of shapes, add duplicates, add single shape and pairs
 * of shapes).
 */
public class App {
    public static void main(String[] args) {


        Shape myShapes = new Shape();

        Shape shape1 = new Circle("Circle", 5);
        Shape shape2 = new Triangle("Triangle", 4, 3, 5, 2, 5);
        Shape shape3 = new Rectangle("Rectangle", 10, 5);
        Shape shape4 = new Square("Square", 7);

        myShapes.addShapes(shape1);
        myShapes.addShapes(shape2);
        myShapes.addShapes(shape3);
        myShapes.addShapes(shape4);


        myShapes.printShape();
        System.out.println("===================================================================================");
        myShapes.addShapes(shape4);
        System.out.println("===================================================================================");

        shape1.calculateArea();
        shape1.calculatePerimeter();
        System.out.println("===================================================================================");
        shape2.calculateArea();
        shape2.calculatePerimeter();
        System.out.println("===================================================================================");
        shape3.calculateArea();
        shape3.calculatePerimeter();
        System.out.println("===================================================================================");
        shape4.calculateArea();
        shape4.calculatePerimeter();
        System.out.println("===================================================================================");

        myShapes.sumOfShapes(shape1);

        double sumOfMultipleShapes = shape1.area + shape2.perimeter + shape1.perimeter + shape3.perimeter;


        System.out.println("Total sum of multiple areas and perimeters for different shapes = " + sumOfMultipleShapes);


    }
}
