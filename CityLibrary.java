import java.util.*;

public class CityLibrary {

    public static void main(String[] args)
    {
       //declaration
       	int loop;
       	double totalOverdueItem1 =0.0;
       	double totalOverdueItem2 =0.0;
       	double totalOverdueItem3 =0.0;
       	double totalOverdueItem4 =0.0;
       	double totalOverdueItem5 =0.0;
       	double totalAmountDue=0.0;
       	int overDueItem;

       	//input object
        Scanner console = new Scanner(System.in);

        //output display
        System.out.println("=================================================");
	    System.out.println("	 		- WELCOME TO CITY LIBRARY -	     	 ");
	    System.out.println("=================================================");

	    //while loop
		loop=1;
        while(loop<=4)
        {
       	  System.out.println("       Charges for Overdue Item       ");
	      System.out.println("--------------------------------------");
	      System.out.println(">> 1 -- Hardcover or Paperback books <<");
	      System.out.println(">> 2 -- Records <<");
	      System.out.println(">> 3 -- Tapes <<");
	      System.out.println(">> 4 -- CDs <<");
	      System.out.println(">> 5 -- Videos <<");
	      System.out.println("\nPlease enter your overdue item: ");
	      overDueItem=console.nextInt();

	      switch(overDueItem)
       	  {
       		case 1: System.out.println("The overdue item is Hardcover or Paperback books");
       				System.out.println("The overdue charge is RM0.50\n");
       				totalOverdueItem1=totalOverdueItem1 +0.50;
       				break;
       		case 2: System.out.println("The overdue item is Records");
       				System.out.println("The overdue charge is RM0.80\n");
       				totalOverdueItem2=totalOverdueItem2 +0.80;
       				break;
       		case 3: System.out.println("The overdue item is Tapes");
       				System.out.println("The overdue charge is RM0.30\n");
       				totalOverdueItem3=totalOverdueItem3 +0.30;
       				break;
       		case 4: System.out.println("The overdue item is CDs");
       				System.out.println("The overdue charge is RM0.70\n");
       				totalOverdueItem4=totalOverdueItem4 +0.70;
       				break;
       		case 5: System.out.println("The overdue item is Videos");
       				System.out.println("The overdue charge is RM1.00\n");
       				totalOverdueItem5=totalOverdueItem5 +1.00;
       				break;
   		  }
   		  loop=loop+1;
		}
			//calculate total amount overdue charge
   			totalAmountDue =totalOverdueItem1+totalOverdueItem2+totalOverdueItem3+totalOverdueItem4+totalOverdueItem5;

   			//display total amount overdue charge
    		System.out.println("Total amount of overdue charge is "+totalAmountDue);
    }

}