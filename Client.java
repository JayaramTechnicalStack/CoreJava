public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		
		e.setEmpid(101);
		e.setEname("Jack");
		e.setSalary(10000.0);
		e.setEaddress("xyz@gmail.com");


		Employee e2=new Employee();
		
		e2.setEmpid(101);
		e2.setEname("Jack");
		e2.setSalary(10000.0);
		e2.setEaddress("xyz@gmail.com");
		System.out.println("Employee id is :"+e.getEmpid() + " Employee Name is :"+e.getEname() +
		"Employee Salary is :"+e.getSalary()+ " Employee Email-id is " +e.getEaddress());
		System.out.println("Employee id is :"+e2.getEmpid() + " Employee Name is :"+e2.getEname() +
		"Employee Salary is :"+e2.getSalary()+ " Employee Email-id is " +e2.getEaddress());
		
	}

}
