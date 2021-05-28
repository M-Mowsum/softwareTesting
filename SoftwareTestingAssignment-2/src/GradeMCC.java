import static org.junit.Assert.*;

import org.junit.Test;

public class GradeMCC {

/////////////////////////////getGrade Method : Multiple Condition Coverage///////////////////////////////////////////////////////
   @Test
   public void test1() {
         GradeCalculator  test1=new GradeCalculator();
         String output1=test1.getGrade(30,10,45,5); //=90 (Failed)
         assertEquals("A+",output1);
   }
   @Test
   public void test2() {
         GradeCalculator  test2=new GradeCalculator();
         String output2=test2.getGrade(25,7,43,3); //=78 (Failed)
         assertEquals("A",output2);
   }
   @Test
   public void test3() {
         GradeCalculator  test3=new GradeCalculator();
         String output3=test3.getGrade(20,8,35,2);//=65 (Failed)
         assertEquals("B",output3);
   }
   @Test
   public void test4() {
         GradeCalculator  test4=new GradeCalculator();
         String output4=test4.getGrade(11,5,30,5);//=51
         assertEquals("C",output4);
   }
   @Test
   public void test5() {
         GradeCalculator  test5=new GradeCalculator();
         String output5=test5.getGrade(15,2,30,2);//=49
         assertEquals("F",output5);
   }
/////////////////////////////getGPA Method : Multiple Condition Coverage///////////////////////////////////////////////////////   

   private static final double delta = 1e-15;   
   @Test
   public void test6() {
         GradeCalculator  test6=new GradeCalculator(); 
         double output6=test6.getGPA("A+");         ////(Failed)
         assertEquals(4.00,output6,delta);
   }
   @Test
   public void test7() {
         GradeCalculator  test7=new GradeCalculator(); 
         double output7=test7.getGPA("A");             ////(Failed)
         assertEquals(3.50,output7,delta);
   }
   @Test
   public void test8() {
         GradeCalculator  test8=new GradeCalculator(); 
         double output8=test8.getGPA("B");             ////(Failed)
         assertEquals(3.00,output8,delta);
   }
   @Test
   public void test9() {
         GradeCalculator  test9=new GradeCalculator(); 
         double output9=test9.getGPA("C");
         assertEquals(2.00,output9,delta);
   }
   @Test
   public void test10() {
         GradeCalculator  test10=new GradeCalculator(); 
         double output10=test10.getGPA("F");
         assertEquals(0.0,output10,delta);
   }
}
