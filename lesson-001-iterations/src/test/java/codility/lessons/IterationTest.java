package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IterationTest {
    private Iteration app;

    @Before
    public void setUp() {
        app = new Iteration();
    }

    @Test
    public void testIteration1() {
        int[] arr = app.interation1(3);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(2, arr[2]);
    }

    @Test
    public void testIteration1Vis() {
        int[] arr = app.interation1Vis(3);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(2, arr[2]);
    }

    @Test
    public void testIteration2() {
        int[] arr = app.interation2(3);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(2, arr[2]);
    }

    @Test
    public void testIteration2Vis() {
        int[] arr = app.interation2Vis(3);
        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(3, arr[2]);
    }

}
