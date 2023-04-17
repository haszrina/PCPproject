import java.util.Scanner;    

public class grade2{
	
   public static void main(String[] args)
   {
   	  int ID,creditHour;
      double coursework, exam, pointer, totalMark;    // To hold a test score
      char grade, name, program;    // To hold a letter grade
 	  
      // Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);

	   // Get the test score.
	  System.out.print("\n\t\t Enter your name            : ");
	  name = console.next().charAt(0);
	  System.out.print("\t\t Enter your ID number       : ");
	  ID = console.nextInt();
	  System.out.print("\t\t Enter your program         : ");
	  program = console.next().charAt(0);
      System.out.print("\t\t Enter your coursework mark : ");
      coursework = console.nextDouble();
	  System.out.print("\t\t Enter your exam mark       : ");
	  exam = console.nextDouble();
	  System.out.print("\t\t Enter your credit hour     : ");
	  creditHour = console.nextInt();
	  
	  totalMark = coursework + exam;
	  
      // Calculate the grade.
          
	     if (totalMark >= 80)
	      {
	         grade = 'A';
	      }
	      else if (totalMark >= 60)
	      {
	         grade = 'B';
	      }
	      else if (totalMark >= 40)
	      {
	         grade = 'C';
	      }
	      else
	      {
	         grade = 'F';
	      }
     
      // Display the grade.
 	if (grade == 'A')
	      {
	         pointer = 4.00;
	      }
	      else if (grade == 'B')
	      {
	         pointer = 3.00;
	      }
	      else if (grade == 'C')
	      {
	         pointer = 2.00;
	      }
	      else
	      {
	         pointer = 0.00;
	      }

      System.out.print("\n\t\t\t\t\t\tUniversiti Kuala Lumpur\n\t");
      System.out.print("\t\t\t\tResult Slip Semester January 2020\n\t");
      System.out.print("\t------------------------------------------------------------\n");
      System.out.print("\t\t Name    : "+name);
   	  System.out.print("\n\t\t ID      : "+ID); 	  
   	  System.out.print("\n\t\t Program : "+program);
   	  System.out.print("\n\t\t-------------------------------------------------------------");
      System.out.print("\n\t\t\t\t\tCredit Hour\t\tGrade\t\tPointer\t\tTotalPt.\n\t");
      System.out.print("\t-------------------------------------------------------------");
      System.out.print("\n\t\t1. ISB10103      "+creditHour);
      System.out.print("\t         "+grade);
      System.out.print("\t        "+pointer); 
      System.out.print("\t        "); 
      System.out.print("\n\t\t-------------------------------------------------------------");
      System.out.print("\n\n\t\t     Total      ");
      System.out.print("\n\t\t                          GPA: ");
   }
}