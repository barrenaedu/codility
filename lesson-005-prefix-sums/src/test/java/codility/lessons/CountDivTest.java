package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {

    @Test
    public void testSolution1() {
        CountDiv app = new CountDiv();
        assertEquals(3, app.solution1(6, 11, 2));
        assertEquals(4, app.solution1(3, 14, 3));
    }

    @Test
    public void testSolution2() {
        CountDiv app = new CountDiv();
        assertEquals(3, app.solution2(6, 11, 2));
        assertEquals(4, app.solution2(3, 14, 3));
    }

}
