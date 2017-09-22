package com.bidhan.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Spent 30 minutes in batting practice";
	}
}
