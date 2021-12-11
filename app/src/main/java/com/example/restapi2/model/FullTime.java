package com.example.restapi2.model;

public class FullTime{
	private int awayTeam;
	private int homeTeam;

	public void setAwayTeam(int awayTeam){
		this.awayTeam = awayTeam;
	}

	public int getAwayTeam(){
		return awayTeam;
	}

	public void setHomeTeam(int homeTeam){
		this.homeTeam = homeTeam;
	}

	public int getHomeTeam(){
		return homeTeam;
	}
}
