package com.arwizon.banking.customer;
//import java.awt.List;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

//import java.util.Scanner;
import com.arwizon.banking.util.MyException;
import com.arwizon.banking.util.Utilities;

public class Details 
{
	public static void main(String[] args)
	{
		System.out.println("press 1 to add new address"+"\n press 2 to display"+"\n press 3 to search"+"\n press 4 to exit");
	Customer[] arr=new Customer[1];
		//java.util.List l=new ArrayList();
		
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("please enter your option");
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			String name=null;
			while(true)
			{
				System.out.println("enter the name");
				name=sc.next();
				try
				{
				  Utilities.example(name);
				  break;
				}catch(MyException e)
				{
					System.out.println(e.getMessage());
				}
			}
				String mailid=null;
				while(true)
				{
					
					//String name=sc.next();
					//System.out.println("enter name");
					//name=sc.next();
					System.out.println("enter the mailid");
					mailid=sc.next();
					try
					{
					  Utilities.example1(mailid);
					  break;
					}catch(MyException e)
					{
						System.out.println(e.getMessage());
					}
				}
				String mobileno=null;
				
			while(true)
				{
					System.out.println("enter the mobileno");
					mobileno=sc.next();
					  try {
						Utilities.example2(mobileno);
						break;
					} 
					  catch (MyException e) 
					  {
		
						System.out.println(e.getMessage());
					  }
				}
			String accounttype=null;
			while(true)
			{
				System.out.println("enter the accounttype");
				accounttype=sc.next();
				  try {
					Utilities.example3(accounttype);
					break;
				} 
				  catch (MyException e) 
				  {
	
					System.out.println(e.getMessage());
				  }
			}
		case 2:
			for(Customer cs:arr)
			{
				if(cs!=null)
				{
					System.out.println(cs);
					break;
				}
				
				
			}
			break;
		case 3:
			if(arr[0]!=null)
			{
				System.out.println("enter name to get");
				String names=sc.next();
				boolean flag=false;
			for(int i=0;i<arr.length;i++)
			{
				if(names.equals(arr[i].getName()))
				{
					System.out.println(arr[i]+"details found");
					flag=true;
				}
			}
		if(flag==false)
		{
			System.out.println("no details get");
		}
			
			}
			break;
		case 4:
			System.exit(1);
			break;
			
		default:
				System.out.println("choose option ");
}
}
}
}
	
	


	
			
			
						
	
			


