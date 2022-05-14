package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity.CompanyEntity;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces.CompanyRequirment;

public class CompanyEditors implements CompanyRequirment{
	/*
	
	//The below constructor is used to sets the values when date is given as parts of(day,month,year).
	public CompanyEditors(String name,String personName,String number,int dd,int mm,int yyyy) {
		super(name,personName,number,dd,mm,yyyy);
	}
	
	*/
	
	private CompanyEntity companyEntity;
	
	public CompanyEditors(CompanyEntity companyEntity) {
		this.companyEntity = companyEntity;
	}
	
	//Below method is used to increment the id value for the next company.
	public void incrementID() {
		companyEntity.id++;
	}
}
