package com.bl.moodanalyser;

public class MoodAnalyser {
	
	String HAPPY = "happy";
	String SAD = "sad";
	
	public String moodAnalyser(String message) {
		if (message.contains("SAD")) {
			return SAD;
		}
		else {
			return HAPPY;
		}
		
	}
	
	public static void main(String[] args) {
		MoodAnalyser mood = new MoodAnalyser();
		
		String message = "I am HAPPPY";
		String moodAnalyser = mood.moodAnalyser(message);
		System.out.println(moodAnalyser + " Mood");
	}
}
