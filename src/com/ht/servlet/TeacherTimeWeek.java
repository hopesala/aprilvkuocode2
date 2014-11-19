package com.ht.servlet;

public class TeacherTimeWeek {
    private int day[];
    public TeacherTimeWeek()
    {
    	day=new int [7];
    	for(int i=0;i<7;i++)
    		day[i]=0;
    }
    public void setDay(int num)
    {
    	day[num-1]=1;
    }
    public int getDay(int num)
    {
    	return day[num-1];
    }
    
}
