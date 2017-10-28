
public class Professor {
	protected String name; 
	protected String deptName; 
	private int numOfYearsInCollege; 
	private boolean tenure = false; 
	
	public void whatDoesTheProfessorTeach(String teaches){
		System.out.print("The Professor teaches"+teaches); 
	}
	
	Professor(){
		super(); // calls the constructor class
	}

}
