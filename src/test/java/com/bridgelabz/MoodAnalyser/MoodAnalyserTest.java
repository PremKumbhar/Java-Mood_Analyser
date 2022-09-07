package com.bridgelabz.MoodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualResult = moodAnalyzer.analyseMood("I am in Any Mood");
        Assertions.assertEquals("HAPPY", actualResult);
    }


}
