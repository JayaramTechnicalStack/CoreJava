class Hello{
	void getGreetings(){
	}
}
class Test{
	void getGreetings(){
	}
}

class Parent
{
	
	
	public Parent(){
System.out.println("Inside Parent constructor");

}
	 void display()
	{
		System.out.println("Inside Parent Class");
	}
}

class Child extends Parent{


	 void display()
	{
		System.out.println("Inside child Display");
		System.out.println("Inside child Display-2");

	}
	 void display2()
	{
		System.out.println("Inside child Display");

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c =new  Child();
		

		 p.display();
Parent p=new  Child();
		
		 p.display();

		 c.display();

		

	}

}
