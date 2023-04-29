package stepdefinition;

import java.text.DecimalFormat;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import dataProviders.LNTEYE_DB_Query;
import dataProviders.Resources_Details_project;
import object_repository.LNTEYE_Objects;

public class LNTEYEResources  extends LNTEYE_Objects {
	
	
	public static String Materialplanned,PageValue,TableValue,POCommitment,MaterialReceivedproject,
	Stock90days,Stockmoredays,ServicePlannedproject,WOCommitmentproject,WorkdoneBilledproject,
	PMPlannedCostproject,PMSpendDateproject,SurplusAssetproject,StaffPlannedCostproject,
	StaffSpendDateproject,StaffEmployedproject,WorkmenEmployedproject,ProvisionalCostproject;
	
	public LNTEYEResources () {

		PageFactory.initElements(Webdriver.driver, LNTEYE_Objects.class);

	}
	
	
	@Then("^click on the Resourcemenu$")
	public void click_on_the_Resourcemenu() throws Throwable {
		Click(Resource);
		Thread.sleep(10000);
		
	    
	}

	@Then("^Compare both table and page values of  Material_Planned_Cost;$")
	public void compare_both_table_and_page_values_of_Material_Planned_Cost() throws Throwable {
		Materialplanned = GetText(Material_Planned_Cost);
		PageValue = Materialplanned.replace(",", "");
		Print("PageValue: " + PageValue);
		String Materialplannedtabel  = Get_Table_Data(Resources_Details_project.ResourcesDBQurey(JobCode()), 2);
		Double d = Double.valueOf(Materialplannedtabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Materialplanned Values are Matching");
		} else {
			Print("Materialplanned Values mismatching");
		}
	}
		
	

	@Then("^Compare both table and page values of PO_Commitment_Made$")
	public void compare_both_table_and_page_values_of_PO_Commitment_Made() throws Throwable {
	    
		POCommitment = GetText(PO_Commitment_Made);
		PageValue = POCommitment.replace(",", "");
		Print("PageValue: " + PageValue);
		String POCommitmenttabel  = Get_Table_Data(Resources_Details_project.ResourcesDBQurey(JobCode()), 3);
		Double d = Double.valueOf(POCommitmenttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("PO_Commitment_Made Values are Matching");
		} else {
			Print("PO_Commitment_Made Values mismatching");
		}
	}	
	

	@Then("^Compare both table and page values of Material_Received$")
	public void compare_both_table_and_page_values_of_Material_Received() throws Throwable {
		MaterialReceivedproject  = GetText(Material_Received);
		PageValue = MaterialReceivedproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String MaterialReceivedprojecttabel  = Get_Table_Data(Resources_Details_project.ResourcesDBQurey(JobCode()), 4);
		Double d = Double.valueOf(MaterialReceivedprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Material_Received Values are Matching");
		} else {
			Print("Material_Received Values mismatching");
		}
	}	

	@Then("^Compare both table and page values of Stock_(\\d+)_days$")
	public void compare_both_table_and_page_values_of_Stock___days(int arg1) throws Throwable {
		Stock90days  = GetText(Stock_90_days);
		PageValue = Stock90days.replace(",", "");
		Print("PageValue: " + PageValue);
		String Stock90daystabel  = Get_Table_Data(Resources_Details_project.ResourcesDBQurey(JobCode()), 5);
		Double d = Double.valueOf(Stock90daystabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Stock < Values are Matching");
		} else {
			Print("Stock < Values mismatching");
		}
	}	
	
	@Then("^Compare both table and page values of Stock_days$")
	public void compare_both_table_and_page_values_of_Stock_days() throws Throwable {
		Stockmoredays  = GetText(Stock_days);
		PageValue = Stockmoredays.replace(",", "");
		Print("PageValue: " + PageValue);
		String Stockmoredaystabel  = Get_Table_Data(Resources_Details_project.ResourcesDBQurey(JobCode()), 6);
		Double d = Double.valueOf(Stockmoredaystabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Stock >Values are Matching");
		} else {
			Print("Stock >Values mismatching");
		}
	}	

	@Then("^Compare both table and page values of Service_Planned_Cost$")
	public void compare_both_table_and_page_values_of_Service_Planned_Cost() throws Throwable {
		ServicePlannedproject  = GetText(Service_Planned_Cost);
		PageValue = ServicePlannedproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String ServicePlannedprojecttabel  = Get_Table_Data(Resources_Details_project.serviceDBQurey(JobCode()), 2);
		Double d = Double.valueOf(ServicePlannedprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Service_Planned_Cost Values are Matching");
		} else {
			Print("Service_Planned_Cost Values mismatching");
		}
	}	
	@Then("^Compare both table and page values of WO_Commitment_Made$")
	public void compare_both_table_and_page_values_of_WO_Commitment_Made() throws Throwable {
		WOCommitmentproject = GetText(WO_Commitment_Made);
		PageValue = WOCommitmentproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String WOCommitmentprojecttabel  = Get_Table_Data(Resources_Details_project.serviceDBQurey(JobCode()), 3);
		Double d = Double.valueOf(WOCommitmentprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("WO_Commitment_Made Values are Matching");
		} else {
			Print("WO_Commitment_Made Values mismatching");
		}
	}	

	@Then("^Compare both table and page values of Work_done_Billed$")
	public void compare_both_table_and_page_values_of_Work_done_Billed() throws Throwable {
		WorkdoneBilledproject = GetText(Work_done_Billed);
		PageValue = WorkdoneBilledproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String WorkdoneBilledprojecttabel  = Get_Table_Data(Resources_Details_project.serviceDBQurey(JobCode()), 4);
		Double d = Double.valueOf(WorkdoneBilledprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Work_done_Billed Values are Matching");
		} else {
			Print("Work_done_Billed Values mismatching");
		}
	}	
	
	@Then("^Compare both table and page values of PM_Planned_Cost$")
	public void compare_both_table_and_page_values_of_PM_Planned_Cost() throws Throwable {
		PMPlannedCostproject = GetText(PM_Planned_Cost);
		PageValue = PMPlannedCostproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String PMPlannedCostprojecttabel  = Get_Table_Data(Resources_Details_project.plantDBQurey(JobCode()), 2);
		Double d = Double.valueOf(PMPlannedCostprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("PM_Planned_Cost Values are Matching");
		} else {
			Print("PM_Planned_CostValues mismatching");
		}
	}	

	@Then("^Compare both table and page values of PM_Spend_Date$")
	public void compare_both_table_and_page_values_of_PM_Spend_Date() throws Throwable {
		    PMSpendDateproject = GetText(PM_Spend_Date);
			PageValue = PMSpendDateproject.replace(",", "");
			Print("PageValue: " + PageValue);
			String PMSpendDateprojecttabel  = Get_Table_Data(Resources_Details_project.plantDBQurey(JobCode()), 3);
			Double d = Double.valueOf(PMSpendDateprojecttabel);
			DecimalFormat df = new DecimalFormat("0.00");
			TableValue = df.format(d);
			Print("TableValue: " + TableValue);
			if (PageValue.equals(TableValue)) {
				Print("PM_Spend_Date Values are Matching");
			} else {
				Print("PM_Spend_Date Values mismatching");
			}
		}	

	

	@Then("^Compare both table and page values of Surplus_Asset$")
	public void compare_both_table_and_page_values_of_Surplus_Asset() throws Throwable {
		    SurplusAssetproject = GetText(Surplus_Asset);
			PageValue = SurplusAssetproject.replace(",", "");
			Print("PageValue: " + PageValue);
			String SurplusAssetprojecttabel  = Get_Table_Data(Resources_Details_project.plantDBQurey(JobCode()), 6);
			Double d = Double.valueOf(SurplusAssetprojecttabel);
			DecimalFormat df = new DecimalFormat("0");
			TableValue = df.format(d);
			Print("TableValue: " + TableValue);
			if (PageValue.equals(TableValue)) {
				Print("Surplus_Asset Values are Matching");
			} else {
				Print("Surplus_Asset Values mismatching");
			}
		}	
	@Then("^Compare both table and page values of Staff_Planned_Cost$")
	public void compare_both_table_and_page_values_of_Staff_Planned_Cost() throws Throwable {
		StaffPlannedCostproject = GetText(Staff_Planned_Cost);
		PageValue = StaffPlannedCostproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String StaffPlannedCostprojecttabel  = Get_Table_Data(Resources_Details_project.staffDBQurey(JobCode()), 2);
		Double d = Double.valueOf(StaffPlannedCostprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Staff_Planned_Cost Values are Matching");
		} else {
			Print("Staff_Planned_Cost Values mismatching");
		}
	}	

	@Then("^Compare both table and page values of Staff_Spend_Date;$")
	public void compare_both_table_and_page_values_of_Staff_Spend_Date() throws Throwable {
		StaffSpendDateproject = GetText(Staff_Spend_Date);
		PageValue = StaffSpendDateproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String StaffSpendDateprojecttabel  = Get_Table_Data(Resources_Details_project.staffDBQurey(JobCode()), 3);
		Double d = Double.valueOf(StaffSpendDateprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Staff_Spend_Date Values are Matching");
		} else {
			Print("Staff_Spend_Date Values mismatching");
		}
	}	

	@Then("^Compare both table and page values of Staff_Employed$")
	public void compare_both_table_and_page_values_of_Staff_Employed() throws Throwable {
		StaffEmployedproject = GetText(Staff_Employed);
		PageValue = StaffEmployedproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String StaffEmployedprojecttabel  = Get_Table_Data(Resources_Details_project.staffDBQurey(JobCode()), 4);
		Double d = Double.valueOf(StaffEmployedprojecttabel);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Staff_Employed Values are Matching");
		} else {
			Print("Staff_Employed Values mismatching");
		}
	}	

	@Then("^Compare both table and page values of  Workmen_Employed$")
	public void compare_both_table_and_page_values_of_Workmen_Employed() throws Throwable {
		WorkmenEmployedproject = GetText(Workmen_Employed);
		PageValue = WorkmenEmployedproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String WorkmenEmployedprojecttabel  = Get_Table_Data(Resources_Details_project.staffDBQurey(JobCode()), 5);
		Double d = Double.valueOf(WorkmenEmployedprojecttabel);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Workmen_Employed Values are Matching");
		} else {
			Print("Workmen_Employed Values mismatching");
		}
	}	

	@Then("^Compare both table and page values of Provisional_Cost$")
	public void compare_both_table_and_page_values_of_Provisional_Cost() throws Throwable {
		ProvisionalCostproject = GetText(Provisional_Cost);
		PageValue = ProvisionalCostproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String ProvisionalCostprojecttabel  = Get_Table_Data(Resources_Details_project.idcDBQurey(JobCode()), 3);
		Double d = Double.valueOf(ProvisionalCostprojecttabel);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Provisional_Cost Values are Matching");
		} else {
			Print("Provisional_Cost Values mismatching");
		}
	}	

}
