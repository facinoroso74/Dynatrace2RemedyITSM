package it.reply.sytel.adr.utility.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class ADRUtilityException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3490588914626490098L;

	public ADRUtilityException(String message, int errorCode, Throwable cause,
			int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
	}

	public ADRUtilityException(String message, int errorCode, Throwable cause) {
		super(message, errorCode, cause);
	}

	public ADRUtilityException(String message, int errorCode) {
		super(message, errorCode);
	}

	public ADRUtilityException(String message, Throwable cause) {
		super(message, cause);
	}

	public ADRUtilityException(String message) {
		super(message);
	}

}
