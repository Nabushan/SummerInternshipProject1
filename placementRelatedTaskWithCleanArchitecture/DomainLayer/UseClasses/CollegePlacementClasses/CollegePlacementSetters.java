package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity.CollegePlacementEntity;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CollegePlacementRequirment;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CompanyNeededPlacementRelatedAdderMethods;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;


public class CollegePlacementSetters implements CompanyNeededPlacementRelatedAdderMethods,CollegePlacementRequirment{
	/*
	//The below constructor is used to populate the company Table and Company Names fields. 
	public CollegePlacements(String inchargeName,String inchargeNumber,Company c) {
		collegePlacementIncharge = inchargeName;
		placementInchargeNumber = inchargeNumber;
		if(!companyTable.containsKey(c.getCompanyName())) {
			companyTable.put(c.getCompanyName(), c);
			companyNames.add(c.getCompanyName());
		}
	}*/
	
	/*
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacements(String inchargeName,String inchargeNumber,List<Company> companies) {
		collegePlacementIncharge = inchargeName;
		placementInchargeNumber = inchargeNumber;
		for(int i = 0;i < companies.size();i++) {
			if(!companyTable.containsKey(companies.get(i).getCompanyName())) {
				companyTable.put(companies.get(i).getCompanyName(), companies.get(i));
				companyNames.add(companies.get(i).getCompanyName());
			}
		}
	}*/
	
	//The below method is used to populate the primitive fields.
	public void CollegePlacementSetters(String inchargeName,String inchargeNumber) {
		collegePlacement.setCollegePlacementIncharge(inchargeName);
		collegePlacement.setPlacementInchargeNumber(inchargeNumber);
	}
	
	//The below method is used to populate the company Table and Company Names fields.
	public void CollegePlacementSetters(String inchargeName,String inchargeNumber,Company c) {
		collegePlacement.setCollegePlacementIncharge(inchargeName);
		collegePlacement.setPlacementInchargeNumber(inchargeNumber);
		this.addCompany(c);
	}
	
	//The below method is used to populate the company Table and Company Names fields.
	public void CollegePlacementSetters(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		collegePlacement.setCollegePlacementIncharge(inchargeName);
		collegePlacement.setPlacementInchargeNumber(inchargeNumber);
		for(int i = 0;i < companies.size();i++) {
			this.addCompany(companies.get(i));
		}
	}
	
	//The below method is used to check for the existence of the company which has to be added.
	//Checks for the availability of the company name in the companyNames Table. 
	public boolean hasKey(Company company) {
		if(collegePlacement.companyNames.size() == 0) return false;
		String tempCompanyName = "";
		for(int i = 0;i < collegePlacement.companyNames.size();i++) {
			if(company.getCompanyName().length() < collegePlacement.companyNames.get(i).length())
				tempCompanyName = collegePlacement.companyNames.get(i).substring(0,company.getCompanyName().length());
			if(tempCompanyName.equals(company.getCompanyName())) return true;
		}
		return false;
	}
	
	//The below method is used to add a Company into the Company Table and the Company List.
	public void addCompany(Company c) {
		//New method.
		if(!this.hasKey(c)) {
			String keyString = c.getCompanyName()+"-"+c.getID();
			collegePlacement.companyTable.put(keyString, c);
			collegePlacement.companyNames.add(keyString);
			c.setCompanyName(keyString);
			//System.out.println(keyString);   //used for debugging purpose.
		}
		else {
			String keyString = c.getCompanyName()+"-"+c.getID();
			//The below lines are used for debugging purpose.
			//System.out.println("Same company addition : "+companyTable.get(keyString).getCompanyName());
			//System.out.println(keyString);
			c.setCompanyName(keyString);
			if(!collegePlacement.companyTable.get(keyString).isSame(c)) {
				c.setID(collegePlacement.companyTable.get(keyString).getID()+1);
				collegePlacement.companyTable.get(keyString).incrementID();
				keyString = c.getCompanyName()+"-"+c.getID();
				collegePlacement.companyTable.put(keyString, c);
				collegePlacement.companyNames.add(keyString);
				c.setCompanyName(keyString);
				//System.out.println(keyString);      //used for debugging purpose.
			}
		}
	}
		
	//The below method is used to add a list of companies into the Company Table and Company List. 
	public void addCompany(List<Company> companies){
		//New Method.
		for(int i = 0;i < companies.size();i++) {
			this.addCompany(companies.get(i));
		}
	}
}

