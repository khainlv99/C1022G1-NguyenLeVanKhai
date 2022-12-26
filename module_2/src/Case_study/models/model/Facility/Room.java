package Case_study.models.model.Facility;

import Case_study.models.model.Facility.Facility;

public class Room extends Facility {
    private int dichVuMienPhi;

    public Room(int dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue, int dichVuMienPhi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room() {
    }

    public int getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(int dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhi=" + dichVuMienPhi +
                '}';
    }
}
