package com.csi.service;

import com.csi.dao.EmpDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl {

    @Autowired
    EmpDaoImpl empDao;

    // savedata
    public void saveData(Employee employee){
        empDao.saveData(employee);
    }

    // getalldata
    public List<Employee> getAllData(){
        return empDao.getAllData();
    }

    // updatedatabyid
    public void updateDataById(int id, Employee employee){
        empDao.updateDataById(id, employee);
    }

    // deletedatabyid
    public void deleteById(int id){
        empDao.deleteDataById(id);
    }
}
