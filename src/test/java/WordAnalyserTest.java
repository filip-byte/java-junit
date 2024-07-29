import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {
    WordAnalyser analyser;
    @BeforeEach
    void setUp() {
        analyser = new WordAnalyser();
    }

    @Test
    void findLongestWords() {
        String input1 = "";
        String input2 = "This is a fairly boring sentence.";
        String input3 = "This is a fairly boring thing.";
        String input4 = "OneWord";
        String[] expectedResult1 = {""};
        String[] expectedResult2 = {"sentence"};
        String[] expectedResult3 = {"fairly","boring"};
        String[] expectedResult4 = {"OneWord"};


        String[] result1 = analyser.findLongestWords(input1);
        String[] result2 = analyser.findLongestWords(input2);
        String[] result3 = analyser.findLongestWords(input3);
        System.out.println("REsult3:" + Arrays.toString(result3));
        String[] result4 = analyser.findLongestWords(input4);

        assertAll(
                () -> assertArrayEquals(expectedResult1,result1),
                () -> assertArrayEquals(expectedResult2,result2),
                () -> assertArrayEquals(expectedResult3,result3),
                () -> assertArrayEquals(expectedResult4,result4)
        );


    }

    @Test
    void calculateLetterFrequency() {
    }
}