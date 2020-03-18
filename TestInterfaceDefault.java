interface Showable{
	default void msg(){System.out.println(" Showable default method");} 
}

interface Drawable1{    
default void msg(){System.out.println("Drawable default method");}  
} 


class TestInterfaceDefault implements Showable,Drawable1{  
	
	
public static void main(String args[]){  
Drawable1 d=new TestInterfaceDefault();  
  
d.msg();  
}}

// if our class extends two different classes , if those two classes having the same method (eg : void msg()) . 
// if our main class extends these two classes , then compiler will confuse which metho it has to call 
