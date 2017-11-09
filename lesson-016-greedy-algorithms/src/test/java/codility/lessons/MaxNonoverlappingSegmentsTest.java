package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxNonoverlappingSegmentsTest {

    @Test
    public void solution() {
        MaxNonoverlappingSegments app = new MaxNonoverlappingSegments();
        assertEquals(3, app.solution(new int[]{1, 3, 7, 9, 9}, new int[]{5, 6, 8, 9, 10}));
    }

}
