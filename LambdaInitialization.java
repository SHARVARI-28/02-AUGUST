import java.util.Scanner;
import java.util.concurrent.Callable;

public class LambdaInitialization {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the first animal to be stored in callable array");
		String string1=sc.next();
		System.out.println("Enter the Second animal to be stored in callable array");
		String string2=sc.next();
		Callable<String> c=()->string1+ "\n"+ string2;
		System.out.println(c.call());
		sc.close();
	}
}
