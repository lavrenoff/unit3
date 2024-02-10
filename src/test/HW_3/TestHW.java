package HW_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestHW {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testEven(int n){
        assertEquals(0, n % 2);
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    void testNotEven(int n){
        assertNotEquals(0, n % 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 37, 58, 99})
    void testNumberInInterval(int n){
        assertTrue(n > 25 && n < 100);
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 12, 157, 100})
    void testNumberNotInInterval(int n){
        assertFalse(n > 25 && n < 100);
    }
}