import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    StringManipulator stringManipulator;

    @BeforeEach
    void setup() {
         stringManipulator = new StringManipulator();
    }

    @Test
    @DisplayName("Returns reversed string when a string input")
    void reverseString() {

        String inputExample = "String";
        String emptyString = "";

        String expectedOutput1 = "gnirtS";
        String expectedOutput2 = "";

        String result1 = stringManipulator.reverseString(inputExample);
        String result2 = stringManipulator.reverseString(emptyString);
        String nullResult = null;

           assertAll(
                () -> assertNotNull(result1),
                () -> assertNotNull(result2),
                   () -> assertEquals(null, nullResult),
                   () -> assertEquals(expectedOutput1, result1),
                () -> assertEquals(expectedOutput2, result2)
        );

    }

    @Test
    @DisplayName("Returns boolean if the input string is a palindrome")
    void isPalindrome() {

        String input1 = "Mu";
        String input = "";
        String inputPalindrome = "Mum";

        boolean result1 = stringManipulator.isPalindrome(input1);
        boolean result2 = stringManipulator.isPalindrome(input);
        boolean result3 = stringManipulator.isPalindrome(inputPalindrome);

        assertAll(
                () -> assertNotNull(input),
                () -> assertNotNull(input1),
                () -> assertNotNull(inputPalindrome),
                () -> assertFalse(result1),
                () -> assertFalse(result2),
                () -> assertTrue(result3)
        );




    }
}