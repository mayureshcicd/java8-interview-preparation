package com.jav8.training.learn.stream.functionutility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Input {

	private  String firstName;
	private  String middleName;
	private String lastName;
}
