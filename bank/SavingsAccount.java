package bank;

public class SavingsAccount extends Account{
	

	public SavingsAccount(long accNo, float balance, String accName, String acType) {
		super(accNo, balance, accName, acType);
		// TODO Auto-generated constructor stub
	}
	public void calculateInterest() {
		

		float interest = balance*(1*(7*1));
		balance = balance + interest;
		System.out.println("the updated balance after interest calculation is : "+balance);
	}

}
