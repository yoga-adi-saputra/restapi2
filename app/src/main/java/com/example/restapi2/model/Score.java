package com.example.restapi2.model;

public class Score{
	private String duration;
	private String winner;
	private Penalties penalties;
	private HalfTime halfTime;
	private FullTime fullTime;
	private ExtraTime extraTime;

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setWinner(String winner){
		this.winner = winner;
	}

	public String getWinner(){
		return winner;
	}

	public void setPenalties(Penalties penalties){
		this.penalties = penalties;
	}

	public Penalties getPenalties(){
		return penalties;
	}

	public void setHalfTime(HalfTime halfTime){
		this.halfTime = halfTime;
	}

	public HalfTime getHalfTime(){
		return halfTime;
	}

	public void setFullTime(FullTime fullTime){
		this.fullTime = fullTime;
	}

	public FullTime getFullTime(){
		return fullTime;
	}

	public void setExtraTime(ExtraTime extraTime){
		this.extraTime = extraTime;
	}

	public ExtraTime getExtraTime(){
		return extraTime;
	}
}
