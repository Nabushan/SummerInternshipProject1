package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses;

import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CollegePlacementRequirment;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;

public class CollegePlacementCheckers implements CollegePlacementRequirment{
	/*
	
	//The below constructor is used to populate the primitive fields.
	public CollegePlacementCheckers(String inchargeName,String inchargeNumber) {
		super(inchargeName,inchargeNumber);
	}
		
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementCheckers(String inchargeName,String inchargeNumber,Company c) {
		super(inchargeName,inchargeNumber,c);
	}
	
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementCheckers(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		super(inchargeName,inchargeNumber,companies);
	}
		
	*/
	
	//The below method is used to check for the existence of the company which has to be added.
	//Checks for the availability of the company name in the companyNames Table. 
	public boolean hasKey(Company company) {
		if(collegePlacement.companyNames.size() == 0) return false;
		String tempCompanyName;
		for(int i = 0;i < collegePlacement.companyNames.size();i++) {
			if(company.getCompanyName().length() > collegePlacement.companyNames.get(i).length()) return false;
			tempCompanyName = collegePlacement.companyNames.get(i).substring(0,company.getCompanyName().length());
			if(tempCompanyName.equals(company.getCompanyName())) return true;
		}
		return false;
	}
}
