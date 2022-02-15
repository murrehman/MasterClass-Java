package com.kata;


public class kata {
	
	  public static String subtractSum (int n) {
		    
		    String[] fruits = {
						"kiwi",
						"pear",
						"kiwi",
						"banana",
						"melon",
						"banana",
						"melon",
						"pineapple",
						"apple",
						"pineapple",
						"cucumber",
						"pineapple",
						"cucumber",
						"orange",
						"grape",
						"orange",
						"grape",
						"apple",
						"grape",
						"cherry",
						"pear",
						"cherry",
						"pear",
						"kiwi",
						"banana",
						"kiwi",
						"apple",
						"melon",
						"banana",
						"melon",
						"pineapple",
						"melon",
						"pineapple",
						"cucumber",
						"orange",
						"apple",
						"orange",
						"grape",
						"orange",
						"grape",
						"cherry",
						"pear",
						"cherry",
						"pear",
						"apple",
						"pear",
						"kiwi",
						"banana",
						"kiwi",
						"banana",
						"melon",
						"pineapple",
						"melon",
						"apple",
						"cucumber",
						"pineapple",
						"cucumber",
						"orange",
						"cucumber",
						"orange",
						"grape",
						"cherry",
						"apple",
						"cherry",
						"pear",
						"cherry",
						"pear",
						"kiwi",
						"pear",
						"kiwi",
						"banana",
						"apple",
						"banana",
						"melon",
						"pineapple",
						"melon",
						"pineapple",
						"cucumber",
						"pineapple",
						"cucumber",
						"apple",
						"grape",
						"orange",
						"grape",
						"cherry",
						"grape",
						"cherry",
						"pear",
						"cherry",
						"apple",
						"kiwi",
						"banana",
						"kiwi",
						"banana",
						"melon",
						"banana",
						"melon",
						"pineapple",
						"apple",
						"pineapple",
				};
				
				
				
				String fluit = "apple";
				int temp = n;
				int sum = 0;
				int rem = 0;
				
		    
//		     if(n <10 && n>=10000){
//		       return "apple";
//		 		}

				while(temp!=0)
				{
					rem = temp%10;
					sum+= rem;
					temp = temp/10;	
				}
				
					n = n - sum;
					System.out.println(n);
					
					
					if(n>100) 
						return "";
						
					return fluit;
					
					
					
					
					
					
					
					
//					for(int i=1; i<fruits.length;i++) { 
//						if(i == n)
//						  fruit = fruits[i-1];
//						
//					}
//		    return fruit;
		  
		  
		}
}
