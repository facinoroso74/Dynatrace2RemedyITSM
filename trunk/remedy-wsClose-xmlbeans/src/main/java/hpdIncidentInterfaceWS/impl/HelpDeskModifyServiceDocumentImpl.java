/*
 * An XML document type.
 * Localname: HelpDesk_Modify_Service
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskModifyServiceDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_Modify_Service(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskModifyServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskModifyServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskModifyServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKMODIFYSERVICE$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_Modify_Service");
    
    
    /**
     * Gets the "HelpDesk_Modify_Service" element
     */
    public hpdIncidentInterfaceWS.SetInputMap getHelpDeskModifyService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.SetInputMap target = null;
            target = (hpdIncidentInterfaceWS.SetInputMap)get_store().find_element_user(HELPDESKMODIFYSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_Modify_Service" element
     */
    public void setHelpDeskModifyService(hpdIncidentInterfaceWS.SetInputMap helpDeskModifyService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.SetInputMap target = null;
            target = (hpdIncidentInterfaceWS.SetInputMap)get_store().find_element_user(HELPDESKMODIFYSERVICE$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.SetInputMap)get_store().add_element_user(HELPDESKMODIFYSERVICE$0);
            }
            target.set(helpDeskModifyService);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_Modify_Service" element
     */
    public hpdIncidentInterfaceWS.SetInputMap addNewHelpDeskModifyService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.SetInputMap target = null;
            target = (hpdIncidentInterfaceWS.SetInputMap)get_store().add_element_user(HELPDESKMODIFYSERVICE$0);
            return target;
        }
    }
}
