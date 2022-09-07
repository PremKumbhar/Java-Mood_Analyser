package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("Sad")){
            return "SAD";
        }
        else if (message.contains("Happy")){
            return "HAPPY";
        }
        return "";
    }
}
