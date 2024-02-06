package com.effigo.employeemanagement.dto.mapper;
import org.mapstruct.Mapper;

import com.effigo.employeemanagement.dto.request.EmployeeRequest;
import com.effigo.employeemanagement.dto.response.EmployeeResponse;
import com.effigo.employeemanagement.entity.Entityclass;
import org.mapstruct.factory.Mappers;
@Mapper
public interface EmployeeMapper {
EmployeeMapper MAPPER =Mappers.getMapper(EmployeeMapper.class);
Entityclass fromRequestToEntity(EmployeeRequest employeeRequest);
EmployeeResponse fromEntityToResponse(Entityclass employeeEntity);
}
