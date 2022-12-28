package Case_study.models.service.CustomerService;

import Case_study.models.model.Person.Customer;
import Case_study.models.service.IService;

public interface ICustomerService extends IService {
    void add();
    void display();
    void edit(Customer customer);
    Customer search(String maNhanVien);
}
