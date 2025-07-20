package com.jav8.training.learn.dataProcessor.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;
 

public class OrderIDGenerator {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		for (int i=0;i<99999;i++)
		{
			String bankID = "access_bank";
			String userID = "IV6dkTl7JPY9Qy1CHjJk5pJYXcC3";
			String nanoTime = String.valueOf(System.nanoTime());
	 
			
			String orderID = bankID.concat(nanoTime).concat(userID);
					
			list.add(DigestUtils.md5Hex(orderID));
			
		}
		Set<String> s = new HashSet<String>();
		System.out.println("Showing list");
		for (String name : list) {
			if (s.add(name) == false)
				System.out.println(name + "is duplicated");
		}
		for (String name : list) {
			 
				System.out.println(name );
		}
		 	
	}

}
