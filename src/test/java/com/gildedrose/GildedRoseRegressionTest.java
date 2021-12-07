package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseRegressionTest {

    ByteArrayOutputStream captureStdOut = new ByteArrayOutputStream();


    @Test
    public void testFixtureOutputShouldMatchFor50Days() {
        String expectedResults = readExpectedResults();
        System.setOut(new PrintStream(captureStdOut));

        TexttestFixture.main(new String[]{"50"});

        assertEquals(expectedResults, captureStdOut.toString());
    }

    private String readExpectedResults() {
        String expectedResults = null;
        Path expectedResultsFile = Path.of("test-fixture-results-50days.txt");
        try {
            expectedResults = Files.readString(expectedResultsFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expectedResults;
    }
}
