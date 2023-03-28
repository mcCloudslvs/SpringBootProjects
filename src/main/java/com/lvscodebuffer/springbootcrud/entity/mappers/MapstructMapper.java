package com.lvscodebuffer.springbootcrud.entity.mappers;

import com.lvscodebuffer.springbootcrud.entity.Department;
import com.lvscodebuffer.springbootcrud.entity.dto.AddDepartmentDto;
import com.lvscodebuffer.springbootcrud.entity.dto.UpdateDepartmentDto;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface MapstructMapper {

    AddDepartmentDto DEPARTMENT_DTOAddDepartmentDto(Department department);
    UpdateDepartmentDto DEPARTMENT_DTOUpdateDepartmentDto(Department department);
}
