package com.yashasvi.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestException {

    @Test
    void testSortingArray_Exception() {
        try {
            SortingArray array = new SortingArray();

            int unsorted[] = null;
            int sortedArray[] = array.sortingArray(unsorted);

//       for(int elem:sortedArray){
//           System.out.println(elem);
//       }
        }catch (NullPointerException e){
            System.out.println("Exception generated");
        }
    }
}
