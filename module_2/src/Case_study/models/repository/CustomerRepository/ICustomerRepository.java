package Case_study.models.repository.CustomerRepository;

import Case_study.models.model.Person.Customer;

public interface ICustomerRepository {
    void add();
    void display();
    void edit(Customer customer);
    Customer search(String maNhanVien);
}
