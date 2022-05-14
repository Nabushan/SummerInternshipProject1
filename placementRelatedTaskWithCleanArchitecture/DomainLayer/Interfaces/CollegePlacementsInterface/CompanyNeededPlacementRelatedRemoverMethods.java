package placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CollegePlacementsInterface;

import java.util.List;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;

public interface CompanyNeededPlacementRelatedRemoverMethods {
	public void removeCompany(Company c);
	public void removeCompany(List<Company> companies);
}
