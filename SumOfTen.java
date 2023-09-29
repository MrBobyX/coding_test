package appicat;
import java.util.*;

//WAP to find sum of 10 integers and print the sum with a proper SOP statement.
//using for loop

public class SumOfTen {

	public static void main(String[] args) {
		
		//taking scanner to take input from user
	 Scanner Sc = new Scanner(System.in);	
	 int total =0;
	 
	 //using for loop to calculated the sum of ten numbers
	 for(int i=1; i<=10; i++) {
		 System.out.println("enter integers"+ i + "; ");
		 int num = Sc.nextInt();
		 total += num;
	 }
	 
	 System.out.println("the sum of 10 number is: " + total);
	 Sc.close();
		
		
		
		
	}

}
