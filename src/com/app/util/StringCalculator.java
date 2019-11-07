package com.app.util;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {
	
	// add numbers found in an input string
	public static int addCase1(String numbers) {
		int sum = 0;
		final String _BLNKSTR = "";
		final String _DELIMTR = ",";

		if (numbers != null && !_BLNKSTR.equals(numbers)
				&& numbers.length() > 0) {
			String[] numArr = numbers.split(_DELIMTR);
			if (numArr != null && numArr.length > 0) {
				for (String num : numArr) {
					try {
						int numVal = Integer.valueOf(num).intValue();
						//System.out.println("numVal-" + numVal);
						sum += numVal;
					} catch (NumberFormatException ne) {}
				}
			}
		}

		return sum;
	}

	/**
	 * @param numbers
	 * @return
	 */
	public static int addCase2(String numbers) {
		// this function removes newline and then add the number in the string
		int sum = 0;
		final String _BLNKSTR = "";
		if (numbers != null && !_BLNKSTR.equals(numbers)
				&& numbers.length() > 0) {
			// remove new lines first
			numbers = removeNewLine(numbers);
			sum = addCase1(numbers);
		}

		return sum;
	}

	/**
	 * @param numbers
	 * @return
	 */
	public static int numberAddWithCustomDelimtr(String numbers) {
		// this function allows custom delimiter sent by //[delimiter]...\n
		int sum = 0;
		// 1. split the string with newline to identify delimiter string
		String[] inputStrArr = numbers.split("\n");
		
		String _DLMTR_STR = inputStrArr[0].substring(inputStrArr[0].indexOf("//")+2);
		String _INPUT_STR = inputStrArr[1];
		String _PATTRN = "";
		
		//System.out.println(_DLMTR_STR);
		//System.out.println(_INPUT_STR);
		
		// 2. Check if single delimiter or multiple delimiter
		if(_DLMTR_STR.length()==1) {
			_PATTRN = _DLMTR_STR;
		}else {
			// 3. multiple delimiter found hence add | in the regex
			for(int i=0; i<_DLMTR_STR.length(); i++) {
				_PATTRN = _PATTRN + _DLMTR_STR.charAt(i) + "|";
			}
		}
		
		Pattern pattern = Pattern.compile(_PATTRN);
		String[] strarr = pattern.split(numbers);
		
		for(String str : strarr) {
			try {
				int numVal = Integer.valueOf(str).intValue();
				if(numVal<0) {
					System.out.println("Error :: Negatives not allowed... the negative number found is " + numVal);
					break;
				}else if(numVal>1000) {
					System.out.println("Error :: Number greater than 1000 not allowed... the wrong input found is " + numVal);
					break;
				}
				sum += numVal;
			} catch (NumberFormatException ne) {}
		}
		return sum;
	}

	private static String removeNewLine(String inputStr) {
		String mdfiedStr = null;
		String _NWLINE = "\n";
		String _BLNKSTR = "";

		if (inputStr != null) {
			mdfiedStr = inputStr.replace(_NWLINE, _BLNKSTR);
		}

		return mdfiedStr;
	}

}
