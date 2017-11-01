package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CyclicRotationTest {

    private CyclicRotation app;

    @Before
    public void setUp() {
        this.app = new CyclicRotation();
    }

    @Test
    public void testSolution() {
        int[] arr = app.solution(new int[]{}, 0);
        assertEquals(0, arr.length);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 0);
        assertEquals(3, arr[0]);
        assertEquals(8, arr[1]);
        assertEquals(9, arr[2]);
        assertEquals(7, arr[3]);
        assertEquals(6, arr[4]);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 5);
        assertEquals(3, arr[0]);
        assertEquals(8, arr[1]);
        assertEquals(9, arr[2]);
        assertEquals(7, arr[3]);
        assertEquals(6, arr[4]);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 1);
        assertEquals(6, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(8, arr[2]);
        assertEquals(9, arr[3]);
        assertEquals(7, arr[4]);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 2);
        assertEquals(7, arr[0]);
        assertEquals(6, arr[1]);
        assertEquals(3, arr[2]);
        assertEquals(8, arr[3]);
        assertEquals(9, arr[4]);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 3);
        assertEquals(9, arr[0]);
        assertEquals(7, arr[1]);
        assertEquals(6, arr[2]);
        assertEquals(3, arr[3]);
        assertEquals(8, arr[4]);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 4);
        assertEquals(8, arr[0]);
        assertEquals(9, arr[1]);
        assertEquals(7, arr[2]);
        assertEquals(6, arr[3]);
        assertEquals(3, arr[4]);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 10);
        assertEquals(3, arr[0]);
        assertEquals(8, arr[1]);
        assertEquals(9, arr[2]);
        assertEquals(7, arr[3]);
        assertEquals(6, arr[4]);
        arr = app.solution(new int[]{3, 8, 9, 7, 6}, 6);
        assertEquals(6, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(8, arr[2]);
        assertEquals(9, arr[3]);
        assertEquals(7, arr[4]);
    }

}
