package Case_study.models.repository.CustomerRepository;

import Case_study.models.model.Person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    static List<Customer> customers = new LinkedList<>();
    static {
        customers.add(new Customer("Khai Nguyen", "03/08/1999", "Nam", "04809900644", "0702750320", "khainguyenlevan@gmail.com", "001", "Vip", "Đà Nẵng"));
        writeFile(customers);
    }
    public static void writeFile(List<Customer> list) {
        try {
            FileWriter writer = new FileWriter("src\\Case_study\\customer.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Customer cus : list) {
                bufferedWriter.write(cus.getCustomerID() + "," + cus.getFullName() + "," + cus.getDateOfBirth() + "," +
                        cus.getPhoneNumber() + "," + cus.getGender() + "," + cus.getIdentityCard() + "," +
                        cus.getEmail() + "," + cus.getCustomerType() + "," + cus.getAddress());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Customer> readFile() {
        List<Customer> stringList = new ArrayList<>();
        try {
            File file = new File("src\\Case_study\\customer.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String customerID = arr[0];
                String fullName = arr[1];
                String dateOfBirth = arr[2];
                String phoneNumber = arr[3];
                String gender = arr[4];
                String identityCard = arr[5];
                String email = arr[6];
                String customerType = arr[7];
                String address = arr[8];
                Customer customer = new Customer(customerID, fullName, dateOfBirth, phoneNumber, gender, identityCard, email, customerType, address);
                stringList.add(customer);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
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
        customer.setFullName(fullName);
        customer.setDateOfBirth(dateOfBirth);
        customer.setGender(gender);
        customer.setIdentityCard(identityCard);
        customer.setPhoneNumber(phoneNumber);
        customer.setEmail(email);
        customer.setCustomerID(customerID);
        customer.setCustomerType(customerType);
        customer.setAddress(address);
        customers.add(customer);
    }

    @Override
    public void display() {
        for (Customer cus : readFile()) {
            System.out.println(cus);
        }
    }

    @Override
    public void edit(Customer customer) {
        for (int i = 0; i < customers.size() ; i++) {
            if (customers.get(i).getCustomerID().equals(customer.getCustomerID())){
                customers.set(i,customer);
            }
        }
    }

    @Override
    public Customer search(String maKhachHang) {
        for (Customer cus: customers) {
            if (cus.getCustomerID().equals(maKhachHang)){
                return cus;
            }
        }
        return null;
    }
}
