package Model.model;

public class CongNhan {
    String maNhanVien;
    String ten;
    String email;
    String diaChi;

    public CongNhan(String maNhanVien, String ten, String email, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.email = email;
        this.diaChi = diaChi;
    }
    public CongNhan() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
