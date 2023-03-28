package com.lvscodebuffer.springbootcrud.entity.dto;

public class UpdateDepartmentDto {
    private String departmentName;
    private String DepartmentAddress;

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

        return null;
    }
}
