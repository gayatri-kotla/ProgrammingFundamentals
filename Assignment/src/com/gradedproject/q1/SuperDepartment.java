package com.gradedproject.q1;

public class SuperDepartment {
	public String departmentName() 
	{
		String str = "Super Department";
		return str;
	}

	public String getTodaysWork() 
	{
		String str = "No Work as of now";
		return str;
	}

	public String getWorkDeadline() 
	{
		String str = "nil";
		return str;
	}

	public String isTodayAHoliday()
	{
		String str = "Today is not a holiday";
		return str;
	}

public static void main(String[] args) {
// TODO Auto-generated method stub
//SuperDepartment sd = new SuperDepartment();
HrDepartment Hr = new HrDepartment();
TechDepartment Tech = new TechDepartment();
AdminDepartment Ad = new AdminDepartment();

System.out.println("Welcome to"+" "+Ad.departmentName());
System.out.println(Ad.getTodaysWork());
System.out.println(Ad.getWorkDeadline());
System.out.println(Ad.isTodayAHoliday());
System.out.println( );


System.out.println("Welcome to"+" "+Hr.departmentName());
System.out.println(Hr.doActivity());
System.out.println(Hr.getTodaysWork());
System.out.println(Hr.getWorkDeadline());
System.out.println(Hr.isTodayAHoliday());
System.out.println( );


System.out.println("Welcome to"+" "+Tech.departmentName());
System.out.println(Tech.getTodaysWork());
System.out.println(Tech.getWorkDeadline());
System.out.println(Tech.getTechStackInformation());
System.out.println(Tech.isTodayAHoliday());
System.out.println( );


	}

}
