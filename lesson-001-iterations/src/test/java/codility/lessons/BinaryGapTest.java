package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;

public class BinaryGapTest {
    private static final int SPEED_TEST_CASES = 1_000_000;

    private BinaryGap app;

    @Before
    public void setUp() {
        app = new BinaryGap();
    }

    @Test
    public void testSolution1() {
        assertEquals(0, app.solution1(0));
        assertEquals(0, app.solution1(1));
        assertEquals(2, app.solution1(9));
        assertEquals(4, app.solution1(264));
        assertEquals(4, app.solution1(529));
        assertEquals(1, app.solution1(20));
        assertEquals(0, app.solution1(15));
        assertEquals(5, app.solution1(1041));
        // Speed test
        Random rnd = new Random();
        for (int i = 0; i < SPEED_TEST_CASES; i++) {
            app.solution1(rnd.nextInt(Integer.MAX_VALUE));
        }
    }

    @Test
    public void testSolution2() {
        assertEquals(0, app.solution2(0));
        assertEquals(0, app.solution2(1));
        assertEquals(2, app.solution2(9));
        assertEquals(4, app.solution2(264));
        assertEquals(4, app.solution2(529));
        assertEquals(1, app.solution2(20));
        assertEquals(0, app.solution2(15));
        assertEquals(5, app.solution2(1041));
        // Speed test
        Random rnd = new Random();
        for (int i = 0; i < SPEED_TEST_CASES; i++) {
            app.solution2(rnd.nextInt(Integer.MAX_VALUE));
        }
    }
}
