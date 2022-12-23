package ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.service;

import ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.repository.IProductRepository;
import ss17_IO_BinaryFile_Serialization1.bai_tap.mvc.model.repository.ProductRepository;

public class ProductService implements IProductService{
    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void add() {
        iProductRepository.add();
    }

    @Override
    public void display() {
        iProductRepository.display();
    }

    @Override
    public void seach() {

    }
}
