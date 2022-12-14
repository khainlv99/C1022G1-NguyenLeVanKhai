package Case_study.models.model.Facility;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String numberPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, String usableArea, String rentalCosts, String numberPeople, String rentType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.numberPeople = numberPeople;
        this.rentType = rentType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(String numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String toString1() {
        return serviceCode +
                "," + serviceName +
                "," + usableArea +
                ", " + rentalCosts +
                "," + numberPeople;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", numberPeople='" + numberPeople + '\'' +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
