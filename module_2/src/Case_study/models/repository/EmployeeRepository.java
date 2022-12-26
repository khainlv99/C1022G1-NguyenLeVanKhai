package Case_study.models.repository;

import Case_study.models.model.Person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();
    static{
        employeeList.add(new Employee("Nguyen Khai", "03/08/1999", "Nam", "048099000777", "0702750320", "Khainguyenlevan@gmail.com", 001, "Đại học", "Giup viec", 130000000));
    }

    @Override
    public void add() {
        String hoTen, ngaySinh, gioiTinh, chungMinhNhanDan, soDienThoai, email, trinhDo, viTri;
        int maNhanVien, luong;
        Scanner scanner = new Scanner(System.in);
        hoTen = scanner.nextLine();
        ngaySinh = scanner.nextLine();
        gioiTinh = scanner.nextLine();
        chungMinhNhanDan = scanner.nextLine();
        soDienThoai = scanner.nextLine();
        email = scanner.nextLine();
        maNhanVien = Integer.parseInt(scanner.nextLine());
        trinhDo = scanner.nextLine();
        viTri = scanner.nextLine();
        luong = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee();
        employee.setHoTen(hoTen);
        employee.setNgaySinh(ngaySinh);
        employee.setGioiTinh(gioiTinh);
        employee.setChungMinhNhanDan(chungMinhNhanDan);
        employee.setSoDienThoai(soDienThoai);
        employee.setEmail(email);
        employee.setMaNhanVien(maNhanVien);
        employee.setTrinhDo(trinhDo);
        employee.setViTri(viTri);
        employee.setLuong(luong);
        employeeList.add(employee);
    }

    @Override
    public void display() {
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
