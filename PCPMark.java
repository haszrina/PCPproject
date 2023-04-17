import java.util.*;

public class PCPMark {

    public static void main(String[] args)
    {
    	//declaration
        int loop;
        int finalMarks =0;
        int totalFinalMark;
        int averageMark;
        String gradeCategory;

        //input object
        Scanner console = new Scanner(System.in);

        //while loop
		loop=1;
        while(loop<=135)
        {
          //prompt for final marks
	      System.out.print("Please enter your Final Marks: ");
	      finalMarks=console.nextInt();

   		  loop=loop+1;
   	   }
		  //calculate total finalMark
   		  totalFinalMark = finalMarks+finalMarks;

   		  //display total finalMark
   	  	  System.out.print("Total final Marks is "+totalFinalMark);

   	  	  //calculate average mark
   	  	  averageMark = totalFinalMark/135;

		  //display average mark
   	  	  System.out.print("\nThe average mark is "+averageMark);

   	  	  //if statement for average total final Marks
       	  if (averageMark <=50)
	      {
	         gradeCategory = "Low";
	         System.out.print("\nGrade Category is  "+gradeCategory);
	      }
	      else if (averageMark <= 79)
	      	{
	       	 gradeCategory = "Good";
	       	 System.out.print("\nGrade Category is  "+gradeCategory);
	     	}
	      	else if (averageMark >=80)
	      	{
	         gradeCategory = "Excellent";
	         System.out.print("\nGrade Category is  "+gradeCategory);
	      	}
	      	else
	      	{
	      	  System.out.print("\nInvalid mark");
	      	}


    }
}
