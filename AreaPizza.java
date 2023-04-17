/**
 * @(#)AreaPizza.java
 *
 *
 * @hasz
 * @version 1.00 2020/2/28
 */
import java.util.*;
public class AreaPizza {
  
    public static void main(String[] args) {
      
      double diameter,r,areaPizza;
      
      System.out.println("Please enter the value of diameter:");
      Scanner scan=new Scanner(System.in);
      
      diameter= scan.nextDouble();
      
      r = diameter/2;
      areaPizza = 3.142 *(r*r);
      
      System.out.println("The total are of pizza is "+areaPizza);  
      System.out.println("-----@@@@@Thank You@@@@@-----");
    }
}
