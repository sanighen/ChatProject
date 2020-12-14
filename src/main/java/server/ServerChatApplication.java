package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import lib.Action;
import lib.Connection;
import lib.Message;

public class ServerChatApplication {

	public static final int PORT = 7777;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket serverSocket = new ServerSocket(PORT);

		Connection con = new Connection(serverSocket.accept());

		System.out.println("SERVER >>> client sent: " + con.fetch());
//        con.send(new Message("Hello back"));
		con.send(new Action("CONFIRMED"));
	}

}
