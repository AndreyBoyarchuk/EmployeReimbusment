package com.revature;

import java.sql.Statement;

import com.revature.model.Employee;
import com.revature.repository.EmployeeRepository;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeOverivew {

	public static void main(String[] args) {
		
		EmployeeRepository employe_rep= new EmployeeRepository();
		employe_rep.findAllEmployee();
	}
        
}
