package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dataProviders.ConfigFileReader;

@RunWith(Cucumber.class)

@CucumberOptions(
			
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:src/reports/cucumber-reports/reports/"
		
				+ ""+ "Automation Test Report_"+".html"}, 
		features = "src\\test\\resources\\featurefile", 
		glue = {"stepdefinition" }, 
		monochrome = true, 
		dryRun=false,
		tags = { "@eAuctionPackageReverseRateDiscovery,"+
		
		"@eAuctionPackageReverseRateDiscoveryBQ," +
		"@eAuctionPackageReverseRateDiscoveryTCC," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicable," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableTCC," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBids," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorA," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorB," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorC," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorD," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAA," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAB," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAC," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAD," +
		"@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsTCC," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendor," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorABQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorBBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorCBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorDBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorAABQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorABBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorACBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorADBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorTCC," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBidding," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingABQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingBBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingCBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingDBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingAABQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingABBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingACBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingADBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingBABQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingBABQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingBBBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingBCBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingBDBQ," +
		"@eAuctionPackageReverseRateDiscoveryBaseRateApplicableMultiVendorMultiMaterialPartialBiddingTCC," +
		"@eAuctionPackageRankOrderReverseRateDiscovery," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryTCC," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryBaseRateApplicable," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryBaseRateApplicableBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryBaseRateApplicableTCC," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBids," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorBBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorCBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorDBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorABBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorACBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorADBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsTCC," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBids," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsBBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsCBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsDBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsVendorABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsVendorBBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsVendorCBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsVendorDBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePostAllBidsTCC," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBidding," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingBBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingCBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingDBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingAABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingABBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingACBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingADBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingAAABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingAABBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingAACBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingAADBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialPartialBiddingTCC," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBidding," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingABA," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingBBA," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingCBA," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingDBA," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingAABAQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingABBAQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingACBAQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingADBAQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingVendorAABQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingVendorABBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingVendorACBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingVendorADBQ," +
		"@eAuctionPackageRankOrderReverseRateDiscoveryMultiVendorandMultiMaterialBaseRateApplicablePartialBiddingTCC" 
				
		})




public class TestRunnerNew {
	 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	@AfterClass
	public static void writeExtentReport() {
	
		Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
		Reporter.setSystemInfo("User Name", "GOPALAKRISHNAN S");
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
	
}


