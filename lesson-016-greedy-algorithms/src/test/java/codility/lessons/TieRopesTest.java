package codility.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TieRopesTest {

    @Test
    public void TieRopesTest() {
        TieRopes app = new TieRopes();
        assertEquals(0, app.solution(5, new int[]{4}));
        assertEquals(1, app.solution(4, new int[]{4}));
        assertEquals(3, app.solution(4, new int[]{1, 2, 3, 4, 1, 1, 3}));
    }

}
