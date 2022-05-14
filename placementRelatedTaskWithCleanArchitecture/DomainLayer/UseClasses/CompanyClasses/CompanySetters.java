package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity.CompanyEntity;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces.CompanyInfoSetter;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.DateInterfaces.DateSetters;

public class CompanySetters implements DateSetters,CompanyInfoSetter{
	
	/*
	//The below constructor is used to sets the values when date is given as parts of(day,month,year).
	public CompanySetters(String name,String personName,String number,int dd,int mm,int yyyy) {
		companyEntity.setDay(dd); 
		companyEntity.setMonth(mm);
		companyEntity.setYear(yyyy);
		companyEntity.setCompanyName(name);
		companyEntity.setCompanyCoordinatorName(personName);
		companyEntity.setCoordinatorMobileNumber(number);
	}
	
	*/
	private CompanyEntity companyEntity;
	
	public CompanySetters(CompanyEntity companyEntity) {
		this.companyEntity = companyEntity;
	}
	
	
	//Below method is used to set company name.
	public void setCompanyName(String compName) {
		companyEntity.setCompanyName(compName);
	}
	
	//Below method is used to set Co-ordinator name.
	public void setCoordinatorName(String facultyName) {
		companyEntity.setCompanyCoordinatorName(facultyName);
	}
	
	//Below method is used to set Co-ordinator's number.
	public void setCoordinatorNumber(String contactNumber) {
		companyEntity.setCoordinatorMobileNumber(contactNumber);
	}
	
	//Below method is used to set the id value.
	public void setID(int val) {
		companyEntity.id = val;
	}
	
	//this method is used to set a new Date or Update a pre-existing data; 
	public void setDateTo(int dd,int mm,int yyyy) {
		companyEntity.setDay(dd); 
		companyEntity.setMonth(mm);
		companyEntity.setYear(yyyy);
	}
}
