package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    EmpServiceImpl empService;

    // savedata
    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(@RequestBody Employee employee){
        empService.saveData(employee);
        return ResponseEntity.ok("DATA SAVED");
    }

    // getalldata
    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(empService.getAllData());
    }

    // updatedatabyid
    @PutMapping("/updatedatabyid/{id}")
    public ResponseEntity<String> updateDataById(@PathVariable int id, @RequestBody Employee employee){
        empService.updateDataById(id, employee);
        return ResponseEntity.ok("DATA UPDATED");
    }

    // deletedatabyid
    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        empService.deleteById(id);
        return ResponseEntity.ok("DATA DELETED");
    }
}
