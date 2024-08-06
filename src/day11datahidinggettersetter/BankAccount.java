package day11datahidinggettersetter;

public class BankAccount {

	public int accNumber;
	public String IFSC;
	public String bankName;
	public String branchName;
	
	private double balance;
	private int atmpin;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAtmpin() {
		return atmpin;
	}
	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}
	
	
	
}
