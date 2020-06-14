import java.util.ArrayList;
import java.util.Scanner;

public class testAtm {
	static Scanner s=new Scanner(System.in);

			public static void main(String[] args) {
				System.out.println("Enter your card number");
				account user =new transactions("0");
				user.setCardNumber(s.next());
			   boolean test= user.validate();
			   if(test== true) {
			    while(1==1) {
			    System.out.println("Choose an operation:");
			    System.out.println("1.Withdraw");
			    System.out.println("2.Deposit");
			    System.out.println("3.Balance Inqury");
			    System.out.println("4.previous");
			    System.out.println("5.next");
			    System.out.println("choose '0' to exit");
			    int n=s.nextInt();
			    if(n==0)
			    	break;
			
			    switch(n) {
			    case 1: 			 
			    	String amount=s.next();
			    	System.out.println(user.withdraw(amount));
			    	
			    break;
			    case 2:
			    	String amou=s.next();
			    	System.out.println(user.deposit(amou));
			    break;
			    case 3:
			    	System.out.println( user.inquire());
			    break;
			    case 4: System.out.println(user.prev()); 
			    break;
			    case 5: System.out.println(user.next());
			    	break;
			    
			    default:System.out.println("ERROR! choose numbers from 1 to 5");break;}
			    System.out.println("*******************");
			   
               
                	
                }


			   }
			}

		}


