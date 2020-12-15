package lib;

public enum Operation {

	SIGNIN("Sign In"),
	SIGNOUT("Sign Out"),
	SENDMESSAGE("Hello");

	private String action;

	private Operation(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	@Override
	public String toString() {
		return "Operation [" + "action='" + action + '\'' + ']';
	}

}
