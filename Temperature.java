/**
 * @(#)Temperature.java
 *
 *
 * @hasz
 * @version 1.00 2020/2/28
 */
import java.util.*;
public class Temperature {
   
    public static void main(String[] args) {
        
        double Fahrenheit,Celsius;
        System.out.println("Please enter the value of temperature from Fahrenheit >");
        Scanner scan=new Scanner(System.in);
        Fahrenheit= scan.nextDouble();
        Celsius =((Fahrenheit-32)* 5/9);
        
        System.out.println("-------------------------------------");
        System.out.println("Converted Temperature in Celsius is :"+Celsius);
        System.out.println("-------------------------------------");
    }
}
