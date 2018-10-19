/*
 * An XML document type.
 * Localname: HelpDesk_GetWorkInfoListResponse
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskGetWorkInfoListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_GetWorkInfoListResponse(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskGetWorkInfoListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskGetWorkInfoListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskGetWorkInfoListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKGETWORKINFOLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_GetWorkInfoListResponse");
    
    
    /**
     * Gets the "HelpDesk_GetWorkInfoListResponse" element
     */
    public hpdIncidentInterfaceWS.OutputMapping4 getHelpDeskGetWorkInfoListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.OutputMapping4 target = null;
            target = (hpdIncidentInterfaceWS.OutputMapping4)get_store().find_element_user(HELPDESKGETWORKINFOLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_GetWorkInfoListResponse" element
     */
    public void setHelpDeskGetWorkInfoListResponse(hpdIncidentInterfaceWS.OutputMapping4 helpDeskGetWorkInfoListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.OutputMapping4 target = null;
            target = (hpdIncidentInterfaceWS.OutputMapping4)get_store().find_element_user(HELPDESKGETWORKINFOLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.OutputMapping4)get_store().add_element_user(HELPDESKGETWORKINFOLISTRESPONSE$0);
            }
            target.set(helpDeskGetWorkInfoListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_GetWorkInfoListResponse" element
     */
    public hpdIncidentInterfaceWS.OutputMapping4 addNewHelpDeskGetWorkInfoListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.OutputMapping4 target = null;
            target = (hpdIncidentInterfaceWS.OutputMapping4)get_store().add_element_user(HELPDESKGETWORKINFOLISTRESPONSE$0);
            return target;
        }
    }
}
