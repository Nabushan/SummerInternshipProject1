package placementRelatedTaskWithCleanArchitecture.PresentationLayer.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CollegePlacementClasses.CollegePlacement;
import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;


public class MainProgram {
	//The below is a helper method which can be used to load the company details available 
	//here it is used mainly for the execution purpose.
	public static ArrayList<Company> helper(){
		ArrayList<Company> companyList = new ArrayList<Company>();
		
		Company company1 = new Company("ABC Companies","Micheal","1324567890",5,10,2021);
		companyList.add(company1);
		
		company1 = new Company("PAP Companies","Samuel","1234657890",25,11,2021);
		companyList.add(company1);
		
		company1 = new Company("DAC Companies","Dinesh","9876543210",30,12,2021);
		companyList.add(company1);
				
		company1 = new Company("ADC Companies","Dinesh","9876543210",15,10,2021);
		companyList.add(company1);
				
		company1 = new Company("DPP Companies","Dinesh","9876543210",5,12,2021);
		companyList.add(company1);
				
		return companyList;
	}
	
	public static void main(String args[]) {
		/*
		//For preLoading of the available data.
		ArrayList<Company> companyList = helper();
		CollegePlacements placementDepartment = new CollegePlacements("Suresh","9513576428",companyList);
				
		placementDepartment.displayDetails();
		placementDepartment.removeCompany("ABC Companies");
		placementDepartment.displayDetails();
				
		*/
				
				
		//Runtime Execution.
		String collegePlacementIncharge,placementInchargeNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Placement Co-ordinator Name : ");
		collegePlacementIncharge = input.nextLine();
		System.out.println("Enter the Placement Co-ordinator Number : ");
		placementInchargeNumber = input.nextLine();
				
				
		boolean flag = true;
		CollegePlacement placementDepartment = new CollegePlacement(collegePlacementIncharge,placementInchargeNumber);
				
		int val;
				
		while(flag) {
			System.out.println("1 -> Add Company\n2 -> Edit Company Details\n3 -> Remove Company\n4 -> To Display"
							+ "\n5 -> Close");
			val = input.nextInt();
			switch(val) {
				case 1:
					String companyName,companyCoordinatorName,CoordinatorMobileNumber;
				
					System.out.println("Enter the name of the Upcoming Company : ");
					input.nextLine();
					companyName = input.nextLine();
					System.out.println("Enter the name of the Company Co-ordinator : ");
					companyCoordinatorName = input.nextLine();
					System.out.println("Company co-ordinator contact Number : ");
					CoordinatorMobileNumber = input.nextLine();
					
					//To get Date From User
					System.out.println("Enter the date in dd/mm/yyyy format : ");
					String dates = input.nextLine();
					String[] s = dates.split("/");
					int day = Integer.parseInt(s[0]);
					int month = Integer.parseInt(s[1]);
					int year = Integer.parseInt(s[2]);
					
					Company company = new Company(companyName,companyCoordinatorName,CoordinatorMobileNumber,day, month, year);
					placementDepartment.addCompany(company);
					break;
				case 2:
					System.out.println("Enter the name of the comapany with ID you would like to edit.");
					input.nextLine();
					String newCompanyName = input.nextLine();
					placementDepartment.editCompanyDetails(newCompanyName);
					break;
				case 3:
					System.out.println("Enter the name of the company to be removed : ");
					input.nextLine();
					String companyToRemove = input.nextLine();
					placementDepartment.removeCompany(companyToRemove);
					break;
				case 4:
					placementDepartment.displayDetails();
					break;
				case 5:
					flag = false;
					break;
				default:
					System.out.println("Please Enter a valid choice.");
					break;		
			}
		}		
		//input.close();
		//placementDepartment.displayDetails();
	}
}

