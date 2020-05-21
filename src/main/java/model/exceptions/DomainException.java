package model.exceptions;

public class DomainException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public DomainException(String msg) {
		super(msg);
	}
}
