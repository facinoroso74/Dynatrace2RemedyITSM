/*
 * An XML document type.
 * Localname: HelpDesk_Query_ServiceResponse
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskQueryServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_Query_ServiceResponse(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskQueryServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskQueryServiceResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskQueryServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKQUERYSERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_Query_ServiceResponse");
    
    
    /**
     * Gets the "HelpDesk_Query_ServiceResponse" element
     */
    public hpdIncidentInterfaceWS.GetOutputMap getHelpDeskQueryServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetOutputMap target = null;
            target = (hpdIncidentInterfaceWS.GetOutputMap)get_store().find_element_user(HELPDESKQUERYSERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_Query_ServiceResponse" element
     */
    public void setHelpDeskQueryServiceResponse(hpdIncidentInterfaceWS.GetOutputMap helpDeskQueryServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetOutputMap target = null;
            target = (hpdIncidentInterfaceWS.GetOutputMap)get_store().find_element_user(HELPDESKQUERYSERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.GetOutputMap)get_store().add_element_user(HELPDESKQUERYSERVICERESPONSE$0);
            }
            target.set(helpDeskQueryServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_Query_ServiceResponse" element
     */
    public hpdIncidentInterfaceWS.GetOutputMap addNewHelpDeskQueryServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetOutputMap target = null;
            target = (hpdIncidentInterfaceWS.GetOutputMap)get_store().add_element_user(HELPDESKQUERYSERVICERESPONSE$0);
            return target;
        }
    }
}
