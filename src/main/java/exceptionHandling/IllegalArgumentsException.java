package exceptionHandling;

public class IllegalArgumentsException extends RuntimeException{

	public IllegalArgumentsException() {
		super();
	}

	public IllegalArgumentsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IllegalArgumentsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalArgumentsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalArgumentsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
