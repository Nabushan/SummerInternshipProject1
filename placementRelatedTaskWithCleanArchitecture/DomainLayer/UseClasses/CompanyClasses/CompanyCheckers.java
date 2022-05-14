package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity.CompanyEntity;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces.CompanyInfoChecker;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces.CompanyRequirment;

public class CompanyCheckers implements CompanyInfoChecker,CompanyRequirment{
	/*
	//The below constructor is used to sets the values when date is given as parts of(day,month,year).
	public CompanyCheckers(String name,String personName,String number,int dd,int mm,int yyyy) {
		super(name,personName,number,dd,mm,yyyy);
	}
	
	*/
	
	private CompanyEntity companyEntity;
	
	public CompanyCheckers(CompanyEntity companyEntity) {
		this.companyEntity = companyEntity;
	}
	
	//Below method is used to check is the two dates are same
	//(ie. the date of the calling object and the dates of the passed object).
	public boolean isDateSame(String date){
		if(this.companyEntity.getDateFormat().equals(date)) {
			return true;
		}
		return false;
	}
		
	//The below method is used to check the contents of the calling object and the passed object.
	public boolean isSame(Company company) {
			
		if((this.companyEntity.getCompanyName().equals(company.getCompanyName())) && 
				(this.companyEntity.getCompanyCoordinatorName().equals(company.getCompanyCoordinatorName())) && 
				(this.companyEntity.getCoordinatorMobileNumber().equals(company.getCoordinatorMobileNumber())) && 
				isDateSame(company.getDateFormat())) {
			return true;
		}
			
		return false;
	}
}
