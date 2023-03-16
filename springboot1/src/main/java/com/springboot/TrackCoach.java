package com.springboot;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

	public String getDailyWorkout() {
		return "Practice 5k Running in Track";
	}

}
