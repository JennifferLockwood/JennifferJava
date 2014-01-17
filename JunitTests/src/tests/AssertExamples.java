package tests;

import org.junit.Test;

// This doesn't expose arrayEquals for example:  import static junit.framework.Assert.*;
// Use this instead
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: john
 * Date: 1/14/14
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class AssertExamples {
    @Test
    public void testAssertTrue() {
       assertTrue(true);
    }

    @Test
    public void testAssertNumbersNotEqualUsingAssertFalse() {
        assertFalse(1 == 10);
    }

    @Test
    public void testAssertEqual() {
        int a = 10;
        int b = 10;
        assertEquals(a, b);
        assertEquals(a, 5 + 5);
    }

    @Test
    public void testAssertEqualArrays() {
        int array1[] = new int[3];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }

        int array2[] = {1, 2, 3};

        assertArrayEquals(array1, array2);

    }
}
