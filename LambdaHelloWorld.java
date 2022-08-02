import java.util.Scanner;

/* Write a program in Java to demonstrate Java 8 Lambda Expression

Step1: create Java main class LambdaHelloWorld

Step2: create a interface HelloWorld with a method hello

Step3: Implement the hello method in LambdaHelloWorld class using lambda expression by passing displayWord as parameter

Step4: Print the displayWord by calling hello method of LambdaHelloWorld class

Sample input1

Enter the word to be displayed

John

Sample output1

Hello John

Sample input2

Enter the word to be displayed

Micheal

Sample output2

Hello Micheal

*/


interface HelloWorld {
	public String hello(String display);
	
}
public class LambdaHelloWorld {
	public static void main(String[] args) {
		HelloWorld helloWorld=(display)->{
			return "Hello " + display;
			};
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Word to be displayed :");
			String displayWord=sc.nextLine();
		
			System.out.println(helloWorld.hello(displayWord));
		
	}

}
