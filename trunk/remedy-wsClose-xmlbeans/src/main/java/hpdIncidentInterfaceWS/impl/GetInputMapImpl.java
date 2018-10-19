/*
 * XML Type:  GetInputMap
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.GetInputMap
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * An XML GetInputMap(@urn:HPD_IncidentInterface_WS).
 *
 * This is a complex type.
 */
public class GetInputMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.GetInputMap
{
    private static final long serialVersionUID = 1L;
    
    public GetInputMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTNUMBER$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Incident_Number");
    
    
    /**
     * Gets the "Incident_Number" element
     */
    public java.lang.String getIncidentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Incident_Number" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Incident_Number" element
     */
    public void setIncidentNumber(java.lang.String incidentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNUMBER$0);
            }
            target.setStringValue(incidentNumber);
        }
    }
    
    /**
     * Sets (as xml) the "Incident_Number" element
     */
    public void xsetIncidentNumber(org.apache.xmlbeans.XmlString incidentNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNUMBER$0);
            }
            target.set(incidentNumber);
        }
    }
}
