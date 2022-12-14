package Case_study.models.repository.FacilityRepository;

import Case_study.models.model.Facility.Facility;
import Case_study.models.model.Facility.Room;
import Case_study.models.model.Facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {

    public static Map<Facility, Integer> readFileRoom() {
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        try {
            File file = new File("src\\Case_study\\room.csv");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                Facility room = new Room(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                facilityList.put(room, Integer.parseInt(arr[7]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityList;
    }

    public static void writeFileRoom(Map<Facility, Integer> listMap) {
        try {
            FileWriter writer = new FileWriter("src\\Case_study\\room.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Facility room : listMap.keySet()) {
                bufferedWriter.write(room.toString1() + "," + listMap.get(room));
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
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
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                Facility villa = new Villa(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                facilityList.put(villa, Integer.parseInt(arr[9]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilityList;
    }

    public static void writeFile(Map<Facility, Integer> listMap) {
        try {
            FileWriter writer = new FileWriter("src\\Case_study\\villa.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Facility villa : listMap.keySet()) {
                bufferedWriter.write(villa.toString1() + "," + listMap.get(villa));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addRoom(Facility facility, int number) {
        Map<Facility, Integer> room = new LinkedHashMap<>();
        room.put(facility, number);
        writeFileRoom(room);
    }

    @Override
    public void addVilla(Facility facility, int number) {
        Map<Facility, Integer> villa = new LinkedHashMap<>();
        villa.put(facility, number);
        writeFile(villa);
    }


    @Override
    public void displayFacility() {
        Map<Facility, Integer> room = readFileRoom();
        Map<Facility, Integer> villa = readFile();
        for (Map.Entry<Facility, Integer> room1 : room.entrySet()) {
            System.out.println(room1);
        }
        for (Map.Entry<Facility, Integer> villa1 : villa.entrySet()) {
            System.out.println(villa1);
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        Map<Facility, Integer> room = readFileRoom();
        Map<Facility, Integer> villa = readFile();
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
