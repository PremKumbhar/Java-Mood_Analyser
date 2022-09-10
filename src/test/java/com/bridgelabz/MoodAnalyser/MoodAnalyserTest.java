package com.bridgelabz.MoodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD", actualResult);
    }

    /**
     * This method will return Happy if we pass as in any mood.
     */
    @Test
    public void givenHappyMessage_shouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", actualResult);
    }
    @Test
    public void givenNullMessage_shouldReturnInvalid(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("null");
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals(" ", actualResult);
    }
}
