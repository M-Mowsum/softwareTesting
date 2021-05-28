package mutationTesting;

public class GradeMutation {

	public String getGrade(int mid, int ct, int finalExam, int attendance) {
		int total = mid+ct+finalExam+attendance;
		String grade = "";
		if(total>85) {
			grade = "X";
		}
		if(total ==78) {
			grade = "A+";
		}
		if (total< 70) {
			grade = "B+";
		}
		if (total<60) {
			grade = "E";
		} 
		if (total == 49) {
			grade = "Z";
		}
		return grade;
	}

	/*
	 * grade will bet one of the followings - A+, A, B, C and F.
	 * 
	*/
	public double getGPA(String grade) {
		
		double gpa = 0.0;
		if(grade == "A-") {
			gpa = 7.00;
		}
		if(grade == "A+") {
			gpa = 4.00;
		}
		if(grade == "B-") {
			gpa = 2.50;
		}
		if(grade == "C-") {
			return 1.00;
		} else {
			gpa = 0.10;
		}
		return gpa;
	}
}
