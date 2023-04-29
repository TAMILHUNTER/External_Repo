package dataProviders;

public class LNTEYE_DB_Query  {
	
public static String LNTEYEDBQurey(String job){
		
		String qurey=
				"Declare                                   \r\n" + 
				"				@PMSMonth varchar(15),                                   \r\n" + 
				"				@PMSMaxMonth int,                                  \r\n" + 
				"				@PMSMaxYear int   ,                  \r\n" + 
				"				@ACEMargin Decimal(19,4),                  \r\n" + 
				"				@JCRMargin Decimal(19,4) ,                  \r\n" + 
				"				@JCRRevisedEstimate     Decimal(19,4)      ,                  \r\n" + 
				"				@AceCost     Decimal(19,4)      ,                   \r\n" + 
				"				@parentRollup char(1) =0 ,                  \r\n" + 
				"				@ACERCV   Decimal(19,4)      ,                   \r\n" + 
				"				@JCRRCV Decimal(19,4)    ,              \r\n" + 
				"				@ldecimalPNMRevEstimateCost decimal(19,4)=0      ,               \r\n" + 
				"				@PNMCost   DECIMAL(19,4) ,              \r\n" + 
				"				@ldecStaffRevEstCost DECIMAL(19, 4)      ,            \r\n" + 
				"				@StaffCostSpend DECIMAL(19, 4)       ,            \r\n" + 
				"				@IDCRevisedEstimate decimal(19,4)=0   ,    \r\n" + 
				"				@IDCCostAsonDate decimal(19,4) ,   \r\n" + 
				"				@JOBCODE varchar(max) ='"+ job +"'   \r\n" + 
				"				     \r\n" + 
				"				    \r\n" + 
				"				set @IDCCostAsonDate =    \r\n" + 
				"				 (    \r\n" + 
				"				 Select Sum(Native_Currency_Amount)    \r\n" + 
				"				 From     \r\n" + 
				"				EDW40.DEN.EDW_Unif_Cost_Statement_DC_IDC     \r\n" + 
				"				where  Job_Code=@JOBCODE and Cost_Tag ='IDC'    \r\n" + 
				"				     \r\n" + 
				"				)    \r\n" + 
				"				    \r\n" + 
				"				    \r\n" + 
				"				set @IDCRevisedEstimate =    \r\n" + 
				"				 (Select Sum(MaterialETC+SCETC+PNMETC+StaffETC)    \r\n" + 
				"				   From  EDW40.den.EDW_EIPPlan_Resouce_JCR_CP_Details    \r\n" + 
				"				where  JobCode=@JOBCODE and CP_Code like 'ID%'    \r\n" + 
				"				)    \r\n" + 
				"				Select  @JCRRCV =  JCR_RCV                   \r\n" + 
				"				from  EDW40.DEN.EDW_Planning_Resouce_Cost_Details                  \r\n" + 
				"				where JobCode=@JOBCODE                 \r\n" + 
				"				                  \r\n" + 
				"				Select  @ACERCV =  ACE_RCV                   \r\n" + 
				"				from  EDW40.DEN.EDW_EIPPlan_Resouce_ACE_Details                  \r\n" + 
				"				where JobCode=@JOBCODE                  \r\n" + 
				"				                   \r\n" + 
				"				set @ACEMargin =                  \r\n" + 
				"				(                  \r\n" + 
				"				Select ((@ACERCV - Sum(ACE_Amount))/@ACERCV)*100.00                   \r\n" + 
				"				From                   \r\n" + 
				"				 EDW40.DEN.GLM_Job_Master                   \r\n" + 
				"				 where Parent_Job_Code = @JOBCODE                  \r\n" + 
				"				                  \r\n" + 
				"				)                   \r\n" + 
				"				                   \r\n" + 
				"				set @ACECost =                  \r\n" + 
				"				(                  \r\n" + 
				"				 Select   Sum(ACE_Amount)                   \r\n" + 
				"				 From                   \r\n" + 
				"				 EDW40.DEN.GLM_Job_Master                   \r\n" + 
				"				 where Parent_Job_Code = @JOBCODE                 \r\n" + 
				"				)                   \r\n" + 
				"				                  \r\n" + 
				"				Set @JCRMargin = (                    \r\n" + 
				"				Select ((@JCRRCV - Sum(JCR_Amount))/@JCRRCV)*100.00                   \r\n" + 
				"				From                   \r\n" + 
				"				 EDW40.DEN.GLM_Job_Master                   \r\n" + 
				"				 where Parent_Job_Code = @JOBCODE                 \r\n" + 
				"				                  \r\n" + 
				"				)                    \r\n" + 
				"				                  \r\n" + 
				"				Set @JCRRevisedEstimate = (                    \r\n" + 
				"				Select Sum(JCR_Amount )                  \r\n" + 
				"				from   edw40.den.glm_job_master                    \r\n" + 
				"				where Job_Code=@JOBCODE                  \r\n" + 
				"				                  \r\n" + 
				"				)                    \r\n" + 
				"				              \r\n" + 
				"				 ---- P&M  Estimate Cost  ---------------                       \r\n" + 
				"				 SET @ldecimalPNMRevEstimateCost =  ( Select               \r\n" + 
				"				       top 1  isnull(PNMCost,0)/10000000.00                 \r\n" + 
				"				       from EDW40.DEN.EDW_Planning_Resouce_Cost_Details               \r\n" + 
				"				       where JobCode  = @JOBCODE)           \r\n" + 
				"				---- P&M  Cost As on Date ---------------              \r\n" + 
				"				set  @PNMCost = (select sum(Hired)+sum(Own)+sum(Fuel) from                       \r\n" + 
				"				EDW40.DEN.EDW_Unif_PNM_Spend_Details                     \r\n" + 
				"				 where Parent_Job_Code =@JOBCODE group by Parent_Job_Code  )                    \r\n" + 
				"				              \r\n" + 
				"				 -----Staff Estimate Cost  ---------------              \r\n" + 
				"				                    \r\n" + 
				"				 SET @ldecStaffRevEstCost = (                    \r\n" + 
				"				   SELECT TOP 1 isnull(StaffCost, 0) / 10000000.00                    \r\n" + 
				"				   FROM EDW40.DEN.EDW_Planning_Resouce_Cost_Details                    \r\n" + 
				"				   WHERE JobCode = @JOBCODE                    \r\n" + 
				"				   )                     \r\n" + 
				"				 ------------------Staff Spend--------------------------------                               \r\n" + 
				"				   SELECT              \r\n" + 
				"				   @StaffCostSpend = SUM(mnyCompanyCurrencyAmount)/ 10000000.00            \r\n" + 
				"				  FROM EDW40.DEN.EDW_Unif_Staff_Cost_Statement NOLOCK                    \r\n" + 
				"				  WHERE ParentJobCode = @JOBCODE                    \r\n" + 
				"				  GROUP BY ParentJobCode                \r\n" + 
				"				 ----------------------------------------------------------        \r\n" + 
				"				if  @JCRRevisedEstimate is null or @JCRRevisedEstimate = 0                   \r\n" + 
				"				begin                   \r\n" + 
				"				                    \r\n" + 
				"				 set @parentRollup =1                  \r\n" + 
				"				                  \r\n" + 
				"				END                  \r\n" + 
				"				                  \r\n" + 
				"				                  \r\n" + 
				"				SELECT                                    \r\n" + 
				"				    @PMSMaxYear=Valuation_Year                                 \r\n" + 
				"				FROM EDW40.DEN.EDW_PMS_Denormalized                                  \r\n" + 
				"				where Job_code=@JOBCODE and  Latest_PMS_Locked ='Y'                                 \r\n" + 
				"				                                  \r\n" + 
				"				SELECT @PMSMaxMonth = Valuation_Month                                   \r\n" + 
				"				FROM EDW40.DEN.EDW_PMS_Denormalized                                  \r\n" + 
				"				where Job_code=@JOBCODE  and  Latest_PMS_Locked ='Y'                                 \r\n" + 
				"				                                   \r\n" + 
				"				                                \r\n" + 
				"				                                  \r\n" + 
				"				Declare                                  \r\n" + 
				"				@Date varchar(10)= cast(@PMSMaxYear  as varchar)+'/'+ cast(@PMSMaxMonth as varchar) +'/01'                                    \r\n" + 
				"				                                  \r\n" + 
				"				print @PMSMaxMonth                                  \r\n" + 
				"				set @PMSMonth=   Format( cast( @Date as datetime),'MMM-yyyy')                   \r\n" + 
				"				      \r\n" + 
				"				;WIth PMSDataLocked                                \r\n" + 
				"				as                   \r\n" + 
				"				(                                \r\n" + 
				"				                                \r\n" + 
				"				Select top 1                                \r\n" + 
				"				Job_code                                \r\n" + 
				"				,Rev_contract_value                                \r\n" + 
				"				,Valuation_Month --(Latest_PMS_Locked ='y')                                \r\n" + 
				"				,Time_Completion                                \r\n" + 
				"				,Sales_over_Invoice                                \r\n" + 
				"				,Org_contract_value                              \r\n" + 
				"				,[Outstanding (INR Crore)]                   \r\n" + 
				"				--,Revised_Estimate                                \r\n" + 
				"				--,Cum_Cost_PMS as [CostAsperLastPMS]                                \r\n" + 
				"				,Invoice as InvoicedAsperLastPMS  ,                            \r\n" + 
				"				Net_Working_Capital                  \r\n" + 
				"				                \r\n" + 
				"				from EDW40.DEN.EDW_PMS_Denormalized                                \r\n" + 
				"				where Job_code =@JOBCODE and Latest_PMS_Locked ='Y'                                \r\n" + 
				"				order by Valuation_Year desc , Valuation_Month desc                                \r\n" + 
				"				) ,                       \r\n" + 
				"				 PMSRevisedEstWithChild                        \r\n" + 
				"				as                                 \r\n" + 
				"				(                                 \r\n" + 
				"				     \r\n" + 
				"				select Parent_Job_code as Job_code ,--SUM(TJP_Revised_Contract_Value)/10000000,SUM(TJP_JCRCostFor_AC)/10000000 ==(RCV-TJP_Estimate_Cost/RCV)*100=Porjected End margin                    \r\n" + 
				"				SUM(TJP_Estimate_Cost) Revised_Estimate  ,sum(TJP_Cost_Cum) [CostAsperLastPMS]                  \r\n" + 
				"				from EDWSTG40.pms.pms_t_job_performance a (NOLOCK)                    \r\n" + 
				"				join EDW40.DEN.GLM_Job_Master b (NOLOCK) on a.TJP_Job_Code=b.Job_Code                    \r\n" + 
				"				JOIN EDW40.DEN.EDW_Unif_PMS_Closed_Date_Details CL on a.TJP_Job_Code=cl.LJCE_Job_Code                     \r\n" + 
				"				and a.TJP_Performance_Date=cl.PMS_Closed_Date                    \r\n" + 
				"				where b.Parent_Job_Code=@JOBCODE and TJP_Revision_Tag=2 and TJP_Currency_Code=72                    \r\n" + 
				"				Group by Parent_Job_code                    \r\n" + 
				"				) ,                     \r\n" + 
				"				PMSDataCurrentMonth                                \r\n" + 
				"				as                                 \r\n" + 
				"				(                                \r\n" + 
				"				Select top 1                                \r\n" + 
				"				Job_code                                 \r\n" + 
				"				,Cum_Cost_PMS as [CostAsonDate]                                \r\n" + 
				"				,GM_Percent as CurrentMarginAsperPMSPercentage                                 \r\n" + 
				"				from EDW40.DEN.EDW_PMS_Denormalized                                \r\n" + 
				"				where Job_code =@JOBCODE                               \r\n" + 
				"				order by Valuation_Year desc , Valuation_Month desc                                \r\n" + 
				"				                                \r\n" + 
				"				)   ,                      \r\n" + 
				"				Parent_Child_Job                      \r\n" + 
				"				as                      \r\n" + 
				"				(select                       \r\n" + 
				"				                      \r\n" + 
				"				Parent_Job_Code ,        \r\n" + 
				"				case when count('x')>1 then 'P'  else 'C'  end as Parent_Child_Job                     \r\n" + 
				"				from  EDW40.DEN.GLM_Job_Master                     \r\n" + 
				"				where Parent_Job_Code= @JOBCODE                   \r\n" + 
				"				group by Parent_Job_Code                    \r\n" + 
				"				)                               \r\n" + 
				"				SELECT                                  \r\n" + 
				"				jm.Job_Code                                \r\n" + 
				"				, Job_Description as  Job_Long_Description         \r\n" + 
				"				,Org_contract_value /10000000.00 as Company_Currency_OCV,                                \r\n" + 
				"				Rev_contract_value/10000000.00 as Company_Currency_RCV,                              \r\n" + 
				"				@PMSMonth as  PMSMonth                                  \r\n" + 
				"				,Job_Customer_Description                                \r\n" + 
				"				,case when @parentRollup =1 then @ACEMargin else  ACE_MarginPercentage  end  as ACE_MarginPercentage                  \r\n" + 
				"				,Actual_Start_Date                           \r\n" + 
				"				,Contract_End_Date                                \r\n" + 
				"				,Expected_End_Date Actual_End_Date                        \r\n" + 
				"				,case when @parentRollup =1 then  @ACECost/10000000.00 else ACE_Amount/10000000.00 END  as OriginalCost                                \r\n" + 
				"				,Rev_contract_value                                \r\n" + 
				"				,Valuation_Month --(Latest_PMS_Locked ='y')                                \r\n" + 
				"				,Time_Completion                                \r\n" + 
				"				,Sales_over_Invoice/10000000.00 as Sales_over_Invoice                                \r\n" + 
				"				,[Outstanding (INR Crore)]/10000000.00 as OutstandingAmount                                \r\n" + 
				"				,Revised_Estimate/10000000.00 as Revised_Estimate    --                            \r\n" + 
				"				,[CostAsperLastPMS] /10000000.00 as [CostAsperLastPMS]                                \r\n" + 
				"				,[CostAsonDate]/10000000.00 as [CostAsonDate]        --                        \r\n" + 
				"				,InvoicedAsperLastPMS/10000000.00 as InvoicedAsperLastPMS                              \r\n" + 
				"				,Net_Working_Capital /10000000.00 as  Net_Working_Capital                            \r\n" + 
				"				, case when Revised_Estimate =0 then 0 else  ([CostAsperLastPMS] / Revised_Estimate) *100 END as  CostCompletionPercentage                                \r\n" + 
				"				, case when Rev_contract_value =0 then 0 else (InvoicedAsperLastPMS / Rev_contract_value) *100 end  as InvoiceCompletionPercentage                                \r\n" + 
				"				, case when Rev_contract_value=0 then 0  else (Rev_contract_value - Revised_Estimate ) *100 / Rev_contract_value end as ProjectedMarginPercentage                                 \r\n" + 
				"				,CurrentMarginAsperPMSPercentage as CurrentMarginAsperPMSPercentage                                \r\n" + 
				"				,(  (isnull( @PNMCost,0 ) /10000000.00)/@ldecimalPNMRevEstimateCost )*100  as PnMCompletionPercentage,                \r\n" + 
				"				(@StaffCostSpend/@ldecStaffRevEstCost ) * 100 as StaffCompletionPercentage      \r\n" + 
				"				,case when @parentRollup =1 then @JCRMargin else  JCR_MarginPercentage  end as  JCR_MarginPercentage                           \r\n" + 
				"				,City + ', '  + State as Joblocation                          \r\n" + 
				"				,'NA' as PlanningHead                          \r\n" + 
				"				,'NA' as ProjectHead                          \r\n" + 
				"				,(jm.Load_Date-1) as Scheduled_date  ,                      \r\n" + 
				"				p.Parent_Child_Job     ,            \r\n" + 
				"				(@IDCRevisedEstimate / Revised_Estimate)*100 as IDCRevisedEstimate,            \r\n" + 
				"				((Revised_Estimate- @IDCRevisedEstimate)/Revised_Estimate)*100 as DCRevisedEstimate  ,        \r\n" + 
				"				((@IDCCostAsonDate/10000000.00 )/ ([CostAsonDate]/10000000.00 ))*100 as IDCCostAsonDate,            \r\n" + 
				"				((([CostAsonDate]- @IDCCostAsonDate)/10000000.00)/ ([CostAsonDate]/10000000.00 ))*100 as DCCostAsonDate           \r\n" + 
				"				FROM EDW40.DEN.GLM_Job_Master jm    ,                    \r\n" + 
				"				  PMSDataLocked pms ,            \r\n" + 
				"				  PMSDataCurrentMonth cpms    ,              \r\n" + 
				"				  Parent_Child_Job  p  ,            \r\n" + 
				"				  PMSRevisedEstWithChild rest                 \r\n" + 
				"				WHERE jm.Job_Code =   @JOBCODE     and                             \r\n" + 
				"				   rest.Job_code =  jm.Job_Code and                     \r\n" + 
				"				      jm.Job_Code=pms.Job_code and                                 \r\n" + 
				"				      jm.Job_Code=cpms.Job_code   AND                    \r\n" + 
				"				   P.Parent_Job_Code =   jm.Job_Code  " ;         
				                 
		return qurey;
		
	}

}
