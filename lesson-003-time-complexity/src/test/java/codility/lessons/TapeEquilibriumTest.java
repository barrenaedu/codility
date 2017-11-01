package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {

    private static final int[] TEST_ARRAY = {3, 1, 2, 4, 3};
    private TapeEquilibrium app;

    @Before
    public void setUp() {
        this.app = new TapeEquilibrium();
    }

    @Test
    public void testSolution1() {
        assertEquals(1, app.solution1(TEST_ARRAY));
    }

    @Test
    public void testSolution2() {
        assertEquals(1, app.solution2(TEST_ARRAY));
    }

}
