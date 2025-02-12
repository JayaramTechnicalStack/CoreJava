
class Parent
{
	
	
	
	 void display()
	{
		System.out.println("Inside Parent Class");
		System.out.println("Inside Parent Class-2");
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
		

	}

}
