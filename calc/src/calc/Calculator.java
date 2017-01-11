package calc;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener{
	private JTextField input1;
	private JTextArea output;
	final private String sin ="sin";
	final private String cos ="cos";
	final private String tan ="tan";
	final private String cotan="cot";
	
	private List<String> ops = new ArrayList<String>(){{add(sin); add(cos); add(tan); add(cotan);}}; //NOTE {{ and }}
	

	public static void main(String[] args) {
		//Use the event dispatch thread for Swing components 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				//create GUI frame 
				new Calculator().setVisible(true); 
				} 
			});

	}
	public Calculator(){
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1,4));
		Container contentPane = this.getContentPane();
		//1. column
		JPanel part = new JPanel(new FlowLayout());
		input1 = new JTextField(10);
		part.add(input1);
		contentPane.add(part);
		
		//2. column
		JPanel panel = new JPanel(new GridLayout(2,2));
		
		for(String s : ops){
			JButton button = new JButton(s);
			button.addActionListener(this);
			panel.add(button);			
		}
				
		contentPane.add(panel);
		part = new JPanel(new FlowLayout());
		part.add(new JLabel(" = "));
		output = new JTextArea(1,10);
		part.add(output);
		contentPane.add(part);
		pack();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double result = 0.0;
		try {
			switch (e.getActionCommand()){
			case sin: result =Math.sin( Double.parseDouble(input1.getText()));

 break;
			case cos: result =Math.cos(Double.parseDouble(input1.getText()));
					 break;
			case tan: result =Math.tan(Double.parseDouble(input1.getText())); 
					 break;
			case cotan: result =1/(Math.tan(Double.parseDouble(input1.getText()))); 
				      break;
			default: break;
			}
		
			//showing the output
			NumberFormat formatter = NumberFormat.getNumberInstance();
			formatter.setMaximumFractionDigits(6);		
			output.setText(formatter.format(result));
		}
		catch(Exception ex){
			output.setText("not a valid number");
		}
		
	}

}
