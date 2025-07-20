package com.jav8.training.interview.findHighestSalary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Builder
public class Employee {
    private int id;
    private String name;
    private Double salary;
}
