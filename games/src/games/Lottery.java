package games;

import java.util.Collections;
import java.util.ArrayList;

public class Lottery {

	public static void main(String[] args) {
		 
	     //defining ArrayList to hold Integer numbers
	     ArrayList<Integer> numbers = new ArrayList<Integer>();
	     for(int i = 1; i < 39; i++)
	     {
	     numbers.add(i+1);
	   }
	 
	     Collections.shuffle(numbers);
	     System.out.print("This week's lottery numbers are: ");
	     for(int j =0; j < 7; j++)
	     {
	       System.out.print(numbers.get(j) + " ");
	     }
	   }
	 } 
