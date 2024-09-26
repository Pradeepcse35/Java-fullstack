package com.index;

//Class methods with an object

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a,String n,float amt) 
		{	
		acc_no=a;
		name=n;
		amount=amt;
	   }
	
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+ " is Deposited");
	}
	void withdraw(float amt)
	{
		if(amount<amt) {
			System.out.println("Insufficient Amount");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"Withdarw amount");
		}
	}

	
	void CheckBalance()
	{
		System.out.println("The blance is:"+amount);
	}
	
	void display() {
		System.out.println("The details are "+acc_no+" "+name+" "+amount);
	}
}
class TestAccount{
	public static void main(String[] args) {
	Account a1=new Account();
      a1.insert(768583,"pradeep",2000);
      a1.display();
      a1.CheckBalance();
      a1.deposit(40000);
      a1.CheckBalance();
      a1.withdraw(30000);
      a1.CheckBalance();
	 }
	
}



