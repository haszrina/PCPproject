import java.util.*;    //to allow Scanner object

public class Time {
        
    
    public static void main(String[] args) {
    	
         double second, minute, hour;     // from use statement in pseudocode
         
         System.out.println("Please enter time in second");   //from prompt statement
         Scanner scan=new Scanner(System.in);		// to allow input statement
         second=scan.nextDouble();				//from get statement – to input
         minute=second/60;					//formula
         hour=minute/60;					//formula
         System.out.println("The converted time in minute is "+minute);	//output statement
         System.out.println("The converted time in hour is "+hour);		//output statement
    }
}
