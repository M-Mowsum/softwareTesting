import static org.junit.Assert.*;

import org.junit.Test;

public class GradeIPT {

	
///////////////////////getGrade: Independent Path Testing ///////////////////////////
	   @Test
	   public void test1() {
	         GradeCalculator  test1=new GradeCalculator();
	         String output1=test1.getGrade(15,2,30,2);//=49
	         assertEquals("F",output1);
	   }
	   @Test
	   public void test2() {
	         GradeCalculator  test2=new GradeCalculator();
	         String output2=test2.getGrade(20,2,30,3);//=50
	         assertEquals("C",output2);
	   }
	   @Test
	   public void test3() {
	         GradeCalculator  test3=new GradeCalculator();
	         String output3=test3.getGrade(20,8,35,2);//=65 (failed)
	         assertEquals("B",output3);
	   }
	   @Test
	   public void test4() {
	         GradeCalculator  test4=new GradeCalculator();
	         String output4=test4.getGrade(25,7,40,3); //=75 (failed)
	         assertEquals("A",output4);
	   }
	   @Test
	   public void test5() {
	         GradeCalculator  test5=new GradeCalculator();
	         String output5=test5.getGrade(30,7,45,3); //=85 (failed)
	         assertEquals("A+",output5);
	   }
	   @Test
	   public void test6() {
	         GradeCalculator  test6=new GradeCalculator();
	         String output6=test6.getGrade(15,2,30,3);//=50
	         assertEquals("F",output6);
	   }
	   
///////////////////////getGPA: Independent Path Testing ///////////////////////////	   
	   
	   private static final double delta = 1e-15; 
	   @Test
	   public void test7() {
	         GradeCalculator  test7=new GradeCalculator(); 
	         double output7=test7.getGPA("F");
	         assertEquals(0.0,output7,delta);
	   }
	   @Test
	   public void test8() {
	         GradeCalculator  test8=new GradeCalculator(); 
	         double output8=test8.getGPA("C");
	         assertEquals(2.00,output8,delta);
	   }
	   @Test
	   public void test9() {
	         GradeCalculator  test9=new GradeCalculator(); 
	         double output9=test9.getGPA("B");            //// (failed)
	         assertEquals(3.00,output9,delta);
	   }
	   @Test
	   public void test10() {
	         GradeCalculator  test10=new GradeCalculator(); 
	         double output10=test10.getGPA("A");           /// (failed)
	         assertEquals(3.50,output10,delta);
	   }
	   @Test
	   public void test11() {
	         GradeCalculator  test11=new GradeCalculator(); 
	         double output11=test11.getGPA("A+");          /// (failed)
	         assertEquals(4.00,output11,delta);
	   }

}
