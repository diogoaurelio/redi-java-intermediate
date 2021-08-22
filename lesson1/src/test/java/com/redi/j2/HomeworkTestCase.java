package com.redi.j2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

class HomeworkTestCase {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    public String[] getResult(final int inputArgument) {
        Homework.printTree(inputArgument);
        return outputStreamCaptor.toString().split("\n");
    }

    @Test
    void testPrintTree_should_returnToStandardOutput() {
        final String[] result = getResult(6);
        assertTrue(result.length > 0 && result[0].length() > 0,
                   "Nothing was printed out. Did you forget to call System.out.println ?");
    }

    @Test
    void testPrintTree_withInputArg6_should_printFirstLineICharacter() {
        final int inputArgument = 6;
        final String[] arr = getResult(inputArgument);
        final String expected = "I";
        final String result = arr[0];
        assertEquals(expected,
                     result,
                     String.format("The first line should have printed out the character \"I\", but it was \"%s\" instead",
                                   result));
    }

    @Test
    void testPrintTree_withInputArg6_should_haveCorrectResultLength() {
        final int inputArgument = 6;
        final String[] arr = getResult(inputArgument);
        assertEquals(arr.length,
                     inputArgument,
                     String.format("Result has %d lines, but should have had a total of %d lines", arr.length, inputArgument));
    }

    @Test
    void testPrintTree_withInputArg6_should_printLastLineICharacter() {
        final int inputArgument = 6;
        final String[] arr = getResult(inputArgument);
        final String expected = "M";
        final String result = arr[arr.length -1];
        assertEquals(expected,
                     result,
                     String.format("The last line should have printed out the character \"I\", but it was %s instead",
                                   result));
    }

    @Test
    void testPrintTree_withInputArg6_should_printCorrectSecondLine() {
        final int inputArgument = 6;
        final String[] arr = getResult(inputArgument);
        final String expected = "XY";
        assertTrue(arr.length >= 2, String.format("Insufficient number of lines was printed out; we were expecting at least %d lines",
                                                  2));
        final String result = arr[1];
        assertEquals(expected,
                     result,
                     String.format("The second line should have printed out \"XY\", but it was %s instead",
                                   result));
    }

    @Test
    void testPrintTree_withInputArg6_should_printCorrect3rdLine() {
        final int inputArgument = 6;
        final String[] arr = getResult(inputArgument);
        final String expected = "XYX";
        assertTrue(arr.length >= 3, String.format("Insufficient number of lines was printed out; we were expecting at least %d lines",
                                                  3));
        final String result = arr[2];
        assertEquals(expected,
                     result,
                     String.format("The third line should have printed out \"%s\", but it was %s instead",
                                   expected, result));
    }

    @Test
    void testPrintTree_withInputArg6_should_printCorrect4thLine() {
        final int inputArgument = 6;
        final String[] arr = getResult(inputArgument);
        final String expected = "XYXY";
        assertTrue(arr.length >= 3, String.format("Insufficient number of lines was printed out; we were expecting at least %d lines",
                                                  3));
        final String result = arr[3];
        assertEquals(expected,
                     result,
                     String.format("The fourth line should have printed out \"%s\", but it was %s instead",
                                   expected, result));
    }

    @Test
    void testPrintTree_withInputArg6_should_printCorrect5thLine() {
        final int inputArgument = 6;
        final String[] arr = getResult(inputArgument);
        final String expected = "XYXYX";
        assertTrue(arr.length >= 5, String.format("Insufficient number of lines was printed out; we were expecting at least %d lines",
                                                 5));
        final String result = arr[4];
        assertEquals(expected,
                     result,
                     String.format("The fifth line should have printed out \"%s\", but it was %s instead",
                                   expected, result));
    }

    @Test
    void testPrintTree_withInputArg8_should_haveCorrectResultLength() {
        final int inputArgument = 8;
        final String[] result = getResult(inputArgument);
        assertEquals(result.length,
                     inputArgument,
                     String.format("Result only has %d lines, but should have had a total of %d lines", result.length, inputArgument));
    }

    @Test
    void testPrintTree_withInputArg8_should_printCorrect6thLine() {
        final int inputArgument = 8;
        final String[] arr = getResult(inputArgument);
        final String expected = "XYXYXY";
        assertTrue(arr.length >= 6, String.format("Insufficient number of lines was printed out; we were expecting at least %d lines",
                                                 6));
        final String result = arr[5];
        assertEquals(expected,
                     result,
                     String.format("The 6th line should have printed out \"%s\", but it was %s instead",
                                   expected, result));
    }

    @Test
    void testPrintTree_withInputArg8_should_printCorrect7thLine() {
        final int inputArgument = 8;
        final String[] arr = getResult(inputArgument);
        final String expected = "XYXYXYX";
        assertTrue(arr.length >= 7, String.format("Insufficient number of lines was printed out; we were expecting at least %d lines",
                                                 7));
        final String result = arr[6];
        assertEquals(expected,
                     result,
                     String.format("The 7th line should have printed out \"%s\", but it was %s instead",
                                   expected, result));
    }


    @Test
    void testPrintTree_withInputArg8_should_printLastLineICharacter() {
        final int inputArgument = 8;
        final String[] arr = getResult(inputArgument);
        final String expected = "M";
        assertTrue(arr.length < 8, String.format("Insufficient number of lines was printed out; we were expecting at least %d lines",
                                                 8));
        final String result = arr[arr.length -1];
        assertEquals(expected,
                     result,
                     String.format("The last line should have printed out the character \"I\", but it was %s instead",
                                   result));
    }

    @Test
    void testPrintTree_withInputArgN_should_printFirstLineICharacter() {
        final Random random = new Random();
        final int low = 20;
        final int high = 100;
        final int inputArgument = random.nextInt(high-low) + low;
        final String[] arr = getResult(inputArgument);
        final String expected = "I";
        final String result = arr[0];
        assertEquals(expected,
                     result,
                     String.format("The first line should have printed out the character \"I\", but it was %s instead",
                                   result));
    }


    @Test
    void testPrintTree_withInputArgN_should_printLastLineICharacter() {
        final Random random = new Random();
        final int low = 20;
        final int high = 100;
        final int inputArgument = random.nextInt(high-low) + low;
        final String[] arr = getResult(inputArgument);
        final String expected = "M";
        final String result = arr[arr.length -1];
        assertEquals(expected,
                     result,
                     String.format("The last line should have printed out the character \"I\", but it was %s instead",
                                   result));
    }

}