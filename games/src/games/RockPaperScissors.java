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

public class RockPaperScissors extends JFrame implements ActionListener{
	//radiobuttons for user selection
	private JRadioButton rock = new JRadioButton("Rock");
	private JRadioButton paper = new JRadioButton("Paper");
	private JRadioButton scissors = new JRadioButton("Scissors");
	//group of radiobuttons ensures that only one is selected at the time
	private ButtonGroup group = new ButtonGroup();
	final private String win = "You win!";
	final private String lose = "You have lost!";
	final private String tie = "Its tie!";
	

	public static void main(String[] args) {
		//Use the event dispatch thread for Swing components 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				//create GUI frame 
				new RockPaperScissors().setVisible(true); 
				} 
			});
	}
	//constructor - called only once
	public RockPaperScissors(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Rock-Paper-Scissors");
		
		JPanel panel = new JPanel(new BorderLayout());		
		JPanel buttonPanel = new JPanel(new GridLayout(2,1));
		JPanel row = new JPanel(new FlowLayout());
		row.add(rock);
		buttonPanel.add(row);
		row.add(paper);
		buttonPanel.add(row);
		row.add(scissors);
		buttonPanel.add(row);
		panel.add(buttonPanel, BorderLayout.NORTH);
		//button that tosses the coin
		JButton button = new JButton("Play");
		button.addActionListener(this);
		panel.add(button, BorderLayout.SOUTH);
		//add elements into the content
		this.getContentPane().add(panel);		
		group.add(rock);
		group.add(paper);
		group.add(scissors);
		this.setSize(400, 140);	
		this.setLocationByPlatform(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//toss the coin
		//pick a random number between 1 .. 99 999
		int random = (int)(Math.random() * 60);
		//testing
		System.out.println(": " + random);
		if (rock.isSelected() == false && paper.isSelected() == false && scissors.isSelected() == false){
			JOptionPane.showMessageDialog(
					this, 						//frame this box is linked with
					"Select Rock, Paper  or Scissors", 	//message text
				    "Nothing selected",			//title			    
				    JOptionPane.PLAIN_MESSAGE 	//no icon
				    );
		}
		else if (rock.isSelected() == true){
			if (random >= 1 && random <=20){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Rock breaks Scissors!", 	//message text
					    win,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );
					
		}
			
		else if (rock.isSelected() == true){
			if (random >= 21 && random <=40){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Its a Tie!", 	//message text
					    tie,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );
					
		}
			
			else {
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Your Rock is covered by the machine's Paper!", 	//message text
					    lose,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );	
			}
		}
		
	}
			
		
		else if (paper.isSelected() == true){
			if (random >= 1 && random <=20){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Paper covers Rock!", 	//message text
					    win,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );
					
		}
			
		else if (paper.isSelected() == true){
			if (random >= 21 && random <=40){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Its a Tie!", 	//message text
					    tie,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );
					
		}
			else {
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Scissor cuts paper!", 	//message text
					    lose,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );	
			}
		}
		
		}
		else if (scissors.isSelected() == true){
			if (random >= 1 && random <=20){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Scissors cut paper!", 	//message text
					    win,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );
					
		}
			
		else if (scissors.isSelected() == true){
			if (random >= 21 && random <=40){
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Its a Tie!", 	//message text
					    tie,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );
					
		}
			else {
				JOptionPane.showMessageDialog(
						this, 				//frame this box is linked with
						"Rock breaks scissors!", 	//message text
					    lose,			//title			    
					    JOptionPane.PLAIN_MESSAGE 	//no icon
					    );	
			}
		}
		
		}
			
		//clear the selection
		this.group.clearSelection();
	}

}
