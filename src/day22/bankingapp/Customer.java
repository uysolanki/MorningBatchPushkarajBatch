package day22.bankingapp;

public class Customer 
{
	private String username;
	private String password;
	
	public Customer() {}
	
	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + "]";
	}
	
	
	public boolean login(String un,String pw)
	{
		if(this.username.equalsIgnoreCase(un) && this.password.equals(pw))
		return true;
		else
		return false;
	}
}
