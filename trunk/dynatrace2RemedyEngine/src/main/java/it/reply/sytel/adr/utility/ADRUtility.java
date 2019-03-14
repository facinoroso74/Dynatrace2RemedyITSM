package it.reply.sytel.adr.utility;

import it.reply.sytel.adr.utility.exc.ADRUtilityException;

public class ADRUtility {

	public static String getDescrizioneFromIncidentType(String incidentType) {
		try {
			int lastOccurrence = incidentType.lastIndexOf(" (");
			if(lastOccurrence==-1) 
				return incidentType;
			String descrizione = incidentType.substring(0, lastOccurrence);
			return descrizione;
			
		}catch (Exception e) {
			throw new ADRUtilityException("IncidentType:["+incidentType+"]",e);
		}
	}
	
//	public static void main(String[] args) {
//		
//		String incidentType="Tempo di esecuzione Query Scalo FCO";
//		
//		System.out.println(getDescrizioneFromIncidentType(incidentType));
//	}
}
