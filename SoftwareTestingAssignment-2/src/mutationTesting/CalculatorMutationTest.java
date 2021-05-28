package mutationTesting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalculatorMutationTest {

	@Test
	   public void test1() {
	         CalculatorMutation  test1=new CalculatorMutation();
	         int output1=test1.add(1,2); 
	         assertEquals(3,output1);
	   }
	   @Test
	   public void test2() {
	         CalculatorMutation  test2=new CalculatorMutation();
	         int output2=test2.add(1,2,3); 
	         assertEquals(6,output2);
	   }
	   @Test
	   public void test3() {
		   CalculatorMutation  test3=new CalculatorMutation();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(1);
			lst.add(2);
			lst.add(3);
			int output3=test3.add(lst);
			assertEquals(6,output3);
	   }
	   @Test
	   public void test4() {
	         CalculatorMutation  test4=new CalculatorMutation();
	         int output4=test4.subtract(1,2);
	         assertEquals(-1,output4);
	   }
	   
	@Test
	   public void test5() {
	         CalculatorMutation  test5=new CalculatorMutation();
	         int output5=test5.divide(1,2);
	         assertEquals(1/2,output5);
	   }
	   @Test
	   public void test6() {
	         CalculatorMutation  test6=new CalculatorMutation();
	         int output6=test6.multiply(1,2);
	         assertEquals(2,output6);
	   }

}
