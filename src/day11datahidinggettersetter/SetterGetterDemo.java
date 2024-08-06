package day11datahidinggettersetter;

public class SetterGetterDemo {

	public static void main(String[] args) {
		BankAccount account=new BankAccount();
				account.accNumber=123456;
				account.bankName="HDFC";
				account.branchName="Baner";
				account.IFSC="HDFC1230000";
				
				account.setBalance(1000);
				account.setAtmpin(1234);
				
				System.out.println("Account Number  : "+account.accNumber);
				System.out.println("Bank Name  : "+account.bankName);
				System.out.println("Branch Name  : "+account.branchName);
				System.out.println("IFSC Number  : "+account.IFSC);
				System.out.println("Account Balance  : "+account.getBalance());
				System.out.println("ATM PIN  : "+account.getAtmpin());
	}

}
