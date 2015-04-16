import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.shape.Circle;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.concurrent.*;
import javafx.event.*;
import java.util.*;

@SuppressWarnings("serial")
public class JavaFxKalkulator extends Application {
	int operand = 0;
	String operator = "";
	boolean reset = false;
	
	TextField tekstfelt = new TextField("0");
	String[] knappenavn = {
						"7", "8", "9", "*", 
						"4", "5", "6", "-", 
						"1", "2", "3", "+", 
						"0", "+/-", "AC", "="};
	
	public void start(Stage stage) {
		FlowPane knapper = new FlowPane(5, 5);
		knapper.setPadding(new Insets(10));
		
		for (String navn : knappenavn) {
			Button knapp = new Button(navn);
			knapp.setOnAction(this::buttonHandler);
			knapp.setPrefSize(60, 60);
			knapper.getChildren().add(knapp);
		}
		
		knapper.setPrefWrapLength(255);
		tekstfelt.setFont(new Font("Calibri", 20));

		BorderPane pane = new BorderPane(knapper);
		pane.setTop(tekstfelt);
		Scene scene = new Scene(pane);

		stage.setTitle("IFI kalkulator 2015");
        stage.setScene(scene);
        stage.show();
	}

	public void buttonHandler(ActionEvent e) {
		Button k = (Button) e.getSource();
		String buttonPressed = k.getText();
		String eks = tekstfelt.getText();
		
		switch(buttonPressed) {
		case "+":
		case "-":
		case "*":
		case "=":
			switch(operator) {
			case "+":
				operand = operand + Integer.parseInt(eks);
				break;
			case "-":
				operand = operand - Integer.parseInt(eks);
				break;
			case "*":
				operand = operand * Integer.parseInt(eks);
				break;
			default:
				operand = Integer.parseInt(eks);
			}
			tekstfelt.setText(String.valueOf(operand));
			operator = buttonPressed;
			reset = true;
			break;
		case "+/-":
			tekstfelt.setText(String.valueOf(Integer.parseInt(eks) * -1));
			break;
		case "AC":
			operand = 0;
			operator = "";
			tekstfelt.setText("0");
			break;
		default:
			if(reset) {
				tekstfelt.setText(buttonPressed);
				reset = false;
			} else {
				tekstfelt.setText(eks.equals("0") ? buttonPressed : eks + buttonPressed);
			}
		}
	}
}
