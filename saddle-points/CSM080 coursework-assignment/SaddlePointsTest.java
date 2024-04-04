package saddlePoints;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import saddlePoints.SaddlePoints;

import javax.xml.transform.Result;

import static org.junit.Assert.*;

public class SaddlePointsTest {
    private SaddlePoints sp;

    @Before
    public void setUp() throws Exception {
         sp = new SaddlePoints(); // create an instance variable
    }

    @Test
    public void createRandomArray() {
        //test if returned array has correct dimentions

        int [][] result = sp.createRandomArray(3,3,0,10);
        assertEquals(3, result.length);
        assertEquals(3, result[0].length);

        //test if all elements are within the specigied range
        int minValue = 0;
        int maxValue = 10;

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                assertTrue(result[i][j] >= minValue && result[i][j] <= maxValue);
            }

        }
    }

    @Test
    public void largest() {
        int[] arr = {-9, 12, -6};
        //test if it returns 12
        int result = sp.largest(arr);
        assertEquals(12, result);
    }

    @Test
    public void smallest() {
        int[] arr = {-9, 12, -6};
        //test if it returns 12
        int result = sp.smallest(arr);
        assertEquals(-9, result);
    }

    @Test
    public void largestValues() {
        int[][] with = {{-9, 12, -6},
                { 7, 14,  5},
                {10, -8,  3},
                { 6, 17,-10}};
        int[] results = sp.largestValues(with);

        assertArrayEquals(new int[]{12,14,10,17}, results);
    }

    @Test
    public void smallestValues() {
        int[][] with = {{-9, 12, -6},
                { 7, 14,  5},
                {10, -8,  3},
                { 6, 17,-10}};
        int[] results = sp.smallestValues(with);

        assertArrayEquals(new int[]{-9,5,-8,-10}, results);
    }

    @Test
    public void hasSaddlePoint() {
    }

    @Test
    public void saddlePointRow() {
    }

    @Test
    public void saddlePointColumn() {
    }

    private int[] setupArray(int elements){
        return null;

    }
}