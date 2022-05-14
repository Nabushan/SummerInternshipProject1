package placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface;

import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;

public interface CompanyNeededPlacementRelatedAdderMethods {
	public void addCompany(Company c);
	public void addCompany(List<Company> companies);
}
