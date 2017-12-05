package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArrayTest {
    private static final int[] TEST_ARRAY1 = {9, 3, 9, 3, 9, 7, 9};
    private static final int[] TEST_ARRAY2 = {9, 3, 9, 3, 9, 9, 10};
    private static final int[] TEST_ARRAY3 = {1, 9, 3, 9, 3, 9, 9};
    private OddOccurrencesInArray app;

    @Before
    public void setUp() {
        this.app = new OddOccurrencesInArray();
    }

    @Test
    public void testSolution1() {
        assertEquals(7, app.solution1(TEST_ARRAY1));
        assertEquals(10, app.solution1(TEST_ARRAY2));
        assertEquals(1, app.solution1(TEST_ARRAY3));
    }

    @Test
    public void testSolution2() {
        assertEquals(7, app.solution2(TEST_ARRAY1));
        assertEquals(10, app.solution2(TEST_ARRAY2));
        assertEquals(1, app.solution2(TEST_ARRAY3));
    }

    @Test
    public void testSolution3() {
        assertEquals(7, app.solution3(TEST_ARRAY1));
        assertEquals(10, app.solution3(TEST_ARRAY2));
        assertEquals(1, app.solution3(TEST_ARRAY3));
    }

    @Test
    public void testSolution4() {
        assertEquals(7, app.solution4(TEST_ARRAY1));
        assertEquals(10, app.solution4(TEST_ARRAY2));
        assertEquals(1, app.solution4(TEST_ARRAY3));
    }

}
