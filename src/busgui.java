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

public class busgui extends Application {

	public static void main( String[] args) {
	  	  
        // start(stage);
		//launch(args);	
		//account object=new transactions(cardnumberfield.getText(),"0");
		
	}
	
	public void start (Stage primarystage) throws Exception{
		primarystage.setTitle("Bus Station");
		Label selection = new Label("Select type of user");
		Button manager = new Button("Manager");
		Button driver = new Button ("Driver");
		Button passenger = new Button ("Passenger");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.add(selection, 0, 0);
		grid.add(manager, 0, 1);
		grid.add(driver, 0, 2);
		grid.add(passenger,0, 3);
		 Scene scene = new Scene(grid,600,400);
	       primarystage.setScene(scene);
	       primarystage.show(); 
		
		
		
		
	}
	
}
