package com.jav8.training.designStandard.genericFactory;


public class AbstractUtilDemo   {
  

  public static void main(String[] args) {
      try{

          AbstractUtil pot = new Pot();

          Class clazz = pot.getNextElement();
          while(clazz != null) {
              System.out.println(clazz.getName());
              AbstractUtil next = (AbstractUtil) clazz.newInstance();
              clazz = next.getNextElement();
              System.out.println(next.getUse("hello"));
          }
      } catch(Exception e) {e.printStackTrace();}
  }
}
