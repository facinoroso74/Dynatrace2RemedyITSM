package it.reply.sytel.adr.quartz.exc;

public class CheckStatusJobQuartzException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3590648658123288598L;

	public CheckStatusJobQuartzException() {
		super();
	}

	public CheckStatusJobQuartzException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CheckStatusJobQuartzException(String message, Throwable cause) {
		super(message, cause);
	}

	public CheckStatusJobQuartzException(String message) {
		super(message);
	}

	public CheckStatusJobQuartzException(Throwable cause) {
		super(cause);
	}

}
