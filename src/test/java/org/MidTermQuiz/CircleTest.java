package org.MidTermQuiz;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CircleTest {

    Circle circle = new Circle();

    @Test
    void testCalculateAreaOfCircle() {

        double radius = 5;
        double pi = 3.14;
        double area = radius * radius * pi;


        assertEquals(78.5, area);

    }

    @Test
    void testCalculatePerimeterOfCircle() {

        double radius = 5;
        double pi = 3.14;
        double perimeter = radius * 2 * pi;
        assertEquals(31.400000000000002, perimeter);


    }


}
