/*
 * XML Type:  OutputMapping4
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.OutputMapping4
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * An XML OutputMapping4(@urn:HPD_IncidentInterface_WS).
 *
 * This is a complex type.
 */
public class OutputMapping4Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.OutputMapping4
{
    private static final long serialVersionUID = 1L;
    
    public OutputMapping4Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTWOQUERY$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "ListWOQuery");
    
    
    /**
     * Gets the "ListWOQuery" element
     */
    public hpdIncidentInterfaceWS.ListWOObjectQuery getListWOQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.ListWOObjectQuery target = null;
            target = (hpdIncidentInterfaceWS.ListWOObjectQuery)get_store().find_element_user(LISTWOQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListWOQuery" element
     */
    public void setListWOQuery(hpdIncidentInterfaceWS.ListWOObjectQuery listWOQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.ListWOObjectQuery target = null;
            target = (hpdIncidentInterfaceWS.ListWOObjectQuery)get_store().find_element_user(LISTWOQUERY$0, 0);
            if (target == null)
            {
                target = (hpdIncidentInterfaceWS.ListWOObjectQuery)get_store().add_element_user(LISTWOQUERY$0);
            }
            target.set(listWOQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "ListWOQuery" element
     */
    public hpdIncidentInterfaceWS.ListWOObjectQuery addNewListWOQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.ListWOObjectQuery target = null;
            target = (hpdIncidentInterfaceWS.ListWOObjectQuery)get_store().add_element_user(LISTWOQUERY$0);
            return target;
        }
    }
}
