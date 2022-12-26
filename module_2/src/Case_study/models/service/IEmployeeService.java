package Case_study.models.service;

import Case_study.models.model.Person.Employee;

public interface IEmployeeService extends IService {
    void add();
    void display();
    void edit(Employee employee);
    Employee search(int maNhanVien);
}
