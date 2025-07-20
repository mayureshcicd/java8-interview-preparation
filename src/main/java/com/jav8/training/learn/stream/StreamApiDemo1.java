package com.jav8.training.learn.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamApiDemo1 {

	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("Swami","om","ganesh");
		 
		lst.stream().filter(s->s.startsWith("s")).forEach(s->System.out.println(s));
		Map<String, String> map  = new HashMap<String, String>() {{
		    put("key1", "value1");
		    put("key2", "value2");
		    put("key3", "value3");
		    put("key4", "value4");
		    put("key5", "value5");
		    put("key6", "value6");
		    put("key7", "value7");
		    put("key8", "value8");
		    put("key9", "value9");
		    put("key10", "value10");		    
		}};
		map.entrySet().stream().filter(s->s.getKey().endsWith("10")).forEach(s->System.out.println(s));
	}

}
