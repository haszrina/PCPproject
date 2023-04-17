import java.util.*;
public class finalMarks {
        
    public static void main(String[] args) {
        // TODO code application logic here
       
       	int finalMarks[]=new int[7];
       	int loop;
		Scanner scan=new Scanner (System.in);
		
		for(loop=0;loop<7;loop++)
		{
			System.out.println("Enter your marks");
			finalMarks[loop]=scan.nextInt();
		}
		
		for(loop=0;loop<7;loop++)
		{
			System.out.println(finalMarks[loop]);
		}
    }
}
