package Case_study.controllers;


import Case_study.models.model.Person.Employee;
import Case_study.models.service.CustomerService;
import Case_study.models.service.EmployeeService;
import Case_study.models.service.ICustomerService;
import Case_study.models.service.IEmployeeService;

import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);
    public int choice = 0;
    IEmployeeService iEmployeeService = new EmployeeService();
    ICustomerService iCustomerService = new CustomerService();
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
                    String oldID =  sc.nextLine();
                    Employee c = iEmployeeService.search(oldID);
                    if(c!= null){
                        System.out.println("Input Name: ");
                        String hoTen = sc.nextLine();
                        System.out.println("Input DateOfBirth: ");
                        String ngaySinh = sc.nextLine();
                        System.out.println("Input Gender: ");
                        String gioiTinh = sc.nextLine();
                        System.out.println("Input IdentityCard: ");
                        String chungMinhNhanDan = sc.nextLine();
                        System.out.println("Input PhoneNumber: ");
                        String soDienThoai =sc.nextLine();
                        System.out.println("Input Email: ");
                        String email = sc.nextLine();
                        System.out.println("Input Level: ");
                        String trinhDo = sc.nextLine();
                        System.out.println("Input Position: ");
                        String viTri = sc.nextLine();
                        System.out.println("Input Wage: ");
                        String luong =sc.nextLine();
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
        } while(true);
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
            switch (choice) {
                case 1:
                    iCustomerService.display();
                case 2:
                case 3:
                case 4:
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
           int choice = sc.nextInt();
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