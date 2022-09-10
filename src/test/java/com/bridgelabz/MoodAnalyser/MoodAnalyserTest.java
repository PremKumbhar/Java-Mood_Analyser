package com.bridgelabz.MoodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", actualResult);
    }
}
