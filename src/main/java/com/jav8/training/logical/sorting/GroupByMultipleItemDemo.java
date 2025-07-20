package com.jav8.training.logical.sorting;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByMultipleItemDemo {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, 2, "1", "0","emp1", LocalDateTime.parse("2017-10-04T10:47:51")));

        items.add(new Item(1, 2, "2", "1","emp2", LocalDateTime.parse("2019-10-04T10:47:51")));
        items.add(new Item(1, 2, "2", "1","emp3", LocalDateTime.parse("2018-10-04T10:47:51")));

        items.add(new Item(1, 2, "3", "2","emp4", LocalDateTime.parse("2019-10-04T10:47:51")));
        items.add(new Item(1, 2, "3", "1","emp5", LocalDateTime.parse("2021-10-04T10:47:51")));

        items.add(new Item(1, 2, "3", "3","emp6", LocalDateTime.parse("2031-10-04T10:47:51")));
        items.add(new Item(1, 2, "3", "3","emp7", LocalDateTime.parse("2041-10-04T10:47:51")));
        items.add(new Item(1, 2, "3", "3","emp8", LocalDateTime.parse("2001-10-04T10:47:51")));

        Map<String, Map<String, List<Item>>> multipleFieldsMapList = items.stream()
                .sorted(Comparator.comparing(Item::getEnteredDate))
                .collect(
                        Collectors.groupingBy(Item::getRelCode,
                                Collectors.groupingBy(Item::getRelCounter)));

        multipleFieldsMapList.forEach((key, value) -> System.out.println(key + value.toString()));

    }


}
