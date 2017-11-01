package codility.lessons;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest {

    private NumberOfDiscIntersections app;

    @Before
    public void setUp() {
        app = new NumberOfDiscIntersections();
    }


    @Test
    @Ignore
    public void testIntersection() {
        assertEquals(true, app.intersec(0, 0, 0, 0));
        assertEquals(true, app.intersec(0, 1, 0, 1));
        assertEquals(true, app.intersec(0, 1, 0, 1));
        assertEquals(true, app.intersec(0, 2, 1, 2));

        assertEquals(true, app.intersec(0, 1, 1, 1));
        assertEquals(true, app.intersec(1, 1, 2, 1));

        assertEquals(true, app.intersec(0, 1, 1, 5));
        assertEquals(true, app.intersec(0, 1, 2, 2));
        assertEquals(false, app.intersec(0, 1, 3, 1));
        assertEquals(true, app.intersec(0, 1, 4, 4));
        assertEquals(false, app.intersec(0, 1, 5, 0));

        assertEquals(true, app.intersec(1, 5, 0, 1));
        assertEquals(true, app.intersec(1, 5, 2, 2));
        assertEquals(true, app.intersec(1, 5, 3, 1));
        assertEquals(true, app.intersec(1, 5, 4, 4));
        assertEquals(true, app.intersec(1, 5, 5, 0));

        assertEquals(true, app.intersec(2, 2, 0, 1));
        assertEquals(true, app.intersec(2, 2, 1, 5));
        assertEquals(true, app.intersec(2, 2, 3, 1));
        assertEquals(true, app.intersec(2, 2, 4, 4));
        assertEquals(false, app.intersec(2, 2, 5, 0));

        assertEquals(false, app.intersec(3, 1, 0, 1));
        assertEquals(true, app.intersec(3, 1, 1, 5));
        assertEquals(true, app.intersec(3, 1, 2, 2));
        assertEquals(true, app.intersec(3, 1, 4, 4));
        assertEquals(false, app.intersec(3, 1, 5, 0));

        assertEquals(true, app.intersec(4, 4, 0, 1));
        assertEquals(true, app.intersec(4, 4, 1, 5));
        assertEquals(true, app.intersec(4, 4, 2, 2));
        assertEquals(true, app.intersec(4, 4, 3, 1));
        assertEquals(true, app.intersec(4, 4, 5, 0));

        assertEquals(false, app.intersec(5, 0, 0, 1));
        assertEquals(true, app.intersec(5, 0, 1, 5));
        assertEquals(false, app.intersec(5, 0, 2, 2));
        assertEquals(false, app.intersec(5, 0, 3, 1));
        assertEquals(true, app.intersec(5, 0, 4, 4));
    }

    @Test
    @Ignore
    public void testLogIntersectionsExample1() {
        app.logIntersections(new int[]{1, 1, 1});
    }

    @Test
    public void testSolutionExample1() {
        assertEquals(3, app.solution(new int[]{1, 1, 1}));
    }

    @Test
    @Ignore
    public void testLogIntersectionsExample2() {
        app.logIntersections(new int[]{1, 2147483647, 0});
    }

    @Test
    public void testSolutionExample2() {
        assertEquals(2, app.solution(new int[]{1, 2147483647, 0}));
    }

    @Test
    @Ignore
    public void testLogIntersectionsMainExample() {
        app.logIntersections(new int[]{1, 5, 2, 1, 4, 0});
    }

    @Test
    public void testSolutionMainExample() {
        assertEquals(11, app.solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

}
