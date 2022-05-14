package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity.CompanyEntity;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces.CompanyRequirment;

public class CompanyDisplayers implements CompanyRequirment{
	/*
	//The below constructor is used to sets the values when date is given as parts of(day,month,year).
	public CompanyDisplayers(String name,String personName,String number,int dd,int mm,int yyyy) {
		super(name,personName,number,dd,mm,yyyy);
	}
	
	*/
	
	private CompanyEntity companyEntity;
	
	public CompanyDisplayers(CompanyEntity companyEntity) {
		this.companyEntity = companyEntity;
	}
	
	//This below method is used to display date in day-month-year Format. 
	public void displayDate() {
		System.out.println(companyEntity.getDay()+"-"+companyEntity.getMonth()+"-"+companyEntity.getYear());
	}
	
	//The below method is used to display the details of the Company object. 
	public void displayCompanyDetails() {
		System.out.println("Company Name : "+companyEntity.getCompanyName());
		System.out.println("Company Name with ID : "+companyEntity.getCompanyNameWithID());
		System.out.println("Company Coordinator Name : "+companyEntity.getCompanyCoordinatorName());
		System.out.println("Company Coordinator Mobile Number : "+companyEntity.getCoordinatorMobileNumber());
		System.out.print("Date of Arrival : ");
		this.displayDate();
	}
}
