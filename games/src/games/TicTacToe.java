package games;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;




public class TicTacToe implements ActionListener {

	JFrame frame = new JFrame();
	JButton [][] button = new JButton[3][3];
	int [][] board = new int[3][3];
	final int BLANK = 0;
	final int x_MOVE = 1;
	final int o_MOVE = 2;
	final int x_TURN = 0;
	final int o_TURN = 1;
	int turn = x_TURN;
	int marks = 0; 
	Container center= new Container();
	JLabel xname = new JLabel ("Player wins:0");
	JLabel oname = new JLabel ("Computer wins:0");
	JButton xChangeName = new JButton ("Change x's Name");
	JButton oChangeName = new JButton ("Change O's Name");
	JTextField xChangeField = new JTextField();
	JTextField oChangeField = new JTextField();
	
	Container north = new Container();
	
	public TicTacToe(){
		frame.setSize(400,400);
		// Center grid container
		
		frame.setLayout(new BorderLayout());
		center.setLayout(new GridLayout(3,3));
	    for (int i = 0; i < button.length; i++){
	    	for (int j = 0; j < button[0].length; j++){
	    		button[j][i] = new JButton ();
	    		center.add(button[j][i]);
	    		button[j][i].addActionListener(this);
	    	}
	    	
	    }
	    frame.add(center, BorderLayout.CENTER);
	    //North container
	    north.setLayout(new GridLayout(3,2));
	    north.add(xname);
	    north.add(oname);
	    north.add(xChangeName);
	    xChangeName.addActionListener(this);
	    north.add(oChangeName);
	    oChangeName.addActionListener(this);
	    north.add(xChangeField);
	    north.add(oChangeField);
	    
	    frame.add(north, BorderLayout.NORTH);
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		}
	
	public static void main(String[] args) {
		new TicTacToe();
		
		}


	
	@Override
	public void actionPerformed(ActionEvent event) {
		JButton current;
		
		boolean gridButton = false;
		for (int i = 0; i < 3; i++){
	    	for (int j = 0; j < 3; j++){ 
	    		if (event.getSource().equals(button[j][i])){
	    			gridButton = true;
	    			current = button[j][i];
		    			if (board[j][i]== BLANK){
		    			if (turn == x_TURN){
		    				current.setText("X");
		    				marks ++;
		    				//System.out.println(marks);
		    				current.setEnabled(false);
		    				board[j][i]= x_MOVE;
		    				turn = o_TURN;
	    				
		    				//System.out.println(j+" "+i);
		    			}
		    			else {
		    				current.setText("O");
		    				current.setEnabled(false);
		    				board[j][i] = o_MOVE;
		    				turn = x_TURN;
		    			}
	    			}
	    		  }
	    		if (gridButton == false){
	    			if (event.getSource().equals(xChangeName) == true){
	    				xChangeField.setText("X Change");
	    			}
	    			else if (event.getSource().equals(oChangeName) == true){
	    				oChangeField.setText("O Change");
	    				
	    			}
	    			
	    		}
	    		}
	    	}
		
		for (int i = 0; i < 3; i++){
	    	for (int j = 0; j < 3; j++){ 
	    		if (!event.getSource().equals(button[j][i])){
	    			gridButton = true;
	    			current = button[j][i];
		    			if (board[j][i]== BLANK){
		    			if (turn == o_TURN){
		    				current.setText("O");
		    				marks ++;
		    				//System.out.println(marks);
		    				current.setEnabled(false);
		    				board[j][i]= o_MOVE;
		    				turn = x_TURN;
		    				if(turn == 0)
		    				break;
	    				
		    			}
		    			else {
		    				current.setText("O");
		    				current.setEnabled(false);
		    				board[j][i] = o_MOVE;
		    				turn = x_TURN;
		    			}
	    			}
	    		  }
	    		if (gridButton == false){
	    			if (event.getSource().equals(xChangeName) == true){
	    				xChangeField.setText("X Change");
	    			}
	    			else if (event.getSource().equals(oChangeName) == true){
	    				oChangeField.setText("O Change");
	    				
	    			}
	    			
	    			
	    		}
	    	  }
	    	
			if(turn == 0)
			break;
	    	}
		
		if (marks >= 6) {
			if ( (button[0][0].getText()=="X" && button[0][1].getText()=="X" &&  button[0][2].getText()=="X") ||
				(button[1][0].getText()=="X" && button[1][1].getText()=="X" &&  button[1][2].getText()=="X") ||
				(button[2][0].getText()=="X" && button[2][1].getText()=="X" &&  button[2][2].getText()=="X") ||
				(button[0][0].getText()=="X" && button[1][0].getText()=="X" &&  button[2][0].getText()=="X") ||
				(button[0][1].getText()=="X" && button[1][1].getText()=="X" &&  button[2][1].getText()=="X") ||
				(button[0][2].getText()=="X" && button[1][2].getText()=="X" &&  button[2][2].getText()=="X") ||
				(button[0][0].getText()=="X" && button[1][1].getText()=="X" &&  button[2][2].getText()=="X") ||
				(button[0][2].getText()=="X" && button[1][1].getText()=="X" &&  button[2][0].getText()=="X")){
				{
					JOptionPane.showMessageDialog(null, "congratulations! " +   " You Won!");
					
				}
			
			}
				
			else if ( (button[0][0].getText()=="O" && button[0][1].getText()=="O" &&  button[0][2].getText()=="O") ||
						(button[1][0].getText()=="O" && button[1][1].getText()=="O" &&  button[1][2].getText()=="O") ||
						(button[2][0].getText()=="O" && button[2][1].getText()=="O" &&  button[2][2].getText()=="O") ||
						(button[0][0].getText()=="O" && button[1][0].getText()=="O" &&  button[2][0].getText()=="O") ||
						(button[0][1].getText()=="O" && button[1][1].getText()=="O" &&  button[2][1].getText()=="O") ||
						(button[0][2].getText()=="O" && button[1][2].getText()=="O" &&  button[2][2].getText()=="O") ||
						(button[0][0].getText()=="O" && button[1][1].getText()=="O" &&  button[2][2].getText()=="O") ||
						(button[0][2].getText()=="O" && button[1][1].getText()=="O" &&  button[2][0].getText()=="O")){
				{
					JOptionPane.showMessageDialog(null, "Sorry! " +   " Computer Won!");
					
				}
			}
				
				
		}
		
	}
}