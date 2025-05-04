public class Munchies {

public static int FindMultiple(int num) {
int multiple = num * 5;
return multiple;

}

public static boolean isLeapYear(int num) {
 	if (num % 4 == 0) {

	return true;
}	else{
		return false;

}
	
}

public static int ComputerSumOfNumber(int num) {
int number1 = (num / 1000) % 10;
int number2 = (num / 100) % 10;
int number3 = (num / 10) % 10;
int number4 = (num / 1) % 10;

int total = number1 + number2 + number3 + number4;
return total;


}

public static String FindMultiplesOf7Not5(int num) {
if (num < 2000 || num > 3200) {
return "Wrong number";

} else if (num % 7 == 0) {
	if (num % 5 == 0) {
	return "number is divisible by 7";
}
	return "number is not a multiple of 5";
}
	return " ";

}



}