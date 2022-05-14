package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses;

import java.util.ArrayList;
import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CollegePlacementRequirment;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CompanyNeededPlacementRelatedRemoverMethods;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;


public class CollegePlacementRemovers implements CompanyNeededPlacementRelatedRemoverMethods,CollegePlacementRequirment{
	/*
	
	//The below constructor is used to populate the primitive fields.
	public CollegePlacementRemovers(String inchargeName,String inchargeNumber) {
		super(inchargeName,inchargeNumber);
	}
			
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementRemovers(String inchargeName,String inchargeNumber,Company c) {
		super(inchargeName,inchargeNumber,c);
	}
		
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementRemovers(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		super(inchargeName,inchargeNumber,companies);
	}
	
	*/
	
	//The below method is used to remove the company from the Table and from the List by using Company Object.
	public void removeCompany(Company c) {
		if(collegePlacement.companyTable.containsKey(c.getCompanyName())) {
			collegePlacement.companyTable.remove(c.getCompanyName());
			collegePlacement.companyNames.remove(c.getCompanyName());
		}
		else {
			System.out.println("Company Details for "+c.getCompanyName()+" is not in the Table");
		}
	}
		
	//The below method is used to remove the company from the Table and from the List by using Company Name.
	public void removeCompany(List<Company> companies) {
		for(int i = 0;i < companies.size();i++) {
			if(collegePlacement.companyTable.containsKey(companies.get(i).getCompanyName())) {
				collegePlacement.companyTable.remove(companies.get(i).getCompanyName());
				collegePlacement.companyNames.remove(companies.get(i).getCompanyName());
			}
			else {
				System.out.println("Company Details for "+companies.get(i).getCompanyName()+" is not in the Table");
			}
		}
	}
	
	//The below method is used to delete/remove all the entries of the company in the 
	//Company Table and the Company List.
	public void removeCompany(String companyName) {
		//New Method.
		boolean flag = true;
		ArrayList<String> tempCompanyNameList = new ArrayList<String>();
			
		for(int i = 0;i < collegePlacement.companyNames.size();i++) {
			String tempCompanyName = collegePlacement.companyNames.get(i);//.substring(0,companyName.length());
			if(tempCompanyName.contains(companyName)) {
				tempCompanyNameList.add(collegePlacement.companyNames.get(i));
				flag = false;
			}
		}
			
		for(String s:tempCompanyNameList) {
			collegePlacement.companyTable.remove(s);
			collegePlacement.companyNames.remove(s);
		}
			
		if(flag){
			System.out.println("Company Details for "+companyName+" is not in the Table");
		}
	}
}
