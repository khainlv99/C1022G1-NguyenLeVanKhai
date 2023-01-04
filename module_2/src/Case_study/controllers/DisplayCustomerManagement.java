package Case_study.controllers;

import Case_study.models.model.Person.Customer;

public class DisplayCustomerManagement extends FuramaController{
    public void displayCustomerManagement() {
        System.out.println("---------Customer Management----------- ");
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
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMainMenu();
                    break;
            }
        } while (true);
    }
}
