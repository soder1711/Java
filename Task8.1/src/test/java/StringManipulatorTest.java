import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    private StringManipulator manipulator;

    @BeforeEach
    void setUp() {
        manipulator = new StringManipulator();
    }

    @Test
    void testConcatenate() {
        assertEquals("HelloWorld", manipulator.concatenate("Hello", "World"));
        assertEquals("Java", manipulator.concatenate("Ja", "va"));
    }

    @Test
    void testFindLength() {
        assertEquals(10, manipulator.findLength("HelloWorld"));
        assertEquals(0, manipulator.findLength(""));
        assertEquals(4, manipulator.findLength("Java"));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("HELLO", manipulator.convertToUpperCase("hello"));
        assertEquals("WORLD", manipulator.convertToUpperCase("World"));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("hello", manipulator.convertToLowerCase("HELLO"));
        assertEquals("world", manipulator.convertToLowerCase("World"));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("HelloWorld", "World"));
        assertFalse(manipulator.containsSubstring("HelloWorld", "Java"));
    }
}