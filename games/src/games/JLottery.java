package games;

import java.util.Random;
02	import javax.swing.*;
03	import java.awt.*;
04	import java.awt.event.*;
05	 
06	public class JLottery extends JFrame implements ActionListener
07	{
08	 
09	    JLottery compNum = new JLottery();
10	     
11	    JFrame aFrame = new JFrame("Lottery.");
12	    JMenuBar menuBar = new JMenuBar();
13	     
14	    JLabel instructions = new JLabel("Please choose six numbers and no more than six.");
15	    JLabel result = new JLabel("");
16	     
17	    JButton submit = new JButton("Submit numbers");
18	     
19	    int total1;
20	    int total2;
21	     
22	    Container con = getContentPane();
23	     
24	    int count;
25	     
26	    public JLottery()
27	    {
28	         
29	        con.setLayout(new FlowLayout());
30	        con.add(menuBar);
31	        con.add(instructions);
32	         
33	        JCheckBox[] boxes = new JCheckBox [30];
34	        for(int x = 0; x<boxes.length; ++x)
35	        {
36	            boxes[x] = new JCheckBox("" + (x + 1));
37	            boxes[x].addActionListener(this);
38	            con.add(boxes[x]);
39	        }
40	        con.add(submit);
41	        con.add(result);
42	        winNum();  
43	 
44	        submit.addActionListener(this);
45	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
46	    }
47	     
48	    public void winNum()
49	    {
50	        int num1 = (int)(Math.random()*30) + 1;
51	        int num2 = (int)(Math.random()*30) + 1;
52	        int num3 = (int)(Math.random()*30) + 1;
53	        int num4 = (int)(Math.random()*30) + 1;
54	        int num5 = (int)(Math.random()*30) + 1;
55	        int num6 = (int)(Math.random()*30) + 1;
56	    }
57	     
58	    public void actionPerformed(ActionEvent e)
59	   {
60	        Object source = e.getSource();
61	        if(source == submit)
62	        compNum.winNum();
63	    }
64	     
65	    public static void main(String[] args)
66	    {      
67	         
68	        JLottery frame = new JLottery();
69	      frame.setSize(350, 400);
70	      frame.setVisible(true);
71	    }
72	}