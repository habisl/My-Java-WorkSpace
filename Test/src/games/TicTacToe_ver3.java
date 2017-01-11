package games;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class TicTacToe_ver3 extends JFrame implements ActionListener {

	private JButton[] buttons = new JButton[9];
	private String[] marks = {"", "X", "O"};
	private int moves;
	//RandomNumber generator
	Random random;
	//winner
	private String winner;
	
	public static void main(String[] args) {
		//Use the event dispatch thread for Swing components 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				//create GUI frame 
				new TicTacToe_ver3().setVisible(true); 
			} 
		});
	}
	
	public TicTacToe_ver3(){
		setTitle("TicTacToe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,3));
		Container contentPane = getContentPane();
		//fill the buttons table
		for(int i = 0; i < buttons.length; i++){
			JButton button = new JButton(marks[0]);
			button.addActionListener(this);			
			contentPane.add(button);
			buttons[i] = button;
		}
		setSize(280,300);
		random = new Random();
		winner = marks[0];
	}
	
	// method for new game
	
	public void newGame()
	{
		for (JButton button : buttons)
		{
			button.setEnabled(true);
			button.setText(marks[0]);
			moves = 0;
			winner = marks[0];
		}
	}
	
	//
	
	@Override
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton)e.getSource();
		//resetting the winner if not done
		winner = marks[0];
		
		//user move
		button.setText(marks[1]);
		button.setEnabled(false);
		moves++;
		
		//checking the winner - start when winning is possible
		if (moves >= 5){
			for (int i = 0; i < 9 ; i++) {				
				//horizontal rows	
				if((i == 0) || (i == 3) || (i == 6)) 
					if (buttons[i].getText().equals(buttons[i+1].getText()) 
							&& buttons[i].getText().equals(buttons[i+2].getText()) 
							&& !buttons[i].getText().equals(marks[0])){ 					
						winner = buttons[i].getText();
						break;
					}
				//vertical columns	
				if((i == 0) || (i == 1) || (i == 2)) 
					if (buttons[i].getText().equals(buttons[i+3].getText()) 
							&& buttons[i].getText().equals(buttons[i+6].getText()) 
							&& !buttons[i].getText().equals(marks[0])){ 					
						winner = buttons[i].getText();
						break;
					}
				//north-west to south-east
				if(i == 0) 
					if (buttons[i].getText().equals(buttons[i+4].getText()) 
							&& buttons[i].getText().equals(buttons[i+8].getText()) 
							&& !buttons[i].getText().equals(marks[0])){ 					
						winner = buttons[i].getText();
						break;
					}
				//south-west to north-east
				if(i == 2) 
					if (buttons[i].getText().equals(buttons[i+2].getText()) 
							&& buttons[i].getText().equals(buttons[i+4].getText()) 
							&& !buttons[i].getText().equals(marks[0])){ 					
					winner = buttons[i].getText();
					break;
					}
			}//for
			//if the winner was found
			if (! winner.equals(marks[0])){
				JOptionPane.showMessageDialog(
						this, 						//frame this box is linked with
						winner + "'s game this time!", 	//message text
						"That's it", 	//title					    
					    JOptionPane.INFORMATION_MESSAGE 	//icon
					    );
				newGame();
				return;
			}
		}
		
		if (moves == 9) {
			checkWinner();
			newGame();
			return;
		}
		//machine move
		while (true) {	
			int cell = random.nextInt(9);
			if (buttons[cell].getText().equals(marks[0])){//cell is free
				buttons[cell].setText(marks[2]);
				buttons[cell].setEnabled(false);
				moves++;
				break;
			}
			else continue;
		}
		
		//checking the winner - start when winning is possible
		if (moves >= 5){
				for (int i = 0; i < 9 ; i++) {				
					//vertical columns	
					if((i == 0) || (i == 3) || (i == 6)) 
						if (buttons[i].getText().equals(buttons[i+1].getText()) 
								&& buttons[i].getText().equals(buttons[i+2].getText()) 
								&& !buttons[i].getText().equals(marks[0])){ 					
							winner = buttons[i].getText();
							break;
						}
					//horizontal rows	
					if((i == 0) || (i == 1) || (i == 2)) 
						if (buttons[i].getText().equals(buttons[i+3].getText()) 
								&& buttons[i].getText().equals(buttons[i+6].getText()) 
								&& !buttons[i].getText().equals(marks[0])){ 					
							winner = buttons[i].getText();
							break;
						}
					//north-west to south-east
					if(i == 0) 
						if (buttons[i].getText().equals(buttons[i+4].getText()) 
								&& buttons[i].getText().equals(buttons[i+8].getText()) 
								&& !buttons[i].getText().equals(marks[0])){ 					
							winner = buttons[i].getText();
							break;
						}
					//south-west to north-east
					if(i == 2) 
						if (buttons[i].getText().equals(buttons[i+2].getText()) 
								&& buttons[i].getText().equals(buttons[i+4].getText()) 
								&& !buttons[i].getText().equals(marks[0])){ 					
						winner = buttons[i].getText();
						break;
						}
				}
		}
	}//actionPerformed
	
	public boolean checkWinner(){
		if(winner==marks[1]||winner==marks[2])
		{
			return true;
			
		}
		
		else{
			
			JOptionPane.showMessageDialog(null,"No winner is registered!!");
			return false;
		}
		
		
	}

}
