package ss4_lop_doituong.thuc_hanh;

public class HinhChuNhat {
    private int chieuRong;
    private int chieuDai;
    public HinhChuNhat(int chieuDai,int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double getDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double getChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public String hienThi() {
        return "Rectangle{" + "width=" + chieuDai + ", height=" + chieuRong + "}";
    }

}
