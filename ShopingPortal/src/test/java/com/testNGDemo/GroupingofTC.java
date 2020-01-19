package com.testNGDemo;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.logger.Log;


public class GroupingofTC 
{
	
		 
	 @BeforeMethod
	 public void setLogger()
	 {
		  
	 }
		  @Test (groups = { "Car" })
		 
		  public void Car1() {

			 
			  Log.info("Batch Car - Test car 1");
		
		 
		  }
		 
		  @Test (groups = { "Car" })
		 
		  public void Car2() {
			  Log.info("Batch Car - Test car 2");
		   
		 
		  }
		 
		  @Test (groups = { "Scooter" })
		 
		  public void Scooter1() {
			  Log.info("Batch Scooter - Test scooter 1");
		  
		 
		  }
		 
		  @Test (groups = { "Scooter" })
		 
		  public void Scooter2() {
		 
			  Log.info("Batch Scooter - Test scooter 2");
		 
		  }
		 
		  @Test (groups = { "Car", "Sedan Car" })
		 
		  public void Sedan1() {
		 
			  Log.info("Batch Sedan Car - Test sedan 1");
		 
		  }
		 
}
