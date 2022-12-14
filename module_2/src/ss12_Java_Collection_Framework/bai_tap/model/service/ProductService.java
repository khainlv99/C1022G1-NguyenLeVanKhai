package ss12_Java_Collection_Framework.bai_tap.model.service;

import ss12_Java_Collection_Framework.bai_tap.model.model.Product;
import ss12_Java_Collection_Framework.bai_tap.model.repository.IProductRepository;
import ss12_Java_Collection_Framework.bai_tap.model.repository.ProductRepository;

public class ProductService extends Product implements IProductService {
    private IProductRepository repository = new ProductRepository();

    @Override
    public void them() {
        repository.them();
    }

    @Override
    public void suaID(Product product) {
        repository.suaID(product);
    }

    @Override
    public Product timKiem(int id) {
        return repository.timKiem(id);
    }


    @Override
    public void xoaID() {
        repository.xoaID();
    }

    @Override
    public void hienThi() {
        repository.hienThi();
    }

    @Override
    public void timKiem() {
        repository.timKiem();
    }

    @Override
    public void sapXepTangDan() {
        repository.sapXepTangDan();
    }

    @Override
    public void sapXepGiamDan() {
        repository.sapXepGiamDan();
    }
}
