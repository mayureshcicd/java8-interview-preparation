package com.jav8.training.learn.practical;

public class PalindromeOne {

	static String checkPalindrome(String str) {
		int n = str.length();

		int count = 0;

		for (int i = 0; i < n / 2; ++i)

			if (str.charAt(i) != str.charAt(n - i - 1))
				++count;

		return (count <= 1)==true?"Yes":"No";
	}

	public static void main(String[] args) {

		 String str = "abccaa";
		// str = "madan";
		 //str = "adwerccaa";
		System.out.println(checkPalindrome(str));

	}

}
