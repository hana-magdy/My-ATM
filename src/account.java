abstract class account{
	public account(String currentBalance) {
		this.currentBalance=currentBalance;
	}
	private String cardNumber;
	private String currentBalance;
	private String validnumber="1234";
	public String getValidnumber() {
		return validnumber;
	}
	public void setValidnumber(String validnumber) {
		this.validnumber = validnumber;
	}
	private int transactionNUmber=0;
	
	
	public int getTransactionNUmber() {
		return transactionNUmber;
	}
	public void setTransactionNUmber(int transactionNUmber) {
		this.transactionNUmber = transactionNUmber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}
	abstract String withdraw(String amount);
	abstract String deposit(String amount);
	abstract String inquire();
	abstract String prev();
	abstract String next();
	abstract boolean validate();
	
	
	
	
}


