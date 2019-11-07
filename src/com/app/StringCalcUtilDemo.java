package com.app;

import com.app.util.StringCalculator;

public class StringCalcUtilDemo {

	public static void main(String[] args) {
		String testcase1 = "1,2,5";
		
		String testcase2a = "1\n,2,3";
		String testcase2b = "1,\n2,4";
		
		String testcase3a = "//$@#\n1$@@@@@2$3";
		String testcase3b = "//@\n2@3@8";
		String testcase3c = "//@\n-2@3@8";
		String testcase3d = "//@\n2000@3@8";
		String testcase3e = "//@\n3@3@@@@@@11@@4";
		
		
		System.out.println("Test Case 1:: sum is " + StringCalculator.addCase1(testcase1));
		
		System.out.println("Test Case 2a:: sum is " + StringCalculator.addCase2(testcase2a));

		System.out.println("Test Case 2b:: sum is " + StringCalculator.addCase2(testcase2b));
		
		/*System.out.println("Test Case 3a:: sum is " + StringCalculator.addCase3(testcase3a));
		System.out.println("Test Case 3b:: sum is " + StringCalculator.addCase3(testcase3b));
		System.out.println("Test Case 3c:: sum is " + StringCalculator.addCase3(testcase3c));
		System.out.println("Test Case 3d:: sum is " + StringCalculator.addCase3(testcase3d));
		System.out.println("Test Case 3e:: sum is " + StringCalculator.addCase3(testcase3e));*/
		
		System.out.println("Test Case 3a:: sum is " + StringCalculator.numberAddWithCustomDelimtr(testcase3a));
		System.out.println("Test Case 3b:: sum is " + StringCalculator.numberAddWithCustomDelimtr(testcase3b));
		System.out.println("Test Case 3c:: sum is " + StringCalculator.numberAddWithCustomDelimtr(testcase3c));
		System.out.println("Test Case 3d:: sum is " + StringCalculator.numberAddWithCustomDelimtr(testcase3d));
		System.out.println("Test Case 3e:: sum is " + StringCalculator.numberAddWithCustomDelimtr(testcase3e));


	}

}
