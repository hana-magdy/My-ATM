public interface ATM { 
	public String getCurrentBalance();
	public void withdraw(String amount);
	public void deposit(String amount);
	public void prev();
	public void next();
	abstract boolean validate();

	
	
}