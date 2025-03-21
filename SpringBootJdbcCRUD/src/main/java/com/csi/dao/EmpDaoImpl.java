package com.csi.dao;

import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmpDaoImpl implements EmpDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    String INSERT_SQL = "insert into empjdbc(id, name, salary) values(?, ?, ?)";

    String UPDATE_SQL = "update empjdbc set name = ?, salary = ? where id = ?";

    String SELECT_SQL = "select * from empjdbc";

    String DELETE_SQL = "delete from empjdbc where id = ?";

    private Employee employee(ResultSet resultSet, int numRow) throws SQLException {
        return Employee.builder().id(resultSet.getInt(1)).name(resultSet.getString(2)).salary(resultSet.getDouble(3)).build();
    }


    @Override
    public void saveData(Employee employee) {

        jdbcTemplate.update(INSERT_SQL, employee.getId(), employee.getName(), employee.getSalary());
    }

    @Override
    public List<Employee> getAllData() {
        return jdbcTemplate.query(SELECT_SQL, this::employee);
    }

    @Override
    public void updateDataById(int id, Employee employee) {

        jdbcTemplate.update(UPDATE_SQL, employee.getName(), employee.getSalary(), id);
    }

    @Override
    public void deleteDataById(int id) {

        jdbcTemplate.update(DELETE_SQL, id);
    }
}
