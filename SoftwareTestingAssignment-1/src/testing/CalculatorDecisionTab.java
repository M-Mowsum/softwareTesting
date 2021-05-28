package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalculatorDecisionTab {

/////////////////////////////Add(2 input)//////////////////////////////////////
	@Test
	public void test1() {
		Caculator  test1=new Caculator();
		int output1=test1.add(2, 2);
		assertEquals(4,output1);
	}
	@Test
	public void test2() {
		Caculator  test2=new Caculator();
		int output2=test2.add(2,2147483648); 
		assertEquals(2147483650,output2);/////////ERROR outbound of integer range
	}
	@Test
	public void test3() {
		Caculator  test3=new Caculator();
		int output3=test3.add(3,-2147483648); 
		assertEquals(-2147483645,output3);
	}
	@Test
	public void test4() {
		Caculator  test4=new Caculator();
		int output4=test4.add(2147483648,2); 
		assertEquals(2147483650,output4);/////////ERROR outbound of integer range
	}
	@Test
	public void test5() {
		Caculator  test5=new Caculator();
		int output5=test5.add(2147483648,2147483648); 
		assertEquals(4294967296,output5);/////////ERROR outbound of integer range
	}
	@Test
	public void test6() {
		Caculator  test6=new Caculator();
		int output6=test5.add(2147483648,-2147483648); 
		assertEquals(0,output6);/////////ERROR outbound of integer range
	}
	@Test
	public void test7() {
		Caculator  test7=new Caculator();
		int output7=test7.add(-2147483648,2); 
		assertEquals(-2147483646,output7);
	}
	@Test
	public void test8() {
		Caculator  test8=new Caculator();
		int output8=test8.add(-2147483648,2147483648); 
		assertEquals(0,output8);/////////ERROR outbound of integer range
	}
	@Test
	public void test9() {
		Caculator  test9=new Caculator();
		int output9=test9.add(-2147483648,-2147483648); 
		assertEquals(-4294967296,output9);/////////ERROR outbound of integer range
	}
////////////////////////////ADD(3 input)///////////////////////////////////////////////
	@Test
	public void test10() {
		Caculator  test10=new Caculator();
		int output10=test10.add(2,2,2);
		assertEquals(6,output10);
	}
	@Test
	public void test11() {
		Caculator  test11=new Caculator();
		int output11=test11.add(2147483648,2147483648,2147483648); 
		assertEquals(6442450950,output11);/////////ERROR outbound of integer range
	}
	@Test
	public void test12() {
		Caculator  test12=new Caculator();
		int output12=test12.add(-2147483648,-2147483648,-2147483648); 
		assertEquals(-6442450950,output12);/////////ERROR outbound of integer range
	}
	@Test
	public void test13() {
		Caculator  test13=new Caculator();
		int output13=test13.add(2,2147483648,2147483648); 
		assertEquals(4294967298,output13);/////////ERROR outbound of integer range
	}
	@Test
	public void test14() {
		Caculator  test14=new Caculator();
		int output14=test14.add(2,-2147483648,-2147483648); 
		assertEquals(-4294967294,output14);/////////ERROR outbound of integer range
	}
	@Test
	public void test15() {
		Caculator  test15=new Caculator();
		int output15=test15.add(2147483648,-2147483648,-2147483648); 
		assertEquals(-2147483648,output15);/////////ERROR outbound of integer range
	}
	@Test
	public void test16() {
		Caculator  test16=new Caculator();
		int output16=test16.add(-2147483648,2147483648,2147483648); 
		assertEquals(2147483648,output16);
	}
	@Test
	public void test17() {
		Caculator  test17=new Caculator();
		int output17=test17.add(2147483648,2,2); 
		assertEquals(2147483652,output17);/////////ERROR outbound of integer range
	}
	@Test
	public void test18() {
		Caculator  test18=new Caculator();
		int output18=test18.add(-2147483648,2,2); 
		assertEquals(-2147483644,output18);
	}	
	@Test
	public void test19() {
		Caculator  test19=new Caculator();
		int output19=test19.add(2147483648,-2147483648,2); 
		assertEquals(2,output19);/////////ERROR outbound of integer range
	}
////////////////////////////////Add (list)///////////////////////////////////////////
	@Test
	public void test20() {
		Caculator  test20=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(2);
		lst.add(2);
		lst.add(2);
		int output20=test20.add(lst);
		assertEquals(6,output20); 
	}
	@Test
	public void test21() {
		Caculator  test21=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(2147483648);
		lst.add(2147483648);
		lst.add(2147483648);
		int output21=test21.add(lst);
		assertEquals(6442450944,output21);//////////ERROR outbound of integer range
	}
	@Test
	public void test22() {
		Caculator  test22=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(-2147483648);
		lst.add(-2147483648);
		lst.add(-2147483648);
		int output22=test22.add(lst); 
		assertEquals(-6442450944,output22);//////////ERROR outbound of integer range
	}
	@Test
	public void test23() {
		Caculator  test23=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(2);
		lst.add(2147483648);
		lst.add(2147483648);
		int output23=test23.add(lst); 
		assertEquals(4294967298,output23);//////////ERROR outbound of integer range
	}
	@Test
	public void test24() {
		Caculator  test24=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(2);
		lst.add(-2147483648);
		lst.add(-2147483648);
		int output24=test24.add(lst); 
		assertEquals(-4294967294,output24);//////////ERROR outbound of integer range
	}
	@Test
	public void test25() {
		Caculator  test25=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(2147483648);
		lst.add(-2147483648);
		lst.add(-2147483648);
		int output25=test25.add(lst); 
		assertEquals(-2147483648,output25); //////////ERROR outbound of integer range
	}
	@Test
	public void test26() {
		Caculator  test26=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(-2147483648);
		lst.add(2147483648);
		lst.add(2147483648);
		int output26=test26.add(lst); 
		assertEquals(2147483648,output26); //////////ERROR outbound of integer range
	}
	@Test
	public void test27() {
		Caculator  test27=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(2147483648);
		lst.add(2);
		lst.add(2);
		int output27=test27.add(lst);
		assertEquals(2147483652,output27); //////////ERROR outbound of integer range
	}
	@Test
	public void test28() {
		Caculator  test28=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(-2147483648);
		lst.add(2);
		lst.add(2);
		int output28=test28.add(lst);
		assertEquals(-2147483644,output28); 
	}@Test
	public void test29() {
		Caculator  test29=new Caculator();
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(2147483648);
		lst.add(-2147483648);
		lst.add(2);
		int output29=test29.add(lst);
		assertEquals(2,output29); //////////ERROR outbound of integer range
	}

///////////////////////////// Subtraction (2 input) //////////////////////////////
	@Test
	public void test30() {
		Caculator  test30=new Caculator();
		int output30=test30.subtract(2, 2);
		assertEquals(0,output30);
	}
	@Test
	public void test31() {
		Caculator  test31=new Caculator();
		int output31=test31.subtract(2,2147483648); 
		assertEquals(-2147483646,output31);/////////ERROR outbound of integer range
	}
	@Test
	public void test32() {
		Caculator  test32=new Caculator();
		int output32=test32.subtract(3,-2147483648); 
		assertEquals(2147483651,output32);/////////ERROR outbound of integer range
	}
	@Test
	public void test33() {
		Caculator  test33=new Caculator();
		int output33=test33.subtract(2147483648,2); 
		assertEquals(2147483646,output33);/////////ERROR outbound of integer range
	}
	@Test
	public void test34() {
		Caculator  test34=new Caculator();
		int output34=test34.subtract(2147483648,2147483648); 
		assertEquals(0,output34);/////////ERROR outbound of integer range
	}
	@Test
	public void test35() {
		Caculator  test35=new Caculator();
		int output35=test35.subtract(2147483648,-2147483648); 
		assertEquals(4294967296 ,output35);/////////ERROR outbound of integer range
	}
	@Test
	public void test36() {
		Caculator  test36=new Caculator();
		int output36=test36.subtract(-2147483648,2); 
		assertEquals(-2147483650,output36);/////////ERROR outbound of integer range
	}
	@Test
	public void test37() {
		Caculator  test37=new Caculator();
		int output37=test37.subtract(-2147483648,2147483648); 
		assertEquals(-4294967296 ,output37);/////////ERROR outbound of integer range
	}
	@Test
	public void test38() {
		Caculator  test38=new Caculator();
		int output38=test38.subtract(-2147483648,-2147483648); 
		assertEquals(0,output38);
	}
	
//////////////////////////////////Division (2 input)//////////////////////////////////
	@Test
	public void test39() {
		Caculator  test39=new Caculator();
		int output39=test39.divide(2, 2);
		assertEquals(1,output39);
	}
	@Test
	public void test40() {
		Caculator  test40=new Caculator();
		int output40=test40.divide(2,2147483648); 
		assertEquals(2/2147483648,output40);/////////ERROR outbound of integer range
	}
	@Test
	public void test41() {
		Caculator  test41=new Caculator();
		int output41=test41.divide(3,-2147483648); 
		assertEquals(3/-2147483648,output41);
	}
	@Test
	public void test42() {
		Caculator  test42=new Caculator();
		int output42=test42.divide(2147483648,2); 
		assertEquals(1073741824,output42);/////////ERROR outbound of integer range
	}
	@Test
	public void test43() {
		Caculator  test43=new Caculator();
		int output43=test43.divide(2147483648,2147483648); 
		assertEquals(1,output43);/////////ERROR outbound of integer range
	}
	@Test
	public void test44() {
		Caculator  test44=new Caculator();
		int output44=test44.divide(2147483648,-2147483648); 
		assertEquals(-1 ,output44);/////////ERROR outbound of integer range
	}
	@Test
	public void test45() {
		Caculator  test45=new Caculator();
		int output45=test45.divide(-2147483648,2); 
		assertEquals(-1073741824,output45);
	}
	@Test
	public void test46() {
		Caculator  test46=new Caculator();
		int output46=test46.divide(-2147483648,2147483648); 
		assertEquals(-1 ,output46);/////////ERROR outbound of integer range
	}
	@Test
	public void test47() {
		Caculator  test47=new Caculator();
		int output47=test47.divide(-2147483648,-2147483648); 
		assertEquals(1,output47);
	}
//////////////////////Multiplication 2 input /////////////////////////////////
	@Test
	public void test48() {
		Caculator  test48=new Caculator();
		int output48=test48.multiply(2, 2);
		assertEquals(4,output48);
	}
	@Test
	public void test49() {
		Caculator  test49=new Caculator();
		int output49=test49.multiply(2,2147483648); 
		assertEquals(4294967296 ,output49);/////////ERROR outbound of integer range
	}
	@Test
	public void test50() {
		Caculator  test50=new Caculator();
		int output50=test50.multiply(3,-2147483648); 
		assertEquals(-6442450944,output50);
	}
	@Test
	public void test51() {
		Caculator  test51=new Caculator();
		int output51=test51.multiply(2147483648,2); 
		assertEquals(4294967296 ,output51);/////////ERROR outbound of integer range
	}
	@Test
	public void test52() {
		Caculator  test52=new Caculator();
		int output52=test52.multiply(2147483648,2147483648); 
		assertEquals(2147483648 *
				2147483648 ,output52);/////////ERROR outbound of integer range
	}
	@Test
	public void test53() {
		Caculator  test53=new Caculator();
		int output53=test53.multiply(2147483648,-2147483648); 
		assertEquals(2147483648 *
				-2147483648  ,output53);/////////ERROR outbound of integer range
	}
	@Test
	public void test54() {
		Caculator  test54=new Caculator();
		int output54=test54.multiply(-2147483648,2); 
		assertEquals(-4294967296 ,output54);
	}
	@Test
	public void test55() {
		Caculator  test55=new Caculator();
		int output55=test55.multiply(-2147483648,2147483648); 
		assertEquals(-2147483648 *
				2147483648,output55);/////////ERROR outbound of integer range
	}
	@Test
	public void test56() {
		Caculator  test56=new Caculator();
		int output56=test56.multiply(-2147483648,-2147483648); 
		assertEquals(4611686018427387904,output56);
	}
}
