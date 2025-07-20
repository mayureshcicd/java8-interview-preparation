package com.jav8.training.designStandard.designPattern.builderPattern.advanceBuilder.staffBuilder;
import com.jav8.training.designStandard.designPattern.builderPattern.advanceBuilder.staffBuilder.Staff.Builder;

public class TestStaffBuilderDemo {

	public static void main(String[] args) {
 
		 Builder build=new Staff.Builder().firstName("firstName").age(10)
		 .lastName("lastName");
		 Staff stff=build.build();
		 
		 System.out.println(stff.toString());
		 
		 Staff staff=new Staff.Builder().firstName("firstName").age(10)
		 .lastName("lastName").build();
		 System.out.println(staff.toString());

	}

}
