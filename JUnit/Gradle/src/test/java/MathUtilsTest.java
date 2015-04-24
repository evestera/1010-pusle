import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testAdd() throws Exception {
        assertEquals(MathUtils.add(2, 2), 4);
    }

}
