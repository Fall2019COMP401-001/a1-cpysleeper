package a1;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        
		
		// Your code follows here.
		
		int customeramount = scan.nextInt();
		
		double [] total_price = new double[customeramount];
		String [] names = new String[customeramount];
		String [] namesl = new String[customeramount];
		
		for(int i=0; i < customeramount; i++)
		{  
			String first = scan.next();
			String last = scan.next();
			names[i]  = first.substring(0,1) + ". " + last;
			int amount_fruit = scan.nextInt();
			double pricetotal = 0; 
			
			for(int j=0; j< amount_fruit; j++) {
			int num1 = scan.nextInt();
			String fruit = scan.next();
			double price1 = scan.nextDouble();
			pricetotal = price1 * num1 + pricetotal;
			}
                total_price[i] = pricetotal;
					
			}
		
		for(int s = 0; s < customeramount ; s ++)
		    {
		    System.out.println(names[s] + ":" + " " + String.format("%.2f", total_price[s])); 
		    }
			
		}
	}



