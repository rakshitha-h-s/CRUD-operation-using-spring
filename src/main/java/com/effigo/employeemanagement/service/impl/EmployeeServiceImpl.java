package com.effigo.employeemanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.effigo.employeemanagement.entity.Entityclass;
import com.effigo.employeemanagement.repository.EmployeeRepository;
import com.effigo.employeemanagement.service.EmployeeService;

@Service
class EmployeeServiceImpl implements EmployeeService{

	private final EmployeeRepository employeeRepository;
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository=employeeRepository;
	}
	@Override
	public List<Entityclass> findAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Entityclass> findById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public Entityclass saveEmployee(Entityclass employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public Entityclass updateEmployee(Entityclass employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employeeEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

}
