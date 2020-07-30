package com.arwizon.banking.customer;

public class Customer {

	private static int count=101;
	private int customerid;
	private String name;
	private String mailid;
	private String mobileno;
	private String accounttype;
	public Customer()
	{
		count++;
	}
	public static  int getCount() {
			return count;
		}
		public int getCustomerid() {
			return customerid;
		}
		public void setCustomerid(int customerid)
		{
			this.customerid=customerid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMailid() {
			return mailid;
		}
		public void setMailid(String mailid) {
			this.mailid = mailid;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		public String getAccounttype() {
			return accounttype;
		}
		public void setAccounttype(String accounttype) {
			this.accounttype = accounttype;
		}
		@Override
		public String toString() {
			return "Customer [  customerid=" + customerid + ", name=" + name + ", mailid=" + mailid
					+ ", mobileno=" + mobileno + ", accounttype=" + accounttype + "]";
		}

}

