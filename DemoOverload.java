public class DemoOverload{

	
	int sum(int x)
	{
		return x;
	}
	int sum(int x ,int y)
	{
		return x+y;
	}
	int sum(int x ,int y,int z)
	{
		return x+y+z;
	}
	int sum(int a ,int b,int c,int d)
	{
		return a+b+c+d;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoOverload d=new DemoOverload();
		int a=d.sum(10,20);
		int b=d.sum(10, 20, 60);
		int c=d.sum(10);
		
		System.out.println(" x value  "+c);
		System.out.println("Sum of two numbers "+a);
		System.out.println("Sum of three numbers "+b);
		
	}

}