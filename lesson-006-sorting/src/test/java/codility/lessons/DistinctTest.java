package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctTest {

    @Test
    public void testSolutionSort() {
        Distinct app = new Distinct();
        // Example 1
        assertEquals(3, app.solutionSort(new int[]{2, 1, 1, 2, 3, 1}));
    }

    @Test
    public void testSolutionSet() {
        Distinct app = new Distinct();
        // Example 1
        assertEquals(3, app.solutionSet(new int[]{2, 1, 1, 2, 3, 1}));
    }

}
