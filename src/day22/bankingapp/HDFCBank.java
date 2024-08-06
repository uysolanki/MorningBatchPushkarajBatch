package day22.bankingapp;

import java.util.Scanner;

public class HDFCBank implements BankingService
{
    
	private double balance;
	public HDFCBank()
	{
		this.balance=5000;
	}
	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double dAmt) {
		this.balance=this.balance+dAmt;
		System.out.println("Deposit Successful");
		
	}

	@Override
	public void withdraw(double wAmt) {
		this.balance=this.balance-wAmt;
		System.out.println("Withdrawl Successful");
	}

	@Override
	public void fundsTransfer() {
		Scanner sc=new Scanner(System.in);
		RandomNumberGenerator otpGenerator=new RandomNumberGenerator();
		int otp=otpGenerator.getSixDigitOTP();
		System.out.println("SMS :"+otp);
		
		System.out.println("Enter OTP");
		int userOtp=sc.nextInt();
		if(userOtp==otp)
		{
			System.out.println("Enter Amount to Transfer");
			double tAmt=sc.nextDouble();
			this.balance=this.balance-tAmt;
			System.out.println("Transfer Successful");
		}
		else
		{
			System.out.println("Invalid OTP");
		}
		
	}

	

}
