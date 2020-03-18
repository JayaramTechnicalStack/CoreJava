public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		
		e.setEmpid(101);
		e.setEname("Jack");
		e.setSalary(10000.0);
		e.setEaddress("xyz@gmail.com");
		
		System.out.println("Employee id is :"+e.getEmpid() + " Employee Name is :"+e.getEname() +
		"Employee Salary is :"+e.getSalary()+ " Employee Email-id is " +e.getEaddress());
		
	}

}
