package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void fibonacciRecursiveTest1() {
        App app = new App();
        int[] arr = app.fibonacciRecursive(2);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
    }

    @Test
    public void fibonacciRecursiveTest2() {
        App app = new App();
        int[] arr = app.fibonacciRecursive(3);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[2]);
    }

    @Test
    public void fibonacciRecursiveTest() {
        App app = new App();
        int[] arr = app.fibonacciRecursive(8);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[2]);
        assertEquals(2, arr[3]);
        assertEquals(3, arr[4]);
        assertEquals(5, arr[5]);
        assertEquals(8, arr[6]);
        assertEquals(13, arr[7]);
    }

    @Test
    public void fibonacciIterativeTest() {
        App app = new App();
        int[] arr = app.fibonacciRecursive(8);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[2]);
        assertEquals(2, arr[3]);
        assertEquals(3, arr[4]);
        assertEquals(5, arr[5]);
        assertEquals(8, arr[6]);
        assertEquals(13, arr[7]);
    }

}
