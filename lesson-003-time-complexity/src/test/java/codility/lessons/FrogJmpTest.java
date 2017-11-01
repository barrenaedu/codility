package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmpTest {
    private FrogJmp app;

    @Before
    public void setUp() {
        this.app = new FrogJmp();
    }

    @Test
    public void testSolution1() {
        assertEquals(3, app.solution1(10, 85, 30));
        assertEquals(2, app.solution1(1, 5, 2));
        assertEquals(474799482, app.solution1(1, 949598964, 2));
    }

    @Test
    public void testSolution2() {
        assertEquals(3, app.solution2(10, 85, 30));
        assertEquals(2, app.solution2(1, 5, 2));
        assertEquals(474799482, app.solution2(1, 949598964, 2));
    }

    @Test
    public void testSolution3() {
        assertEquals(3, app.solution3(10, 85, 30));
        assertEquals(2, app.solution3(1, 5, 2));
        assertEquals(474799482, app.solution3(1, 949598964, 2));
    }

}
