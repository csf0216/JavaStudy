package com.test.IOTest;

import java.io.File;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("file.ecodeing", "UTF-8");
		System.out.println(System.getProperty("file.encoding"));
		CharTest.test();
		File node = new File("C:\\Users\\wangmin\\work\\Study\\Java\\IOTest\\test.txt");
		FileTest ft = new FileTest(node);
		ft.printNodesUnderThis();
		ft.readFileOnByteBuf();
		ft.readFileOnCharBuf();

	}

}
