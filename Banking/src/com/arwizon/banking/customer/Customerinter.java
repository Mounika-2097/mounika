package com.arwizon.banking.customer;

public class Customerinter implements Customerinterface 
{
	public Customer CreateCustomer(String name,String mailid,String mobileno,String accounttype)
	{
		Customer c=new Customer();
		c.setName(name);
		c.setMailid(mailid);
		c.setMobileno(mobileno);
		c.setAccounttype(accounttype);
		c.setCustomerid(Customer.getCount());
		return c;
		
	}
}
