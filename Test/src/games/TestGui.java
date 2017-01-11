package games;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TestGui extends JFrame implements ActionListener {
	JButton bt[] = new JButton[9];
	public TestGui(){
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p= new JPanel(new GridLayout(3,3));
		
		
		for(int i=0; i<bt.length; i++){
			bt[i] = new JButton();
			//bt[i].setText("Test "+(i+1));	
			p.add(bt[i]);
			
		}
		bt[0].addActionListener(this);		
		
		Container contentPane=getContentPane();
		contentPane.add(p);
		p.setSize(400, 140);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TestGui();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random() * 9);
		bt[0].setText("X");
		bt[random].setText("O");
		bt[0].disable();
		bt[random].dispatchEvent();
	}

}
