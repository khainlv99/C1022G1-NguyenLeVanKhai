package Case_study.models.repository.CustomerRepository;

import Case_study.models.model.Person.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    static List<Customer> customers = new LinkedList<>();
    static {
        customers.add(new Customer("Khai Nguyen", "03/08/1999", "Nam", "04809900644", "0702750320", "khainguyenlevan@gmail.com", "001", "Vip", "Đà Nẵng"));
    }
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        String fullName, dateOfBirth, gender, identityCard, phoneNumber, email, customerID, customerType, address;
        System.out.println("Input fullName: ");
        fullName = scanner.nextLine();
        System.out.println("Input dateOfBirth: ");
        dateOfBirth = scanner.nextLine();
        System.out.println("Input gender: ");
        gender = scanner.nextLine();
        System.out.println("Input identityCard: ");
        identityCard = scanner.nextLine();
        System.out.println("Input phoneNumber : ");
        phoneNumber = scanner.nextLine();
        System.out.println("Input email: ");
        email = scanner.nextLine();
        System.out.println("Input customerID: ");
        customerID = scanner.nextLine();
        System.out.println("Input customerType: ");
        customerType = scanner.nextLine();
        System.out.println("Input address: ");
        address = scanner.nextLine();
        Customer customer = new Customer();
        customers.add(customer);
    }

    @Override
    public void display() {
        for (Customer cus : customers) {
            System.out.println(cus);
        }
    }

    @Override
    public void edit(Customer customer) {
        for (int i = 0; i < customers.size() ; i++) {
            if (customers.get(i).getCustomerID() == customer.getCustomerID()){
                customers.set(i,customer);
            }
        }
    }

    @Override
    public Customer search(String maKhachHang) {
        for (Customer cus: customers) {
            if (cus.getCustomerID() == maKhachHang){
                return cus;
            }
        }
        return null;
    }
}
