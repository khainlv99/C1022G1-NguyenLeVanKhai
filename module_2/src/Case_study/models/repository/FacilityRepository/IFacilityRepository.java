package Case_study.models.repository.FacilityRepository;

import Case_study.models.model.Facility.Facility;

public interface IFacilityRepository {
    void add(Facility facility, int number);
    void displayFacility();
    void displayFacilityMaintenance();
}
