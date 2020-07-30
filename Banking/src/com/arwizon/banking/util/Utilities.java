package com.arwizon.banking.util;

public class Utilities {
		public static  void example(String name)throws MyException
	{
		if(!name.matches("[A-Za-z]+"))
			throw new MyException("names should be given properly");
	}
		public static void example1(String mailid)throws MyException
		{
		if(!mailid.matches("[a-zA-Z0-9]{3,}(@){1}[A-Za-z]{3,}(.com|.co.in)")) 
			throw new MyException("mailid  should be given correctly");
		
	}
		public static void example2(String mobileno)throws MyException
		{
		if(!mobileno.matches("[7-9]{1}[0-9]{9}"))
			throw new MyException("mobileno  should be given correctly");
		
		}
		public static void example3(String accounttype)throws MyException
		{
		if(!accounttype.matches("[A-Za-z]+"))
			throw new MyException("accounttype  should be given correctly");
		
		}
}

