import java.util.ArrayList;

public class transactions extends account {
	

	 public transactions( String currentBalance) {
		super(currentBalance);
	}
		ArrayList<String> history = new ArrayList<String>();
		int count=0;
        
	 
	 public String withdraw(String amount) {
		 double bal=Double.parseDouble(getCurrentBalance());
		 double am= Double.parseDouble(amount);
		 if(am > bal || am>3000) {
			return "ERROR!! Whithdrawl amount is more than your current balance.";
		
		 }
		 else { 
			 
			 setCurrentBalance(Double.toString(bal-am));
			// System.out.println("withdarwing done successfully.");
			 history.add("withdraw: "+ amount);
			 count++;
			 return "withdarwing " +amount+" done successfully.";
			// setTransactionNUmber(count++);
		 }
		}
	 public String deposit(String amount) {
			 double bal=Double.parseDouble(getCurrentBalance());
			 double am= Double.parseDouble(amount);
		setCurrentBalance(Double.toString(bal+am));
        history.add("deposit: "+ amount);
        //setTransactionNUmber(count++);
count++;
return "deposting " + amount+" done succesfully.";

		}
	 public String inquire() {
			System.out.println("Card Number=" + getCardNumber());
			
	        history.add("balance inquery: "+ getCurrentBalance());
	    //    setTransactionNUmber(count++);
	        count++;
	        return "Current Balance=" + getCurrentBalance();
		}
	 public String prev() {
		// if((getTransactionNUmber()-1)<0)
		 if((count-2)<0) 

		    	return("No previous transactions to show");
		    else {
			    

		   // System.out.println(history.get(getTransactionNUmber()-1).toString());
		 //setTransactionNUmber(count--);
			   count--;
			   return(history.get(count-1).toString());
		    }
		 
	 }
	 public String next() {
		// if((getTransactionNUmber()+1)>5)
			 if((count)>=history.size())

	    		return("NO more transactions to show");
	    	else {
	    	//System.out.println(history.get(getTransactionNUmber()).toString());
	    	//setTransactionNUmber(count++);
		    	
		    	count++;
		    	return(history.get(count-1).toString());

	    	}
	 }
	
	  public boolean validate() {
		 int input=Integer.parseInt(getCardNumber());
		 int valid=Integer.parseInt(getValidnumber());
			if(input != valid) {
				System.out.println("Invalid Card Number.");
				return false;
			}
			else
				return true;
		}
			
			
		}
