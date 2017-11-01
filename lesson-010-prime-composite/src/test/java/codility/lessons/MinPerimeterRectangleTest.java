package codility.lessons;

import org.junit.Assert;
import org.junit.Test;

public class MinPerimeterRectangleTest {

    @Test
    public void testSolution1() {
        MinPerimeterRectangle app = new MinPerimeterRectangle();
        Assert.assertEquals(22, app.solutionWhile1(30));
        Assert.assertEquals(4, app.solutionWhile1(1));
        Assert.assertEquals(1964903308, app.solutionWhile1(982451653));
    }

    @Test
    public void testSolution2() {
        MinPerimeterRectangle app = new MinPerimeterRectangle();
        Assert.assertEquals(22, app.solutionWhile2(30));
        Assert.assertEquals(4, app.solutionWhile2(1));
        Assert.assertEquals(1964903308, app.solutionWhile2(982451653));
    }

}
