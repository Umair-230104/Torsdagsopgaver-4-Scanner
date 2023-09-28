import java.util.Scanner;

// 2.a 
public class UserRetirement
{

	public static void main(String[] args) 
	{
		// 2.c
		Scanner scanner = new Scanner(System.in); 

		// 2.b
		System.out.println(" Please type your name "); 
		
		// 2.d
		String name = scanner.nextLine();

		// 2.e
		System.out.println("Hey " + " " + name + " " + " Please type your age "); 

		// 2.f
		int age = scanner.nextInt();
		//int age = Integer.parseInt(scanner.nextLine());

		//2.g
		System.out.println(age);

		// 2.h
		int yearsToRetirement = 67-age; 

		System.out.println(" You can retire after " + yearsToRetirement + " years ");

	}
}