package mvc.model.repository;

import mvc.Regex;
import mvc.model.model.NganHangXYZ;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NganHangRepository implements INganHangRepository {
    public static List<NganHangXYZ> nganHangXYZS = new ArrayList<>();

    static {
        nganHangXYZS.add(new NganHangXYZ("1", "STK-789", "Nguyễn Văn An", "5000000", "6 tháng", "7.0"));
    }

    public static List<NganHangXYZ> readFile() {
        List<NganHangXYZ> nganHangXYZS = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\so_tiet_kiem.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
//            int soThuTu, String maSoTietKiem, String tenKhachHang, int soTien, String kyHan, double laiSuat
            while ((line = bufferedReader.readLine()) != null) {
                String arr[] = line.split(",");
                String soThuTu = arr[0];
                String maSoTietKiem = arr[1];
                String tenKhachHang = arr[2];
                String soTien = arr[3];
                String kyHan = arr[4];
                String laiSuat = arr[5];
                NganHangXYZ nganHangXYZ = new NganHangXYZ(soThuTu, maSoTietKiem, tenKhachHang, soTien, kyHan, laiSuat);
                nganHangXYZS.add(nganHangXYZ);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nganHangXYZS;
    }
    public static void writeFile(List<NganHangXYZ> nganHangXYZS){
        FileWriter fileWriter= null;
        BufferedWriter buffered = null;
        try {
            fileWriter = new FileWriter("src\\so_tiet_kiem.csv");
            buffered = new BufferedWriter(fileWriter);
            for (NganHangXYZ nh: nganHangXYZS) {
                buffered.write(nh.getSoThuTu()+","+nh.getMaSoTietKiem()+","+nh.getTenKhachHang()+","+nh.getSoTien()+","+nh.getKyHan()+","+nh.getLaiSuat());
            }
            buffered.newLine();
            buffered.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        for (NganHangXYZ nh:readFile()) {
            System.out.println(nh);
        }
    }

    @Override
    public void dangky() {
        List<NganHangXYZ> nganHangXYZS = new ArrayList<>();
        String soThuTu, maSoTietKiem, tenKhachHang, soTien, kyHan, laiSuat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ tự: ");
        soThuTu = scanner.nextLine();
        do {
            System.out.println("nhập mã số tiết kiệm: ");
            maSoTietKiem = scanner.nextLine();
            if (Regex.checkRegexMaSo(maSoTietKiem)== false){
                System.out.println("Nhập lại!!");
            }
        }while (!Regex.checkRegexMaSo(maSoTietKiem));
        System.out.println("nhập tên khách hàng: ");
        tenKhachHang = scanner.nextLine();
        do {
            System.out.println("Nhập số tiền: ");
            soTien = scanner.nextLine();
            if (Regex.checkSoTien(soTien)== false){
                System.out.println("Nhập lại!!");
            }
        }while (!Regex.checkSoTien(soTien));
        do {
            System.out.println("Nhập kỳ hạn: ");
            kyHan = scanner.nextLine();
            if (Regex.checkKyHan(kyHan)== false){
                System.out.println("Nhập lại!!");
            }
        }while (!Regex.checkKyHan(kyHan));
        do {
            System.out.println("nhập lãi suất: ");
            laiSuat = scanner.nextLine();
            if (Regex.checkLaiSuat(laiSuat)== false){
                System.out.println("Nhập lại!!");
            }
        }while (!Regex.checkLaiSuat(laiSuat));
        NganHangXYZ nganHangXYZ = new NganHangXYZ(soThuTu,maSoTietKiem,tenKhachHang,soTien,kyHan,laiSuat);
        nganHangXYZS.add(nganHangXYZ);
        writeFile(nganHangXYZS);
    }
}
