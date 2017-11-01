package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinAvgTwoSliceTest {

    @Test
    public void testSolution() {
        MinAvgTwoSlice app = new MinAvgTwoSlice();
        assertEquals(1, app.solution(new int[] {4, 2, 2, 5, 1, 5, 8}));
        assertEquals(1, app.solution(new int[] {8, 0, 0, 8}));
    }

}
