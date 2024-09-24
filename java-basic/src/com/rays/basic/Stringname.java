package com.rays.basic;

public class Stringname {
	public static void main(String[] args){
		String  name= "shivkant";
		int value=name.length();
		System.out.println(value);
		
		String toupper=name.toUpperCase();
		System.out.println(toupper);
		
		String tolower=name.toLowerCase();
		System.out.println(tolower);
		
		String trim=name.trim();
		System.out.println(trim);
		
		String substring=name.substring(4);
		System.out.println(substring);
		
		String startend=name.substring(1,4);
		System.out.println(startend);
		
		
		String replace =name.replace('s','c');
		System.out.println(replace);
		
		
		System.out.println(name.replace("shiv", "chou"));
		
		 boolean startswith=name.startsWith("shiv");
		System.out.println(startswith);
		
		System.out.println(name.startsWith("chou"));
		
		boolean endwith=name.endsWith("kant");
		System.out.println(endwith);
		
		//String  substring=name.substring(5);
		//System.out.println(substring);
		
		System.out.println(name.substring(4));
		
		//String lastindexof=name.lastIndexOf('v');
		//System.out.println(lastindexof);
		
		
		//String indexof=name.indexOf("kant");
		
		System.out.println(name.indexOf('v'));
		
		
		System.out.println(name.indexOf("kant"));
		
		System.out.println(name.lastIndexOf('v'));
		
		
		boolean equal=name.contentEquals("shivkant");
		System.out.println(equal);
		
	System.out.println(name.contentEquals("shivkant"));
		
System.out.println(name.equalsIgnoreCase("shivKAnt"));
		
	
		
	}

}