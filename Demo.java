class Demo{

	static {
		System.out.println("static block added by sai parthap");
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
public void sub(){
int x = 10;
int y = 5;
int z = x-y;
System.out.println(z);
}

public static void main (String args[])
{
	Demo d =new Demo();
	d.input();
	d.output();

	
}
}
