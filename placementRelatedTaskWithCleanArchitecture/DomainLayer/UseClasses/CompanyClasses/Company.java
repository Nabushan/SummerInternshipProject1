package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity.CompanyEntity;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces.CompanyRequirment;

public class Company implements CompanyRequirment{
	
	public CompanyEntity companyEntity = new CompanyEntity();
	public CompanySetters companySetters = new CompanySetters(companyEntity);
	public CompanyGetters companyGetters = new CompanyGetters(companyEntity);
	public CompanyEditors companyEditors = new CompanyEditors(companyEntity);
	public CompanyDisplayers companyDisplayers = new CompanyDisplayers(companyEntity);
	public CompanyCheckers companyCheckers = new CompanyCheckers(companyEntity);
	
	//The below constructor is used to sets the values when date is given as parts of(day,month,year).
	public Company(String name,String personName,String number,int dd,int mm,int yyyy) {
		companySetters.setCompanyName(name);
		companySetters.setCoordinatorName(personName);
		companySetters.setCoordinatorNumber(number);
		companySetters.setDateTo(dd, mm, yyyy);
	}

	public String getCompanyName() {
		return companyGetters.getCompanyName();
	}

	public String getCompanyCoordinatorName() {
		return companyGetters.getCompanyCoordinatorName();
	}

	public String getCoordinatorMobileNumber() {
		return companyGetters.getCoordinatorMobileNumber();
	}

	public String getDateFormat() {
		return companyGetters.getDateFormat();
	}

	public void setCompanyName(String keyString) {
		companySetters.setCompanyName(keyString);
	}

	public boolean isSame(Company c) {
		return companyCheckers.isSame(c);
	}

	public int getID() {
		return companyGetters.getID();
	}

	public void incrementID() {
		companyEditors.incrementID();
	}

	public void setID(int i) {
		companySetters.setID(i);
	}

	public String getCompanyNameWithID() {
		return companyGetters.getCompanyNameWithID();
	}

	public void setCoordinatorName(String newCoordinatorName) {
		companySetters.setCompanyName(newCoordinatorName);
	}

	public void setCoordinatorNumber(String newCoordinatorContactDetail) {
		companySetters.setCoordinatorNumber(newCoordinatorContactDetail);
	}

	public void displayCompanyDetails() {
		companyDisplayers.displayCompanyDetails();
	}
	
	
}
