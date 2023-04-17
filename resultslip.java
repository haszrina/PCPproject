import java.util.*;
public class resultslip {
        
    public static void main(String[] args) {
       char name, program, grade;
       int coursework, exam, creditHour, totalCrHr;
       long ID;
       double pointer, totalPt, totalMark;
       totalCrHr=3;
       creditHour=3;
       
      Scanner console = new Scanner(System.in);

	  System.out.print("\n\t\t Enter your name            : ");
	  name = console.next().charAt(0);
	  System.out.print("Enter your ID number       : ");
	  ID = console.nextLong();
	  System.out.print("Enter your program         : ");
	  program = console.next().charAt(0);
      System.out.print("Enter your coursework mark : ");
      coursework = console.nextInt();
	  System.out.print("Enter your exam mark       : ");
	  exam = console.nextInt();
	  
	  totalMark = coursework + exam;
	  
          
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
	      
	      totalPt = creditHour * pointer;
	      
      System.out.print("\n\t\t\t\t\t\tUniversiti Kuala Lumpur\n\t");
      System.out.print("\t\t\t\tResult Slip Semester January 2020\n\t");
      System.out.print("\t------------------------------------------------------------\n");
      System.out.print("\t\t Name    :  "+name);
   	  System.out.print("\n\t\t ID      : "+ID); 	  
   	  System.out.print("\n\t\t Program : "+program);
   	  System.out.print("\n\t\t-------------------------------------------------------------");
      System.out.print("\n\t\t\t\t\tCredit Hour\t\tGrade\t\tPointer\t\tTotalPt.\n\t");
      System.out.print("\t-------------------------------------------------------------");
      System.out.print("\n\t\t1. ISB10103      "+creditHour);
      System.out.print("\t         "+grade);
      System.out.print("\t        "+pointer); 
      System.out.print("\t        "+totalPt); 
      System.out.print("\n\t\t-------------------------------------------------------------");
      System.out.print("\n\n\t\t  Total        "+creditHour);
      System.out.print("                                    "+totalPt);
      System.out.print("\n\n\t\t                         GPA: "+pointer);
   }
}
	
