package com.springboot;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	public String getDailyWorkout() {
		
		return "Practice Fast Bowling for 20minute";
	}
	
	

}
