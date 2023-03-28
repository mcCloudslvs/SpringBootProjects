package com.lvscodebuffer.springbootcrud.service;

import com.lvscodebuffer.springbootcrud.entity.Department;
import com.lvscodebuffer.springbootcrud.entity.dto.AddDepartmentDto;
import com.lvscodebuffer.springbootcrud.entity.dto.UpdateDepartmentDto;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(AddDepartmentDto department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, UpdateDepartmentDto department);

    Department fetchDepartmentByName(String departmentName);
}
