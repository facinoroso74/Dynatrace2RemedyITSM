/*
 * An XML document type.
 * Localname: HelpDesk_QueryList_ServiceResponse
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskQueryListServiceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_QueryList_ServiceResponse(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskQueryListServiceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskQueryListServiceResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskQueryListServiceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKQUERYLISTSERVICERESPONSE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_QueryList_ServiceResponse");
    
    
    /**
     * Gets the "HelpDesk_QueryList_ServiceResponse" element
     */
    public hpdIncidentInterfaceWS.GetListOutputMap getHelpDeskQueryListServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListOutputMap target = null;
            target = (hpdIncidentInterfaceWS.GetListOutputMap)get_store().find_element_user(HELPDESKQUERYLISTSERVICERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_QueryList_ServiceResponse" element
     */
    public void setHelpDeskQueryListServiceResponse(hpdIncidentInterfaceWS.GetListOutputMap helpDeskQueryListServiceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListOutputMap target = null;
            target = (hpdIncidentInterfaceWS.GetListOutputMap)get_store().find_element_user(HELPDESKQUERYLISTSERVICERESPONSE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.GetListOutputMap)get_store().add_element_user(HELPDESKQUERYLISTSERVICERESPONSE$0);
            }
            target.set(helpDeskQueryListServiceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_QueryList_ServiceResponse" element
     */
    public hpdIncidentInterfaceWS.GetListOutputMap addNewHelpDeskQueryListServiceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListOutputMap target = null;
            target = (hpdIncidentInterfaceWS.GetListOutputMap)get_store().add_element_user(HELPDESKQUERYLISTSERVICERESPONSE$0);
            return target;
        }
    }
}
