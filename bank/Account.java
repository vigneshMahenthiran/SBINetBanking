package bank;
//this file maintains account details of user 
//this includes account balance also and will be updated automatically once balance changes
public class Account {
	long accNo;
	float balance;
	String accName;
	String acType;
	public Account(long accNo, float balance, String accName , String acType) {
		this.accNo= accNo;
		this.balance= balance;
		this.accName = accName;
		this.acType = acType;
	}
	
	public void depositMoney(float amount) {
		balance = balance + amount;
		System.out.println("the updated balance after deposit is : "+balance);
	}
	
	public void withdrawMoney(float amount) {
		balance = balance - amount;
		float excess = 0;
		float charge = 0;
		if(acType == "CA") {
			if(amount > 50000) {
				excess = amount  - 50000;
				excess = excess / 10000;
				if(excess > 1) {
					charge = excess * 5;
					System.out.println("the charge for this transaction is : "+charge);					
				}
				else {
					charge = 5;
					System.out.println("the charge for this transaction is : "+charge);	
				}
				
			}
			
		}
		balance = balance - charge;
		System.out.println("the updated balance after withdrawl is : "+balance);
	}
	public void getBalance() {
		System.out.println("the balance in account no  : " +accNo);
		System.out.println(balance);
	}

}
