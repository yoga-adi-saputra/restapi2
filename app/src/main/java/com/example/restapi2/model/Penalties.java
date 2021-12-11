package com.example.restapi2.model;

public class Penalties{
	private Object awayTeam;
	private Object homeTeam;

	public void setAwayTeam(Object awayTeam){
		this.awayTeam = awayTeam;
	}

	public Object getAwayTeam(){
		return awayTeam;
	}

	public void setHomeTeam(Object homeTeam){
		this.homeTeam = homeTeam;
	}

	public Object getHomeTeam(){
		return homeTeam;
	}
}
