package Case_study.models.repository.FacilityRepository;

import Case_study.models.model.Facility.Facility;
import Case_study.models.model.Facility.Room;
import Case_study.models.model.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Map<Facility,Integer> facilityIntegerMap1 = new LinkedHashMap<>();
    static {
        facilityIntegerMap.put(new Room("Ghế tình yêu", "10", "30000000000", "10", "ngay", "an sang"),1);
        facilityIntegerMap.put(new Villa("ghế tình yêu1", "10", "30000000000", "10", "tuan", "vip", "10", "3"),2);
        facilityIntegerMap1.put(new Room("Ghế tình yêu2", "10", "30000000000", "10", "ngay", "an sang"),6);
        facilityIntegerMap1.put(new Villa("ghế tình yêu3", "10", "30000000000", "10", "tuan", "vip", "10", "3"),6);
    }


    @Override
    public void add(Facility facility, int number) {
        if (number<5){
            facilityIntegerMap.put(facility,number);
        }else {
            facilityIntegerMap1.put(facility,number);
        }
    }

    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> room: facilityIntegerMap.entrySet()) {
            System.out.println(room);
        }
        for (Map.Entry<Facility, Integer> room1: facilityIntegerMap1.entrySet()) {
            System.out.println(room1);
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        for (Map.Entry<Facility, Integer> room : facilityIntegerMap.entrySet())
            if (room.getValue() >= 5) {
                System.out.println(room);
            }
        for (Map.Entry<Facility, Integer> room1 : facilityIntegerMap1.entrySet())
            if (room1.getValue() >= 5) {
                System.out.println(room1);
            }
    }
}
