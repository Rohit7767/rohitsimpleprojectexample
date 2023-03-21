package com.Example.demo1;

public class PratiseProject {
	
			void m1()
			{
				System.out.println("this is my project");
			}
	
	
	
	
	static public void main(String abc[])
	{
//		int i = 78;
////		Integer integer = i;
////		
////		System.out.println("value of integer : " + integer);
//		
////		Integer integer = new Integer(i);
////		System.out.println(integer);
////			
//		
////		Integer io1 = i;
////		System.out.println(io1);
////		
////		int int2 = io1.intValue();
////		System.out.println("object to primitive data type" + int2);
////		
////	int k =int2;
////	System.out.println(k);
//	
////	String n="Rohit";
////	String sn="Choudhary";
//////	
//////	System.out.printf("name is :" + n + "sirname is" + sn);
////	
////	
//////	System.out.format(n,sn);
////	
////	System.out.format("hello my name is %s,my sirname is%s",n,sn);
//	
//	
//	Integer i1 = new Integer(i);
//	System.out.println(i1);
//	
//	int k = i1;
//	System.out.println(k);
	
		
//		boxing conversion
	int i = 90;
	
		Integer in = new Integer(i);
	System.out.println(in);
	
	
	
//	autoboxing conversion
	Integer in2 = i;
	System.err.println(in2);
	
//	unboxing-> wrapper class refrence to primitive type -> unboxing
	
	int unbox = in2.intValue();
	System.err.println("unboxing variable is" + unbox);
	
	
	
//	autounboxing: 
	int autounboxing = unbox;
	System.out.println(autounboxing);
	
	
	System.out.println("this is my githu");
	
	
	
	
	
	
	
	}

}
