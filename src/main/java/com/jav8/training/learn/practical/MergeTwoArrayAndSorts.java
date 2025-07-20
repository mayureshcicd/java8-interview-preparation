package com.jav8.training.learn.practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoArrayAndSorts {

	public static void main(String[] args) {
		 
		 int[] array1 = {11, 34, 66, 75};
	     int[] array2 = {1, 5, 19, 50, 89, 100};	     
	     int[] mergeArray=IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
	    List<Integer> list =  Arrays.stream(mergeArray).boxed().sorted().collect(Collectors.toList());
	    
	     
	      System.out.println("\nThe sorted array is: ");
	      for (int num : list) 
	      {
	    	  System.out.print(num + " ");
	      }
		  int n1=array1.length;
		  int n2=array2.length;
		  int[] mereged=new int[n1+n2];
		  System.arraycopy(array1, 0, mereged, 0, n1);
		  System.arraycopy(array2, 0, mereged,n1, n2);
		  
		  Arrays.sort(mereged);
		  
		  List<Integer> meregedList =  Arrays.stream(mereged).boxed().collect(Collectors.toList());
		  
		
		  System.out.println("\nThe sorted array is: ");
	      for (int num : meregedList) 
	      {
	    	  System.out.print(num + " ");
	      }
	      Collections.sort(meregedList,Collections.reverseOrder());
	      
		  System.out.println("\nThe descending sorted array is: ");
	      for (int num : meregedList) 
	      {
	    	  System.out.print(num + " ");
	      }
	      System.out.println("\nThe sorted array is: ");
	      for (int num : mereged) 
	      {
	    	  System.out.print(num + " ");
	      }
	      
	      int[] arrDesc = Arrays.stream(mereged).boxed()
				    .sorted(Collections.reverseOrder())
				    .mapToInt(i->i)
				    .toArray();
	      
	      System.out.println("\nThe sorted descending array is: ");
	      for (int num : arrDesc) 
	      {
	    	  System.out.print(num + " ");
	      }
	}

}
