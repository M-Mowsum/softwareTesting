package mutationTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeMutationTest {

	/////////////////////////////GetGrade Method Mutation test/////////////////////////////////////////
	@Test
	   public void test1() {
	         GradeMutation  test1=new GradeMutation();
	         String output1=test1.getGrade(30,10,45,5); //=90
	         assertEquals("A+",output1);
	   }
	   @Test
	   public void test2() {
	         GradeMutation  test2=new GradeMutation();
	         String output2=test2.getGrade(25,7,43,3); //=78 
	         assertEquals("A",output2);
	   }
	   @Test
	   public void test3() {
	         GradeMutation  test3=new GradeMutation();
	         String output3=test3.getGrade(20,8,35,2);//=65 
	         assertEquals("B",output3);
	   }
	   @Test
	   public void test4() {
	         GradeMutation  test4=new GradeMutation();
	         String output4=test4.getGrade(11,5,30,5);//=51
	         assertEquals("C",output4);
	   }
	   @Test
	   public void test5() {
	         GradeMutation  test5=new GradeMutation();
	         String output5=test5.getGrade(15,2,30,2);//=49
	         assertEquals("F",output5);
	   }

	   //////////////////////////getGPA Method Mutation Test/////////////////////////////////////////////
	   
	   private static final double delta = 1e-15;   
	   @Test
	   public void test6() {
	         GradeMutation  test6=new GradeMutation(); 
	         double output6=test6.getGPA("A-");         
	         assertEquals(4.00,output6,delta);
	   }
	   @Test
	   public void test7() {
	         GradeMutation  test7=new GradeMutation(); 
	         double output7=test7.getGPA("A+");             
	         assertEquals(3.50,output7,delta);
	   }
	   @Test
	   public void test8() {
	         GradeMutation  test8=new GradeMutation(); 
	         double output8=test8.getGPA("B-");             
	         assertEquals(3.00,output8,delta);
	   }
	   @Test
	   public void test9() {
	         GradeMutation  test9=new GradeMutation(); 
	         double output9=test9.getGPA("C-");
	         assertEquals(2.00,output9,delta);
	   }
	   @Test
	   public void test10() {
	         GradeMutation  test10=new GradeMutation(); 
	         double output10=test10.getGPA("Y");
	         assertEquals(0.0,output10,delta);
	   }

}
