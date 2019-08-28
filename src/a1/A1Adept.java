package a1;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        
		
		// Your code follows here.
		
		int numitems = scan.nextInt();
		String [] namefruit = new String[numitems];
		double [] prices = new double[numitems];
	    
		for(int m=0; m < numitems; m++)
		{
			namefruit[m]= scan.next();
			prices[m] = scan.nextDouble();
		}
		int customeramount = scan.nextInt();
		double [] totalprice = new double[customeramount];
		
		String [] names = new String[customeramount];
		for(int i=0; i < customeramount; i++)
		{  
			String first = scan.next();
			String last = scan.next();
			
			names[i]  = first + " " + last;
			int amountfruit = scan.nextInt();
			double priceofone = 0; 
			
			for(int j = 0; j< amountfruit; j++) {
			int num1 = scan.nextInt();
			String fruit = scan.next();
			int fruitindex = 0;
				for(int n = 0; n < numitems ;n++)
				{
					if (fruit.equals(namefruit[n]))
					fruitindex = n;
				}
			double price1 = prices[fruitindex];
			priceofone = price1 * num1 + priceofone;
			}
                        totalprice[i] = priceofone;
					
			}
		int min = 0; 
		double comparep = 111111111;
		for(int h = (customeramount - 1); h >= 0  ; h --)
	        {
	    
	    		if (comparep > totalprice[h])
	        	min= h;
	        	comparep = totalprice[h];
	    	
	        }
		  
			
			
		int max =  0;
		double comparep2 = 0.0;
		for(int s = 0; s < customeramount ; s ++)
		{
		    
		    if (totalprice[s] < comparep2)
		        max= s;
		        comparep2 = totalprice[s];
	        }
		
		double totalforall = 0;
		
		for(int o = 0; o < totalprice.length; o++)
		{
			totalforall = totalprice[o] + totalforall;
		}
		double avg = totalforall / customeramount;
		System.out.println("Biggest:" + " " + names[max] + " (" + String.format("%.2f", totalprice[max]) + ")");
		System.out.println("Smallest:" + " " + names[min] + " (" + String.format("%.2f", totalprice[min]) + ")");
		System.out.println("Average: " + String.format("%.2f", avg));
		}
	}



