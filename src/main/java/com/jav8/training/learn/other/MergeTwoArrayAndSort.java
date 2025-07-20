package com.jav8.training.learn.other;

import java.util.Arrays;

public class MergeTwoArrayAndSort {

	public static void main(String[] args) {
		 
		 int[] arr1 = {11, 34, 66, 75};
	      int n1 = arr1.length;
	      int[] arr2 = {1, 5, 19, 50, 89, 100};
	      
	      int n2 = arr2.length;
	      int[] merge = new int[n1 + n2];
	      
	      System.arraycopy(arr1, 0, merge, 0, n1);
	      System.arraycopy(arr2, 0, merge, n1, n2);
	      Arrays.sort(merge);
	      System.out.println("\nThe sorted array is: ");
	      for (int num : merge) 
	      {
	    	  System.out.print(num + " ");
	      }
	}

}
