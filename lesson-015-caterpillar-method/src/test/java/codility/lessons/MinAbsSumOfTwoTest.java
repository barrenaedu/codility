package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinAbsSumOfTwoTest {

    @Test
    public void solutionTest() {
        MinAbsSumOfTwo app = new MinAbsSumOfTwo();
        assertEquals(1, app.solution(new int[]{1, 4, -3}));
        assertEquals(3, app.solution(new int[]{-8, 4, 5, -10, 3}));
    }

    @Test
    public void solutionImprovedTest() {
        MinAbsSumOfTwo app = new MinAbsSumOfTwo();
        assertEquals(1, app.solutionImproved(new int[]{1, 4, -3}));
        assertEquals(3, app.solutionImproved(new int[]{-8, 4, 5, -10, 3}));
    }

    @Test
    public void solutionSortingTest() {
        MinAbsSumOfTwo app = new MinAbsSumOfTwo();
        assertEquals(1, app.solutionSorting(new int[]{1, 4, -3}));
        assertEquals(3, app.solutionSorting(new int[]{-8, 4, 5, -10, 3}));
        assertEquals(6, app.solutionSorting(new int[]{8, 5, 3, 4, 6, 8}));
    }


}
