package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses;

import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CollegePlacementRequirment;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;

public class CollegePlacementDisplayers implements CollegePlacementRequirment {
	/*
	
	//The below constructor is used to populate the primitive fields.
	public CollegePlacementDisplayers(String inchargeName,String inchargeNumber) {
		super(inchargeName,inchargeNumber);
	}
				
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementDisplayers(String inchargeName,String inchargeNumber,Company c) {
		super(inchargeName,inchargeNumber,c);
	}
			
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementDisplayers(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		super(inchargeName,inchargeNumber,companies);
	}
	
	*/
	
	//The below method is used to display the details of the Company when the company name is given.
	public void displayDetails(String companyName) {
		if(collegePlacement.companyTable.containsKey(companyName)) {
			Company ctemp = collegePlacement.companyTable.get(companyName);
			
			ctemp.displayCompanyDetails();
			System.out.println(new CollegePlacementGetters().getPlacementInchargeDetails());
		}
		else {
			System.out.println("Details for the company '"+companyName+"' is not available");
		}
	}
		
	//The below method is used to display the details of all Company.
	public void displayDetails() {
		if(collegePlacement.companyNames.size() == 0) {
			System.out.println("Company List is Empty.");
			return;
		}
		Company ctemp;
		for(int i = 0;i < collegePlacement.companyNames.size();i++) {
			System.out.println("Company Detail "+(i+1)+" :-");
			ctemp = collegePlacement.companyTable.get(collegePlacement.companyNames.get(i));
			ctemp.displayCompanyDetails();
			System.out.println(new CollegePlacementGetters().getPlacementInchargeDetails());
			System.out.println();
		}
	}
}
