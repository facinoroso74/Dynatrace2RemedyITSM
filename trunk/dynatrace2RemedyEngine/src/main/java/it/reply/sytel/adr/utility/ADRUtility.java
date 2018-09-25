package it.reply.sytel.adr.utility;

public class ADRUtility {

	
	
	public static String getDescrizioneFromIncidentType(String incidentType) {
		int lastOccurrence = incidentType.lastIndexOf(" (");
		String descrizione = incidentType.substring(0, lastOccurrence);
		return descrizione;
	}
}
