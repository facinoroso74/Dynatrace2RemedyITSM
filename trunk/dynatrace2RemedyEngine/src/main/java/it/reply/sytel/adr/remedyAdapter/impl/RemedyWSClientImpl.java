package it.reply.sytel.adr.remedyAdapter.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.w3c.dom.Node;
import org.xmlsoap.schemas.soap.envelope.Body;
import org.xmlsoap.schemas.soap.envelope.Envelope;
import org.xmlsoap.schemas.soap.envelope.EnvelopeDocument;
import org.xmlsoap.schemas.soap.envelope.Header;

import hpdIncidentInterfaceCreateWSVIP.AuthenticationInfo;
import hpdIncidentInterfaceCreateWSVIP.AuthenticationInfoDocument;
import hpdIncidentInterfaceCreateWSVIP.CreateInputMap;
import hpdIncidentInterfaceCreateWSVIP.CreateRequestType;
import hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceDocument;
import hpdIncidentInterfaceCreateWSVIP.HelpDeskSubmitServiceResponseDocument;
import hpdIncidentInterfaceCreateWSVIP.ImpactType;
import hpdIncidentInterfaceCreateWSVIP.ReportedSourceType;
import hpdIncidentInterfaceCreateWSVIP.SedeIntType;
import hpdIncidentInterfaceCreateWSVIP.ServiceTypeType;
import hpdIncidentInterfaceCreateWSVIP.StatusType;
import hpdIncidentInterfaceCreateWSVIP.UrgencyType;
import it.reply.sytel.adr.common.ws.HTTPClient;
import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.domain.RemedyConfiguration;
import it.reply.sytel.adr.remedyAdapter.RemedyClient;
import it.reply.sytel.adr.remedyAdapter.exc.RemedyBadValueFieldException;
import it.reply.sytel.adr.remedyAdapter.exc.RemedyWSClientException;
import it.reply.sytel.adr.vo.DynatraceIncident;

public class RemedyWSClientImpl implements RemedyClient{

	private HTTPClient sharedHTTPClient;
	private String encoding;
	private String userToken="";
	private String soapAction="";

	private org.apache.logging.log4j.Logger log = LogManager.getLogger(getClass());

	@Override
	public String createIncident(DynatraceIncident dynatraceIncident,RemedyConfiguration remedyConfiguration,Configuration incidentTypeconfiguration){
		
		checkNullValueImpact(ImpactType.Enum.forString(incidentTypeconfiguration.getImpact()),incidentTypeconfiguration.getImpact());
		checkNullValueUrgency(UrgencyType.Enum.forString(incidentTypeconfiguration.getUrgency()),incidentTypeconfiguration.getUrgency());
				
		AuthenticationInfoDocument authenticationInfoDocument = AuthenticationInfoDocument.Factory.newInstance();
		AuthenticationInfo authenticationInfo = authenticationInfoDocument.addNewAuthenticationInfo();
		authenticationInfo.setUserName(remedyConfiguration.getUsername());
		authenticationInfo.setPassword(remedyConfiguration.getPassword());
		
		HelpDeskSubmitServiceDocument helpDeskSubmitServiceDocument = HelpDeskSubmitServiceDocument.Factory.newInstance();
		
		CreateInputMap createInputMap = helpDeskSubmitServiceDocument.addNewHelpDeskSubmitService();
		createInputMap.setFirstName(remedyConfiguration.getFirst_name());
		createInputMap.setLastName(remedyConfiguration.getLast_name());
		createInputMap.setImpact(ImpactType.Enum.forString(incidentTypeconfiguration.getImpact()));
		createInputMap.setUrgency(UrgencyType.Enum.forString(incidentTypeconfiguration.getUrgency()));
		
		createInputMap.setReportedSource(ReportedSourceType.Enum.forString(remedyConfiguration.getReported_source()));
		
		createInputMap.setServiceType(ServiceTypeType.Enum.forString(remedyConfiguration.getService_type()));
		
		createInputMap.setStatus(StatusType.Enum.forString(remedyConfiguration.getStatus()));
		
		createInputMap.setAction(remedyConfiguration.getAction());
		
		createInputMap.setCreateRequest(CreateRequestType.Enum.forString(remedyConfiguration.getCreate_request()));
		
		createInputMap.setNotes(dynatraceIncident.getDynatraceIncidentKey().getName());
//		createInputMap.setSummary(incidentTypeconfiguration.getIdEvento());
		createInputMap.setSummary(".");
		createInputMap.setClassificazione(incidentTypeconfiguration.getSummary());
		
		createInputMap.setSistemaSorgente(incidentTypeconfiguration.getSorgenteSistema());
		
		createInputMap.setSedeInt(SedeIntType.Enum.forString(remedyConfiguration.getSede_int()));
		
		createInputMap.setHPDCI(incidentTypeconfiguration.getHpdci());
		
//		createInputMap.setCategorizationTier1(incidentTypeconfiguration.getCategorizationTier1());
//		createInputMap.setCategorizationTier2(incidentTypeconfiguration.getCategorizationTier2());
//		createInputMap.setCategorizationTier3(incidentTypeconfiguration.getCategorizationTier3());
//		
		
		//Sede_int
		
		
		//add optional attributes
//		createInputMap.setAssignedGroup(arg0);
//		createInputMap.setAssignedGroupShiftName(arg0);
//		createInputMap.setAssignedSupportCompany(arg0);
//		createInputMap.setAssignedSupportOrganization(arg0);
//		createInputMap.setAssignee(arg0);
//		createInputMap.setCategorizationTier1(arg0);
//		createInputMap.setCategorizationTier2(arg0);
//		createInputMap.setCategorizationTier3(arg0);
//		createInputMap.setCIName(arg0);
//		createInputMap.setClasse(arg0);
//		createInputMap.setClassificazione(arg0);
//		createInputMap.setClosureManufacturer(arg0);
//		createInputMap.setClosureProductCategoryTier1(arg0);
//		createInputMap.setClosureProductCategoryTier2(arg0);
//		createInputMap.setClosureProductCategoryTier3(arg0);
//		createInputMap.setClosureProductModelVersion(arg0);
//		createInputMap.setClosureProductName(arg0);
//		createInputMap.setCreateRequest(arg0);
//		createInputMap.setDepartment(arg0);
//		createInputMap.setDirectContactFirstName(arg0);
//		createInputMap.setDirectContactLastName(arg0);
//		createInputMap.setDirectContactMiddleInitial(arg0);
//		createInputMap.setHPDCI(arg0);
		//....
		
		log.debug("Exception on helpDeskSubmitServiceDocument:["+helpDeskSubmitServiceDocument.xmlText()+"]");
		
		String remedyTicketID = callRemedy(createInputMap,authenticationInfo);
		
		return remedyTicketID;
	}
	
//	private void checkNullValueStatus(StatusType.Enum forString,String valueSearched) {
//		if(forString==null)
//			throw new RemedyBadValueFieldException("Value ["+valueSearched+"] Not allowed for Remedy Ticket Field:[Status]");
//	}
//	
//	private void checkNullValueReportedSource(ReportedSourceType.Enum forString,String valueSearched) {
//		if(forString==null)
//			throw new RemedyBadValueFieldException("Value ["+valueSearched+"] Not allowed for Remedy Ticket Field:[ReportedSource");
//	}
//
	private void checkNullValueImpact(ImpactType.Enum forString,String valueSearched) {
		if(forString==null)
			throw new RemedyBadValueFieldException("Value ["+valueSearched+"] Not allowed for Remedy Ticket Field:[Impact]");
	}
	private void checkNullValueUrgency(UrgencyType.Enum forString,String valueSearched) {
		if(forString==null)
			throw new RemedyBadValueFieldException("Value ["+valueSearched+"] Not allowed for Remedy Ticket Field:[Ugency]");
	}
//	
//	private void checkNullValueServiceType(ServiceTypeType.Enum forString,String valueSearched) {
//		if(forString==null)
//			throw new RemedyBadValueFieldException("Value ["+valueSearched+"] Not allowed for Remedy Ticket Field:[ServiceType]");
//	}
	

	private String callRemedy(CreateInputMap createInputMap,AuthenticationInfo authenticationInfo) {

		try {

			EnvelopeDocument envelopeToSend =  buildEnvelope(encoding,createInputMap,authenticationInfo);
	
			log.info("EnvelopeToSend sent to Remedy:["+envelopeToSend.toString()+"]");
	
			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);

			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
		
			byte[] bytes = IOUtils.toByteArray(inputStream);

			
			log.info("Return from Remedy :["+new String(bytes)+"]");

			return getResponse(bytes);
		
		} catch (Exception e) {
			
			throw new RemedyWSClientException("Exception on calling Remedy WS. CreateInputMap:["+createInputMap.xmlText()+"]",e);
		}
	}
	
	public String getResponse(byte[] bytes){

		try {
			log.info("Starting gettting Remedy Response");
			
			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
	
			HelpDeskSubmitServiceResponseDocument helpDeskSubmitServiceResponseDocument = HelpDeskSubmitServiceResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
	
			String incidentNumber = helpDeskSubmitServiceResponseDocument.getHelpDeskSubmitServiceResponse().getIncidentNumber();
			
			log.info("incidentNumber: ["+incidentNumber+"]");
	
			if(incidentNumber==null || incidentNumber.equals(""))
				throw new RemedyWSClientException("The Remedy Incident Number is NULL");
			
			return incidentNumber;
			
		}catch (Exception e) {
			throw new RemedyWSClientException("Exception on getting the RemedyResponse",e);
		}
	}


	private EnvelopeDocument buildEnvelope(String encoding2, CreateInputMap createInputMap,AuthenticationInfo authenticationInfo) {
		
		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
		Envelope envelope = envDoc.addNewEnvelope();

		addHeader(envelope, authenticationInfo);
		addBody(envelope,createInputMap);

		envDoc.documentProperties().setEncoding(encoding);
		return envDoc;
	}

	private void addHeader(Envelope envelope, AuthenticationInfo authenticationInfo) {

		Header header = envelope.addNewHeader();
		
		Node node = header.getDomNode();
		Node nodeToImport = authenticationInfo.getDomNode();
		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
		node.appendChild(nodeToAppend);
	}
	
	private void addBody(Envelope envelope, CreateInputMap createInputMap) {

		Body body = envelope.addNewBody();
		Node node = body.getDomNode();
		Node nodeToImport = createInputMap.getDomNode();
		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
		node.appendChild(nodeToAppend);
	}
	
	
	public HTTPClient getSharedHTTPClient() {
		return sharedHTTPClient;
	}

	public void setSharedHTTPClient(HTTPClient sharedHTTPClient) {
		this.sharedHTTPClient = sharedHTTPClient;
	}
	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getSoapAction() {
		return soapAction;
	}

	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}

	

}
