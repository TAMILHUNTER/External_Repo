package stepdefinition;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.LNTEYE_Objects;

public class LNTEYESCMmaterial extends LNTEYE_Objects {
	
	static List<String> povaluepage = new ArrayList<String>();
	static List<String> Povaluefromtabel = new ArrayList<String>();
	static List<String> heading = new ArrayList<String>();
	static String POtext, string2;
	public LNTEYESCMmaterial() {

		PageFactory.initElements(Webdriver.driver, LNTEYE_Objects.class);

	}

	@Then("^click on the Supplychain$")
	public void click_on_the_Supplychain() throws Throwable {
		Click(supplychain);
		Thread.sleep(10000);

	}

	@Then("^Compare both table and page values of  PO$")
	public void compare_both_table_and_page_values_of_PO() throws Throwable {
		for (int i = 1; i <= 4; i++) {
			String string = Webdriver.driver.findElement(By.xpath("(//p[@class='project-count ff-3'])[" + i + "]"))
					.getText();
			String string1 = Webdriver.driver.findElement(By.xpath("(//div[@class='project-title ff-2'])[" + i + "]"))
					.getText();
			String string2 = string.replaceFirst(",", "");
			Double doub = Double.parseDouble(string2);
			DecimalFormat df = new DecimalFormat("0");
			String POtext = df.format(Double.valueOf(doub));
			povaluepage.add(POtext);
			heading.add(string1);

		}

		Povaluefromtabel = dbConnection_MutltipleColumns(ConfigFileReader.poJobCode());
		for (int i = 0; i < Povaluefromtabel.size(); i++) {

			

			if (Povaluefromtabel.get(i).equals(povaluepage.get(i))) {
				
				
				Print("Page Value of "+heading.get(i)+" = " + povaluepage.get(i));
				Print("Table Value of "+heading.get(i)+" = "+ Povaluefromtabel.get(i));
				Print("Value Matching" + "\n");
			}

		}

	}

	
	@Then("^select the material group list$")
	public void select_the_material_group_list() throws Throwable {
		Scroll_Down(Page);
		Click(material);
		Thread.sleep(3000);
		Input(materiallist, MaterialCode());
		Click(material_checkbox);
		Thread.sleep(3000);
		Click(search_button);
		SelectText(Unit, "Unit");
		
	    
	}

	@Then("^Compare both table and page values of Material details in the kendo grid$")
	public void compare_both_table_and_page_values_of_Material_details_in_the_kendo_grid() throws Throwable {
		Povaluefromtabel = dbConnection_MutltipleColumns(ConfigFileReader.pomaterialCode());
		
		for (int i = 27; i <= 35; i++) {
			String string = Webdriver.driver.findElement(By.xpath("(//td[@role='gridcell'])[" + i + "]"))
					.getText();
			Print(string);
			int j=i-20;
			String string1 = Webdriver.driver.findElement(By.xpath("(//th[@role='columnheader'])[" + j + "]"))
					.getText();
			 string2 = string.replace(",", "");
			
			try {
				
					Double doub = Double.parseDouble(string2);
					DecimalFormat df = new DecimalFormat("0");
					 POtext = df.format(Double.valueOf(doub));	
				
				
				
			} catch (Exception e) {
				 POtext = string2;
				
			}
			
			
			povaluepage.add(POtext);
			heading.add(string1);

		}
		
		
		for (int i = 0; i < Povaluefromtabel.size(); i++) {

			

			if (Povaluefromtabel.get(i).equals(povaluepage.get(i))) {
				
				
				Print("Page Value of "+heading.get(i)+" = " + povaluepage.get(i));
				Print("Table Value of "+heading.get(i)+" = "+ Povaluefromtabel.get(i));
				Print("Value Matching" + "\n");
			}else {
				
				Print("Page Value of "+heading.get(i)+" = " + povaluepage.get(i));
				Print("Table Value of "+heading.get(i)+" = "+ Povaluefromtabel.get(i));
				Print("Value Mismatching" + "\n");
			}

		}

	}

	}

