package core_java;

//person interface
interface Person {
	
	public void speak();

}


//Student class 
class Student implements Person {

	//override speak() method
	@Override
	public void speak() {
		System.out.println("Student is speaking");
	}
	
}

class Teacher implements Person {

	//override speak() method
	@Override
	public void speak() {
		System.out.println("Teacher is speaking");
	}
	
}

public class PersonInterface {
	public static void main(String[] args) {
		//create instance of Student class
		Student student =  new Student();
		//create instance of Teacher class
		Teacher teacher = new Teacher();
		
		//call methods
		student.speak();
		teacher.speak();
	}
}


//Output :-

/*
Student is speaking
Teacher is speaking
*/
