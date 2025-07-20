package com.jav8.training.learn.table;

public class TableDemo {

	public static void main(String[] args) {

		printTable(10);
	}

	public static void printTable(int num)
	{
		 for(int i=1;i<=10;i++)
		 {
			 String result="";
			 for (int j=1;j<=num;j++)
			 {
				 String tbl=String.valueOf(i*j).length()==1?" "+String.valueOf(i*j):String.valueOf(i*j);
				 result=result+tbl+" ";
			 }
			 System.out.println(result);
		 }
	}
	public static void showTable(int num)
	{
		 for(int i=1;i<num;i++)
		 {
			 String result="";
			 for (int j=1;j<=10;j++)
			 {
				 String tbl="";
				 if (String.valueOf(i*j).length()==1)
					 tbl=" "+String.valueOf(i*j);
				 else
					 tbl=String.valueOf(i*j);
				 result=result+tbl+" ";
			 }
			 System.out.println(result);
		 }
	}	
}
