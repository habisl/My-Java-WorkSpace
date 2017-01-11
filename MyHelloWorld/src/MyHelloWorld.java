/**
 * 
 */

/**
 * @author 1001393 Habibul Islam
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")


public class MyHelloWorld extends JFrame implements ActionListener{
private JLabel label1 = new JLabel("First name");
private JTextField input1 = new JTextField(50);
private JLabel label2 = new JLabel("Family name");
private JTextField input2 = new JTextField(50);
private JLabel label3 = new JLabel("Height [cm]");
private JTextField input3 = new JTextField(50);
private JLabel label4 = new JLabel("Weight [Kg]");
private JTextField input4 = new JTextField(50);
private JTextArea output = new JTextArea(5,5);
private JButton read = new JButton("READ");
private JButton empty = new JButton("EMPTY");
private String fiName;
private String faName;
private double height;
private double weight;
private double BMI ;
private double nro;
final private String hello1 = "Name: ";
final private String hello2 = " BMI";


public static void main(String[] args) {
	new MyHelloWorld();
} 
	public MyHelloWorld(){

		setTitle("Variables and types");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel totalpanel = new JPanel(new BorderLayout());
		JPanel panel = new JPanel(new GridLayout(6,2));
		JPanel row1 = new JPanel(new FlowLayout());
		row1.add(label1);
		row1.add(input1);
		panel.add(row1);
		JPanel row2 = new JPanel(new FlowLayout());
		row2.add(label2);
		row2.add(input2);
		panel.add(row2);
		JPanel row3 = new JPanel(new FlowLayout());
		row3.add(label3);
		row3.add(input3);
		panel.add(row3);
		JPanel row4 = new JPanel(new FlowLayout());
		row3.add(label4);
		row3.add(input4);
		panel.add(row4);
		JPanel row5 = new JPanel(new FlowLayout());
		row4.add(read);
		row4.add(empty);
		panel.add(row5);
		totalpanel.add(panel, BorderLayout.NORTH);
		totalpanel.add(
		(new JPanel(new FlowLayout())).add(output),
		BorderLayout.SOUTH);
		Container contentPane = getContentPane();
		contentPane.add(totalpanel);
pack();
setVisible(true);
read.addActionListener(this);
empty.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
		fiName = input1.getText();
		faName = input2.getText();
		height = Double.parseDouble(input3.getText())/100;
		weight = Double.parseDouble(input4.getText());
		BMI = weight/(height*height);
		nro = nro + 1; //or nro++;
		StringBuilder sb = new StringBuilder();
		sb.append(nro);
		sb.append(hello1);
		sb.append(fiName + ", ");
		sb.append(faName + "  - ");
		sb.append(BMI);
		sb.append(hello2 + "\n");
		output.append(sb.toString());
		}
}
