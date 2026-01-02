package net_p;

import java.net.Socket;

public class TCPSingleClient {

	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("192.168.0.36", 7777);
		System.out.println("클라이언트 -> 서버 연결");

		new TCPSingleSender(socket).start();
		new TCPSingleReceiver(socket).start();
	}

}
