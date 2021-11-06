package com.vrnda.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vrnda.beans.Employee;

@Repository("oracleDAO")
public class EmployeeRepositoryImpl implements EmployeeRepository{
	private final String INSERT_QUERY="insert into employee values(EMP_ID.NEXTVAL,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public Integer insertEmployee(Employee emp) throws Exception {
		Integer retVal=0;
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(INSERT_QUERY);
		ps.setString(1, emp.getName());
		ps.setInt(2, emp.getAge());
		ps.setFloat(3, emp.getSalary());
		ps.setDate(4, new java.sql.Date(emp.getDoj().getTime()));
		retVal=ps.executeUpdate();
		return retVal;
	}
	
}
