package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxCountersTest {

    @Test
    public void testSolutionLineal() {
        MaxCounters app = new MaxCounters();
        // Sample 1
        int[] arr;
        arr = app.solutionLineal(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        assertEquals(3, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(2, arr[2]);
        assertEquals(4, arr[3]);
        assertEquals(2, arr[4]);
        // Sample 2
        arr = app.solutionLineal(5, new int[]{3, 4, 4, 6, 1, 4, 4, 7, 2, 4});
        assertEquals(4, arr[0]);
        assertEquals(5, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(5, arr[3]);
        assertEquals(4, arr[4]);
        // Sample 3
        arr = app.solutionLineal(3, new int[]{1, 2, 3, 4, 1, 5, 6});
        assertEquals(2, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(2, arr[2]);
        // Sample 4
        arr = app.solutionLineal(3, new int[]{1, 1, 4, 2, 2});
        assertEquals(2, arr[0]);
        assertEquals(4, arr[1]);
        assertEquals(2, arr[2]);
        // Sample 5
        arr = app.solutionLineal(3, new int[]{1, 2, 3, 4, 1, 5, 1, 1});
        assertEquals(4, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(2, arr[2]);
        // Sample 6
        arr = app.solutionLineal(5, new int[]{3, 4, 4, 6, 1, 4, 4, 6, 3});
        assertEquals(4, arr[0]);
        assertEquals(4, arr[1]);
        assertEquals(5, arr[2]);
        assertEquals(4, arr[3]);
        assertEquals(4, arr[4]);
    }

    @Test
    public void testSolutionQuadratic() {
        MaxCounters app = new MaxCounters();
        // Sample 1
        int[] arr;
        arr = app.solutionQuadratic(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        assertEquals(3, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(2, arr[2]);
        assertEquals(4, arr[3]);
        assertEquals(2, arr[4]);
        // Sample 2
        arr = app.solutionQuadratic(5, new int[]{3, 4, 4, 6, 1, 4, 4, 7, 2, 4});
        assertEquals(4, arr[0]);
        assertEquals(5, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(5, arr[3]);
        assertEquals(4, arr[4]);
        // Sample 3
        arr = app.solutionQuadratic(3, new int[]{1, 2, 3, 4, 1, 5, 6});
        assertEquals(2, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(2, arr[2]);
        // Sample 4
        arr = app.solutionQuadratic(3, new int[]{1, 1, 4, 2, 2});
        assertEquals(2, arr[0]);
        assertEquals(4, arr[1]);
        assertEquals(2, arr[2]);
        // Sample 5
        arr = app.solutionQuadratic(3, new int[]{1, 2, 3, 4, 1, 5, 1, 1});
        assertEquals(4, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(2, arr[2]);
        // Sample 6
        arr = app.solutionQuadratic(5, new int[]{3, 4, 4, 6, 1, 4, 4, 6, 3});
        assertEquals(4, arr[0]);
        assertEquals(4, arr[1]);
        assertEquals(5, arr[2]);
        assertEquals(4, arr[3]);
        assertEquals(4, arr[4]);
    }

}
