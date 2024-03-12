package testCases;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.testng.annotations.Test;

import factory.CrossBrowsing;
import pageObjects.BikeDetailsPage;

import utilities.WriteExcelData;

public class TC001_BikeDetails extends CrossBrowsing {
	BikeDetailsPage bike;
	String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";

	@Test(priority =0)
	public void testingBike() {
		bike = new BikeDetailsPage(driver);
	}
	@Test(priority = 1)
	public void testhoverBikes() throws IOException {
		// Pass the WebDriver instance to the BikeDetailsPage constructor
 
		bike.hoverNewBikes();
	}
	
	@Test(priority=2)
	public void testclickUpcomingBikes() {
		bike.clickUpcomingBikes();
	}
	
	@Test(priority=3)
	public void testselectManufacturer() {
		bike.selectManufacturer();
	}
	@Test(priority=4)
	public void testclickToViewMore() throws IOException {
		bike.clickToViewMore();
	}
	
	@Test(priority=5)
	public void testrintUpcomingBikeDetails() throws IOException {
		bike.printUpcomingBikeDetails();
	}

	@Test(priority = 6)
	public void testWriteBikeDetails() {
		LinkedHashMap<String, List<String>> bikeDetailsMap = bike.getUpcomingBikeDetails();
		WriteExcelData.writeBikeDetails(bikeDetailsMap, filepath);
	}
	
	
}
