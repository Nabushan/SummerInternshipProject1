package placementRelatedTaskWithCleanArchitecture.DomainLayer.Entity;

import java.util.ArrayList;
import java.util.HashMap;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;

public class CollegePlacementEntity {
	protected String collegePlacementIncharge,placementInchargeNumber;
	public HashMap<String,Company> companyTable = new HashMap<String,Company>();
	public ArrayList<String> companyNames = new ArrayList<String>();
	
	public String getCollegePlacementIncharge() {
		return collegePlacementIncharge;
	}
	
	public void setCollegePlacementIncharge(String collegePlacementIncharge) {
		this.collegePlacementIncharge = collegePlacementIncharge;
	}
	
	public String getPlacementInchargeNumber() {
		return placementInchargeNumber;
	}
	
	public void setPlacementInchargeNumber(String placementInchargeNumber) {
		this.placementInchargeNumber = placementInchargeNumber;
	}
}
