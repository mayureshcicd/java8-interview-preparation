package com.jav8.training.interview.LRUCache;

public class LRUExample {
    /*
    * Question 4: How do you implement an LRU (Least Recently Used) cache in Java?
        Answer:
        Using LinkedHashMap with access-order.
    * */
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.get(1); // Access 1 to make it recently used
        cache.put(4, "D"); // Evicts key 2 (least recently used)

        System.out.println(cache); // Output: {3=C, 1=A, 4=D}
    }
}
