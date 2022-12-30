package Case_study.models.service.FacilityService;

import Case_study.models.model.Facility.Facility;
import Case_study.models.service.IService;

public interface IFacilityService extends IService {
    void add(Facility facility, int number);
    void displayFacility();
    void displayFacilityMaintenance();
}
