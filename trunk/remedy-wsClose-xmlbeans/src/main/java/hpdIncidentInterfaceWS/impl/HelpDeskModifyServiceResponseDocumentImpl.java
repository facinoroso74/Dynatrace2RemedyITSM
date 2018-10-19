/*
 * An XML document type.
 * Localname: HelpDesk_Modify_ServiceResponse
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskModifyServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_Modify_ServiceResponse(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskModifyServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskModifyServiceResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskModifyServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKMODIFYSERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_Modify_ServiceResponse");
    
    
    /**
     * Gets the "HelpDesk_Modify_ServiceResponse" element
     */
    public hpdIncidentInterfaceWS.SetOutputMap getHelpDeskModifyServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.SetOutputMap target = null;
            target = (hpdIncidentInterfaceWS.SetOutputMap)get_store().find_element_user(HELPDESKMODIFYSERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_Modify_ServiceResponse" element
     */
    public void setHelpDeskModifyServiceResponse(hpdIncidentInterfaceWS.SetOutputMap helpDeskModifyServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.SetOutputMap target = null;
            target = (hpdIncidentInterfaceWS.SetOutputMap)get_store().find_element_user(HELPDESKMODIFYSERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.SetOutputMap)get_store().add_element_user(HELPDESKMODIFYSERVICERESPONSE$0);
            }
            target.set(helpDeskModifyServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_Modify_ServiceResponse" element
     */
    public hpdIncidentInterfaceWS.SetOutputMap addNewHelpDeskModifyServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.SetOutputMap target = null;
            target = (hpdIncidentInterfaceWS.SetOutputMap)get_store().add_element_user(HELPDESKMODIFYSERVICERESPONSE$0);
            return target;
        }
    }
}
