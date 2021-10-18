package com.bz.moodanalyzer;
public class MoodAnalyzer {
    public MoodAnalyzer() {
    }

    public String analyzerMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
