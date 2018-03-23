package it.reply.sytel.adr.services.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class IncidentTypeConfigurationException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3067862786330844497L;

	public IncidentTypeConfigurationException(String message, int errorCode, Throwable cause, int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
		// TODO Auto-generated constructor stub
	}

	public IncidentTypeConfigurationException(String message, int errorCode, Throwable cause) {
		super(message, errorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public IncidentTypeConfigurationException(String message, int errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}

	public IncidentTypeConfigurationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IncidentTypeConfigurationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
