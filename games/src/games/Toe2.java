package games;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Toe2 extends JFrame implements ActionListener{
	JButton bt[] = new JButton[9];
	private ButtonGroup group = new ButtonGroup();
	

	public static void main(String[] args) {
		//Use the event dispatch thread for Swing components 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				//create GUI frame 
				new Toe2().setVisible(true); 
				} 
			});
	}
	//constructor - called only once
	public Toe2(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("TIC_TAC_TOE");
		
		JPanel panel = new JPanel(new BorderLayout());		
		JPanel buttonPanel = new JPanel(new GridLayout(2,1));
		JPanel row = new JPanel(new FlowLayout());
	
		panel.add(buttonPanel, BorderLayout.NORTH);
		//button that tosses the coin
		JButton button = new JButton("Play");
		button.addActionListener(this);
		panel.add(button, BorderLayout.SOUTH);
		//add elements into the content
		this.getContentPane().add(panel);		
	
		this.setSize(400, 140);	
		this.setLocationByPlatform(true);
	}



		
	}


