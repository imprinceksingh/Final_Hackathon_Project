package testCases;

import java.util.List;

import org.testng.annotations.Test;

import factory.CrossBrowsing;

import pageObjects.UsedCarPage;
import utilities.WriteExcelData;

public class TC003_UsedCarDetails extends CrossBrowsing {
	UsedCarPage usedcar ;
	String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";
	List<String> carModels;
	@Test(priority =0)
	public void testing() {
		usedcar = new UsedCarPage(driver);
	}
	
	@Test(priority = 1)
	public void testhoverUsedCars() throws InterruptedException {
		
		usedcar.hoverUsedCars();
	}
	@Test(priority =2)
	public void testclickChennai() {
		usedcar.clickChennai();
	}
	
	@Test(priority =3)
	public void testscrollToPopularModel() {
		usedcar.scrollToPopularModel();
	}
	
	@Test(priority =4)
	public void testprintAllPopularCarModelDetails() throws InterruptedException {
		usedcar.printAllPopularCarModelDetails();
	}
	
	@Test(priority =5)
	public void testprintPopularCarModels() {
		usedcar.printPopularCarModels();
	}
	
	

	@Test(priority = 6)
	public void testWritePopularCarModel() {
		carModels = usedcar.getPopularCarModels();
		WriteExcelData.writePopularCarModel(carModels, filepath);
	}

}

