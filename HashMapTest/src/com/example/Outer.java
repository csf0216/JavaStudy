package com.example;

public class Outer{
    public static void main(String[] args)throws Exception{
    new Outer().hello();
    }

	private void hello()throws Exception{
	    Inner.class.newInstance().sayHi();
	}
	
	public class Inner{
	    public void sayHi(){
	        try{
	            System.exit(0);
	            System.out.println("Hello world.");
	        }finally{
	            System.out.println("Goodbye world.");
	        }
	    }
	}
}