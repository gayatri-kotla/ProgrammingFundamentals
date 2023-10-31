package com.gradedproject.q1;

public class AdminDepartment  extends SuperDepartment {
	//String res = super.isTodayAHoliday();
	public String departmentName() {
		String str = "Admin Department";
		return str;
	}

	public String getTodaysWork() {
		String str = "Complete your documents submission";
		return str;
	}

	public String getWorkDeadline() {
		String str = "Complete by EOD";
		return str;
	}

}
