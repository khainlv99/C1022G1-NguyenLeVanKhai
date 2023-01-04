package Case_study.models.service.FacilityService;

import Case_study.models.model.Facility.Facility;
import Case_study.models.service.IService;

public interface IFacilityService extends IService {
    void addRoom(Facility facility, int number);
    void addVilla(Facility facility, int number);
    void displayFacility();
    void displayFacilityMaintenance();
}
