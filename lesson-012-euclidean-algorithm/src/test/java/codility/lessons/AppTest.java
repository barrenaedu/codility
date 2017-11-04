package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void gcdTest() {
        App app = new App();
        assertEquals(8, app.gcd(8, 16));
        assertEquals(8, app.gcd(8, 32));
        assertEquals(3, app.gcd(9, 24));
        assertEquals(3, app.gcd(9, 6));
        assertEquals(3, app.gcd(3, 6));
    }

    @Test
    public void gcdModTest() {
        App app = new App();
        assertEquals(8, app.gcdMod(8, 16));
        assertEquals(8, app.gcdMod(8, 32));
        assertEquals(3, app.gcdMod(9, 24));
        assertEquals(3, app.gcdMod(9, 6));
        assertEquals(3, app.gcdMod(3, 6));
    }

}
