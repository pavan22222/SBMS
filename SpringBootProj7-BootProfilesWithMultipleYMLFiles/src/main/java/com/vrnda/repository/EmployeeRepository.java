package com.vrnda.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.vrnda.dto.Employee;

@Repository
//@Profile(value={"default"})
public class EmployeeRepository {
	private final String SELECT_QUERY="SELECT * FROM EMPLOYEE"; 
	
	//@Value("${spring.profiles.active}")
	private String profile;
	
	@Autowired
	private DataSource datasource;
	
	public List<Employee> getEmps() throws Exception{
		List<Employee> retList=new ArrayList<Employee>();
		Connection con=null;
		PreparedStatement ps=null;
		try {
			System.out.println("Active Profile is::"+profile);
			System.out.println(datasource.getClass().getName());
			con=datasource.getConnection();
			ps=con.prepareStatement(SELECT_QUERY);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				retList.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalAccessException();
		} finally {
			if(con != null) {
				con.close();
			}
			
			if(ps != null) {
				ps.close();
			}
		}
		
		return retList;
	}

}
