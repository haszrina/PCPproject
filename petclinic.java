import java.util.*;

public class petclinic {

    public static void main(String[] args) {

        //declaration
		int loop; //initialization of loop
		int services;
		double priceOvisit=0.0;
		double priceVaccine=0.0;
		double priceHospitalize=0.0;
		double priceHeartworm=0.0;
		double priceBoarding=0.0;
		double priceDentistry=0.0;
		double priceXrays=0.0;
		double priceLabWork=0.0;
		double pricePrescription=0.0;
		double totalAmount=0.0;


        //input object
        Scanner console = new Scanner(System.in);

		//output display
	    System.out.println("			 WELCOME TO WE LOVE PET CLINIC	     	 ");
	    System.out.println("-----------------------------------------------------");

		//while loop testing
		loop=1;
        while(loop<=9)
        {

	      System.out.println("List of Services at We Love Pet Clinic ");
	      System.out.println("=======================================");
	      System.out.println("1 -- Office Visit");
	      System.out.println("2 -- Vaccinations");
	      System.out.println("3 -- Hospitalization");
	      System.out.println("4 -- Heartworm Prevention");
	      System.out.println("5 -- Boarding");
	      System.out.println("6 -- Dentistry");
	      System.out.println("7 -- X-rays");
	      System.out.println("8 -- Laboratory Work");
	      System.out.println("9 -- Prescriptions");
	      System.out.println("\nPlease select your service: ");
		  services=console.nextInt();

		  //switch case
		  switch(services)
       	  {
       		case 1: System.out.println("The service chosen is Office Visit");
       				System.out.println("The charge for this service is RM40.00\n");
       				priceOvisit=priceOvisit +40.00;
       				break;
       		case 2: System.out.println("The service chosen is Vaccinations");
       				System.out.println("The charge for this service is RM50.90\n");
       				priceVaccine=priceVaccine +50.90;
       				break;
       		case 3: System.out.println("The service chosen is Hospitalization");
       				System.out.println("The charge for this service is RM90.00\n");
       				priceHospitalize=priceHospitalize +90.00;
       				break;
       		case 4: System.out.println("The service chosen is Heartworm Prevention");
       				System.out.println("The charge for this service is RM30.00\n");
       				priceHeartworm= priceHeartworm+30.00;
       				break;
       		case 5: System.out.println("The service chosen is Boarding");
       				System.out.println("The charge for this service is RM100.00\n");
       				priceBoarding=priceBoarding +100.00;
       				break;
       		case 6: System.out.println("The service chosen is Dentistry");
       				System.out.println("The charge for this service is RM34.00\n");
       				priceDentistry=priceDentistry +34.00;
       				break;
       		case 7: System.out.println("The service chosen is X-rays");
       				System.out.println("The charge for this service is RM25.00\n");
       				priceXrays=priceXrays +25.00;
       				break;
       		case 8: System.out.println("The service chosen is Laboratory Work");
       				System.out.println("The charge for this service is RM40.00\n");
       				priceLabWork=priceLabWork +6.90;
       				break;
       		case 9: System.out.println("The service chosen is Prescriptions");
       				System.out.println("The charge for this service is RM45.50\n");
       				pricePrescription=pricePrescription +45.50;
       				break;
       		default:System.out.println(" ");
           }

		 	loop=loop+1; //update
		}
		//calculate total charge
		totalAmount = priceOvisit+priceVaccine+priceHospitalize+priceHeartworm+priceBoarding+priceDentistry+priceXrays+priceLabWork+pricePrescription;

        //display total amaount service charges
        System.out.println("Total amount of the services charges is "+totalAmount);

    }
}
