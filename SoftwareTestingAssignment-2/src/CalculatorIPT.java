import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

///////////////////////Calculator Class Independent Path Testing ///////////////////////////

public class CalculatorIPT {
	
	@Test
	   public void test1() {
	         Caculator  test1=new Caculator();
	         int output1=test1.add(1, 2); 
	         assertEquals(3,output1);
	   }
	   @Test
	   public void test2() {
	         Caculator  test2=new Caculator();
	         int output2=test2.add(1,2,3); 
	         assertEquals(6,output2);
	   }
	   @Test
	   public void test3() {
		   Caculator  test3=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(1);
			lst.add(2);
			lst.add(3);
			int output3=test3.add(lst);
			assertEquals(6,output3);
	   }
	   @Test
	   public void test4() {
	         Caculator  test4=new Caculator();
	         int output4=test4.subtract(1, 2);
	         assertEquals(-1,output4);
	   }
	   @Test
	   public void test5() {
	         Caculator  test5=new Caculator();
	         int output5=test5.divide(1, 2);
	         assertEquals(1/2,output5);          
	   }
	   @Test
	   public void test6() {
	         Caculator  test6=new Caculator();
	         int output6=test6.multiply(1, 2);
	         assertEquals(2,output6);
	   }
}
