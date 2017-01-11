package games;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UMLEditor {

    public static void main(String[] args) {
        JFrame frame = new UMLWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 1000, 700);
        frame.getContentPane().setBackground(Color.white);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
class UMLWindow extends JFrame {
    Canvas canvas = new Canvas();

    private static final long serialVersionUID = 1L;

    public UMLWindow() {
        addMenus();
    }
    public void addMenus() {

        getContentPane().add(canvas);

        JMenuBar menubar = new JMenuBar();

        JMenuItem newTextBox = new JMenuItem("New Text Box");
        newTextBox.setMnemonic(KeyEvent.VK_E);
        newTextBox.setToolTipText("Exit application");
        newTextBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                canvas.addTextBox();
            }
        });

        menubar.add(newTextBox);

        setJMenuBar(menubar);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class Canvas extends JPanel {

    public Canvas() {
        this.setOpaque(true);
        //this.setBackground(Color.WHITE);
    }

    public void addTextBox() {
        final JTextArea commentTextArea = new JTextArea(10, 10);
        commentTextArea.setLineWrap(true);
        commentTextArea.setLineWrap(true);
        commentTextArea.setWrapStyleWord(true);
        commentTextArea.setVisible(true);
    }

}
