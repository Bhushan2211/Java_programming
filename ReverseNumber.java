package core_java;

public class ReverseNumber {
	
	public static int reverse(int no) {
		int rev = 0;
		//Logic for reverse the number
		while(no > 0 ) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		//return the reverse number
		return rev;
	}

	public static void main(String[] args) {
		
        int no = 123;
        // calling method
        int rev = reverse(no);
        //print the output
        System.out.println("Reverse of " + no + " is " + rev);
 
	}

}


// Output :-
// Reverse of 123 is 321