package codility.lessons;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSolution() {
        App app = new App();
        Assert.assertEquals(0, app.divisors(0));    // 0
        Assert.assertTrue(app.isPrime(0));
        Assert.assertEquals(1, app.divisors(1));    // 1
        Assert.assertTrue(app.isPrime(1));
        Assert.assertEquals(2, app.divisors(2));    // 1, 2
        Assert.assertTrue(app.isPrime(2));
        Assert.assertEquals(2, app.divisors(3));    // 1, 3
        Assert.assertTrue(app.isPrime(3));
        Assert.assertEquals(3, app.divisors(4));    // 1, 2, 4
        Assert.assertFalse(app.isPrime(4));
        Assert.assertEquals(2, app.divisors(5));    // 1, 5
        Assert.assertTrue(app.isPrime(5));
        Assert.assertEquals(4, app.divisors(6));    // 1, 2, 4, 6
        Assert.assertFalse(app.isPrime(6));
        Assert.assertEquals(2, app.divisors(7));    // 1, 7
        Assert.assertTrue(app.isPrime(7));
        Assert.assertEquals(4, app.divisors(8));    // 1, 2, 4, 8
        Assert.assertFalse(app.isPrime(8));
        Assert.assertEquals(3, app.divisors(9));    // 1, 3, 9
        Assert.assertFalse(app.isPrime(9));
    }

}
