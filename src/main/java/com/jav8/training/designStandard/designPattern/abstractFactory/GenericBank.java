package com.jav8.training.designStandard.designPattern.abstractFactory;
/*
 * Developed by Mayuresh Ratnaparkhi 01-June-2017
 * */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public  class GenericBank {
	 
	protected Class<?> t=null;
	protected Class<?> loadInstance() {
		Type[] type = this.getClass().getGenericInterfaces();
		ParameterizedType p = (ParameterizedType)type[0];		
        try {							 
			 	t= Class.forName(p.getActualTypeArguments()[0].getTypeName());
		} catch (ClassNotFoundException e) {				 
			e.printStackTrace();
		}
		return t;
	}
	@SuppressWarnings("unchecked")
	protected <T> T getChild()
	{		 
		T o = null; // lazy loading with Thread Safe  Design pattern with Generic
		try {
			if (o==null)
			{ 
				synchronized (this) {
					o=  (T) t.newInstance() ;
				}
			}
			 
		} catch (Exception e) {}
		return o;
	}	
}
