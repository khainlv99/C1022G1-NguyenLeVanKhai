package Case_study.controllers;

import Case_study.TrumCode;
import Case_study.models.model.Facility.Facility;
import Case_study.models.model.Facility.Room;
import Case_study.models.model.Facility.Villa;

public class DisplayFacilityManagement extends FuramaController{
    public void displayFacilityManagement() {
        System.out.println("---Facility Management--- ");
        System.out.println("1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. Display list facility maintenance\n" +
                "4. Return main menu\n" +
                "-------------------------");
        do {
            System.out.print("Please enter your valid choice (1->4): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iFacilityService.displayFacility();
                    break;
                case 2:
                    System.out.println("1. Add New Villa\n" +
                            "2. Add New Room\n" +
                            "3. Back to menu\n" +
                            "--------------------------");
                    int number1 = Integer.parseInt(sc.nextLine());
                    if (number1 == 1) {
                        String serviceCode;
                        do {
                            System.out.println("Input Service Code: ");
                            serviceCode = sc.nextLine();
                        }while (!TrumCode.checkRegexServiceCode(serviceCode));
                        String serviceName;
                        do {
                            System.out.println("New name service: ");
                            serviceName = sc.nextLine();
                        }while (!TrumCode.checkRegexNameService(serviceName));
                        System.out.println("Usable are: ");
                        String usableArea = sc.nextLine();
                        System.out.println("Rental costs");
                        String rentalCosts = sc.nextLine();
                        System.out.println("Max number of people: ");
                        String numberPeople = sc.nextLine();
                        System.out.println("Rental type");
                        String rentType = sc.nextLine();
                        System.out.println("Free service: ");
                        String freeService = sc.nextLine();
                        System.out.println("Number of uses: ");
                        int number = Integer.parseInt(sc.nextLine());
                        Facility room = new Room(serviceName, usableArea, rentalCosts, numberPeople, rentType, freeService);
                        iFacilityService.add(room, number);
                    } else if (number1 == 2){
                        System.out.println("New name service: ");
                        String serviceName = sc.nextLine();
                        System.out.println("Usable are: ");
                        String usableArea = sc.nextLine();
                        System.out.println("Rental costs");
                        String rentalCosts = sc.nextLine();
                        System.out.println("Max number of people: ");
                        String numberPeople = sc.nextLine();
                        System.out.println("Rental type");
                        String rentType = sc.nextLine();
                        System.out.println("Room standard: ");
                        String standardRoom = sc.nextLine();
                        System.out.println("Pool area: ");
                        String poolArea = sc.nextLine();
                        System.out.println("Floors: ");
                        String floorNumber = sc.nextLine();
                        System.out.println("Number of uses: ");
                        int number = Integer.parseInt(sc.nextLine());
                        Facility villa = new Villa(serviceName, usableArea, rentalCosts, numberPeople, rentType, standardRoom, poolArea, floorNumber);
                        iFacilityService.add(villa, number);
                    }else {
                        displayFacilityManagement();
                    }
                    break;
                case 3:
                    iFacilityService.displayFacilityMaintenance();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }
}
