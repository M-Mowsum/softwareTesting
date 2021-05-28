/* EQUIVALENCE CLASS TESTING OF CALCULATOR CLASS */

package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalculatorEquivalence {

/////////////////////////////ADD 2 input///////////////////////////////////////////////////////
		@Test
		public void test1() {
			Caculator  test1=new Caculator();
			int output1=test1.add(-1000, 0);
			assertEquals(-1000,output1);
		}
		@Test
		public void test2() {
			Caculator  test2=new Caculator();
			int output2=test2.add(0, -4000);
			assertEquals(-4000,output2);
		}
		@Test
		public void test3() {
			Caculator  test3=new Caculator();
			int output3=test3.add(2147483647, 3); 
			assertEquals(2147483650,output3);//////////ERROR outbound of integer range
		}
		@Test
		public void test4() {
			Caculator  test4=new Caculator();
			int output4=test4.add(3, 2147483647); 
			assertEquals(2147483650,output4);//////////ERROR outbound of integer range
		}
		@Test
		public void test5() {
			Caculator  test5=new Caculator();
			int output5=test5.add(-2147483647, 3); 
			assertEquals(-2147483644,output5);
		}
		@Test
		public void test6() {
			Caculator  test6=new Caculator();
			int output6=test6.add(-3, -2147483647); 
			assertEquals(-2147483650,output6); //////////ERROR outbound of integer range
		}
		 
/////////////////////////////ADD 3 input///////////////////////////////////////////////////////
		@Test
		public void test7() {
			Caculator  test7=new Caculator();
			int output7=test7.add(-2000,4000, 0);
			assertEquals(2000,output7);
		}
		@Test
		public void test8() {
			Caculator  test8=new Caculator();
			int output8=test8.add(0, -4000,8000);
			assertEquals(4000,output8);
		}
		@Test
		public void test9() {
			Caculator  test9=new Caculator();
			int output9=test9.add(2147483647, 0,3); 
			assertEquals(2147483650,output9);//////////ERROR outbound of integer range
		}
		@Test
		public void test10() {
			Caculator  test10=new Caculator();
			int output10=test10.add(103, 2147483647,-100); 
			assertEquals(2147483650,output10);//////////ERROR outbound of integer range
		}
		@Test
		public void test11() {
			Caculator  test11=new Caculator();
			int output11=test11.add(-2147483647, 3,4); 
			assertEquals(-2147483640,output11);
		}
		@Test
		public void test12() {
			Caculator  test12=new Caculator();
			int output12=test12.add(-3, -2147483647,-50); 
			assertEquals(-2147483700,output12); //////////ERROR outbound of integer range
		}
		@Test
		public void test13() {
			Caculator  test13=new Caculator();
			int output13=test13.add(103,-100, 2147483647); 
			assertEquals(2147483650,output13); //////////ERROR outbound of integer range
		}
		@Test
		public void test14() {
			Caculator  test14=new Caculator();
			int output14=test14.add(47,100, -2147483647); 
			assertEquals(-2147483500,output14); 
		}
/////////////////////////////ADD list///////////////////////////////////////////////////////
		@Test
		public void test15() {
			Caculator  test15=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(-2000);
			lst.add(4000);
			lst.add(0);
			int output15=test15.add(lst);
			assertEquals(2000,output15); 
		}
		@Test
		public void test16() {
			Caculator  test16=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(0);
			lst.add(-4000);
			lst.add(8000);
			int output16=test16.add(lst);
			assertEquals(4000,output16);
		}
		@Test
		public void test17() {
			Caculator  test17=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(2147483647);
			lst.add(0);
			lst.add(3);
			int output17=test17.add(lst); 
			assertEquals(2147483650,output17);//////////ERROR outbound of integer range
		}
		@Test
		public void test18() {
			Caculator  test18=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(103);
			lst.add(2147483647);
			lst.add(-100);
			int output18=test18.add(lst); 
			assertEquals(2147483650,output18);//////////ERROR outbound of integer range
		}
		@Test
		public void test19() {
			Caculator  test19=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(-2147483647);
			lst.add(3);
			lst.add(4);
			int output19=test19.add(lst); 
			assertEquals(-2147483640,output19);
		}
		@Test
		public void test20() {
			Caculator  test20=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(-3);
			lst.add(-2147483647);
			lst.add(-50);
			int output20=test20.add(lst); 
			assertEquals(-2147483700,output20); //////////ERROR outbound of integer range
		}
		@Test
		public void test21() {
			Caculator  test21=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(103);
			lst.add(-100);
			lst.add(2147483647);
			int output21=test21.add(lst); 
			assertEquals(2147483650,output21); //////////ERROR outbound of integer range
		}
		@Test
		public void test22() {
			Caculator  test22=new Caculator();
			List<Integer>lst=new ArrayList<Integer>();
			lst.add(47);
			lst.add(100);
			lst.add(-2147483647);
			int output22=test22.add(lst);
			assertEquals(-2147483500,output22); 
		}
		
///////////////////////////////subtract////////////////////////////////////////////////////
		@Test
		public void test23() {
			Caculator  test23=new Caculator();
			int output23=test23.subtract(-1000, 0);
			assertEquals(-1000,output23);
		}
		@Test
		public void test24() {
			Caculator  test24=new Caculator();
			int output24=test24.subtract(0, -4000);
			assertEquals(4000,output24);
		}
		@Test
		public void test25() {
			Caculator  test25=new Caculator();
			int output25=test25.subtract(2147483647, 3); 
			assertEquals(2147483644,output25);
		}
		@Test
		public void test26() {
			Caculator  test26=new Caculator();
			int output26=test26.subtract(3, 2147483647); 
			assertEquals(-2147483644,output26);
		}
		@Test
		public void test27() {
			Caculator  test27=new Caculator();
			int output27=test27.subtract(-2147483647, 3); 
			assertEquals(-2147483650,output27);/////////ERROR outbound of integer range
		}
		@Test
		public void test28() {
			Caculator  test28=new Caculator();
			int output28=test28.subtract(-3, -2147483647); 
			assertEquals(2147483644,output28); 
		}
		
/////////////////////////////Divide (2 input) //////////////////////////////////////////		
		@Test
		public void test29() {
			Caculator  test29=new Caculator();
			int output29=test29.divide(-1000, 0);
			assertEquals(1/0,output29); /////////ERROR 
		}
		@Test
		public void test30() {
			Caculator  test30=new Caculator();
			int output30=test30.divide(0, -4000);
			assertEquals(0,output30);
		}
		
		@Test
		public void test31() {
			Caculator  test31=new Caculator();
			int output31=test31.divide(2147483647, 3); 
			assertEquals(2147483647/3,output31);
		}
		
		@Test
		public void test32() {
			Caculator  test32=new Caculator();
			int output32=test32.divide(3, 2147483647); 
			assertEquals(3/2147483647,output32);
		}
		
		@Test
		public void test33() {
			Caculator  test33=new Caculator();
			int output33=test33.divide(-2147483647, 3); 
			assertEquals(-2147483647/3 ,output33);
		}
		
		@Test
		public void test34() {
			Caculator  test34=new Caculator();
			int output34=test34.divide(-3, -2147483647); 
			assertEquals(-3/-2147483647,output34); 
		}

////////////////////// Multiply (2 input) ///////////////////////////////////////////
		@Test
		public void test35() {
			Caculator  test35=new Caculator();
			int output35=test35.multiply(-1000, 0);
			assertEquals(0,output35);
		}
		@Test
		public void test36() {
			Caculator  test36=new Caculator();
			int output36=test36.multiply(0, -4000);
			assertEquals(0,output36);
		}
		@Test
		public void test37() {
			Caculator  test37=new Caculator();
			int output37=test37.multiply(2147483647, 3); 
			assertEquals(6442450941,output37);/////////ERROR outbound of integer range
		}
		@Test
		public void test38() {
			Caculator  test38=new Caculator();
			int output38=test38.multiply(3, 2147483647); 
			assertEquals(6442450941,output38);/////////ERROR outbound of integer range
		}
		@Test
		public void test39() {
			Caculator  test39=new Caculator();
			int output39=test39.multiply(-2147483647, 3); 
			assertEquals(-6442450941,output39);/////////ERROR outbound of integer range
		}
		@Test
		public void test40() {
			Caculator  test40=new Caculator();
			int output40=test40.multiply(-3, -2147483647); 
			assertEquals(6442450941,output40); /////////ERROR outbound of integer range
		}
}
