package it.reply.sytel.adr.dynatraceClient.exc;

import it.reply.sytel.adr.core.exc.CoreNestedException;

public class BuildMapDynatraceIncidentFromDashboardreportException extends CoreNestedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2402767237672342884L;

	public BuildMapDynatraceIncidentFromDashboardreportException(String message, int errorCode, Throwable cause,
			int errorCodeThrowable) {
		super(message, errorCode, cause, errorCodeThrowable);
	}

	public BuildMapDynatraceIncidentFromDashboardreportException(String message, int errorCode, Throwable cause) {
		super(message, errorCode, cause);
	}

	public BuildMapDynatraceIncidentFromDashboardreportException(String message, int errorCode) {
		super(message, errorCode);
	}

	public BuildMapDynatraceIncidentFromDashboardreportException(String message, Throwable cause) {
		super(message, cause);
	}

	public BuildMapDynatraceIncidentFromDashboardreportException(String message) {
		super(message);
	}

}
