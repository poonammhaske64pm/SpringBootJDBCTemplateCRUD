package com.csi.dao;

import com.csi.model.Employee;

import java.util.List;

public interface EmpDao {

    public void saveData(Employee employee);

    public List<Employee> getAllData();

    public void updateDataById(int id, Employee employee);

    public void deleteDataById(int id);
}
