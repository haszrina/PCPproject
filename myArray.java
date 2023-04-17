import java.util.*;
public class myArray {
	
	public static void main(String[] args){
		
		int noArray[]=new int[12];
		int loop;
		Scanner scan=new Scanner (System.in);
		for(loop=0;loop<12;loop++)
		{
			System.out.println("Enter your number>>>");
			noArray[loop]=scan.nextInt();
		}
		
		System.out.println("You entered your number>>>");
		for(loop=0;loop<12;loop++)
		{
			System.out.println(noArray[loop]);
		}
	}
}
