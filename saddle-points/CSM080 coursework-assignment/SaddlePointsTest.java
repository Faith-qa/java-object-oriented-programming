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
    }

    @Test
    public void largestValues() {
    }

    @Test
    public void smallestValues() {
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