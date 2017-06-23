package com.javaprograms.secondproject;

public class GalacticCoordinates {
   private String starName;
   private int distanceFromEarth; // In light years (ly)
	
	private int raHour;           //Right Ascension Hour
    private int raMinute;
    private double raSecond;
    
    private int dHour;           //Declination Hour
    private int dMinute;
    private double dSecond;
    
    GalacticCoordinates(String sName, int dist, int rah, int ram, double ras, int dh, int dm, double ds){
    	starName = sName;
    	distanceFromEarth = dist;             
    	
    	raHour = ((rah>=0 && rah<=24) ? rah: 0);             // Right Ascension Values
    	raMinute = ((ram>=0 && ram<=60) ? ram: 0);
    	raSecond = ((ras>=0 && ras<=60) ? ras: 0);
    	
    	dHour = dh;                            // Declination Values, dh is in degrees therefore any value can be used.
    	dMinute = ((dm>=0 && dm<=60) ? dm: 0);
    	dSecond = ((ds>=0 && ds<=60) ? ds: 0);
    }
        
    public String rightAscension(){
    	return String.format("%02d:%02d':%.3f''", raHour, raMinute, raSecond);
    }
    
    public String getStarName(){
    	return starName;
    }
    
    public String getDeclination(){
    	return String.format("%02d°:%02d':%.3f''", dHour, dMinute, dSecond);
    }
    
    public int getDistanceFromEarth(){
    	return distanceFromEarth;
    }
}
