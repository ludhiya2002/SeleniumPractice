package employee;

public class Employee {
	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void basicSalary(int a[]) {
		for(int x:a)
			System.out.println(x);
	}
	public void allowances(int b[] ) {
	    for(int x:b)
	    	System.out.println(x);
	    	
	}
	public void totalPay(int a[],int b[]) {
		for(int i=0;i<a.length;i++) {
			int total=a[i]+b[i];
			System.out.println(total);
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101,"ludhiya");
		int[] basic = {30000,40000,50000};
		int[] allowance = {100,200,500};
		System.out.println("Basic Salary:");
		e.basicSalary(basic);
		
		System.out.println("Allowance:");
		e.allowances(allowance);
		
		System.out.println("Total Pay:");
		e.totalPay(basic,allowance);
	}

}
