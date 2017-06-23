package com.javaprograms.secondproject;

public class Vehicle implements Switchable{
    private String shipName;
	private double lightYearsPerYear;
    private double secondsInYear = 31536000;
    private long oneLightYear = 9460730472580800L;
	
	Vehicle(String name, int mps){
		shipName = name;		
		lightYearsPerYear = (mps*secondsInYear)/oneLightYear;
		System.out.println("LightYearsPerYear: "+ lightYearsPerYear);
	}
	
	public String getName(){
		return shipName;
	}
	
	public double getLightYearsPerYear(){
		
		return lightYearsPerYear;
	}
	
	public void execute(){
		System.out.println("\nExecute computer command subsystem (CCS) diagnostics.");
	}
	
	public void terminate(){
		System.out.println("\nTerminate computer command subsystem (CCS) diagnostics.");
	}
}
