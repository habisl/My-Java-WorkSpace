package employee;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;


import employee.Employee;

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener{
	private JTextField tname;
	private JTextField tsalary;
	private JTextArea output;
	private List<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {
		//Use the event dispatch thread for Swing components 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				//create and show GUI frame 
				new Main().setVisible(true); 
			} 
		});
	}
	
	public Main(){
		setTitle("Employees");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		JPanel right = new JPanel(new GridLayout(3,1));
		JPanel row = new JPanel();
		row.add(new JLabel("name"));
		row.add(tname = new JTextField(50));
		right.add(row);
		row = new JPanel();
		row.add(new JLabel("salary"));
		row.add(tsalary = new JTextField(50));
		right.add(row);
		row = new JPanel(new FlowLayout());
		JButton button = new JButton("ADD");
		row.add(button);
		right.add(row);
		button.addActionListener(this);
		getContentPane().add(right);
		getContentPane().add(new JScrollPane(output = new JTextArea()));
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (tname.getText().length() > 0 && tsalary.getText().length() > 0){
			try {
				employeeList.add(new Employee(tname.getText(), Double.parseDouble(tsalary.getText())));
			} catch (Exception e )  {
				JOptionPane.showMessageDialog(
						this, 						//frame this box is linked with
						"Wrong input\n" + e.getMessage(), 			//message text
					    "Check the salary/name",	//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );
			} finally {
				StringBuilder sb = new StringBuilder(); 

				for (Employee e : employeeList){
					sb.append(e.toString() + "\n");
				}
				output.setText(sb.toString());
			}			
		}		
	}
	
}
