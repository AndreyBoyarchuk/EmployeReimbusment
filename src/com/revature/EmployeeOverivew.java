package com.revature;

import java.sql.Statement;
import java.util.List;

import com.revature.model.Employee;
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
	}

}
