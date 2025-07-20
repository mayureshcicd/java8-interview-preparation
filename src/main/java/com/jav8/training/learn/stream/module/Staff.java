package com.jav8.training.learn.stream.module;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Staff {
	private int id;
	private String name;
	private List<String> emails;
	 
}
