package com.test.IOTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

	private File node;
	
	public FileTest(File in) {
		node = in;
	}
	
	public void printNodesUnderThis() {
		if(node.isDirectory()) {
			for(File f : node.listFiles()){
				System.out.println(f.getName());
			}
		}else {
			System.out.println(node.getName());
		}
	}
	
	public void readFileOnCharBuf() {
		String line;
		FileReader fr;
		BufferedReader br;
		try {
			try {
				fr = new FileReader(node);
				br = new BufferedReader(fr);
				try {
					while((line=br.readLine())!=null) System.out.println(line);
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					br.close();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readFileOnByteBuf() {
		byte[] b = new byte[1024];
		FileInputStream  fs;
		BufferedInputStream bs;
		try {
			fs = new FileInputStream(node);
			bs = new BufferedInputStream(fs);
			try {
				if(bs.read(b,0,1024)!=-1) {
					System.out.println(Arrays.toString(b));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
