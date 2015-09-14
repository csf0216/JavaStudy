package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer extends Thread {
	
	private int mPort;
	private ServerSocket mSock;
	private List<Socket> clients;
	public SocketServer(int port) {
		clients = new ArrayList<Socket>();
		mPort = port;
		}

	@Override
	public	void run() {
		String line;
		try {
			mSock = new ServerSocket(mPort,5);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		while (true) {
			try {
				Socket s = mSock.accept();
				System.out.println("accepted: "+s.getInetAddress().toString());
				synchronized (clients) {
					clients.add(s);
				}
				InputStreamReader isr = new InputStreamReader(s.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				while (!s.isClosed()&&(line = br.readLine()) != null) {
					System.out.println(line);
					bw.write(line);
				}
				bw.flush();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
