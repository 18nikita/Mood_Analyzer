package com.bz.moodanalyzer;

public class MoodAnalyzer {

	// Method to Check Mood
	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood(" Analyse Mood");
		System.out.println(mood);
	}
}
