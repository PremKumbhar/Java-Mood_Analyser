package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("Any Mood")){
            return "HAPPY";
        }
        else {
            return "SAD";
        }
    }
}
