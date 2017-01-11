package games;

/* Author 
 * Habibul Islam
 * 1001393*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lottery extends JFrame implements ActionListener {
	
	JLabel title = new JLabel("Lottery numbers are:");
	JTextArea output = new JTextArea(2,20);
	JButton generate = new JButton("This week's lottery numbers are:");
	
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Lottery();


	}
	public Lottery()	{

		setTitle("Lottery");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		JPanel panel = new JPanel(new FlowLayout());
		
		
		panel.add(generate);
		panel.add(output);
		
		
		
		generate.addActionListener(this);
		contentPane.add(panel);
		pack();
		setVisible(true);
	
	}
	public void generate(){
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
	     for(int i = 1; i < 39; i++)
	     {
	     numbers.add(i+1);
	   }
	 
	     Collections.shuffle(numbers);
	    /* System.out.print("This week's lottery numbers are: ");*/
	     String lotterynumber = "";
	     for(int j =0; j < 7; j++)
	     {
	    	 lotterynumber = lotterynumber +numbers.get(j) + "   ";
	    	 /*stem.out.print(numbers.get(j) + " ");*/
	      
	     }
	     output.setText("  " + lotterynumber + " ");
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		generate();
	}
}

