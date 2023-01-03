package Case_study.models.repository.FacilityRepository;

import Case_study.models.model.Facility.Facility;
import Case_study.models.model.Facility.Room;
import Case_study.models.model.Facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    static Map<Facility,Integer> room = new LinkedHashMap<>();
    static Map<Facility,Integer> villa = new LinkedHashMap<>();
    static {
        room.put(new Room("SVRO-1111","Ghế tình yêu", "100", "3000", "10", "ngay", "an sang"),1);
        villa.put(new Villa("SVVL-1112","Ghế tình yêu", "100", "3000", "10", "tuan", "vip", "10", "3"),2);
        room.put(new Room("SVRO-1113","Ghế tình yêu", "100", "3000", "10", "ngay", "an sang"),6);
        villa.put(new Villa("SVVL-1114","Ghế tình yêu", "100", "3000", "10", "tuan", "vip", "10", "3"),6);
        writeFileRoom(room);
        writeFile(villa);
    }

    public static Map<Facility, Integer> readFileRoom() {
        Map<Facility, Integer> room = new LinkedHashMap<>();
        try {
            File file = new File("src\\Case_study\\room.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                Facility facility = new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                room.put(facility, Integer.parseInt(arr[7]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return room;
    }

    public static void writeFileRoom(Map<Facility, Integer> listMap) {
        try {
            FileWriter fileWriter = new FileWriter("room.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility room : listMap.keySet()) {
                bufferedWriter.write(room + "," + listMap.get(room));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Map<Facility, Integer> readFile() {
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        try {
            File file = new File("src\\Case_study\\villa.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Facility villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6],arr[7],arr[8]);
                facilityList.put(villa,Integer.parseInt(arr[9]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityList;
    }

    public static void writeFile(Map<Facility, Integer> listMap) {
        try {
            FileWriter writer = new FileWriter("src\\Case_study\\villa.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Facility villa : listMap.keySet()) {
                bufferedWriter.write(villa + "," + listMap.get(villa));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void add(Facility facility, int number) {
        if (number<5){
            room.put(facility,number);
        }else {
            villa.put(facility,number);
        }
    }

    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> room: room.entrySet()) {
            System.out.println(room);
        }
        for (Map.Entry<Facility, Integer> room1: villa.entrySet()) {
            System.out.println(room1);
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        for (Map.Entry<Facility, Integer> facility1 : room.entrySet())
            if (facility1.getValue() >= 5) {
                System.out.println(facility1);
            }
        for (Map.Entry<Facility, Integer> facility : villa.entrySet())
            if (facility.getValue() >= 5) {
                System.out.println(facility);
            }
    }
}
