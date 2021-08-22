package com.redi.j2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class WarmUpExercisesTestCase {

    /**
     * Helper method to DRY test of method squareNumber
     * @param testInput
     */
    private static void testSquareNumber(final int testInput, final int expected) {
        final int result = WarmUpExercises.squareNumber(testInput);
        assertEquals(expected,
                     result,
                     String.format("squareNumber(%d) is returning %d; it should have returned %d",
                                   testInput, result, expected));
    }

    /**
     * Helper method to DRY test of method formatPrintSquareResult
     * @param testInput
     */
    private static void testFormatPrintSquareResult(final int testInput, final String expected) {
        final String result = WarmUpExercises.formatPrintSquareResult(testInput);
        assertEquals(expected,
                     result,
                     String.format("formatPrintSquareResult(%d) is returning %s; it should have returned %s",
                                   testInput, result, expected));
    }

    @Test
    void testSquareNumber_squareOf2_should_notReturnZero() {
        assertNotEquals(0,
                        WarmUpExercises.squareNumber(2),
                        "squareNumber(2) is still returning zero; it should have returned 4\n");
    }

    @Test
    void testSquareNumber_squareOf2_should_return4() {
        final int testInput = 2;
        testSquareNumber(testInput, 4);
    }

    @Test
    void testSquareNumber_squareOf3_should_return9() {
        final int testInput = 3;
        testSquareNumber(testInput, 9);
    }

    @Test
    void testSquareNumber_squareOf4_should_return16() {
        final int testInput = 4;
        testSquareNumber(testInput, 16);
    }

    @Test
    void testSquareNumber_squareOf5_should_return25() {
        final int testInput = 5;
        testSquareNumber(testInput, 25);
    }

    @Test
    void testSquareNumber_squareOf1_should_return1() {
        final int testInput = 1;
        testSquareNumber(testInput, 1);
    }

    @Test
    void testSquareNumber_squareOfZero_should_returnZero() {
        final int testInput = 0;
        testSquareNumber(testInput, 0);
    }

    @Test
    void testFormatPrintSquareResult_squareOf2_should_notReturnNull() {
        assertNotEquals(WarmUpExercises.formatPrintSquareResult(2), null);
    }

    @Test
    void testFormatPrintSquareResult_squareOf2_should_return4() {
        final int testInput = 2;
        testFormatPrintSquareResult(testInput, "4");
    }

    @Test
    void testFormatPrintSquareResult_squareOf3_should_return9() {
        final int testInput = 3;
        testFormatPrintSquareResult(testInput, "9");
    }

    @Test
    void testFormatPrintSquareResult_squareOf4_should_return16() {
        final int testInput = 4;
        testFormatPrintSquareResult(testInput, "16");
    }

    @Test
    void testFormatPrintSquareResult_squareOf5_should_return25() {
        final int testInput = 5;
        testFormatPrintSquareResult(testInput, "25");
    }

    @Test
    void testFormatPrintSquareResult_squareOf1_should_return1() {
        final int testInput = 1;
        testFormatPrintSquareResult(testInput, "1");
    }

    @Test
    void testFormatPrintSquareResult_squareOfZero_should_returnZero() {
        final int testInput = 0;
        testFormatPrintSquareResult(testInput, "0");
    }

}