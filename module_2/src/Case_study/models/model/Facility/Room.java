package Case_study.models.model.Facility;

import Case_study.models.model.Facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, String usableArea, String rentalCosts, String numberPeople, String rentType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCosts, numberPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
