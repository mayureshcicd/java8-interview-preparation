package com.jav8.training.learn.stream.module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidate {
	private int id;
	private String fname;
	private String lname;
	private String fullName;
	public Candidate(int id, String fname, String lname) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
 
	 
}
