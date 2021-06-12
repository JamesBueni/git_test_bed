package com.example.james;

public class Bot {
	private long id;
	private String name;
	
	public Bot(String name) {
		setName(name);
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
