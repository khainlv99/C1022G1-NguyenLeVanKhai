package Case_study.controllers;

import Case_study.models.model.Person.Employee;

public class DisplayEmployeeManagement extends FuramaController{
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
                    break;
                case 5:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
                    break;
            }
        } while (true);
    }
}
