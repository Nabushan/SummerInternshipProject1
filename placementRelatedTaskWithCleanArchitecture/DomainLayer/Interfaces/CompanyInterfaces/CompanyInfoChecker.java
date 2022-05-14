package placementRelatedTaskWithCleanArchitecture.DomainLayer.Interfaces.CompanyInterfaces;

import placementRelatedTaskWithCleanArchitecture.DomainLayer.UseClasses.CompanyClasses.Company;

public interface CompanyInfoChecker {
	public boolean isSame(Company company);
}
