package Case_study.models.service.EmployeeService;

import Case_study.models.model.Person.Employee;
import Case_study.models.service.IService;

public interface IEmployeeService extends IService {
    void add();
    void display();
    void edit(Employee employee);
    Employee search(String maNhanVien);
    void delete();
}
