package tools;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {

	@Before("execution (* server.ServerChatApplication.main(..) )")
	public void beforeServerMain() {
		System.out.println("SERVER >>> starting\n");
	}

	@After("execution (* server.ServerChatApplication.main(..) )")
	public void afterServerMain() {
		System.out.println("\nSERVER >>> ending");
	}

	@Before("execution (* client.ClientChatApplication.main(..) )")
	public void beforeClientMain() {
		System.out.println("CLIENT >>> starting\n");
	}

	@After("execution (* client.ClientChatApplication.main(..) )")
	public void afterClientMain() {
		System.out.println("\nCLIENT >>> ending");
	}

}
