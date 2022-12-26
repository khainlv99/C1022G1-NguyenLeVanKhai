package Case_study.controllers;


import Case_study.models.service.EmployeeService;
import Case_study.models.service.IEmployeeService;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    public int choice = -1;
    IEmployeeService iEmployeeService = new EmployeeService();
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
            choice = sc.nextInt();
        } while (choice < 0 || choice > 6);

        switch (choice) {
            case 1:
                displayEmployeeManagement();
                break;
            case 2:
                displayCustomerManagement();
                break;
            case 3:
                displayFacilityManagement();
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

    public void displayEmployeeManagement() {
        System.out.println("---Employee Management--- ");
        System.out.println("1. Display list employees\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Return main menu\n" +
                "--------------------");
        do {
            System.out.print("Please enter your valid choice (1->4): ");
            choice = sc.nextInt();
        } while (choice < 0 || choice > 4);
        switch (choice) {
            case 1:
                iEmployeeService.display();
                break;
            case 2:
                iEmployeeService.add();
        }
    }

    public void displayCustomerManagement() {
        System.out.println("---Customer Management--- ");
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu\n" +
                "--------------------------");

        do {
            System.out.print("Please enter your valid choice (1->4): ");
            choice = sc.nextInt();
        } while (choice < 0 || choice > 4);
    }

    public void displayFacilityManagement() {
        System.out.println("---Facility Management--- ");
        System.out.println("1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. Display list facility maintenance\n" +
                "4. Return main menu\n" +
                "-------------------------");

        do {
            System.out.print("Please enter your valid choice (1->4): ");
            choice = sc.nextInt();
        } while (choice < 0 || choice > 4);
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
        } while (choice < 0 || choice > 6);
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
        } while (choice < 0 || choice > 3);
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}