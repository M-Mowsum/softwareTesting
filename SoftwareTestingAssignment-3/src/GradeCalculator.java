
public class GradeCalculator {

	public String getGrade(int mid, int ct, int finalExam, int attendance) {
		int total = mid+ct+finalExam+attendance;
		String grade = "";
		if(total >= 80) {
			grade = "A+";
		}
		else if(total >=70) {
			grade = "A";
		}
		else if (total >= 60) {
			grade = "B";
		}
		else if (total >= 50) {
			grade = "C";
		} 
		if (total <= 50) {
			grade = "F";
		}
		return grade;
	}

	/*
	 * grade will bet one of the followings - A+, A, B, C and F.
	 * 
	*/
	public double getGPA(String grade) {
		
		double gpa = 0.0;
		if(grade == "A+") {
			gpa = 4.00;
		}
		else if(grade == "A") {
			gpa = 3.50;
		}
		else if(grade == "B") {
			gpa = 3.00;
		}
		else if(grade == "C") {
			return 2.00;
		} else {
			gpa = 0.0;
		}
		return gpa;
	}
	
	/////////////////// Main Method for Debugging Purpose ////////////////
	/*
   public static void main(String[] args) {
		
		System.out.println("Debug Calculator");
		GradeCalculator g=new GradeCalculator();
		//System.out.println(g.getGrade(30, 10, 45, 5));    // For getGrade method
		//System.out.println(g.getGPA("A+"));               // For getGPA method
   }
   */
}
