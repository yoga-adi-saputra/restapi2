package com.example.restapi2.model;

import java.util.List;

public class MatchesList{
	private int count;
	private Competition competition;
	private Filters filters;
	private List<MatchesItem> matches;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setCompetition(Competition competition){
		this.competition = competition;
	}

	public Competition getCompetition(){
		return competition;
	}

	public void setFilters(Filters filters){
		this.filters = filters;
	}

	public Filters getFilters(){
		return filters;
	}

	public void setMatches(List<MatchesItem> matches){
		this.matches = matches;
	}

	public List<MatchesItem> getMatches(){
		return matches;
	}
}