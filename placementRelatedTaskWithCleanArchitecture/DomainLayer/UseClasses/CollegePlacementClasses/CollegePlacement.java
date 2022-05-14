package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses;

import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CollegePlacementRequirment;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;


public class CollegePlacement implements CollegePlacementRequirment{
	
	public static final CollegePlacementSetters collegePlacementSetters = new CollegePlacementSetters();
	public static final CollegePlacementRemovers collegePlacementRemovers = new CollegePlacementRemovers();
	public static final CollegePlacementGetters collegePlacementGetters = new CollegePlacementGetters();
	public static final CollegePlacementEditors collegePlacementEditors = new CollegePlacementEditors();
	public static final CollegePlacementDisplayers collegePlacementDisplayers = new CollegePlacementDisplayers();
	public static final CollegePlacementCheckers collegePlacementCheckers = new CollegePlacementCheckers();
	
	//The below constructor is used to populate the primitive fields.
	public CollegePlacement(String inchargeName,String inchargeNumber) {
		collegePlacementSetters.CollegePlacementSetters(inchargeName, inchargeNumber);
	}
					
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacement(String inchargeName,String inchargeNumber,Company c) {
		collegePlacementSetters.CollegePlacementSetters(inchargeName, inchargeNumber, c);
	}
				
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacement(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		collegePlacementSetters.CollegePlacementSetters(inchargeName, inchargeNumber, companies);
	}
	
	//The below method is used to populate the primitive fields.
	public void feedDetails(String inchargeName,String inchargeNumber) {
		collegePlacementSetters.CollegePlacementSetters(inchargeName, inchargeNumber);
	}
					
	//The below method is used to populate the company Table and Company Names fields.
	public void feedDetails(String inchargeName,String inchargeNumber,Company c) {
		collegePlacementSetters.CollegePlacementSetters(inchargeName, inchargeNumber, c);
	}
				
	//The below method is used to populate the company Table and Company Names fields.
	public void feedDetails(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		collegePlacementSetters.CollegePlacementSetters(inchargeName, inchargeNumber, companies);
	}
	
	//The below method is used to call the edit method in College Placement Editors class.
	public void editCompanyDetails(String newCompanyName) {
		collegePlacementEditors.editCompanyDetails(newCompanyName);
	}

	//The below method is used to call the remove method in College Placement Removers class.
	public void removeCompany(String companyToRemove) {
		collegePlacementRemovers.removeCompany(companyToRemove);
	}

	//The below method is used to call the displayDetails method in College Placement Displayers class.
	public void displayDetails() {
		collegePlacementDisplayers.displayDetails();
	}

	//The below method is used to call the addCompany method in College Placement Setters class.
	public void addCompany(Company company) {
		collegePlacementSetters.addCompany(company);
	}
}
