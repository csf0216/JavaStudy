package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Socket s = new Socket();
		InetAddress addr;
		String line;
		startServer();
		try {
			addr = InetAddress.getByName("www.baidu.com");
			System.out.println("Ip address of baidu is "+addr.getHostAddress());
			try {
				s.connect(new InetSocketAddress(addr.getHostAddress(),80));
				InputStream is = s.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				while((line=br.readLine())!=null) System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void startServer() {
		Thread t = new SocketServer(81);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
