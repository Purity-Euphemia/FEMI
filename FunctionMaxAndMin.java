public class FunctionMaxAndMin{
public static int[] MaxiAndMiniClassWork(int[] number){

	int largestNumber = number[0];
	int smallestNumber = number[0];
	int total = 0;	

for(int count = 0; count < number.length; count++){
	if(number[count] > largestNumber){
	largestNumber = number[count];
}
	if(number[count] < smallestNumber){
	smallestNumber = number[count];
	

}
	total = largestNumber - smallestNumber;
	
	
}
	int[] range = new int[1];
	range[0] = total;
	return range ;
}
}