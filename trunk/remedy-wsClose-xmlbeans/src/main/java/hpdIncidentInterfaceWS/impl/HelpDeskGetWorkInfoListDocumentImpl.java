/*
 * An XML document type.
 * Localname: HelpDesk_GetWorkInfoList
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.HelpDeskGetWorkInfoListDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one HelpDesk_GetWorkInfoList(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class HelpDeskGetWorkInfoListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.HelpDeskGetWorkInfoListDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelpDeskGetWorkInfoListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELPDESKGETWORKINFOLIST$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HelpDesk_GetWorkInfoList");
    
    
    /**
     * Gets the "HelpDesk_GetWorkInfoList" element
     */
    public hpdIncidentInterfaceWS.InputMapping4 getHelpDeskGetWorkInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.InputMapping4 target = null;
            target = (hpdIncidentInterfaceWS.InputMapping4)get_store().find_element_user(HELPDESKGETWORKINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HelpDesk_GetWorkInfoList" element
     */
    public void setHelpDeskGetWorkInfoList(hpdIncidentInterfaceWS.InputMapping4 helpDeskGetWorkInfoList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.InputMapping4 target = null;
            target = (hpdIncidentInterfaceWS.InputMapping4)get_store().find_element_user(HELPDESKGETWORKINFOLIST$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.InputMapping4)get_store().add_element_user(HELPDESKGETWORKINFOLIST$0);
            }
            target.set(helpDeskGetWorkInfoList);
        }
    }
    
    /**
     * Appends and returns a new empty "HelpDesk_GetWorkInfoList" element
     */
    public hpdIncidentInterfaceWS.InputMapping4 addNewHelpDeskGetWorkInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.InputMapping4 target = null;
            target = (hpdIncidentInterfaceWS.InputMapping4)get_store().add_element_user(HELPDESKGETWORKINFOLIST$0);
            return target;
        }
    }
}
