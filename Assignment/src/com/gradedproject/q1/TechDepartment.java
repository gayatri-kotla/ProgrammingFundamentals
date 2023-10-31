package com.gradedproject.q1;


public class TechDepartment extends SuperDepartment {
	//String res = super.isTodayAHoliday();
	public String departmentName() {
		String str = "Tech Department";
		return str;
	}

	public String getTodaysWork() {
		String str = "Complete coding of Module 1";
		return str;
	}

	public String getWorkDeadline() {
		String str = "Complete by EOD";
		return str;
	}

	public String getTechStackInformation() {
		String str = "Core Java";
		return str;
	}

}
