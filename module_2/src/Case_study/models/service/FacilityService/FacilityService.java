package Case_study.models.service.FacilityService;

import Case_study.models.repository.FacilityRepository.FacilityRepository;
import Case_study.models.repository.FacilityRepository.IFacilityRepository;

public class FacilityService implements IFacilityService{
    IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void add() {

    }

    @Override
    public void displayFacility() {
        iFacilityRepository.displayFacility();
    }

    @Override
    public void displayFacilityMaintenance() {
        iFacilityRepository.displayFacilityMaintenance();
    }
}
