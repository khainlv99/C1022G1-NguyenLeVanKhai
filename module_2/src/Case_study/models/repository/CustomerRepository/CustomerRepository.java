package Case_study.models.repository.CustomerRepository;

import Case_study.models.model.Person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    static List<Customer> customers = new LinkedList<>();
    static {
        customers.add(new Customer("Khai Nguyen", "03/08/1999", "Nam", "04809900644", "0702750320", "khainguyenlevan@gmail.com", "001", "Vip", "Đà Nẵng"));
    }
    public static void writeFile(List<Customer> customers) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\USER\\Documents\\CodeGym\\C1022G1-NguyenLeVanKhai\\module_2\\src\\Case_study\\customer.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Customer customer : customers) {
            bufferedWriter.write(String.valueOf(customer));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
    public List<Customer> readFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine())!= null) {
                temp = line.split(",");
                String fullName = temp[0];
                String dateOfBirth = temp[1];
                String gender = temp[2];
                String identityCard = temp[3];
                String phoneNumber = temp[4];
                String email = temp[5];
                String customerID = temp[6];
                String customerType = temp[7];
                String address = temp[8];
                Customer customer = new Customer(fullName, dateOfBirth, gender, identityCard, phoneNumber, email, customerID, customerType,address);
                customers.add(customer);
                writeFile(customers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customers;
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
        for (Customer cus : readFile("C:\\Users\\USER\\Documents\\CodeGym\\C1022G1-NguyenLeVanKhai\\module_2\\src\\Case_study\\customer.csv")) {
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
