package com.lambdas;

public class IntermediateReportFormat {
	
	private String name;
	private char band;
	private int points;
	
	
	public IntermediateReportFormat(String name, char band, int points) {
		//super();
		this.name = name;
		this.band = band;
		this.points = points;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getBand() {
		return band;
	}
	public void setBand(char band) {
		this.band = band;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}


	@Override
	public String toString() {
		return "IntermediateReportFormat [name=" + name + ", band=" + band + ", points=" + points + "]";
	}
	
	

}
