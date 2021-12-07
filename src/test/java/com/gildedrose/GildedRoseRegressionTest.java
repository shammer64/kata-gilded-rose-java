package com.gildedrose;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseRegressionTest {

    ByteArrayOutputStream captureStdOut;
    private static String[] expectedResults;

    @BeforeAll
    static void setupExpectedResults() {
        expectedResults = readExpectedResults();
    }

    @BeforeEach
    public void setupCaptureStream() {
        captureStdOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captureStdOut));
    }

    @Test
    public void testFixtureOutputShouldMatchFor50Days() {
        TexttestFixture.main(new String[]{"50"});
        String[] actualResults = captureStdOut.toString().split(System.lineSeparator());
        for (int index = 0; index < expectedResults.length; index++)
            assertEquals(expectedResults[index], actualResults[index], "Output differs on line " + index + 1);
    }

    private static String[] readExpectedResults() {
        String expectedResults = null;
        Path expectedResultsFile = Path.of("test-fixture-results-50days.txt");
        try {
            expectedResults = Files.readString(expectedResultsFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expectedResults.split(System.lineSeparator());
    }
}
