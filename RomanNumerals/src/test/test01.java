package test;

import static org.junit.Assert.*;

import org.junit.Test;

import RomanNum.RomanNumerals;
public class test01 {

	@Test
	public void single_digit() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("I");
//		System.out.println(res);
		assertEquals(1,res);
	}
	@Test
	public void single_digit_V() {
	    RomanNumerals romanNum = new RomanNumerals();
	    int res = romanNum.convertRomanNumToInt("V");
	    assertEquals(5, res);
	}

	
	@Test
	public void two_digitSmaller() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("IX");
//		System.out.println(res);
		assertEquals(9,res);
	}
	@Test
	public void two_digitSmaller_XL() {
	    RomanNumerals romanNum = new RomanNumerals();
	    int res = romanNum.convertRomanNumToInt("XL");  
	    assertEquals(40, res);
	}
	

	
	@Test
	public void two_digitLarger() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("DX");
//		System.out.println(res);
		assertEquals(510,res);
	}
	@Test
	public void two_digitLargerLX() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("LX");
//		System.out.println(res);
		assertEquals(60,res);
	}
	
	//error expect=20 but res=0
	@Test
	public void two_digitSameNum() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("XX");
//		System.out.println(res);
		assertEquals(20,res);
	}
	
	//error expect=15 but res=-5
	@Test
	public void mul_digitSameNum() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("VVV");
//		System.out.println(res);
		assertEquals(15,res);
	}
	
	//error expect=26 but res=6
	@Test 
	public void mul_digitLargerThanTheRest() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("XXVI");
//		System.out.println(res);
		assertEquals(26,res);
	}
	
	//error expect=78 but res=54
	@Test 
	public void mul_digitLargestNum() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("LXXVIII");
//		System.out.println(res);
		assertEquals(78,res);
	}
	
	//Negative Test
	//error value is empty.
	@Test 
	public void not_romanNumerals() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("Z");
//		System.out.println(res);
	}
	
	//not error
	@Test 
	public void uisng_wrongRepeating() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("LL");
//		System.out.println(res);
		assertNotEquals(100, res);
	}
	
	//not error
	@Test 
	public void using_moreThanThreeRepeating() {
		RomanNumerals romanNum = new RomanNumerals();
		int res = romanNum.convertRomanNumToInt("IIII");
		System.out.println(res);
		assertNotEquals(4, res);
	}
}
