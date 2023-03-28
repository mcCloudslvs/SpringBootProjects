package com.lvscodebuffer.springbootcrud.repository;

import com.lvscodebuffer.springbootcrud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentName(String departmentName);

     Department findByDepartmentNameIgnoreCase(String departmentName);





}
