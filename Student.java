
public class Student {
	public final String status = "STUDENT"; 
	public String name; 
	private double tution; 
	private int studentID; 
	public String major; 
	
	public void whatDoesStudentLearn(String major){
		System.out.print("The Student Learns"+major); 
	}

	public Student() {
		super();
	}

}
