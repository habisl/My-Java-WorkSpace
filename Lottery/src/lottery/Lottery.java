package lottery;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lottery extends JFrame {
	JLabel title = new JLabel("Lottery");
	JTextArea output = new JTextArea(2,20);
	JButton generate = new JButton("Generate");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Lottery();

	}
	public Lottery()	{

		setTitle("calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		JPanel panel = new JPanel(new FlowLayout());
		
		panel.add(title);
		panel.add(output);
		panel.add(generate);

		contentPane.add(panel);
		pack();
		setVisible(true);
	
	}
}
