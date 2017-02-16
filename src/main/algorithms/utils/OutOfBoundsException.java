package utils;


public class OutOfBoundsException extends Exception {

	private static final long serialVersionUID = 1L;

	/*
	 * Exception indicating that some form of indexing was out of bounds
	 */
	public OutOfBoundsException() { 
		super(); 
	}
	
	public OutOfBoundsException(String message) { 
		super(message); 
	}
	
	public OutOfBoundsException(String message, Throwable cause) { 
		super(message, cause); 
	}
	
	public OutOfBoundsException(Throwable cause) {
		super(cause); 
	}
}