package khai.baitap.file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Test {

    public static final String PATHFILE = "C:\\Users\\USER\\Documents\\CodeGym\\C1022G1-NguyenLeVanKhai\\module_2\\src\\khai\\baitap\\file_csv\\text.csv";

    public static void main(String[] args) throws IOException {
        System.out.println("Read file CSV");
        Test.readFile(PATHFILE);
        System.out.println("Done !!!");
    }
    public static void readFile(String PATHFILE) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATHFILE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String arr[];
            ListOfCountries listOfCountries;
            while ((line = bufferedReader.readLine())!=null){
                arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String code = arr[1];
                String name = arr[2];
                listOfCountries = new ListOfCountries(id,code,name);
                System.out.println(listOfCountries);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                System.out.println("IOException");
            }
        }
    }
}
