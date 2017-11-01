package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;

public class BinaryGapTest {
    private static final int[][] TEST_NUMBERS = {{0, 0}, {0, 1}, {2, 9}, {4, 264}, {4, 529}, {1, 20}, {0, 15}, {5, 1041}};
    private static final int SPEED_TEST_CASES = 1_000_000;

    private BinaryGap app;

    @Before
    public void setUp() {
        app = new BinaryGap();
    }

    @Test
    public void testSolution1() {
        for (int i = 0; i < TEST_NUMBERS.length; i++) {
            assertEquals(TEST_NUMBERS[i][0], app.solution1(TEST_NUMBERS[i][1]));
        }
        // Speed test
        Random rnd = new Random();
        for (int i = 0; i < SPEED_TEST_CASES; i++) {
            app.solution1(rnd.nextInt(Integer.MAX_VALUE));
        }
    }

    @Test
    public void testSolution2() {
        for (int i = 0; i < TEST_NUMBERS.length; i++) {
            assertEquals(TEST_NUMBERS[i][0], app.solution2(TEST_NUMBERS[i][1]));
        }
        // Speed test
        Random rnd = new Random();
        for (int i = 0; i < SPEED_TEST_CASES; i++) {
            app.solution2(rnd.nextInt(Integer.MAX_VALUE));
        }
    }
}
