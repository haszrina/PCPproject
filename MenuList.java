import java.util.*;

public class MenuList {
  
    public static void main(String[] args) {
      int menu_list;
      	
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter your menu list 1-4 : ");
      menu_list=sc.nextInt();
      
      switch (menu_list) {
      	case 1: System.out.println("Lolly pop");
      			break;
      	case 2: System.out.println("Chocolate");
      			break;
      	case 3: System.out.println("Ice cream");
      			break;
      	case 4: System.out.println("Fruit tart");
      			break;
      	default: System.out.println("not in the menu list");    	
      	}
      }
}
