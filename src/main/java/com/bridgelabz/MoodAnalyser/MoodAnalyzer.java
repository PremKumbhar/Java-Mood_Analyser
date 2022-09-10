package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer {
    private String message;
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
        analyseMood();
    }

    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else if (message.contains("happy"))
                return "HAPPY";

        } catch (NullPointerException exception) {
        }
        return "HAPPY";
    }
}