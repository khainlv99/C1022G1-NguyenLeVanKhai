package Case_study.controllers;

import Case_study.Regex;
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
                        }while (!Regex.checkRegexServiceCode(serviceCode));
                        String serviceName;
                        do {
                            System.out.println("Input Service Name: ");
                            serviceName = sc.nextLine();
                        }while (!Regex.checkRegexNameService(serviceName));
                        String usableArea;
                        do {
                            System.out.println("Input Usable Area: ");
                            usableArea = sc.nextLine();
                        }while (!Regex.checkRegexArea(usableArea));
                        String rentalCosts;
                        do {
                            System.out.println("Input Rental Costs: ");
                            rentalCosts = sc.nextLine();
                        }while (!Regex.checkRegexRentalCosts(rentalCosts));
                        String numberPeople;
                        do {
                            System.out.println("Input Number People: ");
                            numberPeople = sc.nextLine();
                        }while (!Regex.checkRegexNumberPeople(numberPeople));
                        String rentType;
                        do {
                            System.out.println("Input Rent Type: ");
                            rentType = sc.nextLine();
                        }while (!Regex.checkRegexRentalType(rentType));
                        System.out.println("Input Free Service: ");
                        String freeService = sc.nextLine();
                        System.out.println("Number of uses: ");
                        int number = Integer.parseInt(sc.nextLine());
                        Facility room = new Room(serviceCode,serviceName,usableArea,rentalCosts,numberPeople,rentType,freeService);
                        iFacilityService.add(room, number);
                    } else if (number1 == 2){
                        String serviceCode;
                        do {
                            System.out.println("Input Service Code: ");
                            serviceCode = sc.nextLine();
                        }while (!Regex.checkRegexServiceCode(serviceCode));
                        String serviceName;
                        do {
                            System.out.println("Input Service Name: ");
                            serviceName = sc.nextLine();
                        }while (!Regex.checkRegexNameService(serviceName));
                        String usableArea;
                        do {
                            System.out.println("Input Usable Area: ");
                            usableArea = sc.nextLine();
                        }while (!Regex.checkRegexArea(usableArea));
                        String rentalCosts;
                        do {
                            System.out.println("Input Rental Costs: ");
                            rentalCosts = sc.nextLine();
                        }while (!Regex.checkRegexRentalCosts(rentalCosts));
                        String numberPeople;
                        do {
                            System.out.println("Input Number People: ");
                            numberPeople = sc.nextLine();
                        }while (!Regex.checkRegexNumberPeople(numberPeople));
                        String rentType;
                        do {
                            System.out.println("Input Rent Type: ");
                            rentType = sc.nextLine();
                        }while (!Regex.checkRegexRentalType(rentType));
                        System.out.println("Room standard: ");
                        String standardRoom = sc.nextLine();
                        String poolArea;
                        do {
                            System.out.println("Pool area: ");
                            poolArea = sc.nextLine();
                        }while (!Regex.checkRegexArea(poolArea));
                        String floorNumber;
                        do {
                            System.out.println("Floors: ");
                            floorNumber = sc.nextLine();
                        }while (!Regex.checkRegexNumberFloors(floorNumber));
                        System.out.println("Number of uses: ");
                        int number = Integer.parseInt(sc.nextLine());
                        Facility villa = new Villa(serviceCode,serviceName,usableArea,rentalCosts,numberPeople,rentType,standardRoom,poolArea,floorNumber);
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
