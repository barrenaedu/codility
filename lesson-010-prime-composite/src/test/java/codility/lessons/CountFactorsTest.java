package codility.lessons;

import org.junit.Assert;
import org.junit.Test;

public class CountFactorsTest {

    @Test
    public void testSolution1() {
        CountFactors app = new CountFactors();
        // 24 has factors: 1, 2, 3, 4, 6, 8, 12, 24
        Assert.assertEquals(8, app.solution(24));
        // 0 has factors: 0
        Assert.assertEquals(0, app.solution(0));
        // 1 has factors: 1
        Assert.assertEquals(1, app.solution(1));
        // 2 has factors: 1, 2
        Assert.assertEquals(2, app.solution(2));
        // 4 has factors: 1, 2, 4
        Assert.assertEquals(3, app.solution(4));
        Assert.assertEquals(2, app.solution(2_147_483_647));
    }

}
