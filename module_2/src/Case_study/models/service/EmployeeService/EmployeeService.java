package Case_study.models.service.EmployeeService;

import Case_study.models.model.Person.Employee;
import Case_study.models.repository.EmployeeRepository.EmployeeRepository;
import Case_study.models.repository.EmployeeRepository.IEmployeeRepository;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public void add() {
        iEmployeeRepository.add();
    }

    @Override
    public void display() {
        iEmployeeRepository.display();
    }

    @Override
    public void edit(Employee employee) {
        iEmployeeRepository.edit(employee);
    }

    @Override
    public Employee search(String maNhanVien) {
        return iEmployeeRepository.search(maNhanVien);
    }

    @Override
    public void delete() {
        iEmployeeRepository.delete();
    }
}
