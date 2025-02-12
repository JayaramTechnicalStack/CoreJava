
class Parent
{
	
	
	public Parent(){}
	 void display()
	{
		System.out.println("Inside Parent Class");
	}
}

class Child extends Parent{

	Child(){}
	 void display()
	{
		System.out.println("Inside child Display");

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c =new  Child();
		
		 c.display();
		

	}

}
