package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import lib.Action;
import lib.Connection;
import lib.Message;
import lib.Operation;
import lib.User;

public class ServerChatApplication {

	public static final int PORT = 7777;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket serverSocket = new ServerSocket(PORT);

		Connection con = new Connection(serverSocket.accept());

		Map<Socket, User> users = new HashMap<>();

		Action action = (Action) con.fetch();

		User user = (User) action.getTarget();

		Action suc = new Action(Operation.SUCCESS, user);

		if (action.getType().equals(Operation.SIGN_IN)) {
			users.put(con.getSocket(), user);
			con.send(suc);
		}

		System.out.println("SERVER >>> client sent: " + action);

		Action act = (Action) con.fetch();

//		if (act.getType().equals(Operation.USER_LIST))
//			con.send(new Action(Operation.SUCCESS, users));
	}

}
