package loops;
import java.io.*;


public class Loops
{
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{    
		
		 BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		 
         System.out.println("Enter the First number:");
         int firstNumber= Integer.parseInt(buffer.readLine());
        
         System.out.println("Enter the Second number:");
         int secondNumber= Integer.parseInt(buffer.readLine());
         int maxNumber = max(firstNumber,secondNumber);
         int minNumber = min(firstNumber, secondNumber);
        
         System.out.println("Max and Min numbers are : " +maxNumber+ " and " +minNumber);
         System.out.println("What operation would like to operate ?"+ " enter '+' or '*' :");
         String operate = buffer.readLine();
         
         Calculate(maxNumber, minNumber, operate);
	}
         
        public static  int max(int n1, int n2)
        {  
        	
        		return (n1>n2) ? n1:n2;
         }
        
        public static int min(int n1, int n2)
        {
        	return (n1<n2) ? n1:n2;
        }
        
        public static void Calculate(int max, int min, String Op)
        {
        	
        	if(Op.equals("+"))
        	{
        		int sum=0;
        		for(int i = min; i<=max; i++)
        		{
        			sum += i;
        			System.out.print(i + (i==max ? " = " : " + "));
        		}
        		System.out.println( sum);
        	}
        	else if (Op.equals("*"))
        	{
        		int product=1;
        		for(int i=min; i<=max; i++)
        		{
        			product *= i;
        			System.out.print(i + (i==max ? " = " : " * "));
        		}
        		System.out.println(product);
        	}
        	else
        	{
        		System.out.println("Please select your operator");
        		System.exit(0);
        	}
        	
        }
        
}