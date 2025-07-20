package com.jav8.training.learn.modifyarray;

import java.util.Arrays;
import java.util.HashMap;

public class ErrorMapDemo {

    public static void main(String[] args) {
        HashMap<String, String[]> errorMap = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            if (errorMap.containsKey("address")) {
                errorMap.put("address", appendToArray(errorMap.get("address"),"MH"));
            } else {
                errorMap.put("address", new String[]{"pune"});
            }
        }

        for (String v:errorMap.get("address")) {
            System.out.println(v);
        }
    }
    public static <T> T[] appendToArray(T[] elements, T element)
    {
        T[] newArray = Arrays.copyOf(elements, elements.length + 1);
        newArray[elements.length] = element;
        return newArray;
    }

}
