package com.example.restapi2.model;

import java.util.List;

public class Filters{
	private List<String> status;

	public void setStatus(List<String> status){
		this.status = status;
	}

	public List<String> getStatus(){
		return status;
	}
}