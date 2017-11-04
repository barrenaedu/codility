package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void binarySearchTest() {
        App app = new App();
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

}
