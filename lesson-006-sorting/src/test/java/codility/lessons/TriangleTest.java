package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void testSolutionSort() {
        Triangle app = new Triangle();
        assertEquals(1, app.solution(new int[]{10, 2, 5, 1, 8, 20}));
        assertEquals(0, app.solution(new int[]{10, 50, 5, 1}));
    }

}
