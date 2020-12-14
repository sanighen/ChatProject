package lib;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connection {

	private Socket socket;

	public Connection(Socket socket) {
		this.socket = socket;
	}

	public Connection(String host, int port) throws UnknownHostException, IOException {
		this(new Socket(host, port));
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public void send(Object object) throws IOException {
		ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
		outputStream.writeObject(object);
		outputStream.flush();
	}

	public Object fetch() throws IOException, ClassNotFoundException {
		ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
		return inputStream.readObject();
	}

}
