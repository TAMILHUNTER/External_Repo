package runner;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\resources\\featurefile" }, 
		glue = {"stepdefinition" }, 
		monochrome = true, 
		publish = true, 
				tags = "@CreateWorkmen",
						
						
		plugin = { 
				"pretty",  
				"html:src/reports/Junit-Cucumber/cucumber.html",
				"json:src/reports/Junit-Cucumber/cucumber.json", 
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
)
public class Tamil_WorkingSuite {
	
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	@AfterClass
	public static void writeExtentReport() throws IOException {

		
	}

}
