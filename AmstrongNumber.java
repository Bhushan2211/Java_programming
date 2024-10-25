package core_java;
import java.util.Scanner;

public class AmstrongNumber {
	
	public static boolean isAmstrong(int num) {
		int originalNum = num;
        int result = 0;
        
        //Logic for Amstrong Number
        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, 3);
            originalNum /= 10;
        }
        return result == num;
	}

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a number to check if it is an Armstrong number: ");
	       int num = scanner.nextInt();

	       //calling method
	       boolean result = isAmstrong(num);
	       
	       // print results
	       if (result) {
	            System.out.println(num + " is an Armstrong number.");
	        } else {
	            System.out.println(num + " is not an Armstrong number.");
	        }
	        scanner.close();


	}

}


// Output :-
// Enter a number to check if it is an Armstrong number: 153
// 153 is an Armstrong number.
