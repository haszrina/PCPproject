import java.util.*;

public class DanialGarage {


    public static void main(String[] args)
    {
     	//declaration
		int loop;
		int drivingType;
		int tyrePressure1;
		int tyrePressure2;
		int tyrePressure3;
		int tyrePressure4;
		int totalTyrePressure;

		//input object
        Scanner console = new Scanner(System.in);

        //output display
	    System.out.println("=======================================");
	    System.out.println("|			 DANIAL'S GARAGE	      |");
	    System.out.println("=======================================");

        //while loop
		loop=1;
        while(loop<=5)
        {
	      System.out.println("\nDriving Type Option ");
	      System.out.println("--------------------");
	      System.out.println("1 -- Normal");
	      System.out.println("2 -- Hauling");
	      System.out.println("3 -- Rugged Terrain");
	      System.out.print("\nPlease select your driving type: ");
		  drivingType=console.nextInt();

		  System.out.print("Please enter the tire pressure(front, right): ");
		  tyrePressure1=console.nextInt();

		  System.out.print("Please enter the tire pressure(front, left): ");
		  tyrePressure2=console.nextInt();

		  System.out.print("Please enter the tire pressure(back, right): ");
		  tyrePressure3=console.nextInt();

		  System.out.print("Please enter the tire pressure(back, left): ");
		  tyrePressure4=console.nextInt();

		  //calculate total tyre pressure
		  totalTyrePressure =tyrePressure1+tyrePressure2+tyrePressure3+tyrePressure4;

		  //display total tyre pressure
		  System.out.println("\nThe total tyre pressure is "+totalTyrePressure);

		  switch(drivingType)
       	  {
       		case 1: System.out.println("\nYour driving type is Normal");
       				System.out.println("All four tyres should be inflated between 33 and 43 pounds per square inch(psi)");
       				break;
       		case 2: System.out.println("Your driving type is Hauling");
       				System.out.println("Rear tyre pressure should between 43 and 53");
       				break;
       		case 3: System.out.println("Your driving type is Rugged Terrain");
       				System.out.println("Rear tyre pressure should be 53 and 73");
       				break;
    	  }
			loop=loop+1;
		}

	}
}