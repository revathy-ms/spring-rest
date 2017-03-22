package com.controller.employee;

import java.util.ArrayList;


public class EmployeeMain{
	int eid;
	String ename,dept,domain,pid;
	
	public EmployeeMain(){}
	public EmployeeMain(int eid, String ename, String dept,String domain, String pid) {
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.domain= domain;
		this.pid = pid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public int getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	public String getDept() {
		return dept;
	}
	public String getDomain() {
		return domain;
	}
	public String getPid() {
		return pid;
	}
	public ArrayList<EmployeeMain> setValues(){
		ArrayList<EmployeeMain> elist=new ArrayList<EmployeeMain>();
		EmployeeMain edata=new EmployeeMain(1001,"Diya","IT","Communication","pid_100");
		EmployeeMain emp=new EmployeeMain(1002,"John","Development","Java","pid_2091");
		EmployeeMain emp1=new EmployeeMain(1234,"Heera","Support","DataAcces","pid_908");
		EmployeeMain emp2=new EmployeeMain(1111,"Athira","Support","WebServices","pid_2008");
		EmployeeMain emp3=new EmployeeMain(1003,"Arathi","IT","WebServices","pid_8908");
		EmployeeMain emp4=new EmployeeMain(2222,"Sreehari","IES","C#","pid_945");
		EmployeeMain emp5=new EmployeeMain(2333,"Jis","Development","Java","pid_0123");
		
		elist.add(edata);
		elist.add(emp);
		elist.add(emp1);
		elist.add(emp2);
		elist.add(emp3);
		elist.add(emp4);
		elist.add(emp5);
		return elist;
	}
}


