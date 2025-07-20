package com.jav8.training.interview.conversion;
public class TextConversion {

	public static void main(String[] args) {
		String name="mayuresh ratnaparkhi";
		String finalName="";
		String finalName1="";
		String finalName2="";
		for (String nm:name.split(" "))
		{
			finalName=finalName.concat(" ").concat(String.valueOf(nm.charAt(0)).toUpperCase().concat(nm.substring(1, nm.length())));
			finalName1=String.valueOf(nm.charAt(0)).toUpperCase().concat(nm.substring(1, nm.length())).concat(" ").concat(finalName1);
			finalName2=String.valueOf(nm.charAt(0)).toUpperCase().concat(nm.substring(1, nm.length())).concat(" ").concat(String.valueOf(nm.length())).concat(" ").concat(finalName2);
		}
		System.out.println(finalName);
		System.out.println(finalName1);
		System.out.println(finalName2);
		
		String nme="";
		for (int i=0;i<=name.length()-1;i++)
		{
			nme=nme.concat(String.valueOf(i)).concat(String.valueOf(name.charAt(i)));
			
		}
		System.out.println(nme);
			
	}

}
