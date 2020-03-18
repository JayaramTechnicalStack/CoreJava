class Demo{

	int a;
	int b;
	

public void input()
{
	 a=10;
	 b=20;
}

public void output()
{

System.out.println("A value is "+a);
System.out.println("B value is "+b);
}

public static void main (String args[])
{
	Demo d =new Demo();
	d.input();
	d.output();
}
}