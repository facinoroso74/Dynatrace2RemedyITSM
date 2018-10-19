/*
 * An XML document type.
 * Localname: AuthenticationInfo
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.AuthenticationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * A document containing one AuthenticationInfo(@urn:HPD_IncidentInterface_WS) element.
 *
 * This is a complex type.
 */
public class AuthenticationInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.AuthenticationInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthenticationInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONINFO$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "AuthenticationInfo");
    
    
    /**
     * Gets the "AuthenticationInfo" element
     */
    public hpdIncidentInterfaceWS.AuthenticationInfo getAuthenticationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.AuthenticationInfo target = null;
            target = (hpdIncidentInterfaceWS.AuthenticationInfo)get_store().find_element_user(AUTHENTICATIONINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthenticationInfo" element
     */
    public void setAuthenticationInfo(hpdIncidentInterfaceWS.AuthenticationInfo authenticationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.AuthenticationInfo target = null;
            target = (hpdIncidentInterfaceWS.AuthenticationInfo)get_store().find_element_user(AUTHENTICATIONINFO$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.AuthenticationInfo)get_store().add_element_user(AUTHENTICATIONINFO$0);
            }
            target.set(authenticationInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "AuthenticationInfo" element
     */
    public hpdIncidentInterfaceWS.AuthenticationInfo addNewAuthenticationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.AuthenticationInfo target = null;
            target = (hpdIncidentInterfaceWS.AuthenticationInfo)get_store().add_element_user(AUTHENTICATIONINFO$0);
            return target;
        }
    }
}
