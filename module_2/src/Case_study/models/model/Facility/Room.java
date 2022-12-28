package Case_study.models.model.Facility;

import Case_study.models.model.Facility.Facility;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoi, String kieuThue, String dichVuMienPhi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room() {
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhi=" + dichVuMienPhi +
                '}';
    }
}
