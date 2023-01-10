package Model.repository;

import Model.model.CongNhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CongNhanRepository implements ICongNhanRepository {
    Scanner scanner = new Scanner(System.in);

    public static List<CongNhan> readFile (){
        List<CongNhan> congNhans1 = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\CongNhan.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String arr[]=line.split(",");
                String maNhanVien = arr[0];
                String ten = arr[1];
                String email = arr[2];
                String diaChi = arr[3];
                CongNhan cns = new CongNhan(maNhanVien,ten,email,diaChi);
                congNhans1.add(cns);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return congNhans1;
    }
    public static void writerFile(List<CongNhan> congNhans2){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\CongNhan.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CongNhan cns: congNhans2) {
                bufferedWriter.write(cns.getMaNhanVien()+ ","+ cns.getTen()+","+cns.getEmail()+","+cns.getDiaChi());
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void display() {
        for (CongNhan cns: readFile()) {
            System.out.println(cns);
        }

    }

    @Override
    public void add() {
        List<CongNhan> congNhans1 = new ArrayList<>();
        String maNhanVien,name,email,diaChi;
        System.out.println("Input maNhanVien: ");
        maNhanVien = scanner.nextLine();
        System.out.println("Input name: ");
        name = scanner.nextLine();
        System.out.println("Input email: ");
        email = scanner.nextLine();
        System.out.println("Input diaChi: ");
        diaChi = scanner.nextLine();
        CongNhan congNhan = new CongNhan(maNhanVien,name,email,diaChi);
        congNhans1.add(congNhan);
        writerFile(congNhans1);
    }

    @Override
    public void search() {
        List<CongNhan> congNhans1 = readFile();
        System.out.println("Nhap ten can tim: ");
        String name1 = scanner.nextLine();
        for (int i = 0; i < congNhans1.size(); i++) {
            if (congNhans1.get(i).getTen().contains(name1)){
                System.out.println(congNhans1);
            }
        }
    }
}
