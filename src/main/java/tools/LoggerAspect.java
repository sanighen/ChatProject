package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {

	@Before("execution (public static void server.ServerChatApplication.main(String[]) )")
	public void beforeServerMain() {
		System.out.println("SERVER >>> starting\n");
	}

	@After("execution (public static void server.ServerChatApplication.main(String[]) )")
	public void afterServerMain() {
		System.out.println("\nSERVER >>> ending");
	}

	@Before("execution (public static void client.ClientChatApplication.main(String[]) )")
	public void beforeClientMain() {
		System.out.println("CLIENT >>> starting\n");
	}

	@After("execution (public static void client.ClientChatApplication.main(String[]) )")
	public void afterClientMain() {
		System.out.println("\nCLIENT >>> ending");
	}

}
