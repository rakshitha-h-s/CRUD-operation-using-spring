package com.effigo.employeemanagement.service;
import java.util.List;
import java.util.Optional;

import com.effigo.employeemanagement.entity.Entityclass;
public interface EmployeeService {
List<Entityclass> findAllEmployee();
Optional<Entityclass> findById(Long id);
Entityclass saveEmployee(Entityclass employeeEntity);
Entityclass updateEmployee(Entityclass employeeEntity);
void deleteEmployee(Long id);

}
