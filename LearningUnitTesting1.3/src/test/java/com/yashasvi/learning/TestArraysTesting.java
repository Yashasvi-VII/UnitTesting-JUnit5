package com.yashasvi.learning;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestArraysTesting {

    @Test
    void testArrays() {
        int[] expected = {2, 4, 6, 8};
        int[] actual = {4, 8, 6, 2};

        Arrays.sort(actual);

        assertArrayEquals(expected, actual);
    }
}
