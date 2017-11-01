package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracketsTest {

    @Test
    public void testSolutionStack() {
        Brackets app = new Brackets();
        assertEquals(1, app.solutionStack("{[()()]}"));
        assertEquals(0, app.solutionStack("([)()]"));
        assertEquals(0, app.solutionStack("())"));
        assertEquals(1, app.solutionStack("(())"));
        assertEquals(0, app.solutionStack(")("));
        assertEquals(0, app.solutionStack("{{{{"));
    }

    @Test
    public void testSolutionSwitch() {
        Brackets app = new Brackets();
        assertEquals(1, app.solutionSwitch("{[()()]}"));
        assertEquals(0, app.solutionSwitch("([)()]"));
        assertEquals(0, app.solutionSwitch("())"));
        assertEquals(1, app.solutionSwitch("(())"));
        assertEquals(0, app.solutionSwitch(")("));
        assertEquals(0, app.solutionSwitch("{{{{"));
    }


}
