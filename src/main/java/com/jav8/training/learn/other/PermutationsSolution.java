package com.jav8.training.learn.other;

//https://github.com/suchimaheshwari/Coding-ninjas-data-st.-through-java
import java.util.Arrays;
import java.util.List;

public class PermutationsSolution {

	public static void main(String[] args) {
		
		List<String> output=Arrays.asList(permutationOfString("XYZ"));	
		output.forEach(a->{
			System.out.println(a);
		});
	
	}
	public static String[] permutationOfString(String input){
        if(input.length() == 0){
            String y[] = {""};
            return y;
        }
        
        String [] ans = permutationOfString(input.substring(1));
		String output[] = new String[ans.length*input.length()];
        
        int k=0;
        for(int i=0;i<ans.length;i++){
            
            for(int j=0;j<=ans[i].length();j++){
                output[k++] = ans[i].substring(0,j) + input.charAt(0) + ans[i].substring(j);
            }
        }
        return output;
	}
}
