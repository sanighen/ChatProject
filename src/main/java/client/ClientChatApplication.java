package client;

import java.io.IOException;

import lib.Action;
import lib.Connection;
import lib.Operation;
import server.ServerChatApplication;

public class ClientChatApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection con = new Connection("localhost", ServerChatApplication.PORT);

//		Message msg = new Message("Hello server!");
//		msg.setFrom(new User("Mister Author"));
//		msg.setTo(new User("Mister Reader"));

		con.send(new Action(Operation.SEND_MESSAGE));

		System.out.println("CLIENT >>> server sent: " + con.fetch());
	}

}
