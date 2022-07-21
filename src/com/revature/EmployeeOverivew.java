package com.revature;

import java.sql.Statement;
import java.util.List;

import com.revature.model.Employee;
import com.revature.repository.EmploeeRepository;
import com.revature.repository.EmployeeRepositoryImpl;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeOverivew {

	public static void main(String[] args) {

		EmployeeRepositoryImpl employee_rep = new EmployeeRepositoryImpl();
		employee_rep.selectAllEmployee();
		List<Employee> employees = employee_rep.findAllEmployee();
		System.out.println(employees);
		
		EmploeeRepository employeeRepository =new EmployeeRepositoryImpl();
		
		Employee newEmployee= new Employee(12,"Joe Chmo","chmo@gmail.com",2,"Everett");
		//Employee newEmployee= new Employee(0,"Joe chom',4);drop table testTable; --comment","chmo@ll_n.com",2,"Tampa");
		employee_rep.save(newEmployee);
		employee_rep.selectAllEmployee();
	}

}
