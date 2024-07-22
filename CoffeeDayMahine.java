

import java.util.Scanner;
 class CoffeeDayMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Select your beverage Iteam");

		System.out.println("1)coffee. 2)Tea. 3)milk. 4)hotwater.");
		
		Scanner sc=new Scanner(System.in);


		int beverage=sc.nextInt();
		
	 
	    //Switch statement  
	    switch(beverage){    
	    //case statements within the switch block 
	 
	    case 1: System.out.println("Please have Coffee");  
	    break;    
	    case 2: System.out.println("Please have Tea");  
	    break;    
	    case 3: System.out.println("Please have Milk");
	    break;    
	    case 4: System.out.println("Please have hotwater");  
	    break;   
	    case 5: System.out.println("Please have juice");  
	    break; 
	    case 6: System.out.println("Please have cooldirinks");  
	    break;
	    case 7: System.out.println("Please have hot drinks");  
	    break;
	    default:System.out.println("Invalid Option you have Enter, please choose valid option!");    
	    }     

	}

}
