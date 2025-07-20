package com.jav8.training.learn.filters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;
/**
 * @author Crunchify.com
 * 
 *         Best way to sort HashMap by Key and Value in Java8 - Tutorial by App Shah
 * 
 */
public class CrunchifySortMapByKeyValueJava8 {
    private static final Random crunchifyRandom = new Random();
    public static void main(String[] argv) {
        Map<String, Integer> crunchifyMap = new HashMap<>();
        // Let's first create companies ArrayList
        ArrayList<String> companies = new ArrayList<>();
        companies.add("Crunchify.com");
        companies.add("Google.com");
        companies.add("Twitter.com");
        // Let's add 10 entries to HashMap crunchifyMap
        for (int i = 1; i <= 10; ++i) {
            // How to get Random value from ArrayList?
            String company = companies.get(crunchifyRandom.nextInt(companies.size()));
            // Basically we are creating
            // Key with pattern: 1-Crunchify, 5-Google, and so on...
            // Random Value: Number between 1 to 50
            crunchifyMap.put(crunchifyRandom.nextInt(10) + "-" + company, crunchifyRandom.nextInt(50));
        }
        crunchifyLog("~~~~~~~~~~~~~~Original HashMap (crunchifyMap value)~~~~~~~~~~~~~~");
        crunchifyLog(crunchifyMap);
        crunchifyLog("\n~~~~~~~~~~~~~~Updated HashMap after Sorting by Key~~~~~~~~~~~~~~");
        
        // Map: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
        Map<String, Integer> key = crunchifySortByKey(crunchifyMap);
        iterateThroughHashMapJava8(key);
        crunchifyLog("\n~~~~~~~~~~~~~~Updated HashMap after Sorting by Value~~~~~~~~~~~~~~");
        Map<String, Integer> value = crunchifySortByValue(crunchifyMap);
        iterateThroughHashMapJava8(value);
    }
    // Simple Log Statement
    private static void crunchifyLog(Object string) {
        System.out.println(string);
    }
 
    // How to Iterate through HashMap in Java 8?
    private static void iterateThroughHashMapJava8(Map<String, Integer> crunchifyMap) {
        crunchifyMap.forEach((k, v) -> {
            System.out.println("Key: " + k + "\t\t\t Value: " + v);
        });
    }
    // Let's sort HashMap by Key
    // Comparable: This interface imposes a total ordering on the objects of each class that implements it.
    // This ordering is referred to as the class's natural ordering, and the class's compareTo method is referred to as its natural comparison method.
    public static <K extends Comparable<? super K>, V> Map<K, V> crunchifySortByKey(Map<K, V> crunchifyMap) {
        Map<K, V> crunchifyResult = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> sequentialStream = crunchifyMap.entrySet().stream();
        // comparingByKey() returns a comparator that compares Map.Entry in natural order on key.
        sequentialStream.sorted(Map.Entry.comparingByKey()).forEachOrdered(c -> crunchifyResult.put(c.getKey(), c.getValue()));
        return crunchifyResult;
    }
    // Let's sort HashMap by Value
    public static <K, V extends Comparable<? super V>> Map<K, V> crunchifySortByValue(Map<K, V> crunchifyMap) {
        Map<K, V> crunchifyResult = new LinkedHashMap<>();
        
        // Stream: A sequence of elements supporting sequential and parallel aggregate operations.
        // The following example illustrates an aggregate operation using Stream and IntStream.
        Stream<Map.Entry<K, V>> sequentialStream = crunchifyMap.entrySet().stream();
        // comparingByValue() returns a comparator that compares Map.Entry in natural order on value.
        // sorted(): Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.
        sequentialStream.sorted(Map.Entry.comparingByValue()).forEachOrdered(c -> crunchifyResult.put(c.getKey(), c.getValue()));
        
        // getValue(): Returns the value corresponding to this entry. If the mapping has been removed from the backing map (by the iterator's remove operation), the results of this call are undefined.
        // getKey(): Returns the key corresponding to this entry.
        return crunchifyResult;
    }
}
