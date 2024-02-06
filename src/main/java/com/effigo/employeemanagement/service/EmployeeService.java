package com.effigo.employeemanagement.service;
import java.util.List;
import java.util.Optional;

import com.effigo.employeemanagement.dto.request.EmployeeRequest;
import com.effigo.employeemanagement.dto.response.EmployeeResponse;
import com.effigo.employeemanagement.entity.Entityclass;
public interface EmployeeService {
List<Entityclass> findAllEmployee();
Optional<Entityclass> findById(Long id);
Entityclass saveEmployee(Entityclass employeeEntity);
Entityclass updateEmployee(Entityclass employeeEntity);
void deleteEmployee(Long id);
EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);
EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id);
}
