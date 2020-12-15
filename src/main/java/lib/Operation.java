package lib;

public enum Operation {

	SIGN_IN("Sign In"),
	SIGN_OUT("Sign Out"),
	SEND_MESSAGE("Hello");

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
