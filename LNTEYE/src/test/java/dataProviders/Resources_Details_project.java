package dataProviders;

public class Resources_Details_project {
	
	public static String ResourcesDBQurey(String job){
		
		String qurey= "exec [LNT_EYE].[PRF].[LNTEYE_Supply_Resources_Details] '"+job+"'";
		
		return qurey;

		
		
}
	public static String plantDBQurey(String job){
	
		String qurey= "exec [LNT_EYE].[PRF].[LNTEYE_Plant_Resources_Details] '"+job+"'";
			
			return qurey;
	
}
	
	public static String staffDBQurey(String job){
		
		String qurey= "exec [LNT_EYE].[PRF].[LNTEYE_Staff_Workmen_Resources_Details] '"+job+"'";
			
			return qurey;
	
}
	
public static String idcDBQurey(String job){
		
		String qurey= "exec [LNT_EYE].[PRF].[LntEYE_IDC_PLanned_Spend] '"+job+"'";
			
			return qurey;
	
}
	
	public static String serviceDBQurey(String job){
		
		String qurey= "exec [LNT_EYE].[PRF].[LNTEYE_Service_Resources_Details] '"+job+"'";
			
			return qurey;
	
}
}
