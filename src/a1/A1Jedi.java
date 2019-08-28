package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		

				
				int numitems = scan.nextInt();
				String [] namefruit = new String[numitems];
				double [] prices = new double[numitems];
				int [] countfruit = new int[numitems];
				int fruitindex = 0;
				for(int l=0; l < numitems ; l ++)
				{
					countfruit[l] = 0;
				}
			    
				int [] countcus = new int[numitems];
				
				for(int l=0; l < numitems ; l ++)
				{
					countcus[l] = 0;
				}
				
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
					
					int [] temp = new int[numitems];
					for(int j = 0; j< amountfruit; j++) {
						
					int num1 = scan.nextInt();
					String fruit = scan.next();
					
					
					
						for(int n = 0; n < numitems ;n++)
						{
							if (fruit.equals(namefruit[n]))
							fruitindex = n;
						}
						
						
						
					countfruit[fruitindex] = num1 + countfruit[fruitindex];
					temp[fruitindex] = 1;
						
					double price1 = prices[fruitindex];
					priceofone = price1 * num1 + priceofone;
					
					}
					for (int k=0; k<numitems; k++) {
						countcus[k] += temp[k];
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
				
				
				
				
				
			for(int x = 0; x < numitems; x++ )
			{
				if (countfruit[x] == 0)
					System.out.println("No customers bought " + namefruit[x]);
				else
					System.out.println(countcus[x] + " customers bought " + countfruit[x] + " " + namefruit[x]);
			}
				
	
	
	}
			




	
}
