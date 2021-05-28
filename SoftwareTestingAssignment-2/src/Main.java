
public class Main {
	static double gp = 0.0;
	public static double getx(String grade) {
		if(grade == "C") {
			return 2.00;
		 }
		return gp;
	  }
	public static void main(String[] args) {
		System.out.println("Software Testing Assignment");
		/*GradeCalculator  test1=new GradeCalculator();
		String x=test1.getGrade(30, 10, 45, 5);
		System.out.println(x);
		double y=test1.getGPA(x);
		System.out.println(y);*/
		System.out.println(getx("C"));
		
	}
}
