package core_java;

public class GreaterBetweenThree {
	
	public static void Greatest(int n1,int n2,int n3) {
		if(n1 >= n2 ) {
			System.out.println("Number 1 is Greater");
		}
		else if(n2 >= n3) {
			System.out.println("Number 2 is Greater");
		}else {
			System.out.println("Number 3 is Greater");
		}
	}

	public static void main(String[] args) {
	
		// Declaring Numbers
         int n1 = 10;
         int n2 = 30;
         int n3 = 20;
         
         //Calling method
         Greatest(n1, n2, n3);
	}

}


// Output :-
// Number 2 is Greater