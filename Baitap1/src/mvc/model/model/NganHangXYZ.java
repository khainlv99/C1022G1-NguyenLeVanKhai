package mvc.model.model;

public class NganHangXYZ {
    String soThuTu;
    String maSoTietKiem;
    String tenKhachHang;
    String soTien;
    String kyHan;
    String laiSuat;

    public NganHangXYZ() {
    }

    public NganHangXYZ(String soThuTu, String maSoTietKiem, String tenKhachHang, String soTien, String kyHan, String laiSuat) {
        this.soThuTu = soThuTu;
        this.maSoTietKiem = maSoTietKiem;
        this.tenKhachHang = tenKhachHang;
        this.soTien = soTien;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }

    public String getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(String soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaSoTietKiem() {
        return maSoTietKiem;
    }

    public void setMaSoTietKiem(String maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    @Override
    public String toString() {
        return "NganHangXYZ{" +
                "soThuTu=" + soThuTu +
                ", maSoTietKiem=" + maSoTietKiem +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", soTien=" + soTien +
                ", kyHan='" + kyHan + '\'' +
                ", laiSuat=" + laiSuat +
                '}';
    }
}
