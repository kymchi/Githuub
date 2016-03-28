
///Samuel Coker
//CSC 200
//003N
//2i7MAR2016
//SLC27919
//slc27919@email.vccs.edu


import javafx.application.Application;//first
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;//2
import javafx.scene.Scene;//2
import javafx.scene.control.Button;
import javafx.scene.control.Label;//3
import javafx.scene.control.PasswordField;//3
import javafx.scene.control.TextField;//3
import javafx.scene.layout.GridPane;//2
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;//3
import javafx.stage.Stage;//first






import javax.swing.JOptionPane;



public class LoginOverhaul extends Application {
         int i =0;
         int DoWhileLoop=0;

public enum MonthNumber{ADMIN,GUEST,USER}

@Override
    public void start(Stage primaryStage) {

	primaryStage.setTitle("JavaFX Welcome");
        //Sets the GridPane to grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //labels, text boxes, and buttons        
        Text scenetitle = new Text("Welcome");
        grid.add(scenetitle, 0, 0, 2,1);
        //labels and text boxes
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        //Account boxes to be activated if User and pw correct
        Label Account = new Label ("Account type");
        TextField AccountText = new TextField();
        //Access button
        Button Access = new Button("Access");
        Button signin = new Button("Sign in");
       
	//New horizontal box
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(signin);
        grid.add(hbBtn, 1, 4);
        
	//initializing a Text variable
        Text Message = new Text("");
   


	//Month copy  code


	MonthNumber[] choicesA = {
	MonthNumber.ADMIN,
	MonthNumber.USER,
	MonthNumber.GUEST};



       
        signin.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle (ActionEvent event){
                
               /* do {
                    DoWhileLoop++;
                    System.out.println("here is a do-while loop...\n"
                            + "i didnt need it " +DoWhileLoop);
                    
                }while (DoWhileLoop<1);*/
                
                         
                
                if (pwBox.getText().equals("yup")
                    && 
                    userTextField.getText().equals("kymchi") )
                {  
               		hbBtn.getChildren().remove(signin);//button
	                grid.getChildren().remove(pwBox);//pw box
        	        grid.getChildren().remove(pw); //pw Field
               		grid.getChildren().remove(userTextField);//user text
                        grid.getChildren().remove(scenetitle);//removes welcome
			userName.setText("Welcome "+userTextField.getText());//set lable to usertext
//             		Message.setText("Enter your account type");
//	                grid.add(Message,0,2);
  //       	        grid.add(AccountText,0,3);//Text field
    //     	        hbBtn.getChildren().add(Access);//button
		

		//Month Code start		
		MonthNumber input; //declaring new variable of type MonthNumber

		do{
			input = (MonthNumber) JOptionPane.showInputDialog(
			null,"please enter your account type","Month"
			,JOptionPane.INFORMATION_MESSAGE,null,choicesA, choicesA[2]);
		
			System.out.println(input);
			

			if (input ==null){
			System.exit(1);
			}

			switch (input)
			{		
			case USER: case GUEST:
			JOptionPane.showMessageDialog(null,"Please try again");
			break;
		/*	case ADMIN:
			JOptionPane.showMessageDialog(null,"Welcome !" + userTextField.getText() );
			break;*/
			

			}

		}
		while(input!= MonthNumber.ADMIN
		&& input!=null);
		//Month code stop

		} else{i++;}
              
                if (i>=3){ //Maximium login attempts exceeded
                    hbBtn.getChildren().remove(signin);//button
                    grid.getChildren().remove(pwBox);//pw box
                    grid.getChildren().remove(pw); //pw Field
                    grid.getChildren().remove(userTextField);//user text
                    grid.getChildren().remove(scenetitle);//removes welcome
                    userName.setText("Please contact your administrator"
                        + " to unlock your account!");//set lable to usertext
                }
                
            }});//end of signin Button
            
        //ACCESS BUTTON 
        Access.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle (ActionEvent event){
            System.out.println("access button pressed");
            if(AccountText.getText().equals("77")){
               hbBtn.getChildren().remove(Access);
               grid.getChildren().remove(AccountText);
               Message.setText("you have been granted access");
               
            }          
        }});//end of Access button


    

Scene scene = new Scene(grid,500, 250);
primaryStage.setScene(scene);
primaryStage.show();
}//stage
}//applicaton

