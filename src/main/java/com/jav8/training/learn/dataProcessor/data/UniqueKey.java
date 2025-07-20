package com.jav8.training.learn.dataProcessor.data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueKey {

	public static void main(String[] args) {
		String createdBy = "woU8p2WdHzO96THwX1RnqAhI68x2";
		List<String> list = new ArrayList<String>();
		String bankId = "fidelity_bank";
		for (int i = 0; i < 10230; i++)
			list.add(String.valueOf(generateUniqueKey(bankId, createdBy)));

		bankId = "accessBank";
		for (int i = 0; i < 1090230; i++)
			list.add(String.valueOf(generatePrimaryKey(bankId, createdBy)));
		Set<String> s = new HashSet<String>();
		System.out.println("Showing list");
		for (String name : list) {
			if (s.add(name) == false)
				System.out.println(name + "is duplicated");
		}
		//for (String l : list)

			//System.out.println(l + " " + l.length());

	}
	public static String generatePrimaryKey(String bankId, String createdBy) {
		return bankId.concat("_").concat(createdBy.concat("_").concat(String.valueOf(System.nanoTime()).concat("_")
				.concat(new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_az").format(new Date()))));
	} 
	public static String generateUniqueKey(String bankId, String createdBy) {
		return getUniqueId(String.valueOf(bankId.concat("_")
				.concat(createdBy.concat("_")
						.concat(String.valueOf(System.nanoTime()).concat("_")
								.concat(new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_az").format(new Date()))))
				.hashCode()));
	}

	private static String getUniqueId(String id) {
		return id.concat(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()))
				.concat(String.valueOf(id.concat(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())).length()));
	}

}
