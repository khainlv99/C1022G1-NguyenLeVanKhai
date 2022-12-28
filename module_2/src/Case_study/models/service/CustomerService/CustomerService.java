package Case_study.models.service.CustomerService;

import Case_study.models.model.Person.Customer;
import Case_study.models.repository.CustomerRepository.CustomerRepository;
import Case_study.models.repository.CustomerRepository.ICustomerRepository;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public void add() {

    }

    @Override
    public void display() {
        iCustomerRepository.display();
    }

    @Override
    public void edit(Customer customer) {
        iCustomerRepository.edit(customer);
    }

    @Override
    public Customer search(String maNhanVien) {
        return iCustomerRepository.search(maNhanVien);
    }
}
