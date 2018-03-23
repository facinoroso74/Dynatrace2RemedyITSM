package it.reply.sytel.adr.main;
import org.apache.xmlbeans.XmlException;

import noNamespace.DashboardreportDocument;
import noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet;
import noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet.Incidentoverviewrecords.Incidentoverviewrecord;

public class ProvaXML {
	

	private static String dashboardreportBuffer="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
			"<dashboardreport name=\"ADBM_TEST_REMEDY_INTEGRATION\" version=\"7.0.10.1010\" reportdate=\"2018-03-23T10:29:37.123+01:00\" description=\"\">\r\n" + 
			"  <source name=\"ADBM_TEST\">\r\n" + 
			"    <filters summary=\"last 24 hours\">\r\n" + 
			"      <filter>tf:Last24h</filter>\r\n" + 
			"    </filters>\r\n" + 
			"  </source>\r\n" + 
			"  <data>\r\n" + 
			"    <incidentsoverviewdashlet name=\"Incidents\" description=\"\" displaysource=\"Base\">\r\n" + 
			"      <source>\r\n" + 
			"        <filters summary=\"Incident Rules, last 24 hours\">\r\n" + 
			"          <filter>if:RULE?Agent Instrumentation Disabledif:RULE?Application Process Out-of-Memoryif:RULE?Application Process Unavailable (unexpected)if:RULE?Application Process Unhealthyif:RULE?Average response time degradedif:RULE?CURRENT_Q_DEPTHif:RULE?Database connection issueif:RULE?Failure rate too highif:RULE?Host Availabilityif:RULE?Host CPU Unhealthyif:RULE?Host Disk Unhealthyif:RULE?Host Memory Unhealthyif:RULE?Host Network Unhealthyif:RULE?JDBC Connection Pool Percent Usedif:RULE?JDBC Connection Pool Waiting Thread Countif:RULE?Potentially stuck Java VM detectedif:RULE?Response time degraded for slow requestsif:RULE?Status of the QMif:RULE?Thread Declared Hungif:RULE?Total GC Collection Time</filter>\r\n" + 
			"          <filter>tf:Last24h</filter>\r\n" + 
			"        </filters>\r\n" + 
			"      </source>\r\n" + 
			"      <incidentoverviewrecords structuretype=\"tree\">\r\n" + 
			"        <incidentoverviewrecord name=\"ADBM_TEST (10)\">\r\n" + 
			"          <incidentoverviewrecord name=\"Agent Instrumentation Disabled\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Application Process Out-of-Memory\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Application Process Unavailable (unexpected)\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Application Process Unhealthy\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"CURRENT_Q_DEPTH (9)\">\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_ANAGRAFICA] (ARAPPX02_QM_NUM_MSG_10@192.168.175.144) ARAPPX02_QM_NUM_MSG_10 upper bound exceeded\" start=\"2018-03-21T23:29:10.000+01:00\" source=\"ARAPPX02_QM_NUM_MSG_10@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_NAS] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T22:56:10.000+01:00\" duration=\"235380000\" end=\"2018-03-22T16:19:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_NAS] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-23T00:38:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_UFIS_ADR] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T19:29:10.000+01:00\" duration=\"247800000\" end=\"2018-03-22T16:19:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_UFIS_ADR] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-23T00:36:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_UFIS_TEST] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T22:10:10.000+01:00\" duration=\"238140000\" end=\"2018-03-22T16:19:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_UFIS_TEST] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-23T00:35:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;LM_QU_ADBM] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-12T00:47:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;TELEX_QU_ADBM] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T16:45:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
			"          </incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Database Agent Connection Issue\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Failure rate too high\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"JDBC Connection Pool Percent Used\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"JDBC Connection Pool Waiting Thread Count\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Potentially stuck Java VM detected\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Response time degraded\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Response time degraded for slow requests\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Status of the QM\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Thread Declared Hung\"></incidentoverviewrecord>\r\n" + 
			"          <incidentoverviewrecord name=\"Total GC Collection Time (1)\">\r\n" + 
			"            <incidentoverviewrecord name=\"Java Virtual Machine/Total GC Collection Time: Total GC Collection Time &lt;all-applications&gt; (WebSphere_ADBM_TEST[arappx03Cell01-app_adbm_mercuriox2]@mercurio) upper bound exceeded\" start=\"2018-03-23T03:00:20.000+01:00\" duration=\"10000\" end=\"2018-03-23T03:00:30.000+01:00\" source=\"WebSphere_ADBM_TEST[arappx03Cell01-app_adbm_mercuriox2]@mercurio &lt;all-applications&gt;\"></incidentoverviewrecord>\r\n" + 
			"          </incidentoverviewrecord>\r\n" + 
			"        </incidentoverviewrecord>\r\n" + 
			"      </incidentoverviewrecords>\r\n" + 
			"    </incidentsoverviewdashlet>\r\n" + 
			"  </data>\r\n" + 
			"</dashboardreport>";
	
	public static void main(String[] args) {
	
		try {
			DashboardreportDocument dashboardreportDocument = DashboardreportDocument.Factory.parse(dashboardreportBuffer);
			Incidentsoverviewdashlet[] incidentsoverviewdashletsArr= dashboardreportDocument.getDashboardreport().getData().getIncidentsoverviewdashletArray();

			if(incidentsoverviewdashletsArr.length!=0){
				Incidentoverviewrecord[] incidentoverviewrecordArray = incidentsoverviewdashletsArr[0].getIncidentoverviewrecords().getIncidentoverviewrecordArray();
				//devo ciclare opportunamente l'array incidentoverviewrecordArray
				//e prendere tutti i nodi che presentano gli attributi name e start
				//quando li trovo devo popolare la mappa
				
				
				System.out.println("---------FirstIncidentType:["+incidentsoverviewdashletsArr[0].getName()+"]----------------");
				System.out.println("---------DisplaySource:["+incidentsoverviewdashletsArr[0].getDisplaysource()+"]----------------");
				//loopOverIncidentoverviewrecordArray(dashboardName,"",dynatraceIncidentMap,incidentoverviewrecordArray[0].getIncidentoverviewrecordArray());
			}
			
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
