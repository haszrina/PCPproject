import java.util.*;

public class PetrolBillApplication {


    public static void main(String[] args) {
    	
    	int fuel 
        int residenceStatus,Adult,Child, Seniorcitizen, totalPrice;

        //input object
        Scanner console = new Scanner(System.in);

        //output display
        System.out.println("*************************************************");
        System.out.println("*			 WELCOME TO ZOO NEGARA	     		*");
        System.out.println("*			 TICKET PRICE CALCULATOR			*");
        System.out.println("*************************************************");
        System.out.println("ENTRANCE FEE");
        System.out.println("------------");

        //Entrance Fee price guide
        System.out.println("								Malaysian  Asian  Others");
        System.out.println("Adult (>12 years old)				44		63		85");
        System.out.println("Child (3-12 years old)				16		33		43");
        System.out.println("Senior citizen (>=60 years old)		21		63		85\n");


        //input statement
        System.out.println("\tSelect one of the following:");
        System.out.println("\t----------------------------");
        System.out.println("	1 -- Malaysian");
        System.out.println("	2 -- Asian");
        System.out.println("	3 -- Others");
        System.out.print("	Enter your selection: ");
        residenceStatus = console.nextInt();


        //input statement
        System.out.println("\n\tSelect quantity of tickets for:");
        System.out.println("\t--------------------------------");
        System.out.print("	Adult : ");
        Adult=console.nextInt();
        System.out.print("Child : ");
        Child=console.nextInt();
        System.out.print("Senior Citizen : ");
        Seniorcitizen=console.nextInt();
        System.out.print("--------------------------------");


       //if statement
       if(residenceStatus==1)
       {
       		Adult = 44*	Adult;
       		Child = 16*Child;
       		Seniorcitizen = 21*Seniorcitizen;

       		totalPrice = Adult + Child + Seniorcitizen;

       }
       	else
       		 if(residenceStatus==2)
	   		    {
		       		Adult = 63*	Adult;
		       		Child = 33*Child;
		       		Seniorcitizen = 63*Seniorcitizen;

		       		totalPrice = Adult + Child + Seniorcitizen;
		        }
		        else
		        	if(residenceStatus==3)
				    {
				       Adult = 85*Adult;
				       Child = 43*Child;
				       Seniorcitizen = 85*Seniorcitizen;

				       totalPrice = Adult + Child + Seniorcitizen;
				    }
				    else

		//calculate totalPrice
		totalPrice = Adult + Child + Seniorcitizen;

        //output statment
        System.out.println("\n\tTHANK YOU FOR YOUR PURCHASE!");
        System.out.println("    Your total price is RM " +totalPrice);

    }//end of main()
}//end of class