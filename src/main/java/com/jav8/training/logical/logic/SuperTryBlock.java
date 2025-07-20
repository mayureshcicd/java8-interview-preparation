package com.jav8.training.logical.logic;

import java.io.FileNotFoundException;

public class SuperTryBlock
{
    public static void main(String[] args) {
          checkTry();
    }

    private static int checkTry() {
        try{
            System.out.println("Try");
            int  i  = 10 / 0 ;
            return 1;
        }
        catch(RuntimeException ex){   //
        //catch(FileNotFoundException ex){   //
            System.out.println("Catch");
            return 2;
        }finally{
            System.out.println("Finally");
            return 3;
        }
    }
}

