package com.jav8.training.learn.mapFlatMapDifference;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDifferenceDemo {
    public static void main(String[] args) {


        List<List<Integer>> numberList = List.of(List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9, 10)) ;



        System.out.println(numberList.stream().flatMap(no -> no.stream())
                .collect(Collectors.toList())
               .stream().map(no -> no * 2)
               .collect(Collectors.toList()));
        ;

      /*  List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numberList.stream().map(no -> no * 2)
                .collect(Collectors.toList())
                .stream().forEach(no -> System.out.println(no));

System.out.println("\n------------------------------\n");
        numberList.stream().flatMap(no -> Stream.of(no*2) )
                .collect(Collectors.toList())
                .stream().forEach(no -> System.out.println(no));


        System.out.println("\n------------------------------\n");
*/
        List<Developer> developerList=List.of(new Developer(1,"dev1",List.of("add1","add2")),
                new Developer(2,"dev2",List.of("add1","add2")),
                new Developer(3,"dev3",List.of("add1","add2")),
                new Developer(4,"dev4",List.of("add1","add2")),
                new Developer(5,"dev5",List.of("add1","add2"))
                );


        developerList.stream().map(dev ->
                        dev.getAddress()
                )
                .collect(Collectors.toList())
                .forEach(no -> System.out.println(no));

        System.out.println("\n------------------------------\n");
        developerList.stream().flatMap(dev ->
                   dev.getAddress().stream()
               )
                .collect(Collectors.toList())
                .forEach(no -> System.out.println(no));
     /*   developerList.stream().map(dev->
                        {
                            dev.setName(dev.getName().toUpperCase());
                        return dev;
                        })
                .collect(Collectors.toList())
                .forEach(no -> System.out.println(no));;

        System.out.println("\n------------------------------\n");
        developerList.stream().flatMap(dev->
                {
                    dev.setName(dev.getName().toUpperCase());
                    return Stream.of(dev);
                })
                .collect(Collectors.toList())
                .forEach(no -> System.out.println(no));
*/
    }


}
