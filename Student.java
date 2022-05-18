class Student{

	int roll;
	String name; 
	int marks;
	
	void displayStudentDetails(int roll, String name,int marks){
	
	System.out.println("Roll is :"+roll);
	System.out.println("Name is :"+name);
	System.out.println("Marks is :"+marks);

	}

	public static void main(String[] args){

	Student s1 = new Student();
	
	Student s2 = new Student();
	
	s1.displayStudentDetails(1234,"Shubham Singh",500);
	
	s1 = null;
	s2 = null;
	
	}


}