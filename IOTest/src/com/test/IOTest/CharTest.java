package com.test.IOTest;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharTest {

	static void  test() {
		String s = "ÄãºÃ";
		try {
			System.out.println(Arrays.toString(s.getBytes("UTF-16")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
