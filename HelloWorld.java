import java.util.*;

public class HelloWorld
{

    public static void main(String[] args)
    {
       int loop;
       double totalLolly=0.0;
       double totalChoco=0.0;
       double totalIce=0.0;
       double totalTart=0.0;
       int option;

       Scanner scan=new Scanner (System.in);
       loop=1;
       while(loop<=4)
       {
       	System.out.println("-------------------Menu List-------------------");
       	System.out.println("<<Select 1: LollyPop, 2:Chocolate, 3: IceCream");
       	System.out.println("-----------------------------------------------");
       	System.out.println("Enter your option");
       	option=scan.nextInt();
       	switch(option)
       	{
       		case 1: System.out.println("Lolly Pop");
       				System.out.println("price is RM2.30 each");
       				totalLolly=totalLolly +2.30;
       				break;
       		case 2: System.out.println("Chocolate");
       				System.out.println("price is RM4.90 each");
       				totalChoco=totalChoco +4.90;
       				break;
       		case 3: System.out.println("Ice cream");
       				System.out.println("price is RM8.90 each");
       				totalIce=totalIce +8.90;
       				break;
       		case 4: System.out.println("Fruit Tart");
       				System.out.println("price is RM6.90 each");
       				totalTart=totalTart +6.90;
       				break;
       		default:System.out.println("Not in Menu List");
       	}
       	loop=loop+1;
       }
        System.out.println("Total selected menu based on 30 customer:>>>");
       	System.out.println("-----------------------------------------------");
       	System.out.println("Total for LollyPop: RM" +totalLolly);
       	System.out.println("Total for Chocolate: RM" +totalChoco);
       	System.out.println("Total for Ice cream: RM" +totalIce);
       	System.out.println("Total for Fruit tart: RM" +totalTart);
	}
}
