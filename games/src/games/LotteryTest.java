package games;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class LotteryTest extends JFrame implements ActionListener{
	private JTextArea output;

	public static void main(String[] args) {
		//Use the event dispatch thread for Swing components 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				//create GUI frame 
				new LotteryTest().setVisible(true); 
				} 
			});
	}
	//constructor - called only once
	public LotteryTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Lottery");
		
		JPanel panel = new JPanel(new BorderLayout());
		JLabel instructions = new JLabel("Please choose six numbers and no more than six.");
		 final JPanel comboPanel = new JPanel();
	      JLabel comboLbl = new JLabel("Fruits:");
	      
			
			output = new JTextArea(1,10);
			
	
				
		
		
		JButton button = new JButton("Generate the number");
		button.addActionListener(this);
		panel.add(button, BorderLayout.SOUTH);
		//add elements into the content
		this.getContentPane().add(panel);		
		
		this.setSize(370, 250);	
		this.setLocationByPlatform(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
