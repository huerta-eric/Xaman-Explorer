/*  Xaman Ek - Mayan God of the North Star. The patron god of merchants and travelers.  
    http://www.samaelgnosis.net/revista/ser43/xaman_ek.html
    
    This program stores the location of any object in the Milky Way galaxy. The program uses the Galactic Coordinate System
    for specifying an object's location relative to the Sun and the Galactic core of the Milky Way. The program also returns 
    the time it would take for any object to reach a particular location given that the speed of the object is provided in 
    meters/second
    
    The Galactic Coordinate System uses declination and Right Ascension to locate an object. 
    Declination (delta): angular distance from the celestial equator (+=north, -=south)
    Right Ascension (alpha): angular distance along circles parallel to the equator. Define zero point to be the vernal equinox,
    the point where the Sun's position crosses the celestial equator as it moves north. Right ascension increases going eastward.
    
    Dec is measured in degrees, minutes of arc, seconds of arc, or decimal degrees.
    RA is measured in either time (hr, min of time, sec of time), or in decimal degrees.
    http://burro.case.edu/Academics/Astr306/Coords/coords.html
*/
package com.javaprograms.secondproject;
import java.util.*;

public class XamanExplorer {

	public static void main(String[] args) {
		
		System.out.println("STAR INFORMATION");
		/*Values passed to GalacticCoordinates Constructor: Star's name, Distance from Earth (in light-years), 
		  Right Ascension hour, Right Ascension minute, Right Ascension second, Degrees, arcminute, arcsecond*/
		
		GalacticCoordinates alphard = new GalacticCoordinates("Alphard", 177, 9, 27, 35.433, -8, 39, 30.969); 
        System.out.println("\nALPHARD\nRight Ascension of " + alphard.getStarName() + ": " + alphard.rightAscension());
        System.out.println("Declination of " + alphard.getStarName() + ": " + alphard.getDeclination());
        System.out.println("Distance of " + alphard.getStarName() + " from Earth: " + alphard.getDistanceFromEarth() + " ly");
        
        GalacticCoordinates deneb = new GalacticCoordinates("Deneb", 2600, 20, 41, 25.9, 45, 16, 49); 
        System.out.println("\nDENEB\nRight Ascension of " + deneb.getStarName() + ": " + deneb.rightAscension());
        System.out.println("Declination of " + deneb.getStarName() + ": " + deneb.getDeclination());
        System.out.println("Distance of " + deneb.getStarName() + " from Earth: " + deneb.getDistanceFromEarth() + " ly");
        
        GalacticCoordinates albireo = new GalacticCoordinates("Albireo", 430, 19, 30, 43.286, 27, 57, 34.84); 
        System.out.println("\nALBIREO\nRight Ascension of " + albireo.getStarName() + ": " + albireo.rightAscension());
        System.out.println("Declination of " + albireo.getStarName() + ": " + albireo.getDeclination());
        System.out.println("Distance of " + albireo.getStarName() + " from Earth: " + albireo.getDistanceFromEarth() + " ly");
        
        GalacticCoordinates sadr = new GalacticCoordinates("Sadr", 1800, 20, 22, 13.70184, 40, 15, 24.0450); 
        System.out.println("\nSADR\nRight Ascension of " + sadr.getStarName() + ": " + sadr.rightAscension());
        System.out.println("Declination of " + sadr.getStarName() + ": " + sadr.getDeclination());
        System.out.println("Distance of " + sadr.getStarName() + " from Earth: " + sadr.getDistanceFromEarth() + " ly");
        
        GalacticCoordinates alphaCephei = new GalacticCoordinates("Alpha Cephei", 49, 21, 18, 34.7715, 62, 35, 08.061); 
        System.out.println("\nALPHA CEPHEI\nRight Ascension of " + alphaCephei.getStarName() + ": "
        + alphaCephei.rightAscension());
        System.out.println("Declination of " + alphaCephei.getStarName() + ": " + alphaCephei.getDeclination());
        System.out.println("Distance of " + alphaCephei.getStarName() + " from Earth: " + alphaCephei.getDistanceFromEarth() 
        + " ly");
        
        GalacticCoordinates lesath = new GalacticCoordinates("Lesath", 580, 17, 30, 45.83712, -37, 17, 44.9285); 
        System.out.println("\nLESATH\nRight Ascension of " + lesath.getStarName() + ": " + lesath.rightAscension());
        System.out.println("Declination of " + lesath.getStarName() + ": " + lesath.getDeclination());
        System.out.println("Distance of " + lesath.getStarName() + " from Earth: " + lesath.getDistanceFromEarth() + " ly");
        
        /*Vehicles available for travel. Name & speed in meters/second is passed to the constructor. The speed is converted to
        light years per year (ly/year)*/
        Vehicle voyagerOne = new Vehicle("Voyager 1", 17260);
        Vehicle voyagerTwo = new Vehicle("Voyager 2", 16080);
        Vehicle pioneerEleven = new Vehicle("Pioneer 11", 11380);
        Vehicle galileo = new Vehicle("Galileo", 48270);
        
        travelTime(alphaCephei, voyagerOne);
        travelTime(alphaCephei, galileo);
        
        //Execute or Terminate computer diagnostic tools onboard a particular spacecraft.
        galileo.execute();
        galileo.terminate();
	}
        
	public static void travelTime(GalacticCoordinates star, Vehicle transport){ 
		double travelTime;
		
		travelTime = star.getDistanceFromEarth()/transport.getLightYearsPerYear();
		
		System.out.println("\nTravel Time of " + transport.getName() + " to " + star.getStarName() + ": " +
		travelTime + " years");
	}
	   		
}


