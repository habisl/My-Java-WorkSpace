package games;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Example extends JFrame implements ActionListener {
    public static void main(String[] args) {
             new Example();
    }

    JFrame go = new JFrame("Example");
    JPanel panel = new JPanel();
    JButton Button = new JButton("Button");
   
    
    JLabel Title = new JLabel("The lottery number is: ");
    JTextArea textArea1 = new JTextArea("TextArea 1");

    public Example() {
   
    panel.setLayout(new GridLayout(1,3));
    Title.setFont(new Font("Serif", Font.BOLD, 20));
    panel.add(Title);
    panel.add(textArea1);
    panel.add(Button);
    Container contentPane = getContentPane();
    pack();

    go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    go.setSize(450, 350);
    go.setVisible(true);
    }


}