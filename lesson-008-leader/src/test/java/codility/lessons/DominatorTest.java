package codility.lessons;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertTrue;

public class DominatorTest {

    private Dominator app;

    @Before
    public void setUp() {
        app = new Dominator();
    }

    @Test
    public void testSolutionMap() {
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 2, 4, 6, 7))).contains(app.solutionMap(new int[]{3, 4, 3, 2, 3, -1, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 2, 4, 7, 8))).contains(app.solutionMap(new int[]{3, 1, 3, 1, 3, 4, 4, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 3, 4))).contains(app.solutionMap(new int[]{3, 4, 4, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0))).contains(app.solutionMap(new int[]{2147483647})));
        assertTrue((new HashSet<Integer>(Arrays.asList(-1))).contains(app.solutionMap(new int[]{})));
        assertTrue((new HashSet<Integer>(Arrays.asList(-1))).contains(app.solutionMap(new int[]{2, 1, 1, 3})));
    }

    @Test
    public void testSolutionQuadratic() {
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 2, 4, 6, 7))).contains(app.solutionQuadratic(new int[]{3, 4, 3, 2, 3, -1, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 2, 4, 7, 8))).contains(app.solutionQuadratic(new int[]{3, 1, 3, 1, 3, 4, 4, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 3, 4))).contains(app.solutionQuadratic(new int[]{3, 4, 4, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0))).contains(app.solutionQuadratic(new int[]{2147483647})));
        assertTrue((new HashSet<Integer>(Arrays.asList(-1))).contains(app.solutionQuadratic(new int[]{})));
        assertTrue((new HashSet<Integer>(Arrays.asList(-1))).contains(app.solutionQuadratic(new int[]{2, 1, 1, 3})));
    }

    @Test
    public void testSolutionLineal() {
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 2, 4, 6, 7))).contains(app.solutionLineal(new int[]{3, 4, 3, 2, 3, -1, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 2, 4, 7, 8))).contains(app.solutionLineal(new int[]{3, 1, 3, 1, 3, 4, 4, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0, 3, 4))).contains(app.solutionLineal(new int[]{3, 4, 4, 3, 3})));
        assertTrue((new HashSet<Integer>(Arrays.asList(0))).contains(app.solutionLineal(new int[]{2147483647})));
        assertTrue((new HashSet<Integer>(Arrays.asList(-1))).contains(app.solutionLineal(new int[]{})));
        assertTrue((new HashSet<Integer>(Arrays.asList(-1))).contains(app.solutionLineal(new int[]{2, 1, 1, 3})));
    }

}
