package Case_study.models.service.FacilityService;

import Case_study.models.model.Facility.Facility;
import Case_study.models.repository.FacilityRepository.FacilityRepository;
import Case_study.models.repository.FacilityRepository.IFacilityRepository;

public class FacilityService implements IFacilityService{
    IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void add(Facility facility, int number) {
        iFacilityRepository.add(facility,number);
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
