package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {

    @Test
    public void testSolution1() {
        PassingCars app = new PassingCars();
        assertEquals(5, app.solution1(new int[]{0, 1, 0, 1, 1}));
        assertEquals(1, app.solution1(new int[]{0, 1, 0, 0, 0}));
        assertEquals(9, app.solution1(new int[]{0, 1, 0, 1, 1, 0, 0, 1}));
    }

    @Test
    public void testSolution2() {
        PassingCars app = new PassingCars();
        assertEquals(5, app.solution2(new int[]{0, 1, 0, 1, 1}));
        assertEquals(1, app.solution2(new int[]{0, 1, 0, 0, 0}));
        assertEquals(9, app.solution2(new int[]{0, 1, 0, 1, 1, 0, 0, 1}));
    }

}
