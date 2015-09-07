package com.test;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bootstrapPath = System.getProperty("sun.boot.class.path");
		System.out.println("BootStrapClassLoader Path : " + bootstrapPath);
		String extPath = System.getProperty("java.ext.dirs");
		System.out.println("ExtClassLoader Path : " + extPath);
		String appPath = System.getProperty("java.class.path");
		System.out.println("AppClassLoader Path : " + appPath);
	}

}
