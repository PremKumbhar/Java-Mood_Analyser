package com.bridgelabz.MoodAnalyser;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message){
        this.message = message;
        analyseMood();
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}