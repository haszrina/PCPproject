import java.util.*;

public class cookiessale {
        
    
    public static void main(String[] args) {
        char cookiesName1, cookiesName2;
        int cookiesSold, totalNoCookies;
        double cookiesPrice, totalSales;
        cookiesPrice= 2.00;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Name of first cookies ");
	    cookiesName1=scan.next().charAt(0);
	    
	    System.out.println("No of cookies sold ");
	    cookiesSold=scan.nextInt();
	    
	    System.out.println("Name of second cookies ");
	    cookiesName2=scan.next().charAt(0);
	    
	    System.out.println("No of cookies sold ");
	    cookiesSold=scan.nextInt();
	    
	    System.out.println("------------------------ ");
	    
	    totalNoCookies = cookiesSold + cookiesSold;
		totalSales = totalNoCookies * cookiesPrice;
		
		System.out.println("The total sales is RM "+totalSales);
	    
	    	
    }
}
