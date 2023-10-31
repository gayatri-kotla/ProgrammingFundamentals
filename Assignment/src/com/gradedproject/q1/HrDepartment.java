package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {
	//String res = super.isTodayAHoliday();

	public String departmentName() {
		String str = "HR Department";
		return str;
	}

	public String getTodaysWork() {
		String str = "Fill today's timesheet and mark your attendance";
		return str;
	}

	public String getWorkDeadline() {
		String str = "Complete by EOD";
		return str;
	}

	public String doActivity() {
		String str = "team Lunch";
		return str;
	}

}
