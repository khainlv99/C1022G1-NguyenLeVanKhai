package ss12_Java_Collection_Framework.bai_tap;

public class TestMangerProduct {
    public static void main(String[] args) {
        System.out.println("Thêm mới sản phẩm : ");
        ManagerProduct.addNewProductLinkedList();
        System.out.println("Thêm mới sản phẩm : ");
        ManagerProduct.addNewProductLinkedList();
        System.out.println("Thêm mới sản phẩm : ");
        ManagerProduct.addNewProductLinkedList();
        ManagerProduct.displayProductLinkedList();
        ManagerProduct.sortDescendingByPriceLinkedList();
        ManagerProduct.displayProductLinkedList();
        ManagerProduct.sortAscendingByPriceLinkedList();
        ManagerProduct.displayProductLinkedList();
        ManagerProduct.searchProductByNameLinkedList();
    }
}
