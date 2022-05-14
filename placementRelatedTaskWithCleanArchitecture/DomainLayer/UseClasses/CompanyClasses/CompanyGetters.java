package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity.CompanyEntity;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces.CompanyInfoGetter;

public class CompanyGetters implements CompanyInfoGetter{
	/*
	
	//The below constructor is used to sets the values when date is given as parts of(day,month,year).
	public CompanyGetters(String name,String personName,String number,int dd,int mm,int yyyy) {
		super(name,personName,number,dd,mm,yyyy);
	}
	
	*/
	
	private CompanyEntity companyEntity;
	
	public CompanyGetters(CompanyEntity companyEntity) {
		this.companyEntity = companyEntity;
	}
	
	//Below method is used to get company name along with the set ID.
	public String getCompanyNameWithID() {
		return companyEntity.getCompanyName();
	}
		
	//Below method is used to get company name.
	public String getCompanyName() {
		String str[] = companyEntity.getCompanyName().split("-");
		return str[0];
	}
		
	//Below method is used to get company Co-ordinator name.
	public String getCompanyCoordinatorName(){
		return companyEntity.getCompanyCoordinatorName();
	}
		
	//Below method is used to set company Co-ordinator Mobile Number.
	public String getCoordinatorMobileNumber() {
		return companyEntity.getCoordinatorMobileNumber();
	}
		
	//Below method is used to get the date formated as a string using the predefined method.
	public String getCompanyArrivalDate() {
		return this.getDateFormat();
	}

	//Below method is used to get an id if the company is coming twice or thrice and so on.
	public int getID() {
		return companyEntity.id;
	}
	
	//This method gets the date formated as day-month-year as a string.
	public String getDateFormat() {
		return ""+companyEntity.getDay()+"-"+companyEntity.getMonth()+"-"+companyEntity.getYear();
	}
}