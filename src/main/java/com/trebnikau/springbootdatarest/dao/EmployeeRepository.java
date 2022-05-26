package com.trebnikau.springbootdatarest.dao;

import com.trebnikau.springbootdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public List<Employee> findAllByName(String name);




}
