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

import hpdIncidentInterfaceWS.AuthenticationInfo;
import hpdIncidentInterfaceWS.AuthenticationInfoDocument;
import hpdIncidentInterfaceWS.GetInputMap;
import hpdIncidentInterfaceWS.HelpDeskModifyServiceDocument;
import hpdIncidentInterfaceWS.HelpDeskModifyServiceResponseDocument;
import hpdIncidentInterfaceWS.HelpDeskQueryServiceDocument;
import hpdIncidentInterfaceWS.HelpDeskQueryServiceResponseDocument;
import hpdIncidentInterfaceWS.SetInputMap;
import hpdIncidentInterfaceWS.StatusReasonType;
import hpdIncidentInterfaceWS.StatusType;
import it.reply.sytel.adr.common.ws.HTTPClient;
import it.reply.sytel.adr.domain.RemedyConfiguration;
import it.reply.sytel.adr.remedyAdapter.RemedyClientToClose;
import it.reply.sytel.adr.remedyAdapter.exc.RemedyWSClientException;
import it.reply.sytel.adr.vo.DynatraceIncident;

public class RemedyWSClientToCloseImpl implements RemedyClientToClose {

	private HTTPClient sharedHTTPClient;
	private String encoding;
	private String userToken="";
	private String soapAction="";

	private org.apache.logging.log4j.Logger log = LogManager.getLogger(getClass());

	
	@Override
	public HelpDeskQueryServiceResponseDocument getIncidentFromRemedy(DynatraceIncident dynatraceIncident,RemedyConfiguration remedyConfiguration) {
				
		AuthenticationInfoDocument authenticationInfoDocument = AuthenticationInfoDocument.Factory.newInstance();
		AuthenticationInfo authenticationInfo = authenticationInfoDocument.addNewAuthenticationInfo();
		authenticationInfo.setUserName(remedyConfiguration.getUsername());
		authenticationInfo.setPassword(remedyConfiguration.getPassword());
		
		HelpDeskQueryServiceDocument helpDeskQueryServiceDocument = HelpDeskQueryServiceDocument.Factory.newInstance();
		GetInputMap getInputMap = helpDeskQueryServiceDocument.addNewHelpDeskQueryService();
		getInputMap.setIncidentNumber(dynatraceIncident.getRemedyTicketID());
		
		return  callRemedy(getInputMap,authenticationInfo);
		
	}

	@Override
	public String closeTicketToRemedy(DynatraceIncident dynatraceIncident, RemedyConfiguration remedyConfiguration) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private HelpDeskQueryServiceResponseDocument callRemedy(GetInputMap getInputMap, AuthenticationInfo authenticationInfo) {
		
		try {
	
			EnvelopeDocument envelopeToSend =  buildEnvelope(encoding,getInputMap,authenticationInfo);
	
			log.info("EnvelopeToSend sent to Remedy:["+envelopeToSend.toString()+"]");
	
			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);
	
			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
		
			byte[] bytes = IOUtils.toByteArray(inputStream);
	
			
			log.info("Return from Remedy :["+new String(bytes)+"]");
	
			return getResponse(bytes);
		
		} catch (Exception e) {
			throw new RemedyWSClientException("Exception on calling Remedy WS. CreateInputMap:["+getInputMap.xmlText()+"]",e);
		}
	}

	public HelpDeskQueryServiceResponseDocument getResponse(byte[] bytes){
	
		try {
			log.info("Starting gettting Remedy Response");
			
			EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
	
			HelpDeskQueryServiceResponseDocument helpDeskQueryServiceResponseDocument = HelpDeskQueryServiceResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
					
			return helpDeskQueryServiceResponseDocument;
			
		}catch (Exception e) {
			throw new RemedyWSClientException("Exception on getting the RemedyResponse for the Query",e);
		}
	}


	private EnvelopeDocument buildEnvelope(String encoding2, GetInputMap getInputMap,AuthenticationInfo authenticationInfo) {
		
		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
		Envelope envelope = envDoc.addNewEnvelope();
	
		addHeader(envelope, authenticationInfo);
		addBody(envelope,getInputMap);
	
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

	private void addBody(Envelope envelope, GetInputMap createInputMap) {
	
		Body body = envelope.addNewBody();
		Node node = body.getDomNode();
		Node nodeToImport = createInputMap.getDomNode();
		Node nodeToAppend = node.getOwnerDocument().importNode(nodeToImport, true);
		node.appendChild(nodeToAppend);
	}

	private void addBodyforClose(Envelope envelope, SetInputMap setInputMap) {
		
		Body body = envelope.addNewBody();
		Node node = body.getDomNode();
		Node nodeToImport = setInputMap.getDomNode();
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
	

	@Override
	public void resolveTicket(String remedyTicketId,HelpDeskQueryServiceResponseDocument helpDeskQueryServiceResponseDocument,RemedyConfiguration remedyConfiguration) {
		
		AuthenticationInfoDocument authenticationInfoDocument = AuthenticationInfoDocument.Factory.newInstance();
		AuthenticationInfo authenticationInfo = authenticationInfoDocument.addNewAuthenticationInfo();
		authenticationInfo.setUserName(remedyConfiguration.getUsername());
		authenticationInfo.setPassword(remedyConfiguration.getPassword());
		
		HelpDeskModifyServiceDocument helpDeskModifyServiceDocument = HelpDeskModifyServiceDocument.Factory.newInstance();
		SetInputMap setInputMap = helpDeskModifyServiceDocument.addNewHelpDeskModifyService();
		
		/*
Status = “Resolved”
Status_Reason = “No Further Action Required”
Resolution = <potete decidere una descrizione della soluzione> di solito in Nagios mette “Risoluzione Automatica”
Action = “MODIFY”
		da prendere in configurazione dalla tabella	
		 */
		
		setInputMap.setAction(remedyConfiguration.getActionResolved());
		setInputMap.setStatus(StatusType.Enum.forString(remedyConfiguration.getStatusResolved()));
		setInputMap.setStatusReason(StatusReasonType.Enum.forString(remedyConfiguration.getStatusReasonResolved()));
		setInputMap.setResolution(remedyConfiguration.getResolutionResolved());
			
		
		setInputMap.setIncidentNumber(remedyTicketId);
		setInputMap.setCategorizationTier1(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getCategorizationTier1());
		setInputMap.setCategorizationTier2(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getCategorizationTier2());
		setInputMap.setCategorizationTier3(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getCategorizationTier3());
		setInputMap.setImpact(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getImpact());
		setInputMap.setNotes(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getNotes());
		setInputMap.setReportedSource(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getReportedSource());
		setInputMap.setServiceType(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getServiceType());
		setInputMap.setSummary(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getSummary());
		setInputMap.setUrgency(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getUrgency());
		setInputMap.setServiceCI(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getServiceCI());
		setInputMap.setServiceCIReconID(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getServiceCIReconID());
		setInputMap.setHPDCI(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getHPDCI());
		setInputMap.setHPDCIReconID(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getHPDCIReconID());
		setInputMap.setHPDCIFormName(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getHPDCIFormName());
		setInputMap.setZ1DCIFormName(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getZ1DCIFormName());
		
		
		callRemedyToClose(setInputMap,authenticationInfo);
		
	}

	private HelpDeskModifyServiceResponseDocument callRemedyToClose(SetInputMap setInputMap, AuthenticationInfo authenticationInfo) {
		try {
			
			EnvelopeDocument envelopeToSend =  buildEnvelopeToClose(encoding,setInputMap,authenticationInfo);
	
			log.info("EnvelopeToSend sent to Remedy:["+envelopeToSend.toString()+"]");
	
			byte[] soapPayload = envelopeToSend.toString().getBytes(encoding);
	
			InputStream inputStream = sharedHTTPClient.invoke(soapPayload, userToken, soapAction);
		
			byte[] bytes = IOUtils.toByteArray(inputStream);
				
			log.info("Return from Remedy for Closure:["+new String(bytes)+"]");
	
			return getResponseToClose(bytes);
		
		} catch (Exception e) {
			throw new RemedyWSClientException("Exception on calling Remedy WS for Closing. CreateInputMap:["+setInputMap.xmlText()+"]",e);
		}
	}

	private EnvelopeDocument buildEnvelopeToClose(String encoding2, SetInputMap setInputMap,AuthenticationInfo authenticationInfo) {
		EnvelopeDocument envDoc = EnvelopeDocument.Factory.newInstance();
		Envelope envelope = envDoc.addNewEnvelope();
	
		addHeader(envelope, authenticationInfo);
		addBodyforClose(envelope,setInputMap);
	
		envDoc.documentProperties().setEncoding(encoding);
		return envDoc;
	}

	private HelpDeskModifyServiceResponseDocument getResponseToClose(byte[] bytes) {
				
			try {
				log.info("Starting getting Remedy Response for Closing");
				
				EnvelopeDocument responseDoc = EnvelopeDocument.Factory.parse(new ByteArrayInputStream(bytes));
		
				HelpDeskModifyServiceResponseDocument helpDeskModifyServiceResponseDocument= HelpDeskModifyServiceResponseDocument.Factory.parse(responseDoc.getEnvelope().getBody().xmlText());
						
				return helpDeskModifyServiceResponseDocument;
				
			}catch (Exception e) {
				throw new RemedyWSClientException("Exception on closing the Remedy Ticket. \n -->Buffer:["+new String(bytes)+"]\n",e);
			}
	}
	

}
