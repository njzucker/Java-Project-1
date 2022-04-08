package com.noah.finalproject10;

public class Task {
	private String name;
	private boolean completed;
	
	public Task(String name) {
		this.name = name;
		this.completed = false;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	@Override
	public String toString() {
		String message = "";
		if(this.completed == true) {
			message = "(COMPLETE)";
		}
		return this.name + message;
	}
}
