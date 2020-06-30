package jpmc.H2Testing.Services;

import jpmc.H2Testing.Entities.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee getEmployeeByName(String name);
    public List<Employee> getAllEmployees();
}
