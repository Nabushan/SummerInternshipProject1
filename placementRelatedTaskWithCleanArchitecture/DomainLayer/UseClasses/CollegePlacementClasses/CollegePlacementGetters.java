package placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses;

import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface.CollegePlacementRequirment;

public class CollegePlacementGetters implements CollegePlacementRequirment{
	/*
	
	//The below constructor is used to populate the primitive fields.
	public CollegePlacementGetters(String inchargeName,String inchargeNumber) {
		super(inchargeName,inchargeNumber);
	}
				
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementGetters(String inchargeName,String inchargeNumber,Company c) {
		super(inchargeName,inchargeNumber,c);
	}
			
	//The below constructor is used to populate the company Table and Company Names fields.
	public CollegePlacementGetters(String inchargeName,String inchargeNumber,List<Company> companies) {
		//New method.
		super(inchargeName,inchargeNumber,companies);
	}
	
	*/
	
	//The below method is used to get the details of the Placement Incharge. 
	public String getPlacementInchargeDetails() {
		return "Placement Incharge Name : "+collegePlacement.getCollegePlacementIncharge()+"\n"+
				"Placement Incharge Number : "+collegePlacement.getPlacementInchargeNumber();
	}
}

