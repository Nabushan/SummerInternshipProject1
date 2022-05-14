package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses;

import java.util.List;
import java.util.Scanner;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CollegePlacementRequirment;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CompanyNeededPlacementRelatedEditorMethods;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;

public class CollegePlacementEditors implements CompanyNeededPlacementRelatedEditorMethods,CollegePlacementRequirment{
	/*
	
	//The below constructor is used to populate the primitive fields.
	public CollegePlacementEditors(String inchargeName,String inchargeNumber) {
		super(inchargeName,inchargeNumber);
	}
			
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementEditors(String inchargeName,String inchargeNumber,Company c) {
		super(inchargeName,inchargeNumber,c);
	}
		
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementEditors(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		super(inchargeName,inchargeNumber,companies);
	}
	
	*/
	
	//The below method is used to edit the details of the previously added companies.
	public void editCompanyDetails(String companyName) {
		Company tempCompany = collegePlacement.companyTable.get(companyName);
		System.out.println("tempCompany is holding : "+tempCompany.getCompanyName());
		System.out.println("1 -> Company Name With ID\n2 -> Co-ordinator Name\n3 -> Contact Number");
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		if(val == 1) {
			System.out.println("Enter the new Name with previous ID to replace the old Name.");
			in.nextLine();
			String newName = in.nextLine();
			tempCompany.setCompanyName(newName);
			collegePlacement.companyTable.remove(companyName);
			collegePlacement.companyNames.remove(companyName);			
			collegePlacement.companyTable.put(tempCompany.getCompanyNameWithID(),tempCompany);
			collegePlacement.companyNames.add(tempCompany.getCompanyNameWithID());
		}
		else if(val == 2) {
			System.out.println("Enter the New Co-ordinator Name");
			in.nextLine();
			String newCoordinatorName = in.nextLine();
			tempCompany.setCoordinatorName(newCoordinatorName);
		}
		else if(val == 3) {
			System.out.println("Enter the new Number to replace the old Number.");
			in.nextLine();
			String newCoordinatorContactDetail = in.nextLine();
			tempCompany.setCoordinatorNumber(newCoordinatorContactDetail);
		}
		else {
			System.out.println("Enter a valid option to change the details");
		}
		//in.close();
	}
}
