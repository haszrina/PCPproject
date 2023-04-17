import java.util.*;

public class optionPizza {

	public static void main(String[] args) {
		int  number=2;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter number :");
		number=sc.nextInt();

		switch(number){
		case 1: System.out.println ("Good morning\n");
		case 2:
		case 3: System.out.println ("Have a happy day\n");
				break;
		case 4: System.out.println ("Have a nice evening\n");
		}

	}
}