package example3;


public class Lambdaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunInter add = (a,b) -> a+b; 
		FunInter mul = (a,b) -> a*b; 
		FunInter sub = (a,b) -> a-b; 
		FunInter div = (a,b) -> a/b; 
		{
			System.out.println(add.operation(6,3));
			System.out.println(mul.operation(6,3));
			System.out.println(sub.operation(6,3));
			System.out.println(div.operation(6,3));
		    System.out.println("This is lambda");
		
		}
	}

}
