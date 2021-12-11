package com.example.restapi2.model;

import java.util.List;

public class MatchesItem{
	private Object matchday;
	private AwayTeam awayTeam;
	private String utcDate;
	private String lastUpdated;
	private Score score;
	private String stage;
	private Odds odds;
	private Season season;
	private HomeTeam homeTeam;
	private int id;
	private List<Object> referees;
	private String status;
	private Object group;

	public void setMatchday(Object matchday){
		this.matchday = matchday;
	}

	public Object getMatchday(){
		return matchday;
	}

	public void setAwayTeam(AwayTeam awayTeam){
		this.awayTeam = awayTeam;
	}

	public AwayTeam getAwayTeam(){
		return awayTeam;
	}

	public void setUtcDate(String utcDate){
		this.utcDate = utcDate;
	}

	public String getUtcDate(){
		return utcDate;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setScore(Score score){
		this.score = score;
	}

	public Score getScore(){
		return score;
	}

	public void setStage(String stage){
		this.stage = stage;
	}

	public String getStage(){
		return stage;
	}

	public void setOdds(Odds odds){
		this.odds = odds;
	}

	public Odds getOdds(){
		return odds;
	}

	public void setSeason(Season season){
		this.season = season;
	}

	public Season getSeason(){
		return season;
	}

	public void setHomeTeam(HomeTeam homeTeam){
		this.homeTeam = homeTeam;
	}

	public HomeTeam getHomeTeam(){
		return homeTeam;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setReferees(List<Object> referees){
		this.referees = referees;
	}

	public List<Object> getReferees(){
		return referees;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setGroup(Object group){
		this.group = group;
	}

	public Object getGroup(){
		return group;
	}
}