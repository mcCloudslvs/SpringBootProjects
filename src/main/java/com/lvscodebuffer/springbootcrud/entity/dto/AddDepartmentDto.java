package com.lvscodebuffer.springbootcrud.entity.dto;

import com.lvscodebuffer.springbootcrud.entity.Department;
import org.springframework.lang.NonNull;

public class AddDepartmentDto {
    @NonNull
    private String departmentName;

    private String DepartmentAddress;
    @NonNull
    private String departmentCode;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
