package com.jav8.training.logical.tricky.obj;
class Based {
    public Based() {
        System.out.print("Base ");
    }

    public Based(String s) {
        System.out.print("Base: " + s);
    }
}

class Derived extends Based {
    public Derived(String s) {
        //super(); // Stmt-1
        super(s); // Stmt-2
        System.out.print("Derived ");
    }
}
public class Tester {
	 public static void main(String[] args) {
	        Based base = new Derived("Hello ");
	    }
}
