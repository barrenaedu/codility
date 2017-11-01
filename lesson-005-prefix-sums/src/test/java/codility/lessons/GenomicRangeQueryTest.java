package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenomicRangeQueryTest {

    @Test
    public void testSolution() {
        GenomicRangeQuery app = new GenomicRangeQuery();
        int[] arr;
        // Example 1
        arr = app.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
        assertEquals(2, arr[0]);
        assertEquals(4, arr[1]);
        assertEquals(1, arr[2]);
        // Example 2
        arr = app.solution("CAGTC", new int[]{0, 0, 0, 0, 0}, new int[]{0, 1, 2, 3, 4});
        assertEquals(2, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[2]);
        assertEquals(1, arr[3]);
        assertEquals(1, arr[4]);
        // Example 3
        arr = app.solution("CAGTC", new int[]{1, 1, 1, 1}, new int[]{1, 2, 3, 4});
        assertEquals(1, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[2]);
        assertEquals(1, arr[3]);
        // Example 4
        arr = app.solution("CAGTC", new int[]{2, 2, 2}, new int[]{2, 3, 4});
        assertEquals(3, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(2, arr[2]);
        // Example 5
        arr = app.solution("CAGTC", new int[]{3, 3}, new int[]{3, 4});
        assertEquals(4, arr[0]);
        assertEquals(2, arr[1]);
        // Example 6
        arr = app.solution("CAGTC", new int[]{4}, new int[]{4});
        assertEquals(2, arr[0]);
    }

}
