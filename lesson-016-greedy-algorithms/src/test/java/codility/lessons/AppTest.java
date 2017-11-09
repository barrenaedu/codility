package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void greedyCanoeistTest() {
        App app = new App();
        // Note: Optimal solution would be 4 however greedy algorithm returns 5
        assertEquals(5, app.greedyCanoeist(new int[] {2, 1, 3, 3, 1, 1, 1}, 3));
    }

}
