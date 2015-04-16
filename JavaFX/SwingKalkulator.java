import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SwingKalkulator extends JFrame implements ActionListener {
	int operand = 0;
	String operator = "";
	boolean reset = false;
	
	JTextField tekstfelt = new JTextField("0");
	String[] knappenavn = {
						"7", "8", "9", "*", 
						"4", "5", "6", "-", 
						"1", "2", "3", "+", 
						"0", "+/-", "AC", "="};

	public static void main(String[] args) {
		SwingUtilities.invokeLater(SwingKalkulator::new);
	}
	
	public SwingKalkulator() {
		this.setBounds(400, 200, 256, 322);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("IFI kalkulator 2015");
		this.setLayout(new FlowLayout());

		JPanel knapper = new JPanel(new GridLayout(4, 4, 3, 3));
		JPanel innhold = new JPanel(new BorderLayout(3, 3));
		
		for (String navn : knappenavn) {
			JButton knapp = new JButton(navn);
			knapp.addActionListener(this);
			knapper.add(knapp);
		}
		
		knapper.setPreferredSize(new Dimension(250, 250));
		tekstfelt.setFont(new Font("Calibri", 0, 20));
		
		innhold.add(tekstfelt, BorderLayout.NORTH);
		innhold.add(knapper, BorderLayout.SOUTH);

		this.add(innhold);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton k = (JButton) e.getSource();
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
