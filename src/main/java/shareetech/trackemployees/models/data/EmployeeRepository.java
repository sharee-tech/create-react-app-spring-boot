package shareetech.trackemployees.models.data;

import org.springframework.data.repository.CrudRepository;
import shareetech.trackemployees.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
