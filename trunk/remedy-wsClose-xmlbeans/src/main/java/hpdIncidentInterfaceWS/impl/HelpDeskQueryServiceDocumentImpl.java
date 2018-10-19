/*
 * An XML document type.
 * Localname: HelpDesk_Query_Service
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskQueryServiceDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_Query_Service(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskQueryServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskQueryServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskQueryServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKQUERYSERVICE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_Query_Service");
    
    
    /**
     * Gets the "HelpDesk_Query_Service" element
     */
    public hpdIncidentInterfaceWS.GetInputMap getHelpDeskQueryService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetInputMap target = null;
            target = (hpdIncidentInterfaceWS.GetInputMap)get_store().find_element_user(HELPDESKQUERYSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_Query_Service" element
     */
    public void setHelpDeskQueryService(hpdIncidentInterfaceWS.GetInputMap helpDeskQueryService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetInputMap target = null;
            target = (hpdIncidentInterfaceWS.GetInputMap)get_store().find_element_user(HELPDESKQUERYSERVICE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.GetInputMap)get_store().add_element_user(HELPDESKQUERYSERVICE$0);
            }
            target.set(helpDeskQueryService);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_Query_Service" element
     */
    public hpdIncidentInterfaceWS.GetInputMap addNewHelpDeskQueryService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetInputMap target = null;
            target = (hpdIncidentInterfaceWS.GetInputMap)get_store().add_element_user(HELPDESKQUERYSERVICE$0);
            return target;
        }
    }
}
