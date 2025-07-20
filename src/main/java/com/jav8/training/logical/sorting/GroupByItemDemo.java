package com.jav8.training.logical.sorting;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByItemDemo {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, 2, "1", "0","emp1", LocalDateTime.parse("2017-10-04T10:47:51")));

        items.add(new Item(1, 2, "2", "1","emp2", LocalDateTime.parse("2019-10-04T10:47:51")));
        items.add(new Item(1, 2, "2", "1","emp3", LocalDateTime.parse("2018-10-04T10:47:51")));

        items.add(new Item(1, 2, "3", "2","emp4", LocalDateTime.parse("2019-10-04T10:47:51")));
        items.add(new Item(1, 2, "3", "1","emp5", LocalDateTime.parse("2021-10-04T10:47:51")));
        items.add(new Item(1, 2, "3", "3","emp6", LocalDateTime.parse("2001-10-04T10:47:51")));

        Map<String, List<Item>> map = items.stream()
                .sorted(Comparator.comparing(Item::getEnteredDate))
                .collect(Collectors.groupingBy(Item::getRelCode));

        for (Map.Entry<String, List<Item>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }


        map = items.stream()
                .sorted(Comparator.comparing(Item::getEnteredDate).reversed())
                .collect(Collectors.groupingBy(Item::getRelCode));
        System.out.println("-------------------------------\n\n");

        for (Map.Entry<String, List<Item>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

    }
}
