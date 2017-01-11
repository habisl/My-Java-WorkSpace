    package games;
	import java.awt.*;  
    import java.awt.event.*;  
    import javax.swing.*;  
    import java.util.Random;  
    public class LotteryApplication extends JFrame  
    {  
          
      
	private JPanel instructionPanel;       
       private JPanel lotteryPanel;   
       private JPanel userPanel;  
       private JPanel resultsPanel;  
       private JPanel buttonPanel;     
       private JLabel instruction;  
       private JTextField userPicks[];  
       private JLabel lotteryNumbers[];  
       private JLabel results;  
       private JButton calcBtn;  
       private JButton exitBtn;  
       private JButton clearBtn;  
         
       
          
        public static void main (String[] args)  
        {  
                    
            LotteryApplication lotteryApp = new LotteryApplication();  
              
        }  
              
            public LotteryApplication()  
            {  
            setTitle("Lottery Application");  
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            setLayout(new BorderLayout());  
              
            buildInstructionPanel();  
            buildUserPanel();  
            buildLotteryPanel();  
            buildResultsPanel();  
            buildButtonPanel();  
              
            add(instructionPanel, BorderLayout.NORTH);  
            add(userPanel, BorderLayout.WEST);  
            add(lotteryPanel, BorderLayout.CENTER);  
            add(resultsPanel, BorderLayout.EAST);  
            add(buttonPanel, BorderLayout.SOUTH);  
            
            pack();  
            setVisible(true);  
        }          
               
            private void buildInstructionPanel()  
        {  
               
            instructionPanel = new JPanel();  
            instruction = new JLabel("Select 5 numbers from 0-9.");  
            instructionPanel.add(instruction);  
               
        }  
              
            private void buildUserPanel()  
        {  
              
            userPanel = new JPanel();  
            userPanel.setLayout(new GridLayout(5, 1));  
            userPanel.setBorder(BorderFactory.createTitledBorder("User Picks"));  
           
              
             
            }  
              
            private void buildLotteryPanel()  
        {  
            lotteryPanel = new JPanel();  
            lotteryPanel.setBorder(BorderFactory.createTitledBorder("Lottery Numbers"));  
              
           
        } 
                      
           
                      
            private void buildResultsPanel()  
            {  
            resultsPanel = new JPanel();  
            resultsPanel.setBorder(BorderFactory.createTitledBorder("Results"));  
              
            resultsPanel.add(results);  
              
            }  
      
            private void buildButtonPanel()  
        {  
      
            buttonPanel = new JPanel();  
            calcBtn = new JButton("Calculate");  
            clearBtn = new JButton("Clear");  
            exitBtn = new JButton("Exit");  
      
           
            buttonPanel.add(exitBtn);  
      
           
            exitBtn.addActionListener(new ExitButtonListener());  
          
        }       
      
            private class ExitButtonListener implements ActionListener  
        {  
             
            public void actionPerformed(ActionEvent e)  
                {  
                System.exit(0);  
                }  
            }  
       
              
                
          
            }  
    