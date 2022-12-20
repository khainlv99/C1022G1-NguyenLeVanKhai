package ss12_Java_Collection_Framework.bai_tap.model.repository;

import ss12_Java_Collection_Framework.bai_tap.model.model.Product;

public interface IProductRepository {
    void them();
    void suaID(Product product);
    Product timKiem(int id);
    void xoaID();
    void hienThi();
    void timKiem();
    void sapXepTangDan();
    void sapXepGiamDan();
}
