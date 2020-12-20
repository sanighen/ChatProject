package client;

import java.io.IOException;
import java.util.Scanner;

import lib.Action;
import lib.Connection;
import lib.Operation;
import lib.User;
import server.ServerChatApplication;

public class ClientChatApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection con = new Connection("localhost", ServerChatApplication.PORT);

//		Scanner in = new Scanner(System.in);
		
//		User user = new User(in.next());
		
		User user = new User("Kolea");
		
		con.send(new Action(Operation.SIGN_IN, user));
		
//		System.out.println("CLIENT >>> server sent: " + con.fetch());
		
		Action action = (Action) con.fetch();
		
		if (action.getType().equals(Operation.SUCCESS))
			System.out.println("CLIENT >>> server sent: Signed in");
		
		con.send(new Action(Operation.USER_LIST));
		
		System.out.println(action.getType());
		
	}

}
