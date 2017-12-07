package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcct acc1 = new BankAcct("3221453241", 1000);
		BankAcct acc2 = new BankAcct("9621234533", 1200);
		BankAcct acc3 = new BankAcct("1221453462", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.payBill(1000);
		acc1.annInterest();
		System.out.println(acc1.toString());
	}
}

class BankAcct implements IInterest {
	
	private String acctNumber;  //id + random 2-digit number + first 2 ssn
	private static final String routingNumber = "000000251";
	private String ssn;
	private String name;
	private static int iD = 1000;  //Internal ID
	private double balance;
	
	public BankAcct(String ssn, double initDeposit) {
		System.out.println("New Acct Created");
		this.ssn = ssn;
		this.balance = initDeposit;
		System.out.println("Acct Balance " + this.balance);
		iD++;
		setAcctNumber();
		
	}
	
	private void setAcctNumber() {
		int random = (int) (Math.random() * 100);
		//System.out.println(iD + ", " + random);
		acctNumber = iD + "" + random + "" + ssn.substring(0, 2);
		System.out.println(acctNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your account Balance is: " + balance);
	}
	
	public void annInterest() {
		balance = balance * (1 + (rate/100));
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + acctNumber + "]\n[Routing number: " + routingNumber + "]\n[Balance: " + balance + "]";
		
	}
}
