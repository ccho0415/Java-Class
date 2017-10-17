public class BankTest{

  public static void main(String[] args)
  {
	BankAccount myAccount;
	myAccount = new BankAccount("Joe Lion", 1234567);

	BankAccount otherAccount  =  new BankAccount("fred",1234555);


	double currentBalance;
	currentBalance = myAccount.getBalance();
	System.out.println("current balance is " + currentBalance);
	
	myAccount.deposit(10000);
	myAccount.withdraw(1000);


	

	currentBalance=myAccount.getBalance();
	System.out.println("current balance is now " +
 myAccount.getBalance());
  }

}//end class
