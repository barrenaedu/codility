package codility.lessons;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {

    private static final int[] TEST_ARRAY1 = {3, 1, 2, 4, 3};
    private static final int[] TEST_ARRAY2 = {-1000, 1000};
    private static final int[] TEST_ARRAY3 = {-10, -5, 5, 10};

    private static TapeEquilibrium app;
    private static int[] testArray;

    @BeforeClass
    public static void setUpClass() {
        app = new TapeEquilibrium();
        testArray = new int[10_000_000];
        for (int i=0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
    }

    @Test
    public void testSolution1() {
        assertEquals(1, app.solution1(TEST_ARRAY1));
        assertEquals(2000, app.solution1(TEST_ARRAY2));
        assertEquals(20, app.solution1(TEST_ARRAY3));
        app.solution1(testArray);
    }

    @Test
    public void testSolution2() {
        assertEquals(1, app.solution2(TEST_ARRAY1));
        assertEquals(2000, app.solution2(TEST_ARRAY2));
        assertEquals(20, app.solution2(TEST_ARRAY3));
        app.solution2(testArray);
    }

}
