package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NestingTest {

    @Test
    public void testSolutionAlternative() {
        Nesting app = new Nesting();
        assertEquals(0, app.solutionAlternative("("));
        assertEquals(0, app.solutionAlternative(")"));
        assertEquals(0, app.solutionAlternative("())"));
        assertEquals(0, app.solutionAlternative("(()"));
        assertEquals(0, app.solutionAlternative(")("));
        assertEquals(0, app.solutionAlternative("(((("));
        assertEquals(0, app.solutionAlternative("))))"));
        assertEquals(1, app.solutionAlternative("(())"));
        assertEquals(1, app.solutionAlternative("((()))"));
        assertEquals(1, app.solutionAlternative("(()(())())"));
    }

    @Test
    public void testSolutionStack() {
        Nesting app = new Nesting();
        assertEquals(0, app.solutionStack("("));
        assertEquals(0, app.solutionStack(")"));
        assertEquals(0, app.solutionStack("())"));
        assertEquals(0, app.solutionStack("(()"));
        assertEquals(0, app.solutionStack(")("));
        assertEquals(0, app.solutionStack("(((("));
        assertEquals(0, app.solutionStack("))))"));
        assertEquals(1, app.solutionStack("(())"));
        assertEquals(1, app.solutionStack("((()))"));
        assertEquals(1, app.solutionStack("(()(())())"));
    }

}
