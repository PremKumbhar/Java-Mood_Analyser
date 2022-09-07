package com.bridgelabz.MoodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        String actualResult = moodAnalyzer.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", actualResult);
    }

    /**
     * This method will return Happy if we pass as in any mood.
     */
    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        String actualResult = moodAnalyzer.analyseMood("I am in Happy Mood");
        Assertions.assertEquals("HAPPY", actualResult);
    }

}
