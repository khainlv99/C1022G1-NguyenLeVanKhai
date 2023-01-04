package Case_study.models.repository.FacilityRepository;

import Case_study.models.model.Facility.Facility;

public interface IFacilityRepository {
    void addRoom(Facility facility, int number);
    void addVilla(Facility facility, int number);

    void displayFacility();
    void displayFacilityMaintenance();
}
