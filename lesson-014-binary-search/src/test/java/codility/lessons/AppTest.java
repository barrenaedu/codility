package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void binarySearchTest() {
        App app = new App();
        assertEquals(-1, app.binarySearch(new int[0], 2));
        int[] arr = new int[]{2, 4, 6, 8, 10};
        assertEquals(0, app.binarySearch(arr, 2));
        assertEquals(1, app.binarySearch(arr, 4));
        assertEquals(2, app.binarySearch(arr, 6));
        assertEquals(3, app.binarySearch(arr, 8));
        assertEquals(4, app.binarySearch(arr, 10));
        assertEquals(-1, app.binarySearch(new int[0], 2));
        assertEquals(-1, app.binarySearch(arr, 1));
        assertEquals(-1, app.binarySearch(arr, 3));
        assertEquals(-1, app.binarySearch(arr, 5));
        assertEquals(-1, app.binarySearch(arr, 7));
        assertEquals(-1, app.binarySearch(arr, 9));
    }

    @Test
    public void binarySearchVariationTest() {
        App app = new App();
        assertEquals(-1, app.binarySearchVariation(new int[0], 2));
        int[] arr = new int[]{2, 4, 6, 8, 10};
        assertEquals(0, app.binarySearchVariation(arr, 2));
        assertEquals(1, app.binarySearchVariation(arr, 4));
        assertEquals(2, app.binarySearchVariation(arr, 6));
        assertEquals(3, app.binarySearchVariation(arr, 8));
        assertEquals(4, app.binarySearchVariation(arr, 10));
        assertEquals(-1, app.binarySearchVariation(new int[0], 2));
        assertEquals(-1, app.binarySearchVariation(arr, 1));
        assertEquals(-1, app.binarySearchVariation(arr, 3));
        assertEquals(-1, app.binarySearchVariation(arr, 5));
        assertEquals(-1, app.binarySearchVariation(arr, 7));
        assertEquals(-1, app.binarySearchVariation(arr, 9));
    }

}
