package bank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount p1 = new SavingsAccount(1111 , 10 , "jack", "SA");
		p1.depositMoney(1000);
		p1.withdrawMoney(500);
		p1.getBalance();
		CheckingAccount p2 = new CheckingAccount(2222 , 100000 , "sparrow", "CA");
		p2.depositMoney(50000);
		p2.withdrawMoney(60000);
	    p2.getBalance();
		p1.calculateInterest();

	}

}
