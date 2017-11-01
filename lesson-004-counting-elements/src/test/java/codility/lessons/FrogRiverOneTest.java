package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {

    @Test
    public void testSolution1() {
        FrogRiverOne app = new FrogRiverOne();
        assertEquals(6, app.solution1(5, new int[]{1,3,1,4,2,3,5,4}));
        assertEquals(0, app.solution1(1, new int[]{1}));
        assertEquals(3, app.solution1(2, new int[]{1,1,1,2}));
        assertEquals(4, app.solution1(4, new int[]{1,2,3,2,4}));
        assertEquals(4, app.solution1(3, new int[]{1,7,6,3,2,4}));
        assertEquals(-1, app.solution1(3, new int[]{1}));
    }

}
