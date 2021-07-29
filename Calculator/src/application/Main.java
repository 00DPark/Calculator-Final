package application;
	
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

//this gets the functionality of Java FX
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Main extends Application 
{
	//declares button control elements
	static TextField text;
	static Button btnDivision;
	static Button btnMultiply;
	static Button btnAddition;
	static Button btnSubtract;
	static Button btnExp;
	static Button btnSqrt;
	static Button btnClear;
	static Button btnLog;
	static Button btnSine;
	static Button btnCosine;
	static Button btnTangent;
	static Button btnMC;
	static Button btnMS;
	static Button btnMR;
	static Button btnMPlus;
	static Label lblText;
   @Override
   public void start(Stage stage) 
   {
	   
	   //declare and intialize function buttons
	   text= new TextField();
	   text.setPrefSize(100, 50);
	   text.setStyle("\"-fx-border-color: #001; -fx-padding: 5px;\"");
	   
	   
	   //creates buttons and sets sizes
	   btnDivision= new Button("/");
	   btnDivision.setPrefSize(100, 50);
	   
	   btnMultiply= new Button("*");
	   btnMultiply.setPrefSize(100, 50);
	   
	   btnAddition= new Button("+");
	   btnAddition.setPrefSize(100, 50);
	   
	   btnSubtract= new Button("-");
	   btnSubtract.setPrefSize(100, 50);
	   
	   btnClear= new Button("Clear");
	   btnClear.setPrefSize(100, 50);
	   
	   btnExp= new Button("^");
	   btnExp.setPrefSize(100, 50);
	   
	   btnSqrt= new Button("Sqrt()");
	   btnSqrt.setPrefSize(100, 50);
	   
	   btnLog= new Button("Log()");
	   btnLog.setPrefSize(100, 50);
	   
	   btnSine= new Button("Sin()");
	   btnSine.setPrefSize(100, 50);
	   
	   btnCosine= new Button("Cos()");
	   btnCosine.setPrefSize(100, 50);
	   
	   btnTangent= new Button("Tan()");
	   btnTangent.setPrefSize(100, 50);
	   
	   btnMC= new Button("MC");
	   btnMC.setPrefSize(100, 50);
	   
	   btnMR= new Button("MR");
	   btnMR.setPrefSize(100, 50);
	   
	   btnMS= new Button("MS");
	   btnMS.setPrefSize(100, 50);
	   
	   btnMPlus= new Button("M+");
	   btnMPlus.setPrefSize(100, 50);
	   
	   //creates label used to display results and sets style
	   lblText= new Label("Result:");
	   lblText.setPrefSize(200, 50);
	   lblText.setAlignment(Pos.BOTTOM_CENTER);
	   lblText.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
	   
	  
	   
      //Setting the stage
	 //creates a grid that will hold all of the labels and buttons
     GridPane root= new GridPane();
     root.setAlignment(Pos.TOP_CENTER);
     
     //spacing between buttons, textboxes, and labels
     root.setHgap(5);
     root.setVgap(5);
     
     //adds all of the buttons, text boxes, and labels according to positions on the grid (x,y)
     root.add(btnSqrt, 0, 0);
     root.add(btnLog, 1, 0);
     
     root.add(btnSine, 0, 1);
     root.add(btnCosine, 1, 1);
     
     root.add(btnTangent, 0, 2);
     root.add(btnMC, 1, 2);
     
     root.add(btnMR, 0, 3);
     root.add(btnMS, 1, 3);
     
     root.add(btnMPlus, 0, 4);
     root.add(btnClear,1, 4);
     
     root.add(btnAddition, 0, 5);
     root.add(btnSubtract, 1, 5);
     
     root.add(btnMultiply, 0, 6);
     root.add(btnDivision, 1, 6);
     
     root.add(text, 0,7,6,5);
     root.add(lblText,0, 15, 14, 13);
     
     //attaches the code for the buttons
     onClickEventActions();
     
     //creates gui window
     Scene scene= new Scene(root, 400, 600);
     
     //window title
     stage.setTitle("Calculator Program");
     
     //makes window size unresizable
     stage.setResizable(false);
     
     //always put window on top
     stage.alwaysOnTopProperty();
     
     //displays gui
     stage.setScene(scene);
     stage.show();
     
   }
    public static void onClickEventActions()
    {
    	//sets an onClickEvent Action which then calls the btncode method
    	btnAddition.setOnAction(e -> btncode(e));
    	btnSubtract.setOnAction(e -> btncode(e));
    	btnMultiply.setOnAction(e -> btncode(e));
    	btnDivision.setOnAction(e -> btncode(e));
    	btnSine.setOnAction(e -> btncode(e));
    	btnCosine.setOnAction(e -> btncode(e));
    	btnTangent.setOnAction(e -> btncode(e));
    	btnLog.setOnAction(e -> btncode(e));
    	btnSqrt.setOnAction(e -> btncode(e));
    	btnExp.setOnAction(e -> btncode(e));
    	btnClear.setOnAction(e -> btncode(e));
    	btnMC.setOnAction(e -> btncode(e));
    	btnMS.setOnAction(e -> btncode(e));
    	btnMR.setOnAction(e -> btncode(e));
    	btnMPlus.setOnAction(e -> btncode(e));
    	
    }
	
    //what to do on the click event
	private static void btncode(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//variable that will hold user input
		double op1;
		
		//create object
		CalculatorMethods m= new CalculatorMethods();
		
		//gets a double variable type from textbox
		op1= Double.parseDouble(text.getText());
		
		//clear function
		if(e.getSource()== btnClear)
		{
			//clears both boxes and sets the starting position back to textbox
			text.setText("");
			lblText.setText("");
			text.requestFocus();
			return;
			
		}
		
		//addition function
		else if(e.getSource()== btnAddition)
		{	
			//calls addition method and then clears 
			m.addition(op1);
			lblText.setText(m.getCurrentValue()+ "+ " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//subtraction function
		else if(e.getSource()== btnSubtract)
		{
			//calls subtraction method and then clears 
			m.subtraction(op1);
			lblText.setText(m.getCurrentValue()+ "- " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//multiplication function
		else if(e.getSource()== btnMultiply)
		{
			//calls multiplication method and then clears 
			m.multiplication(op1);
			lblText.setText(m.getCurrentValue()+ "* " + op1);
			text.setText("");
			text.requestFocus();
		
		}
		
		//division function
		else if(e.getSource()== btnDivision)
		{
			//calls division method and then clears 
			m.division(op1);
			lblText.setText(m.getCurrentValue()+ "/ " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//exponent function
		else if(e.getSource()== btnExp)
		{
			//calls exponent method and then clears 
			m.exponential(op1);
			lblText.setText(m.getCurrentValue()+ "^ " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//logarithm function
		else if(e.getSource()== btnLog)
		{
			//calls logarithm method and then clears
			m.log(op1);
			lblText.setText(m.getCurrentValue()+ "log() " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//square root function
		else if(e.getSource()== btnSqrt)
		{
			//calls square root method and then clears
			m.squareRoot(op1);
			lblText.setText(m.getCurrentValue()+ "Sqrt() " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//cosine function
		else if(e.getSource()== btnCosine)
		{
			//calls cosine method and then clears
			m.cos(op1);
			lblText.setText(m.getCurrentValue()+ "cos() " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//tangent function
		else if(e.getSource()== btnTangent)
		{
			//calls tangent method and then clears 
			m.tan(op1);
			lblText.setText(m.getCurrentValue()+ "tan() " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//sine function
		else if(e.getSource()== btnSine)
		{
			//calls sine method and then clears 
			m.sin(op1);
			lblText.setText(m.getCurrentValue()+ "sin() " + op1);
			text.setText("");
			text.requestFocus();
		}
		
		//memory plus
		else if(e.getSource()== btnMPlus)
		{
			//adds current value and result to memory array
			m.addMemory(op1);
			lblText.setText("Added to Memory");
			text.setText("");
			text.requestFocus();
		}
		
		//memory store function
		else if(e.getSource()== btnMS)
		{
			//stores current value to memory array
			m.memStore(op1);
		}
		
		//memory recall
		else if(e.getSource()== btnMR)
		{
			//prints memory array
			m.printMemory();
		}
		
		//memory clear
		else if(e.getSource()== btnMC)
		{
			//clears memory array
			m.memClear();
		}
		
		else
		{
			//creates an exception if user does not enter value first
			throw new IllegalArgumentException("Enter value before pressing button! ");
		}
	
		//displays the result
		lblText.setText(m.toString());
		
	}
	public static void main(String[] args) 
	{
		//calls the launch method and sets it up as Java FX
		launch(args);
		
		/*resources used for creating gui
		https://www.tutorialspoint.com/javafx/index.htm
		https://o7planning.org/10623/javafx-tutorial-for-beginners
		https://www.geeksforgeeks.org/javafx-button-with-examples/
		https://www.javatpoint.com/javafx-gridpane
		https://www.programmersought.com/article/18586489081/
		http://www.discoversdk.com/blog/javafx-calculator-with-java-code
		https://programming.vip/docs/javafx-implementation-calculator.html
		*/
	}
}
