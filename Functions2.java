import java.util.Scanner;
public class Functions2 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);


	System.out.print("Enter a number: ");
	int num = input.nextInt();


	Munchies munchies = new Munchies();


	//System.out.println(Munchies.FindMultiple(num));
	//System.out.println(Munchies.isLeapYear(num));
	//System.out.println(Munchies.ComputerSumOfNumber(num));
	System.out.println(Munchies.FindMultiplesOf7Not5(num));


}

}