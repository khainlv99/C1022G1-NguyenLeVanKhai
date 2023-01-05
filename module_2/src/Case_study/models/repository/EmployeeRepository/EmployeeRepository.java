package Case_study.models.repository.EmployeeRepository;

import Case_study.models.model.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    public static void writeFile(List<Employee> list) {
        try {
            FileWriter writer = new FileWriter("src\\Case_study\\employee.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Employee employee : list) {
                bufferedWriter.write(employee.getEmployeeCode() + "," + employee.getFullName() + "," + employee.getDateOfBirth() + "," +
                        employee.getPhoneNumber() + "," + employee.getGender() + "," + employee.getIdentityCard() + "," +
                        employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getWage());
            }
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFile() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            File file = new File("src\\Case_study\\employee.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
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
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void add() {
        List<Employee> employeeList = new ArrayList<>();
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
        writeFile(employeeList);
    }

    @Override
    public void display() {
        for (Employee elm:readFile()){
            System.out.println(elm);
        }
    }

    @Override
    public void edit(Employee employee) {
        List<Employee> employeeList = readFile();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().equals(employee.getEmployeeCode())) {
                employeeList.set(i, employee);
            }
        }
        writeFile(employeeList);
    }

    @Override
    public Employee search(String maNhanVien) {
        for (Employee epl : readFile()) {
            if (epl.getEmployeeCode().equals(maNhanVien))
                return epl;
        }
        return null;
    }

    @Override
    public void delete() {
        List<Employee> employeeList = new ArrayList<>();
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
