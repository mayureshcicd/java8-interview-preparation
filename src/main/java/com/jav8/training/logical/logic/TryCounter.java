package com.jav8.training.logical.logic;

public class TryCounter {
    public static void main(String[] args) {
        int i=0;
        try {
            i++;
            try {
                i++;
                throw new Exception();
            }
            catch (Exception e)
            {
                i++;
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            i++;
        }
        System.out.println(i);
    }

}
