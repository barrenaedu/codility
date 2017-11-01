package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSliceSumTest {

    private MaxSliceSum app;

    @Before
    public void setUp() {
        app = new MaxSliceSum();
    }

    @Test
    public void testSolutionCubic() {
        // Max [3, 5, -2, 4]
        assertEquals(10, app.solutionCubic(new int[]{5, -7, 3, 5, -2, 4, -1}));
    }

    @Test
    public void testSolutionQuadratic() {
        // Max [3, 5, -2, 4]
        assertEquals(10, app.solutionQuadratic(new int[]{5, -7, 3, 5, -2, 4, -1}));
    }

    @Test
    public void testSolutionLineal() {
        // Max [3, 5, -2, 4]
        assertEquals(10, app.solutionLineal(new int[]{5, -7, 3, 5, -2, 4, -1}));
        assertEquals(5, app.solutionLineal(new int[]{3, 2, -6, 4, 0}));
    }

}
