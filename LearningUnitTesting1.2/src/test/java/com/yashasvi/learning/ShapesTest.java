package com.yashasvi.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {

    Shapes shape = new Shapes();

    @Test
    void testComputeShapesArea() {
        assertEquals(576, shape.computeSquareArea(24));
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(153.86, shape.computeCircleArea(7), "Wrong calculation of area of circle");
    }

    @Test
    void testComputeCircleArea_Supplier() {
        /* This is efficient way of writing test as message will be evaluated in fail*/
        assertEquals(153.86, shape.computeCircleArea(7), () -> "Wrong calculation of area of circle");
    }
}

