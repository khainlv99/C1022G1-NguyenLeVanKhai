package Case_study.models.model.Facility;

import Case_study.models.model.Facility.Facility;

public class Villa extends Facility {
    private String standardRoom;
    private String poolArea;
    private String floorNumber;

    public Villa() {
    }

    public Villa(String serviceName, String usableArea, String rentalCosts, String numberPeople, String rentType, String standardRoom, String poolArea, String floorNumber) {
        super(serviceName, usableArea, rentalCosts, numberPeople, rentType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                "} " + super.toString();
    }
}
