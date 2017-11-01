package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {

    @Test
    public void testSolution1() {
        PermCheck app = new PermCheck();
        assertEquals(0, app.solution(new int[]{4, 2, 1}));
        assertEquals(0, app.solution(new int[]{4, 1, 3}));
        assertEquals(0, app.solution(new int[]{2}));
        assertEquals(1, app.solution(new int[]{4, 1, 3, 2}));
        assertEquals(1, app.solution(new int[]{1}));
        assertEquals(1, app.solution(new int[]{1, 2}));
        assertEquals(1, app.solution(new int[]{1, 3, 2}));
        assertEquals(1, app.solution(new int[]{3, 1, 2}));
    }

}
