package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductOfThreeTest {

    @Test
    public void testSolutionSort() {
        MaxProductOfThree app = new MaxProductOfThree();
        assertEquals(60, app.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }

}
