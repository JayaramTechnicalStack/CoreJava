
public class Final
{
	final int speedlimit;
static {
		System.out.println("inside static block");

	}
	
	Final()
	{
		speedlimit=100;
		System.out.println(speedlimit);
	}

	Final(int speed)
	{
		speedlimit=100;
		System.out.println(speedlimit);
	}
	public static void main(String args[]){ 
	
		Final f=new Final();
		Final f = new Final(100);
		Final f = new Final(100);
		
	}
	
}
