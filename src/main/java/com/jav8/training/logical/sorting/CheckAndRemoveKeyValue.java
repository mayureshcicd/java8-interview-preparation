package com.jav8.training.logical.sorting;

import java.util.HashMap;
import java.util.Map;

public class CheckAndRemoveKeyValue {

    public static void main(String[] args) {
        Map<String, String> serviceResponseEntityCache = new HashMap<>();
        String searchUser = "ram";
        String userPassword = "pass";
        serviceResponseEntityCache.put(searchUser + ":" + userPassword, "helo1");

        searchUser = "ram1";
        userPassword = "pass1";
        serviceResponseEntityCache.put(searchUser + ":" + userPassword, "helo2");

        searchUser = "ram2";
        userPassword = "pass2";
        serviceResponseEntityCache.put(searchUser + ":" + userPassword, "helo3");

        String user = "ram";
       boolean check= serviceResponseEntityCache.entrySet().removeIf(entry -> entry.getKey().startsWith(user + ":"));
       System.out.println(check);
        check= serviceResponseEntityCache.entrySet().removeIf(entry -> entry.getKey().startsWith(user + "23:"));
        System.out.println(check);

        serviceResponseEntityCache.entrySet().forEach(entry-> System.out.println(entry.getKey() + " : " + entry.getValue()));
        for (Map.Entry<String, String> entry : serviceResponseEntityCache.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
