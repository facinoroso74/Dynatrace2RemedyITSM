/*
 * An XML document type.
 * Localname: HelpDesk_QueryList_Service
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskQueryListServiceDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_QueryList_Service(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskQueryListServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskQueryListServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskQueryListServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKQUERYLISTSERVICE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_QueryList_Service");
    
    
    /**
     * Gets the "HelpDesk_QueryList_Service" element
     */
    public hpdIncidentInterfaceWS.GetListInputMap getHelpDeskQueryListService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListInputMap target = null;
            target = (hpdIncidentInterfaceWS.GetListInputMap)get_store().find_element_user(HELPDESKQUERYLISTSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_QueryList_Service" element
     */
    public void setHelpDeskQueryListService(hpdIncidentInterfaceWS.GetListInputMap helpDeskQueryListService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListInputMap target = null;
            target = (hpdIncidentInterfaceWS.GetListInputMap)get_store().find_element_user(HELPDESKQUERYLISTSERVICE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.GetListInputMap)get_store().add_element_user(HELPDESKQUERYLISTSERVICE$0);
            }
            target.set(helpDeskQueryListService);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_QueryList_Service" element
     */
    public hpdIncidentInterfaceWS.GetListInputMap addNewHelpDeskQueryListService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListInputMap target = null;
            target = (hpdIncidentInterfaceWS.GetListInputMap)get_store().add_element_user(HELPDESKQUERYLISTSERVICE$0);
            return target;
        }
    }
}
