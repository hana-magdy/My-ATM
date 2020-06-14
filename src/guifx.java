import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;





public class guifx extends Application{

	public static void main( String[] args) {
  	  

		launch(args);	
		//account object=new transactions(cardnumberfield.getText(),"0");
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
       primaryStage.setTitle("ATM");	
       Label cardnumber =new Label("Enter your card number: ");
       TextField cardnumberfield = new TextField ();
       Button ok = new Button("OK");
       GridPane grid=new GridPane();
	   grid.setAlignment(Pos.CENTER);
       grid.add(cardnumber, 0, 0);
       grid.add(cardnumberfield, 1,0);
       grid.add(ok, 1, 1);
       
       account object=new transactions("0");

       ok.setOnAction(new EventHandler(){
    	 // account object=new transactions(cardnumberfield.getText(),"0");
		@Override
		public void handle(Event event) {
			object.setCardNumber(cardnumberfield.getText());
		boolean t=object.validate();
		if(t==false) {
			Stage popupwindow=new Stage();
			popupwindow.setTitle("ERROR!!");
			//Button tryagain= new Button("Try Again");
			VBox layout= new VBox(10);
			//layout.getChildren().addAll(invalid);
			layout.setAlignment(Pos.CENTER);
			Scene inv= new Scene(layout, 300, 250);
			popupwindow.setScene(inv);
		    popupwindow.show();

		}
		if(t==true) {
			Stage menu=new Stage();
			menu.setTitle("Main Menu");
			Label choose= new Label("Choose an opertion");
			Button withdraw = new Button("Withdraw");
			Button deposit = new Button("Deposit");
			Button inqury = new Button("Balance Inqury");
			Button previous= new Button("previous");
			Button next = new Button("next");
			GridPane menugrid=new GridPane();
			menugrid.setAlignment(Pos.CENTER);
			menugrid.add(choose,0, 0);
			menugrid.add(withdraw, 0, 1);
			menugrid.add(deposit, 0, 2);
			menugrid.add(inqury,0, 3);
			menugrid.add(previous,0,4);
			menugrid.add(next,0, 5);
			Scene mainmenu= new Scene(menugrid, 300, 250);
			menu.setScene(mainmenu);
		    menu.show();
		    withdraw.setOnAction(new EventHandler(){
		    	@Override
				public void handle(Event event) {
		    		Stage withdraw = new Stage();
		    		withdraw.setTitle("withdraw");
		    		Label amwithdraw = new Label("Enter withdrwal amount:");
		    		TextField amwith = new TextField();
		    		Button withdrawing= new Button("withdraw");
		    		GridPane withdrawgrid=new GridPane();
		    		withdrawgrid.setAlignment(Pos.CENTER);
		    	    withdrawgrid.add(amwithdraw,1,0);
		    	    withdrawgrid.add(amwith,1,1);
		    	    withdrawgrid.add(withdrawing,1,2);
		    	    Scene withdrawingg= new Scene(withdrawgrid,400,300);
		    	    withdraw.setScene(withdrawingg);
		    	    withdraw.show();
		    		withdrawing.setOnAction(new EventHandler() {
			    		public void handle(Event event) {
			    		Label message= new Label(	object.withdraw(amwith.getText()));
			    		 withdrawgrid.add(message,1,3);
			    		 withdraw.show();
			    		}
			    	});
		    	    }
		    });
		    deposit.setOnAction(new EventHandler() {
				@Override
				public void handle(Event event) {
					Stage deposit = new Stage();
					deposit.setTitle("deposit");
					Label amdeposit = new Label("Enter depositing amount:");
					TextField amdep = new TextField();
					Button depositing= new Button ("deposit");
					GridPane depositgrid= new GridPane();
					depositgrid.setAlignment(Pos.CENTER);
					depositgrid.add(amdeposit,1,0);
					depositgrid.add(amdep,1,1);
					depositgrid.add(depositing, 1,2);
					Scene dipositingg = new Scene(depositgrid,400,300);
					deposit.setScene(dipositingg);
					deposit.show();
					depositing.setOnAction(new EventHandler() {
						@Override
						public void handle(Event event) {
							Label message = new Label(object.deposit(amdep.getText()));
							depositgrid.add(message,1,3);
							deposit.show();
						}
						
					});
					
					
				

				}
		    	
		    });
		    inqury.setOnAction(new EventHandler(){

				@Override
				public void handle(Event event) {
					Stage inquire= new Stage();
					inquire.setTitle("balance inqury");
					Label shownumber = new Label("Your card number= "+ object.getCardNumber() );
					Label showbalance = new Label(object.inquire());
					GridPane inquiregrid= new GridPane();
					inquiregrid.setAlignment(Pos.CENTER);
					inquiregrid.add(shownumber, 0, 1);
					inquiregrid.add(showbalance,0, 2);
					Scene inquiring= new Scene(inquiregrid,400,300);
					inquire.setScene(inquiring);
					inquire.show();
					
					
				}
		    	
		    });
		    previous.setOnAction(new EventHandler(){

				@Override
				public void handle(Event event) {
					Stage previous= new Stage();
					previous.setTitle("previous");
					Label previnfo = new Label(object.prev());
					GridPane prevgrid= new GridPane();
					prevgrid.setAlignment(Pos.CENTER);
					prevgrid.add(previnfo,1,1);
					Scene previoustransaction = new Scene(prevgrid,400,300);
					previous.setScene(previoustransaction);
					previous.show();
					
					
				}
		    	
		    } );
		    next.setOnAction(new EventHandler() {

				@Override
				public void handle(Event event) {
					Stage next= new Stage();
				    next.setTitle("Next");
				    Label nextinfo=new Label(object.next());
				    GridPane nextgrid= new GridPane();
				    nextgrid.setAlignment(Pos.CENTER);
				    nextgrid.add(nextinfo,1, 1);
				    Scene nexttransaction=new Scene(nextgrid,400,300);
				    next.setScene(nexttransaction);
				    next.show();
				    
				    
					
				}
		    	
		    });
		    
		    }
		 
		    

			

			
			
			
		}
		
			
		
		
    	   
       });
       Scene scene = new Scene(grid,600,400);
       primaryStage.setScene(scene);
       primaryStage.show(); 
	}

}
