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

public class HeadsOrTails extends JFrame implements ActionListener{
	//radiobuttons for user selection
	private JRadioButton heads = new JRadioButton("Heads");
	private JRadioButton tails = new JRadioButton("Tails");
	//group of radiobuttons ensures that only one is selected at the time
	private ButtonGroup group = new ButtonGroup();
	final private String win = "You win!";
	final private String lose = "You have lost!";

	public static void main(String[] args) {
		//Use the event dispatch thread for Swing components 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				//create GUI frame 
				new HeadsOrTails().setVisible(true); 
				} 
			});
	}
	//constructor - called only once
	public HeadsOrTails(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Heads or Tails");
		
		JPanel panel = new JPanel(new BorderLayout());		
		JPanel buttonPanel = new JPanel(new GridLayout(2,1));
		JPanel row = new JPanel(new FlowLayout());
		row.add(heads);
		buttonPanel.add(row);
		row = new JPanel(new FlowLayout());
		row.add(tails);
		buttonPanel.add(row);		
		panel.add(buttonPanel, BorderLayout.NORTH);
		//button that tosses the coin
		JButton button = new JButton("TOSS THE COIN");
		button.addActionListener(this);
		panel.add(button, BorderLayout.SOUTH);
		//add elements into the content
		this.getContentPane().add(panel);		
		group.add(heads);
		group.add(tails);
		this.setSize(330, 140);	
		this.setLocationByPlatform(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//toss the coin
		//pick a random number between 1 .. 99 999
		int random = (int)(Math.random() * 100000);
		//testing
		System.out.println(": " + random);
		if (heads.isSelected() == false && tails.isSelected() == false){
			JOptionPane.showMessageDialog(
					this, 						//frame this box is linked with
					"Select Heads or Tails", 	//message text
				    "Nothing selected",			//title			    
				    JOptionPane.PLAIN_MESSAGE 	//no icon
				    );
		}
		else if (heads.isSelected() == true){
			if (random % 2 == 0){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Heads it is!", 	//message text
					    win,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );				
			}
			else {
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"It was Tails!", 	//message text
					    lose,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );	
			}
		}
		else {//tails is selected
			if (random % 2 != 0){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Tails it is!", 	//message text
					    win,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );				
			}
			else {
				JOptionPane.showMessageDialog(
						this, 						//frame this box is linked with
						"It was Heads!", 	//message text
					    lose,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );	
			}			
		}
		//clear the selection
		this.group.clearSelection();
	}

}
