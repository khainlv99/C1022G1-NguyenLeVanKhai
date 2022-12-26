package Case_study.models.service;

import Case_study.models.repository.EmployeeRepository;
import Case_study.models.repository.IEmployeeRepository;

public class EmployeeService implements IEmployeeService{
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public void add() {
        iEmployeeRepository.add();
    }

    @Override
    public void display() {
        iEmployeeRepository.display();
    }
}
