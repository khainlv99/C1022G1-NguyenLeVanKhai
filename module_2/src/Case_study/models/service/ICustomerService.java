package Case_study.models.service;

import Case_study.models.model.Person.Customer;

public interface ICustomerService extends IService {
    void add();
    void display();
    void edit(Customer customer);
    Customer search(String maNhanVien);
}
