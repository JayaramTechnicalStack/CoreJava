
class Parent
{
	
	
	
	 void display()
	{
		System.out.println("Inside Parent Class");
	}
}

class Child extends Parent{


	 void display()
	{
		System.out.println("Inside child Display");

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new  Child();
		
		 p.display();
Parent p=new  Child();
		
		 p.display();
		

	}

}
