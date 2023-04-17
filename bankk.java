import java.util.*;

public class bankk {
        
   
    public static void main(String[] args) {
        //variable declaration
        char option;
        double Amount, Balance, Deposit, Transfer;
        
        //input object
        Scanner scan=new Scanner(System.in);
        
        //simple menu
        System.out.println("----WELCOME TO MYbANK----");  
        System.out.println("----choose w: withdraw----");
        System.out.println("----  c: check balance----");
        System.out.println("----  t: transfer     ----");
        System.out.println("----  a: deposit      ----");
        System.out.println(); //create empty line
        
        //input statement
        System.out.println("Please enter your option");
        option=scan.next().charAt(0);
        System.out.println("Enter your current amount");
        Amount=scan.nextDouble();
        System.out.println("Enter your transfer amount");
        Transfer=scan.nextDouble();
        System.out.println("Enter your deposit amount");
        Deposit=scan.nextDouble();
        
        //IF structure
        if ((option=='w') || (option=='W')) //OR operator ||  , AND operator &&
        {
        	System.out.println("You have selected withdrawal option");
        	Amount=Amount-200;
        	System.out.println("The current balance is RM:"+ Amount);
        	
        }
        else
        	if ((option=='c')||(option=='C'))
        	{
        		System.out.println("Checking balance");
        		Balance=Amount;
        		System.out.println("The current balance is RM:"+ Balance);
        	}
        	else
        		if((option=='a') ||(option=='a'))
        		{
        			System.out.println("You have selected deposit option");
        			Amount=Amount+Deposit;
        			System.out.println("The current balance is RM:"+ Amount);
        		}
        		else
        			if((option=='t')||(option=='t'))
        			{
        				System.out.println("Transfer your money now");
        				Amount=Amount-Transfer;
        				System.out.println("The current balance is RM:"+ Amount);
        			}
        			else
        				{
        					System.out.println("Select correct option");        
        				}
        
        
    }//end of main()
}//end of class