import java.util.Scanner;

public class HelloWorld
{

	public static void main(String[] args)
	{
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.print("Please enter you name: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		HelloUser user = new HelloUser(input);
		
		user.greetUser();
	}

}
