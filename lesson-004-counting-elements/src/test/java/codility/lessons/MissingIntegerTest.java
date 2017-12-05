package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {

    @Test
    public void testSolution() {
        MissingInteger app = new MissingInteger();
        assertEquals(1, app.solution(new int[]{-1, -4, -3}));
        assertEquals(2, app.solution(new int[]{-1, -4, 1, -3}));
        assertEquals(1, app.solution(new int[]{-1, -4, 2, -3}));
        assertEquals(1, app.solution(new int[]{-1, 3, -4, 2, -3}));
        assertEquals(2, app.solution(new int[]{-1, 3, -4, 1, -3}));
        assertEquals(1, app.solution(new int[]{0}));
        assertEquals(5, app.solution(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(4, app.solution(new int[]{1, 3, 2}));
        assertEquals(1, app.solution(new int[]{2, 3}));
        assertEquals(3, app.solution(new int[]{1, 2}));
        assertEquals(3, app.solution(new int[]{4, 1, 5, 6, 2}));
        assertEquals(1, app.solution(new int[]{-1, -3}));
        assertEquals(1, app.solution(new int[]{-1}));
        assertEquals(1, app.solution(new int[]{-3}));
        assertEquals(1, app.solution(new int[]{-1000000, 1000000}));
    }

}
