package com.effigo.employeemanagement.repository;

import org.springframework.stereotype.Repository;
import com.effigo.employeemanagement.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmployeeRepository extends JpaRepository<Entityclass,Long>{

}
