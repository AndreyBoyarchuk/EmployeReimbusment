package com.revature.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.model.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeeRepository {
	
	public void findAllEmployee() {
		

		
		  Connection conn= null;
		  Statement stmt=null;
		  ResultSet set=null;
		  
		  final String SQL= "select * from employee";
				try { 
					conn=ConnectionUtil .getNewConnection();
;					
				stmt=conn.createStatement();
				   set=stmt.executeQuery(SQL);
					
					while(set.next()) {
						Employee  employee= new Employee(
								set.getInt(1),
								set.getString(2),
								set.getString(3),
								set.getString(4),
								set.getString(5)
								);
						
						
						
						System.out.println(employee);
					}
					
			
				}
				catch (SQLException e) {
					e.printStackTrace();
					
				}
				finally {
					try {
						stmt.close();
						set.close();
						conn.close();
					} catch(SQLException e){
						e.printStackTrace();
						
					}
					}
		// TODO Auto-generated method stub

		
	}

}
