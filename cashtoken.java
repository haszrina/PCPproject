import java.util.*;
public class cashtoken {

    public static void main(String[] args)
    {
        //declaration
        int loop;
        int cash1 =0;
        int cash2 =0;
        int cash3 =0;
        int cash4 =0;
        int cash5 =0;
        int totalCashAmount;
        char levelCode;
		String levelStudy;

        //input object
        Scanner console = new Scanner(System.in);

		//display cash token based on level of study
		System.out.println("Level Code | Level of Study ");
        System.out.println("----------------------------");
        System.out.println("   F       |   Foundation   ");
        System.out.println("   D       |    Diploma     ");
        System.out.println("   B       |    Bachelor    ");
        System.out.println("   M       |     Master     ");
        System.out.println("   P       |   	  PhD       ");
        System.out.println("----------------------------");

        //while loop
		loop=1;
        while(loop<=2345)
        {
          //prompt for level code
	      System.out.print("\nPlease enter your level code(F/D/B/M/P): ");
	      levelCode=console.next().charAt(0);

	      //if statement
       	  if (levelCode == 'F')
	      {
	         levelStudy = "Foundation";
	         cash1 = 50;
	      }
	      else if (levelCode == 'D')
	      {
	         levelStudy = "Diploma";
	         cash2 = 50;
	      }
	      else if (levelCode == 'B')
	      {
	         levelStudy = "Bachelor";
	         cash3 = 70;
	      }
	      else if (levelCode == 'M')
	      {
	         levelStudy = "Master";
	         cash4 = 90;
	      }
	      else if(levelCode == 'P')
	      {
	         levelStudy = "PhD";
	         cash5 = 90;
	      }
	      else
	      {
	      	//System.out.print("\nInvalid level code ");
	      }

   		  loop=loop+1;
   	   }
   	   //calculate total cash amount
   	   totalCashAmount =  cash1 + cash2 + cash3 + cash4 + cash5;

   	   //display total cash amount
   	   System.out.print("\nThe total cash amount is  "+totalCashAmount);
}

}
