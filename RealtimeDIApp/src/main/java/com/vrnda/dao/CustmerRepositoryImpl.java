package com.vrnda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.vrnda.bo.CustmerBO;

public class CustmerRepositoryImpl implements CustmerRepository{
	
	private final static String  INSERT_QUERY="insert into Custmer Values(CUST.NEXTVAL,?,?)";
	private DataSource ds;
	
	public CustmerRepositoryImpl(DataSource ds) {
		System.out.println("CustmerRepositoryImpl 1-Param Constructor)");
		this.ds = ds;
	}

	@Override
	public Integer insertCustmer(CustmerBO bo) throws Exception {
		Integer result;
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(INSERT_QUERY);
		System.out.println(bo);
		ps.setString(1, bo.getName());
		ps.setFloat(2, bo.getAmount());
		result=ps.executeUpdate();	
		return result;
	}

}
