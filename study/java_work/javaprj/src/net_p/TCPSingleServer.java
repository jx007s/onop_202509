package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPSingleSender extends Thread{
	String name;
	DataOutputStream dos;
	
	TCPSingleSender(Socket socket) throws IOException {
		name = "["+InetAddress.getLocalHost()+"]";
		dos = new DataOutputStream(socket.getOutputStream());
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			
			while(dos!=null) {
				dos.writeUTF(name+sc.nextLine());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class TCPSingleReceiver extends Thread{
	
	DataInputStream dis;
	
	TCPSingleReceiver(Socket socket) throws Exception {
		dis = new DataInputStream(socket.getInputStream());
	}
	
	@Override
	public void run() {
		try {
			while(dis!=null) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class TCPSingleServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(7777);

		System.out.println("서버시작");
		
		Socket client = server.accept();
		System.out.println(client.getInetAddress()+" 접속");
		
		new TCPSingleSender(client).start();
		new TCPSingleReceiver(client).start();
	}

}
