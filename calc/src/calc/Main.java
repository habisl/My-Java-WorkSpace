package calc;

import java.util.ArrayList;
02	import java.util.Random;
03	 
04	 
05	public class Main
06	 
07	    public static void main(String[] arg) {
08	        ArrayList<Integer> al = new ArrayList<Integer>();
09	        for(int i = 1; i <= 49; i++)
10	            al.add(i);
11	        Random ran = new Random();
12	         
13	        for(int i = 0; i < 6; i++) {
14	            int x = al.remove(ran.nextInt(al.size()));
15	            System.out.print(" " + x);
16	        }
17	        System.out.println();
18	    }
19	}