package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    private PermMissingElem app;

    @Before
    public void setUp() {
        this.app = new PermMissingElem();
    }

    @Test
    public void testSolution1() {
        assertEquals(1, app.solution1(new int[]{}));
        assertEquals(2, app.solution1(new int[]{1}));
        assertEquals(1, app.solution1(new int[]{2}));
        assertEquals(3, app.solution1(new int[]{1, 2}));
        assertEquals(1, app.solution1(new int[]{2, 3}));
        assertEquals(4, app.solution1(new int[]{2, 1, 3}));
        assertEquals(4, app.solution1(new int[]{2, 3, 1, 5}));
        assertEquals(1, app.solution1(new int[]{2, 3, 4, 5}));
        assertEquals(5, app.solution1(new int[]{2, 3, 1, 4, 6}));
    }

    @Test
    public void testSolution2() {
        assertEquals(1, app.solution2(new int[]{}));
        assertEquals(2, app.solution2(new int[]{1}));
        assertEquals(1, app.solution2(new int[]{2}));
        assertEquals(3, app.solution2(new int[]{1, 2}));
        assertEquals(1, app.solution2(new int[]{2, 3}));
        assertEquals(4, app.solution2(new int[]{2, 1, 3}));
        assertEquals(4, app.solution2(new int[]{2, 3, 1, 5}));
        assertEquals(1, app.solution2(new int[]{2, 3, 4, 5}));
        assertEquals(5, app.solution2(new int[]{2, 3, 1, 4, 6}));
    }

    @Test
    public void testSolution3() {
        assertEquals(1, app.solution3(new int[]{}));
        assertEquals(2, app.solution3(new int[]{1}));
        assertEquals(1, app.solution3(new int[]{2}));
        assertEquals(3, app.solution3(new int[]{1, 2}));
        assertEquals(1, app.solution3(new int[]{2, 3}));
        assertEquals(4, app.solution3(new int[]{2, 1, 3}));
        assertEquals(4, app.solution3(new int[]{2, 3, 1, 5}));
        assertEquals(1, app.solution3(new int[]{2, 3, 4, 5}));
        assertEquals(5, app.solution3(new int[]{2, 3, 1, 4, 6}));
    }

}
