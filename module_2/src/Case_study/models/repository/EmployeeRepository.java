package Case_study.models.repository;

import Case_study.models.model.Person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("Nguyen Khai", "03/08/1999", "Nam", "048099000777", 0702750320, "Khainguyenlevan@gmail.com", 001, "Đại học", "Giup viec", 130000000));
    }

    @Override
    public void add() {
        String hoTen, ngaySinh, gioiTinh, chungMinhNhanDan, email, trinhDo, viTri;
        int maNhanVien, luong, soDienThoai;
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
        soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Email: ");
        email = scanner.nextLine();
        System.out.println("Input EmployeeCode: ");
        maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Level: ");
        trinhDo = scanner.nextLine();
        System.out.println("Input Position: ");
        viTri = scanner.nextLine();
        System.out.println("Input Wage: ");
        luong = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee();
        employee.setFullName(hoTen);
        employee.setDateOfBirth(ngaySinh);
        employee.setGender(gioiTinh);
        employee.setIdentityCard(chungMinhNhanDan);
        employee.setPhoneNumber(soDienThoai);
        employee.setEmail(email);
        employee.setEmployeeCode(maNhanVien);
        employee.setLevel(trinhDo);
        employee.setPosition(viTri);
        employee.setWage(luong);
        employeeList.add(employee);
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode() == employee.getEmployeeCode()) {
                employeeList.set(i, employee);
                break;
            }
        }
    }

    @Override
    public Employee search(int maNhanVien) {
        for (Employee epl : employeeList) {
            if (epl.getEmployeeCode() == maNhanVien)
                return epl;
        }
        return null;
    }


}
