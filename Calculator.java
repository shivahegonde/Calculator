import java.util.*;
class Calculator{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No1:: ");
	int no1=sc.nextInt();
	System.out.println("Enter No1:: ");
	int no2=sc.nextInt();
	int add=Calculator.add(n1,n2);
	
	}
	
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	public static int div(int a,int b){
		return a/b;
	}		
}
