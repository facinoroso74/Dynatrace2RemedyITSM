/*
 * XML Type:  InputMapping4
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.InputMapping4
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * An XML InputMapping4(@urn:HPD_IncidentInterface_WS).
 *
 * This is a complex type.
 */
public class InputMapping4Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.InputMapping4
{
    private static final long serialVersionUID = 1L;
    
    public InputMapping4Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUALIFICATION$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Qualification");
    private static final javax.xml.namespace.QName STARTRECORD$2 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "startRecord");
    private static final javax.xml.namespace.QName MAXLIMIT$4 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "maxLimit");
    
    
    /**
     * Gets the "Qualification" element
     */
    public java.lang.String getQualification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Qualification" element
     */
    public org.apache.xmlbeans.XmlString xgetQualification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFICATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Qualification" element
     */
    public void setQualification(java.lang.String qualification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFICATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALIFICATION$0);
            }
            target.setStringValue(qualification);
        }
    }
    
    /**
     * Sets (as xml) the "Qualification" element
     */
    public void xsetQualification(org.apache.xmlbeans.XmlString qualification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFICATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUALIFICATION$0);
            }
            target.set(qualification);
        }
    }
    
    /**
     * Gets the "startRecord" element
     */
    public java.lang.String getStartRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTRECORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "startRecord" element
     */
    public org.apache.xmlbeans.XmlString xgetStartRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTRECORD$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startRecord" element
     */
    public void setStartRecord(java.lang.String startRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTRECORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTRECORD$2);
            }
            target.setStringValue(startRecord);
        }
    }
    
    /**
     * Sets (as xml) the "startRecord" element
     */
    public void xsetStartRecord(org.apache.xmlbeans.XmlString startRecord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTRECORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTRECORD$2);
            }
            target.set(startRecord);
        }
    }
    
    /**
     * Gets the "maxLimit" element
     */
    public java.lang.String getMaxLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLIMIT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxLimit" element
     */
    public org.apache.xmlbeans.XmlString xgetMaxLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXLIMIT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxLimit" element
     */
    public void setMaxLimit(java.lang.String maxLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLIMIT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLIMIT$4);
            }
            target.setStringValue(maxLimit);
        }
    }
    
    /**
     * Sets (as xml) the "maxLimit" element
     */
    public void xsetMaxLimit(org.apache.xmlbeans.XmlString maxLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXLIMIT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXLIMIT$4);
            }
            target.set(maxLimit);
        }
    }
}
