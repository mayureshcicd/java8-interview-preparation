package com.jav8.training.learn.imutable;

 

public class TestStaff {

	public TestStaff() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Staff staff=new Staff(1,"Mayuresh","pune","411051");
		System.out.println(staff.getStaffId()+ " "+staff.getStaffName()+ " "+
				
				staff.getAddress().getCity()+ " "+
				staff.getAddress().getPostalCode());
	}

}
