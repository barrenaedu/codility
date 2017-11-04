package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void primeArrayTest() {
        App app = new App();
        boolean[] arr = app.primeArray(17);
        // False: Prime, True: Excluded
        assertFalse(arr[0]);
        assertFalse(arr[1]);
        assertFalse(arr[2]);
        assertFalse(arr[3]);
        assertTrue(arr[4]);
        assertFalse(arr[5]);
        assertTrue(arr[6]);
        assertFalse(arr[7]);
        assertTrue(arr[8]);
        assertTrue(arr[9]);
        assertTrue(arr[10]);
        assertFalse(arr[11]);
        assertTrue(arr[12]);
        assertFalse(arr[13]);
        assertTrue(arr[14]);
        assertTrue(arr[15]);
        assertTrue(arr[16]);
        assertFalse(arr[17]);
    }

    @Test
    public void FactorizationArrayTest() {
        App app = new App();
        int[] arr = app.FactorizationArray(20);
        // 0: Prime
        assertEquals(0, arr[0]);
        assertEquals(0, arr[1]);
        assertEquals(0, arr[2]);
        assertEquals(0, arr[3]);
        assertEquals(2, arr[4]);
        assertEquals(0, arr[5]);
        assertEquals(2, arr[6]);
        assertEquals(0, arr[7]);
        assertEquals(2, arr[8]);
        assertEquals(3, arr[9]);
        assertEquals(2, arr[10]);
        assertEquals(0, arr[11]);
        assertEquals(2, arr[12]);
        assertEquals(0, arr[13]);
        assertEquals(2, arr[14]);
        assertEquals(3, arr[15]);
        assertEquals(2, arr[16]);
        assertEquals(0, arr[17]);
        assertEquals(2, arr[18]);
        assertEquals(0, arr[19]);
        assertEquals(2, arr[20]);
    }

}
