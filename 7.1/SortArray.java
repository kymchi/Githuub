
import java.util.Arrays;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


    public class SortArray extends Application{
 
         @Override
 
        public void start(Stage primaryStage){
               double[] number= {2,45,55,97,88};

            primaryStage.setTitle("I will Sort the numbers!");
            GridPane grid=new GridPane();
            grid.setAlignment(Pos.CENTER);
            Label LBL1 = new Label("first number");
            Label LBL2= new Label("second number");
            Label LBL3= new Label("third number");
            Label LBL4= new Label("fourth number");
            Label LBL5= new Label("fifth number");
            Label LBL6= new Label();
           
            grid.add(LBL6, 1, 3);
           grid.setColumnSpan(LBL6,3);
            grid.add(LBL1, 1, 1);
            grid.add(LBL2, 2, 1);
            grid.add(LBL3, 3, 1);
            grid.add(LBL4, 4, 1);
            grid.add(LBL5, 5, 1);
            
//            HBox hbBtn = new HBox(100);
//            hbBtn.getChildren().add(LBL6);
//            grid.add(hbBtn, 1, 5);
            
            TextField TXT1 = new TextField(""+number[0]);
            TextField TXT2= new TextField(""+number[1]);
            TextField TXT3= new TextField(""+number[2]);
            TextField TXT4= new TextField(""+number[3]);
            TextField TXT5= new TextField(""+number[4]);
          
            grid.add(TXT1, 1, 2);
            grid.add(TXT2, 2, 2);
            grid.add(TXT3, 3, 2);
            grid.add(TXT4, 4, 2);
            grid.add(TXT5, 5, 2);
            
            
            //Defining the Submit button
            Button submit = new Button("SORT THESE");
            grid.add(submit,5,3);
            
            Scene scene =new Scene(grid,500,250);
            primaryStage.setScene(scene);
            primaryStage.show();
           
              
        submit.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle (ActionEvent event){
            System.out.println("SORT button pressed");
            System.out.println(TXT5.getText());
            number[0]=Double.parseDouble(TXT1.getText());
            number[1]=Double.parseDouble(TXT2.getText());
            number[2]=Double.parseDouble(TXT3.getText());
            number[3]=Double.parseDouble(TXT4.getText());
            number[4]=Double.parseDouble(TXT5.getText());
            double temp=number[0];
         for(int i =0; i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if (number[j]<number[i]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
                
            }
            
        }
//          for (int i=0;i<number.length;i++){
//            System.out.print(number[i]+" ");
//           
//        }
         
        LBL6.setText(""+Arrays.toString(number));
        }});//end of Access button
        
        
    
//        System.out.println(TXT5);
       
        
      
        
        
    }


     public static void main(String[] args) {
        launch(args);
    }
    
    }
    

