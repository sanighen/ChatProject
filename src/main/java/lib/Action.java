package lib;

import java.io.Serializable;

public class Action implements Serializable {

	private Operation type;
	private Object target;
	
	public Action(Operation type) {
		this.type = type;
	}

	public Action(Operation type, Object target) {
		this.type = type;
		this.target = target;
	}
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Operation getType() {
		return type;
	}

	public void setType(Operation type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Action [type=" + type + ", target=" + target + "]";
	}

}
