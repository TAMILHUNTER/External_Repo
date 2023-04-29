package test.DBQuery_Tamil;

public class SendDBValue {

	public static String Purchase_Order_Number;
	public static String Work_Order_Number;
	public static String MRN_Number;
	public static String Vendor_code;

	public static void Purchase_Order_Number(String Purchase_Order_Number) {
		System.out.println("Purchase Order Number from DB : " + Purchase_Order_Number);
		System.out.println("===========================================================");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.sendKeys(Purchase_Order_Number);
	}
	
	public static void Work_Order_Number(String Work_Order_Number) {
		System.out.println("Work Order Number from DB : " + Work_Order_Number);
		System.out.println("===========================================================");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.sendKeys(Work_Order_Number);
	}
	
	public static void MRN_Number(String MRN_Number) {
		System.out.println("MRN Number from DB : " + MRN_Number);
		System.out.println("===========================================================");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.sendKeys(MRN_Number);
	}
	
	public static void Vendor_Code(String Vendor_code) {
		System.out.println("Vendor Code from DB : " + Vendor_code);
		System.out.println("===========================================================");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_vendor.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_vendor.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_vendor.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_vendor.sendKeys(Vendor_code);
	}
	
	public static void Purchase_Order_Number_Create(String Purchase_Order_Number_Create) {
		System.out.println("Purchase Order Number from DB : " + Purchase_Order_Number_Create);
		System.out.println("===========================================================");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input.sendKeys(Purchase_Order_Number_Create);
	}

}
