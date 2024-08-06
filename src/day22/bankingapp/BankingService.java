package day22.bankingapp;

public interface BankingService {
	public double getBalance();
	public void deposit(double dAmt);
	public void withdraw(double wAmt);
	public void fundsTransfer();
}
