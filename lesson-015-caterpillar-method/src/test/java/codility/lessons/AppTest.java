package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void caterpillarMethodTest() {
        App app = new App();
        assertTrue(app.caterpillarMethod(new int[]{6, 2, 7, 4, 1, 3, 6}, 12));   // 7, 4, 1 = 12
        assertFalse(app.caterpillarMethod(new int[]{1, 7, 4, 1, 3, 2, 1}, 14));  // 7, 4, 1, (3), 2
    }

}
