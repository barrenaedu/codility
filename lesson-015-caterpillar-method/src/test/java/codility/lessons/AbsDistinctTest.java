package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsDistinctTest {

    @Test
    public void solutionInternetTest() {
        AbsDistinct app = new AbsDistinct();
        assertEquals(0, app.solutionInternet(new int[]{}));
        assertEquals(4, app.solutionInternet(new int[]{-5, -3, -1, 0, 3}));
        assertEquals(1, app.solutionInternet(new int[]{-1}));
        assertEquals(1, app.solutionInternet(new int[]{-2147483648, -2147483648}));
        assertEquals(1, app.solutionInternet(new int[]{2147483647, 2147483647}));
        assertEquals(2, app.solutionInternet(new int[]{-2147483648, 0}));
        assertEquals(3, app.solutionInternet(new int[]{-2147483648, -1, 0, 1}));
        assertEquals(5, app.solutionInternet(new int[]{-5, -3, -1, 0, 3, 6}));
        assertEquals(4, app.solutionInternet(new int[]{-3, 0, 1, 2, 3}));
        assertEquals(4, app.solutionInternet(new int[]{-2, -1, 0, 1, 2, 3}));
        assertEquals(4, app.solutionInternet(new int[]{-3, -2, -2, 0, 1, 2, 3}));
    }

}
