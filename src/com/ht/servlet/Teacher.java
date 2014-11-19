package com.ht.servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teacher {
	  private String username , password,name,teacherid;
		private boolean isLogin;
	  public boolean isLogin() {
			return isLogin;
		}
		public void setLogin(boolean isLogin) {
			this.isLogin = isLogin;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void check()
	{	
		dbconnection d = new dbconnection();
		Connection t = d.getConnection();
		Statement stmt;
		stmt=null;
		try {
			stmt = t.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	ResultSet rs=null;
		try {
		String sql="select * from teacher where username=\""+username+"\"and password=\""+password+"\"";
		rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			name=rs.getString(4);
			teacherid=rs.getString(2);
		    System.out.println("username:"+rs.getString(4));
            isLogin=true;
		}
		else {
			 isLogin=false;
		}
		rs.close();
		t.close();
		}catch (Exception E) {
		E.printStackTrace();	
	}
		
	}
		




}
