package com.jav8.training.logical.sorting;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByCombinationOfTwoFieldsDemo {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
         items.add(new Item(1, 2, "1", "0", "emp1", LocalDateTime.parse("2017-10-04T10:47:51"), "Y"));

        items.add(new Item(1, 2, "2", "1", "emp2", LocalDateTime.parse("2019-10-04T10:47:51"), "Y"));
        items.add(new Item(2, 2, "2", "1", "emp3", LocalDateTime.parse("2018-10-04T10:47:51"), "N"));

        items.add(new Item(1, 2, "3", "2", "emp4", LocalDateTime.parse("2019-10-04T10:47:51"), "Y"));
        items.add(new Item(2, 2, "3", "1", "emp5", LocalDateTime.parse("2021-10-04T10:47:51"), "Y"));

         items.add(new Item(3, 2, "3", "3", "emp6", LocalDateTime.parse("2031-10-04T10:47:51"), "Y"));
        items.add(new Item(2, 2, "3", "3", "emp7", LocalDateTime.parse("2041-10-04T10:47:51"), "Y"));
        items.add(new Item(null, 2, "3", "3", "emp7", LocalDateTime.parse("2041-10-04T10:47:51"), "Y"));
        items.add(new Item(1, 2, "3", "3", "emp8", LocalDateTime.parse("2001-10-04T10:47:51"), "N"));

        List<String> typeOfHistoryAttributes = null;

        Comparator<Item> compareByName = Comparator
                .comparing(Item::getHistCounter,Comparator.nullsFirst(Comparator.naturalOrder()))
                .thenComparing(Item::getEnteredDate);

        Comparator<Item> compareByName1 =Comparator.comparing((Item b) -> b.getHistCounter()==null?0:b.getHistCounter()).thenComparing((Item b) -> b.getEnteredDate() );
       /* Comparator
                .comparing(l->l.getHistCounter().getTeacher().getAge(), Comparator.reverseOrder())
                .thenComparing(l->l.getEnteredDate().getStudentSize());*/
        List<String> childrenHistoryAttributes = null;
        Map<List<String>, List<Item>> collect = items.stream()
                //.sorted(Comparator.comparing(Item::getEnteredDate))
                .sorted(compareByName)
                .collect(
                        Collectors.groupingBy(dto -> List.of(dto.getRelCode(), dto.getRelCounter())));

        collect.forEach((key, value) -> {

            value.stream().
                    filter(p -> p.getNok().equals("N")).findAny().ifPresentOrElse(
                            (actualValue) -> {
                                compareByConditon(value, typeOfHistoryAttributes);
                            },
                            ()-> {
                                compareByConditon(value, childrenHistoryAttributes);

                            });


        });
        // collect.forEach((key, value) -> System.out.println(key + value.toString()));
    }

    public static void compareByConditon(List<Item> items, List<String> attributes) {
        for (Item i : items)
        {
            System.out.println(" " +i);
        }
    System.out.println("-----------------------------------------------------------------------");
    }
}
