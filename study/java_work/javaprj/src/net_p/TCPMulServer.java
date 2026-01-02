package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class TCPMulServer {
	
	ArrayList<DataOutputStream> list;
	
	TCPMulServer() throws Exception {
		list = new ArrayList<DataOutputStream>();
		
		Collections.synchronizedList(list);
		
		
		ServerSocket server = new ServerSocket(7777);
		
		while(true) {
			new TCPMulReciever(server.accept()).start();
		}
	}
	
	void sendToAll(String msg) {
		list.stream().forEach(dd->{
			try {
				dd.writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	class TCPMulReciever extends Thread{
		String name;
		DataOutputStream dos;
		DataInputStream dis;
		
		TCPMulReciever(Socket socket) throws Exception {
			name = "["+socket.getInetAddress()+"]";
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
		}
		
		@Override
		public void run() {
			
			try {
				sendToAll(name+"입장");
				list.add(dos);
				sendToAll("접속자 수 : "+list.size());
				
				while(dis!=null) {
					
					sendToAll(dis.readUTF());
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				list.remove(dos);
				sendToAll(name+"퇴장");
				sendToAll("접속자 수 : "+list.size());
			}
			
		}
		
	}
	
	

	public static void main(String[] args) throws Exception {

		new TCPMulServer();

	}

}
