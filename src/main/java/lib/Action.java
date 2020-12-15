package lib;

import java.io.Serializable;

public class Action implements Serializable {

	private Operation type;

	public Action(Operation type) {
		this.type = type;
	}

	public Operation getType() {
		return type;
	}

	public void setType(Operation type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Action [type=" + type + "]";
	}
	
}
