package Model.repository;

import Model.model.CongNhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CongNhanRepository implements ICongNhanRepository {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (CongNhan cns:readFile()){
            System.out.println(cns);
        }
    }

    @Override
    public void add() {
        List<CongNhan> congNhans = new ArrayList<>();
        String maNhanVien, ten, email, diaChi;
        System.out.println("Vui lòng nhập mã nhân viên: ");
        maNhanVien = scanner.nextLine();
        System.out.println("Vui lòng nhập tên: ");
        ten = scanner.nextLine();
        System.out.println("Vui lòng nhập email: ");
        email = scanner.nextLine();
        System.out.println("Vui lòng nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        CongNhan congNhan = new CongNhan(maNhanVien, ten, email, diaChi);
        congNhans.add(congNhan);
        writeFile(congNhans);
    }

    @Override
    public void search() {
        System.out.println("Nhập mã nhân viên");
        String ten = scanner.nextLine();
        for (CongNhan cns : readFile()) {
            if (cns.getTen().contains(ten)){
                System.out.println(cns);
            }
        }
    }

    public static List<CongNhan> readFile() {
        List<CongNhan> cns = new ArrayList<>();
        try {
            File file = new File("src\\CongNhan.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                String maNhanVien = temp[0];
                String name = temp[1];
                String email = temp[2];
                String diaChi = temp[3];
                CongNhan cns1 = new CongNhan(maNhanVien,name,email,diaChi);
                cns.add(cns1);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cns;
    }
    public static void writeFile(List<CongNhan> list) {
        try {
            FileWriter writer = new FileWriter("src\\CongNhan.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (CongNhan cns : list) {
                bufferedWriter.write(cns.toString());
            }
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
