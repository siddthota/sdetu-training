package labs;

public class NewStudentAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentAcct stud1 = new StudentAcct("533123634", "Josh", "Amore");
		StudentAcct stud2 = new StudentAcct("512431432", "Steve", "Kenneth");
		StudentAcct stud3 = new StudentAcct("953421435", "Sid", "Thota");
	
		stud1.enroll("Math");
		stud1.enroll("Science");
		stud1.enroll("Java");
		stud1.payTuition(600);
		stud1.checkBalance();
		stud1.showCourses();
		System.out.println(stud1.toString());

	}

}

class StudentAcct {
	
	private String emailId;
	private String ssn;
	private static int iD = 1000;
	private String userId;
	private String fname;
	private String lname;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	private int payFee = 0;
	
	public StudentAcct(String ssn, String fname, String lname ) {
		this.ssn = ssn;
		this.fname = fname;
		this.lname = lname;
		iD++;
		setEmail();
		createUserId();
		
	}
	
	private void setEmail() {
		this.emailId = fname.toLowerCase() + "_" + lname.toLowerCase() + "" + iD + "" + "@college.edu";
		System.out.println("Email id is: " + this.emailId);
	}
	
	public String getEmail() {
		return emailId;
	}
	
	
	public void createUserId() {
	
		int min = 1001;
		int max = 9000;
		this.userId = iD + " " + (int) (Math.random() * ((max - min))) + " " + ssn.substring(4);
		System.out.println("User ID is: " + this.userId);
		
	}
	
	public void enroll(String courses) {
		this.courses = this.courses + "\n" + courses; 
		System.out.println("Successfully enrolled: " + this.courses);
		balance = balance + costOfCourse;			
	}
	
	public void payTuition(int paidFee) {
		checkBalance();
		this.payFee = this.payFee + paidFee;
		System.out.println("Student paid: " + this.payFee);
		balance = balance - this.payFee;
		
		
	}
	
	public void checkBalance() {
		System.out.println("The pending balance is: " + balance);
		
	}
	
	public void showCourses() {
		System.out.println("Courses enrolled by the student are: " + courses);
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + fname + " " + lname + " ]\n[Courses: " + courses + "]\n[Balance: " + balance + "]\n";
		
	}
	
	
	
	
}
