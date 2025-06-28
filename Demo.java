class Demo{

	static {
		System.out.println("static block added");
	}

public void input()
{
	 a=20;
	 b=20;
}

public void output()
{

System.out.println("A value is "+a);

}

public static void main (String args[])
{
	Demo d =new Demo();
	d.input();
	d.output();

	
}
}
