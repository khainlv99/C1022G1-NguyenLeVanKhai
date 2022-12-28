package Case_study.models.repository.EmployeeRepository;

import Case_study.models.model.Person.Employee;

public interface IEmployeeRepository {
    void add();
    void display();
    void edit(Employee employee);
    Employee search(String maNhanVien);
    void delete();
}
