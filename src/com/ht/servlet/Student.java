package com.ht.servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Student {
	private String username,name;
	private String password,studentid;
	private boolean isLogin;
	public Student(){
		username=null;
		name=null;password=null;studentid=null;
		isLogin=false;
	}
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



	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
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
		String sql="select * from student where username=\""+username+"\"and password=\""+password+"\"";
		rs=stmt.executeQuery(sql);
		if(rs.next())
		{
			name=rs.getString(3);
			studentid=rs.getString(4);
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
	

