package Case_study.controllers;


import Case_study.models.model.Facility.Facility;
import Case_study.models.model.Facility.Room;
import Case_study.models.model.Facility.Villa;
import Case_study.models.model.Person.Customer;
import Case_study.models.model.Person.Employee;
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
                "4. Delete employee\n" +
                "5. Return main menu\n" +
                "--------------------");
        do {
            System.out.print("Please enter your valid choice (1->4): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iEmployeeService.display();
                    break;
                case 2:
                    iEmployeeService.add();
                    break;
                case 3:
                    System.out.println("Nhập mã nhân viên :");
                    String oldID = sc.nextLine();
                    Employee c = iEmployeeService.search(oldID);
                    if (c != null) {
                        System.out.println("Input Name: ");
                        String hoTen = sc.nextLine();
                        System.out.println("Input DateOfBirth: ");
                        String ngaySinh = sc.nextLine();
                        System.out.println("Input Gender: ");
                        String gioiTinh = sc.nextLine();
                        System.out.println("Input IdentityCard: ");
                        String chungMinhNhanDan = sc.nextLine();
                        System.out.println("Input PhoneNumber: ");
                        String soDienThoai = sc.nextLine();
                        System.out.println("Input Email: ");
                        String email = sc.nextLine();
                        System.out.println("Input Level: ");
                        String trinhDo = sc.nextLine();
                        System.out.println("Input Position: ");
                        String viTri = sc.nextLine();
                        System.out.println("Input Wage: ");
                        String luong = sc.nextLine();
                        c.setFullName(hoTen);
                        c.setDateOfBirth(ngaySinh);
                        c.setGender(gioiTinh);
                        c.setIdentityCard(chungMinhNhanDan);
                        c.setPhoneNumber(soDienThoai);
                        c.setEmail(email);
                        c.setLevel(trinhDo);
                        c.setPosition(viTri);
                        c.setWage(luong);
                        iEmployeeService.edit(c);
                        break;
                    }
                case 4:
                    iEmployeeService.delete();
                case 5:
                    displayMainMenu();
            }
        } while (true);
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
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    System.out.println("Nhập mã khách hàng :");
                    String oldID1 = sc.nextLine();
                    Customer d = iCustomerService.search(oldID1);
                    if (d != null) {
                        System.out.println("Input fullName: ");
                        String fullName = sc.nextLine();
                        System.out.println("Input dateOfBirth: ");
                        String dateOfBirth = sc.nextLine();
                        System.out.println("Input gender: ");
                        String gender = sc.nextLine();
                        System.out.println("Input identityCard: ");
                        String identityCard = sc.nextLine();
                        System.out.println("Input phoneNumber : ");
                        String phoneNumber = sc.nextLine();
                        System.out.println("Input email: ");
                        String email = sc.nextLine();
                        System.out.println("Input customerID: ");
                        String customerID = sc.nextLine();
                        System.out.println("Input customerType: ");
                        String customerType = sc.nextLine();
                        System.out.println("Input address: ");
                        String address = sc.nextLine();
                        d.setFullName(fullName);
                        d.setDateOfBirth(dateOfBirth);
                        d.setGender(gender);
                        d.setIdentityCard(identityCard);
                        d.setPhoneNumber(phoneNumber);
                        d.setEmail(email);
                        d.setCustomerID(customerID);
                        d.setCustomerType(customerType);
                        d.setAddress(address);
                        iCustomerService.edit(d);
                        break;
                    }
                case 4:
                    displayMainMenu();
            }
        } while (true);
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