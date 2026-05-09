package Encapsulation_practice;
class BankAccount{
	private double balance;//1000
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Deposited: "+amount);
		}else {
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amount) {
		if(amount<= balance) {
			balance = balance - amount;//2000-1000=1000
			System.out.println("Withdrawan amount "+amount);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	public double getBalance() {
		return balance;//retrieve current balance
	}
}
public class Bankdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount();
		acc.deposit(1000);
		acc.withdraw(2000);;
		System.out.println("Balance = "+ acc.getBalance());
		Student st = new Student();
		System.out.println(st.rollno);

	}

}
