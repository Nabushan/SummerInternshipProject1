package placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity;

public class CompanyEntity {
	private String companyName,companyCoordinatorName,CoordinatorMobileNumber;
	private int day,month,year;
	public int id = 1;
	
	//Below method is used to get company name along with the set ID.
	public String getCompanyNameWithID() {
		return companyName;
	}
			
	//Below method is used to get company name.
	public String getCompanyName() {
		String str[] = companyName.split("-");
		return str[0];
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyCoordinatorName() {
		return companyCoordinatorName;
	}
	
	public void setCompanyCoordinatorName(String companyCoordinatorName) {
		this.companyCoordinatorName = companyCoordinatorName;
	}
	
	public String getCoordinatorMobileNumber() {
		return CoordinatorMobileNumber;
	}
	
	public void setCoordinatorMobileNumber(String coordinatorMobileNumber) {
		CoordinatorMobileNumber = coordinatorMobileNumber;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}	
	
	//This method gets the date formated as day-month-year as a string.
	public String getDateFormat() {
		return ""+day+"-"+month+"-"+year;
	}
}
