package variables;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class BMICalculator extends JFrame implements ActionListener {
	private JLabel label1=new JLabel("Firstname");
	private JTextField input1=new JTextField(50);
	private JLabel label2=new JLabel("Familyname");
	private JTextField input2=new JTextField(50);
	private JLabel label3=new JLabel("height in cm");
	private JTextField input3=new JTextField(50);
	private JLabel label4=new JLabel("weight in kg");
	private JTextField input4=new JTextField(50);
	private JTextArea output=new JTextArea(5,5);
	private JButton read=new JButton("READ");
	private JButton empty=new JButton("EMPTY");
	private String fname;
	private String lname;
	private double height;
	private double weight;
	private double Height;
	private double BMI;
	private int nro;
	final private String hello1=":";
	final private String hello="NAME :";
	final private String hello2="BMI :";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BMICalculator();
			

	}
      
	public BMICalculator() {
		setTitle("BMI Calculation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel totalpanel=new JPanel(new BorderLayout());
		JPanel panel=new JPanel(new GridLayout(5,2));
		JPanel row1=new JPanel(new FlowLayout());
		row1.add(label1);
		row1.add(input1);
		panel.add(row1);
		JPanel row2=new JPanel(new FlowLayout());
		row2.add(label2);
		row2.add(input2);
		panel.add(row2);
		JPanel row3=new JPanel(new FlowLayout());
		row3.add(label3);
		row3.add(input3);
		panel.add(row3);
		JPanel row4=new JPanel(new FlowLayout());
		row4.add(label4);
		row4.add(input4);
		panel.add(row4);
		JPanel row5=new JPanel(new FlowLayout());
		row5.add(read);
		row5.add(empty);
		panel.add(row5);
		totalpanel.add(panel,BorderLayout.NORTH);
		totalpanel.add((new JPanel(new FlowLayout())).add(output),BorderLayout.SOUTH);
		Container contentPane=getContentPane();
		contentPane.add(totalpanel);
		pack();
		setVisible(true);
		read.addActionListener(this);
		empty.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(read)){
		fname=input1.getText();
		lname=input2.getText();
		height=Integer.parseInt(input3.getText());
		weight=Double.parseDouble(input4.getText());
	     Height = height/100;
		 BMI = (weight/Height)/Height;
		nro++;
		StringBuilder sb=new StringBuilder();
		sb.append(nro);
		sb.append(hello1);
		sb.append(hello);
		
		sb.append(fname + ",");
		sb.append(lname +"\t");
		sb.append(hello2);
		sb.append(BMI);
		sb.append("\n");
		if(BMI<20)
		{
			sb.append("low ");
		}
		 if(BMI>=20 && BMI<=25){
	                 sb.append("normal");
		 }
		 
		 if(BMI>25)
		 {
			 sb.append("high");
			 
		 }
		 
		 else{
			 sb.append("");
		 }
		output.append(sb.toString());
		
		
	}
	else{
		String ee = "";
		input1.setText(ee);
		input2.setText("");
		input3.setText("");
		input4.setText("");
		output.setText("");
	}
		
	}
}

