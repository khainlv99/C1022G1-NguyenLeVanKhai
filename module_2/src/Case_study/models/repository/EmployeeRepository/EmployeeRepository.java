package Case_study.models.repository.EmployeeRepository;

import Case_study.models.model.Person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("Nguyen Khai", "03/08/1999", "Nam", "0480990007771", "0702750320", "Khainguyenlevan@gmail.com", "001", "Đại học", "Giup viec", "130000000"));
        employeeList.add(new Employee("Nguyen Khai1", "03/08/1999", "Nam", "0480990007772", "0702750320", "Khainguyenlevan@gmail.com", "002", "Đại học", "Giup viec", "140000000"));
        employeeList.add(new Employee("Nguyen Khai2", "03/08/1999", "Nam", "0480990007773", "0702750320", "Khainguyenlevan@gmail.com", "003", "Đại học", "Giup viec", "150000000"));
        employeeList.add(new Employee("Nguyen Khai3", "03/08/1999", "Nam", "0480990007774", "0702750320", "Khainguyenlevan@gmail.com", "004", "Đại học", "Giup viec", "160000000"));
        employeeList.add(new Employee("Nguyen Khai4", "03/08/1999", "Nam", "0480990007775", "0702750320", "Khainguyenlevan@gmail.com", "005", "Đại học", "Giup viec", "170000000"));
    }

    @Override
    public void add() {
        String hoTen, ngaySinh, gioiTinh, chungMinhNhanDan, email, trinhDo, viTri;
        String maNhanVien, luong, soDienThoai;
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
            if (employeeList.get(i).getEmployeeCode().equals(id)){
                employeeList.remove(employeeList.get(i));
            }
        }
    }


}
