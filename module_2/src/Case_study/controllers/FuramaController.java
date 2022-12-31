package Case_study.controllers;


import Case_study.models.service.CustomerService.CustomerService;
import Case_study.models.service.EmployeeService.EmployeeService;
import Case_study.models.service.CustomerService.ICustomerService;
import Case_study.models.service.EmployeeService.IEmployeeService;
import Case_study.models.service.FacilityService.FacilityService;
import Case_study.models.service.FacilityService.IFacilityService;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    public int choice = 0;
    IEmployeeService iEmployeeService = new EmployeeService();
    ICustomerService iCustomerService = new CustomerService();
    IFacilityService iFacilityService = new FacilityService();

    public void displayMainMenu() {
        System.out.println("------Menu------");
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit\n" +
                "---------------------------");

        do {
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice < 0 || choice > 6);

        switch (choice) {
            case 1:
                DisplayEmployeeManagement employeeManager = new DisplayEmployeeManagement();
                employeeManager.displayEmployeeManagement();
                break;
            case 2:
                DisplayCustomerManagement customerManager = new DisplayCustomerManagement();
                customerManager.displayCustomerManagement();
                break;
            case 3:
                DisplayFacilityManagement facilityManager = new DisplayFacilityManagement();
                facilityManager.displayFacilityManagement();
                break;
            case 4:
                displayBookingManagement();
                break;
            case 5:
                displayPromotionManagement();
                break;
            case 6:
                System.exit(0);
        }
    }



    public void displayBookingManagement() {
        System.out.println("---Booking Management--- ");
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu\n" +
                "---------------------");

        do {
            System.out.print("Please enter your valid choice (1->6): ");
            choice = sc.nextInt();
        } while (true);
    }

    public void displayPromotionManagement() {
        System.out.println("---Promotion Management--- ");
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu\n" +
                "--------------------");

        do {
            System.out.print("Please enter your valid choice (1->3): ");
            choice = sc.nextInt();
        } while (true);
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}