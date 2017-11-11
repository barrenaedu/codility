package codility.lessons;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDistinctSlicesTest {

    @Test
    @Ignore
    public void solutionTest() {
        CountDistinctSlices app = new CountDistinctSlices();
        assertEquals(9, app.solution(6, new int[]{3, 4, 5, 5, 2}));
    }
}
