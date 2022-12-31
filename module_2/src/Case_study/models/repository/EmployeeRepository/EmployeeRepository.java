package Case_study.models.repository.EmployeeRepository;

import Case_study.models.model.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("Nguyen Khai", "03/08/1999", "Nam", "0480990007771", "0702750320", "Khainguyenlevan@gmail.com", "001", "Đại học", "Giup viec", "1300"));
        employeeList.add(new Employee("Nguyen Khai1", "03/08/1999", "Nam", "0480990007772", "0702750320", "Khainguyenlevan@gmail.com", "002", "Đại học", "Giup viec", "1400"));
        employeeList.add(new Employee("Nguyen Khai2", "03/08/1999", "Nam", "0480990007773", "0702750320", "Khainguyenlevan@gmail.com", "003", "Đại học", "Giup viec", "1500"));
        employeeList.add(new Employee("Nguyen Khai3", "03/08/1999", "Nam", "0480990007774", "0702750320", "Khainguyenlevan@gmail.com", "004", "Đại học", "Giup viec", "1600"));
        employeeList.add(new Employee("Nguyen Khai4", "03/08/1999", "Nam", "0480990007775", "0702750320", "Khainguyenlevan@gmail.com", "005", "Đại học", "Giup viec", "1700"));
        try {
            writeFile("C:\\Users\\USER\\Documents\\CodeGym\\C1022G1-NguyenLeVanKhai\\module_2\\src\\Case_study\\employee.csv", employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String path, List<Employee> employeeList) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Employee employee : employeeList) {
            bufferedWriter.write(String.valueOf(employee));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public List<Employee> readFile(String path) {
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
                String employeeCode = temp[6];
                String level = temp[7];
                String position = temp[8];
                String wage = temp[9];
                Employee employee = new Employee(fullName, dateOfBirth, gender, identityCard, phoneNumber, email, employeeCode, level, position, wage);
                employeeList.add(employee);
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
        return employeeList;
    }

    @Override
    public void add() {
        String hoTen, ngaySinh, gioiTinh, chungMinhNhanDan, email, trinhDo, viTri, soDienThoai, maNhanVien, luong;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name: ");
        hoTen = scanner.nextLine();
        System.out.println("Input DateOfBirth: ");
        ngaySinh = scanner.nextLine();
        System.out.println("Input Gender: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Input IdentityCard: ");
        chungMinhNhanDan = scanner.nextLine();
        System.out.println("Input PhoneNumber: ");
        soDienThoai = scanner.nextLine();
        System.out.println("Input Email: ");
        email = scanner.nextLine();
        System.out.println("Input EmployeeCode: ");
        maNhanVien = scanner.nextLine();
        System.out.println("Input Level: ");
        trinhDo = scanner.nextLine();
        System.out.println("Input Position: ");
        viTri = scanner.nextLine();
        System.out.println("Input Wage: ");
        luong = scanner.nextLine();
        Employee employee = new Employee(hoTen, ngaySinh, gioiTinh, chungMinhNhanDan, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
        employeeList.add(employee);
    }

    @Override
    public void display() {
        for (Employee employee : readFile("C:\\Users\\USER\\Documents\\CodeGym\\C1022G1-NguyenLeVanKhai\\module_2\\src\\Case_study\\employee.csv")) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().equals(employee.getEmployeeCode())) {
                employeeList.set(i, employee);
                break;
            }
        }
    }

    @Override
    public Employee search(String maNhanVien) {
        for (Employee epl : employeeList) {
            if (epl.getEmployeeCode().equals(maNhanVien))
                return epl;
        }
        return null;
    }

    @Override
    public void delete() {
        String id;
        System.out.print("Nhập vào id nhân viên : ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().equals(id)) {
                employeeList.remove(employeeList.get(i));
            }
        }
    }


}
