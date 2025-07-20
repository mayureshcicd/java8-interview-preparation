package com.jav8.training.interview.compare;

public class ArrayCompare {

    public static void main(String[] args) {
        String[] names={"100","101","100","100","102","103","101"};
        for (int i=0;i<names.length;i++)
        {
            for (int j=i+1; j<(i+2) && j< names.length;j++ )
            {
                if (!names[i].equalsIgnoreCase(names[j]))
                {
                    System.out.println( names[i]+ "  "+names[j]);
                }
            }
        }
    }
}
/*
100  101
101  100
100  102
102  103
103  101

===========
 String[] names={"100","101","100","100","102","103","101"};
100  101
101  100
100  102
102  103
103  101
* */
