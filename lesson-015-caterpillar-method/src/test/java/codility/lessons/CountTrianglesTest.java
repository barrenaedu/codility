package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTrianglesTest {

    @Test
    public void solutionTest() {
        CountTriangles app = new CountTriangles();
        assertEquals(4, app.solution(new int[]{10, 2, 5, 1, 8, 12}));
    }

    @Test
    public void solutionSlowerTest() {
        CountTriangles app = new CountTriangles();
        assertEquals(4, app.solutionSlower(new int[]{10, 2, 5, 1, 8, 12}));
    }

}
