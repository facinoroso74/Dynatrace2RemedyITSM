/*
 * XML Type:  ListWOObjectQuery
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.ListWOObjectQuery
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * An XML ListWOObjectQuery(@urn:HPD_IncidentInterface_WS).
 *
 * This is a complex type.
 */
public class ListWOObjectQueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.ListWOObjectQuery
{
    private static final long serialVersionUID = 1L;
    
    public ListWOObjectQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTVALUES$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "getListValues");
    
    
    /**
     * Gets array of all "getListValues" elements
     */
    public hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues[] getGetListValuesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETLISTVALUES$0, targetList);
            hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues[] result = new hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getListValues" element
     */
    public hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues getGetListValuesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues)get_store().find_element_user(GETLISTVALUES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "getListValues" element
     */
    public int sizeOfGetListValuesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GETLISTVALUES$0);
        }
    }
    
    /**
     * Sets array of all "getListValues" element
     */
    public void setGetListValuesArray(hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues[] getListValuesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(getListValuesArray, GETLISTVALUES$0);
        }
    }
    
    /**
     * Sets ith "getListValues" element
     */
    public void setGetListValuesArray(int i, hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues getListValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues)get_store().find_element_user(GETLISTVALUES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(getListValues);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getListValues" element
     */
    public hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues insertNewGetListValues(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues)get_store().insert_element_user(GETLISTVALUES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getListValues" element
     */
    public hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues addNewGetListValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues)get_store().add_element_user(GETLISTVALUES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "getListValues" element
     */
    public void removeGetListValues(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GETLISTVALUES$0, i);
        }
    }
    /**
     * An XML getListValues(@urn:HPD_IncidentInterface_WS).
     *
     * This is a complex type.
     */
    public static class GetListValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues
    {
        private static final long serialVersionUID = 1L;
        
        public GetListValuesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKINFOINSTANCEID$0 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoInstanceID");
        private static final javax.xml.namespace.QName WORKINFOSTATUS$2 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoStatus");
        private static final javax.xml.namespace.QName WORKINFOTYPE$4 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoType");
        private static final javax.xml.namespace.QName WORKINFOCOMMSOURCE$6 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoCommSource");
        private static final javax.xml.namespace.QName WORKINFOSUMMARY$8 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoSummary");
        private static final javax.xml.namespace.QName WORKINFONOTES$10 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoNotes");
        private static final javax.xml.namespace.QName PARENTID$12 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "ParentID");
        private static final javax.xml.namespace.QName WORKINFOSECURELOG$14 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoSecureLog");
        private static final javax.xml.namespace.QName WORKINFOSUBMITDATE$16 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoSubmitDate");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT1NAME$18 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment1Name");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT1DATA$20 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment1Data");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT1ORIGSIZE$22 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment1OrigSize");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT2NAME$24 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment2Name");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT2DATA$26 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment2Data");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT2ORIGSIZE$28 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment2OrigSize");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT3NAME$30 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment3Name");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT3DATA$32 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment3Data");
        private static final javax.xml.namespace.QName WORKINFOATTACHMENT3ORIGSIZE$34 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "WorkInfoAttachment3OrigSize");
        
        
        /**
         * Gets the "WorkInfoInstanceID" element
         */
        public java.lang.String getWorkInfoInstanceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOINSTANCEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoInstanceID" element
         */
        public org.apache.xmlbeans.XmlString xgetWorkInfoInstanceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOINSTANCEID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoInstanceID" element
         */
        public void setWorkInfoInstanceID(java.lang.String workInfoInstanceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOINSTANCEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOINSTANCEID$0);
                }
                target.setStringValue(workInfoInstanceID);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoInstanceID" element
         */
        public void xsetWorkInfoInstanceID(org.apache.xmlbeans.XmlString workInfoInstanceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOINSTANCEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFOINSTANCEID$0);
                }
                target.set(workInfoInstanceID);
            }
        }
        
        /**
         * Gets the "WorkInfoStatus" element
         */
        public hpdIncidentInterfaceWS.WorkInfoStatusType.Enum getWorkInfoStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSTATUS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.WorkInfoStatusType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoStatus" element
         */
        public hpdIncidentInterfaceWS.WorkInfoStatusType xgetWorkInfoStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoStatusType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoStatusType)get_store().find_element_user(WORKINFOSTATUS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoStatus" element
         */
        public void setWorkInfoStatus(hpdIncidentInterfaceWS.WorkInfoStatusType.Enum workInfoStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOSTATUS$2);
                }
                target.setEnumValue(workInfoStatus);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoStatus" element
         */
        public void xsetWorkInfoStatus(hpdIncidentInterfaceWS.WorkInfoStatusType workInfoStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoStatusType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoStatusType)get_store().find_element_user(WORKINFOSTATUS$2, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.WorkInfoStatusType)get_store().add_element_user(WORKINFOSTATUS$2);
                }
                target.set(workInfoStatus);
            }
        }
        
        /**
         * Gets the "WorkInfoType" element
         */
        public hpdIncidentInterfaceWS.WorkInfoTypeType.Enum getWorkInfoType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.WorkInfoTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoType" element
         */
        public hpdIncidentInterfaceWS.WorkInfoTypeType xgetWorkInfoType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoTypeType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoTypeType)get_store().find_element_user(WORKINFOTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "WorkInfoType" element
         */
        public boolean isNilWorkInfoType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoTypeType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoTypeType)get_store().find_element_user(WORKINFOTYPE$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "WorkInfoType" element
         */
        public void setWorkInfoType(hpdIncidentInterfaceWS.WorkInfoTypeType.Enum workInfoType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOTYPE$4);
                }
                target.setEnumValue(workInfoType);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoType" element
         */
        public void xsetWorkInfoType(hpdIncidentInterfaceWS.WorkInfoTypeType workInfoType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoTypeType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoTypeType)get_store().find_element_user(WORKINFOTYPE$4, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.WorkInfoTypeType)get_store().add_element_user(WORKINFOTYPE$4);
                }
                target.set(workInfoType);
            }
        }
        
        /**
         * Nils the "WorkInfoType" element
         */
        public void setNilWorkInfoType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoTypeType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoTypeType)get_store().find_element_user(WORKINFOTYPE$4, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.WorkInfoTypeType)get_store().add_element_user(WORKINFOTYPE$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "WorkInfoCommSource" element
         */
        public hpdIncidentInterfaceWS.WorkInfoSourceType.Enum getWorkInfoCommSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOCOMMSOURCE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.WorkInfoSourceType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoCommSource" element
         */
        public hpdIncidentInterfaceWS.WorkInfoSourceType xgetWorkInfoCommSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoSourceType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoSourceType)get_store().find_element_user(WORKINFOCOMMSOURCE$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "WorkInfoCommSource" element
         */
        public boolean isNilWorkInfoCommSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoSourceType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoSourceType)get_store().find_element_user(WORKINFOCOMMSOURCE$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "WorkInfoCommSource" element
         */
        public void setWorkInfoCommSource(hpdIncidentInterfaceWS.WorkInfoSourceType.Enum workInfoCommSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOCOMMSOURCE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOCOMMSOURCE$6);
                }
                target.setEnumValue(workInfoCommSource);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoCommSource" element
         */
        public void xsetWorkInfoCommSource(hpdIncidentInterfaceWS.WorkInfoSourceType workInfoCommSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoSourceType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoSourceType)get_store().find_element_user(WORKINFOCOMMSOURCE$6, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.WorkInfoSourceType)get_store().add_element_user(WORKINFOCOMMSOURCE$6);
                }
                target.set(workInfoCommSource);
            }
        }
        
        /**
         * Nils the "WorkInfoCommSource" element
         */
        public void setNilWorkInfoCommSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.WorkInfoSourceType target = null;
                target = (hpdIncidentInterfaceWS.WorkInfoSourceType)get_store().find_element_user(WORKINFOCOMMSOURCE$6, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.WorkInfoSourceType)get_store().add_element_user(WORKINFOCOMMSOURCE$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "WorkInfoSummary" element
         */
        public java.lang.String getWorkInfoSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSUMMARY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoSummary" element
         */
        public org.apache.xmlbeans.XmlString xgetWorkInfoSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOSUMMARY$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoSummary" element
         */
        public void setWorkInfoSummary(java.lang.String workInfoSummary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSUMMARY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOSUMMARY$8);
                }
                target.setStringValue(workInfoSummary);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoSummary" element
         */
        public void xsetWorkInfoSummary(org.apache.xmlbeans.XmlString workInfoSummary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOSUMMARY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFOSUMMARY$8);
                }
                target.set(workInfoSummary);
            }
        }
        
        /**
         * Gets the "WorkInfoNotes" element
         */
        public java.lang.String getWorkInfoNotes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFONOTES$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoNotes" element
         */
        public org.apache.xmlbeans.XmlString xgetWorkInfoNotes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFONOTES$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoNotes" element
         */
        public void setWorkInfoNotes(java.lang.String workInfoNotes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFONOTES$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFONOTES$10);
                }
                target.setStringValue(workInfoNotes);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoNotes" element
         */
        public void xsetWorkInfoNotes(org.apache.xmlbeans.XmlString workInfoNotes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFONOTES$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFONOTES$10);
                }
                target.set(workInfoNotes);
            }
        }
        
        /**
         * Gets the "ParentID" element
         */
        public java.lang.String getParentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ParentID" element
         */
        public org.apache.xmlbeans.XmlString xgetParentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTID$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ParentID" element
         */
        public void setParentID(java.lang.String parentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTID$12);
                }
                target.setStringValue(parentID);
            }
        }
        
        /**
         * Sets (as xml) the "ParentID" element
         */
        public void xsetParentID(org.apache.xmlbeans.XmlString parentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTID$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTID$12);
                }
                target.set(parentID);
            }
        }
        
        /**
         * Gets the "WorkInfoSecureLog" element
         */
        public hpdIncidentInterfaceWS.VIPType.Enum getWorkInfoSecureLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSECURELOG$14, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.VIPType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoSecureLog" element
         */
        public hpdIncidentInterfaceWS.VIPType xgetWorkInfoSecureLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(WORKINFOSECURELOG$14, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "WorkInfoSecureLog" element
         */
        public boolean isNilWorkInfoSecureLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(WORKINFOSECURELOG$14, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "WorkInfoSecureLog" element
         */
        public void setWorkInfoSecureLog(hpdIncidentInterfaceWS.VIPType.Enum workInfoSecureLog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSECURELOG$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOSECURELOG$14);
                }
                target.setEnumValue(workInfoSecureLog);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoSecureLog" element
         */
        public void xsetWorkInfoSecureLog(hpdIncidentInterfaceWS.VIPType workInfoSecureLog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(WORKINFOSECURELOG$14, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.VIPType)get_store().add_element_user(WORKINFOSECURELOG$14);
                }
                target.set(workInfoSecureLog);
            }
        }
        
        /**
         * Nils the "WorkInfoSecureLog" element
         */
        public void setNilWorkInfoSecureLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(WORKINFOSECURELOG$14, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.VIPType)get_store().add_element_user(WORKINFOSECURELOG$14);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "WorkInfoSubmitDate" element
         */
        public java.util.Calendar getWorkInfoSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSUBMITDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoSubmitDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetWorkInfoSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WORKINFOSUBMITDATE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "WorkInfoSubmitDate" element
         */
        public boolean isSetWorkInfoSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKINFOSUBMITDATE$16) != 0;
            }
        }
        
        /**
         * Sets the "WorkInfoSubmitDate" element
         */
        public void setWorkInfoSubmitDate(java.util.Calendar workInfoSubmitDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOSUBMITDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOSUBMITDATE$16);
                }
                target.setCalendarValue(workInfoSubmitDate);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoSubmitDate" element
         */
        public void xsetWorkInfoSubmitDate(org.apache.xmlbeans.XmlDateTime workInfoSubmitDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(WORKINFOSUBMITDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(WORKINFOSUBMITDATE$16);
                }
                target.set(workInfoSubmitDate);
            }
        }
        
        /**
         * Unsets the "WorkInfoSubmitDate" element
         */
        public void unsetWorkInfoSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKINFOSUBMITDATE$16, 0);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment1Name" element
         */
        public java.lang.String getWorkInfoAttachment1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1NAME$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment1Name" element
         */
        public org.apache.xmlbeans.XmlString xgetWorkInfoAttachment1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT1NAME$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "WorkInfoAttachment1Name" element
         */
        public boolean isSetWorkInfoAttachment1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKINFOATTACHMENT1NAME$18) != 0;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment1Name" element
         */
        public void setWorkInfoAttachment1Name(java.lang.String workInfoAttachment1Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1NAME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT1NAME$18);
                }
                target.setStringValue(workInfoAttachment1Name);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment1Name" element
         */
        public void xsetWorkInfoAttachment1Name(org.apache.xmlbeans.XmlString workInfoAttachment1Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT1NAME$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFOATTACHMENT1NAME$18);
                }
                target.set(workInfoAttachment1Name);
            }
        }
        
        /**
         * Unsets the "WorkInfoAttachment1Name" element
         */
        public void unsetWorkInfoAttachment1Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKINFOATTACHMENT1NAME$18, 0);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment1Data" element
         */
        public byte[] getWorkInfoAttachment1Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1DATA$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment1Data" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetWorkInfoAttachment1Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT1DATA$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment1Data" element
         */
        public void setWorkInfoAttachment1Data(byte[] workInfoAttachment1Data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1DATA$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT1DATA$20);
                }
                target.setByteArrayValue(workInfoAttachment1Data);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment1Data" element
         */
        public void xsetWorkInfoAttachment1Data(org.apache.xmlbeans.XmlBase64Binary workInfoAttachment1Data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT1DATA$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(WORKINFOATTACHMENT1DATA$20);
                }
                target.set(workInfoAttachment1Data);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment1OrigSize" element
         */
        public int getWorkInfoAttachment1OrigSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$22, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment1OrigSize" element
         */
        public org.apache.xmlbeans.XmlInt xgetWorkInfoAttachment1OrigSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment1OrigSize" element
         */
        public void setWorkInfoAttachment1OrigSize(int workInfoAttachment1OrigSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT1ORIGSIZE$22);
                }
                target.setIntValue(workInfoAttachment1OrigSize);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment1OrigSize" element
         */
        public void xsetWorkInfoAttachment1OrigSize(org.apache.xmlbeans.XmlInt workInfoAttachment1OrigSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT1ORIGSIZE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WORKINFOATTACHMENT1ORIGSIZE$22);
                }
                target.set(workInfoAttachment1OrigSize);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment2Name" element
         */
        public java.lang.String getWorkInfoAttachment2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT2NAME$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment2Name" element
         */
        public org.apache.xmlbeans.XmlString xgetWorkInfoAttachment2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT2NAME$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "WorkInfoAttachment2Name" element
         */
        public boolean isSetWorkInfoAttachment2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKINFOATTACHMENT2NAME$24) != 0;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment2Name" element
         */
        public void setWorkInfoAttachment2Name(java.lang.String workInfoAttachment2Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT2NAME$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT2NAME$24);
                }
                target.setStringValue(workInfoAttachment2Name);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment2Name" element
         */
        public void xsetWorkInfoAttachment2Name(org.apache.xmlbeans.XmlString workInfoAttachment2Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT2NAME$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFOATTACHMENT2NAME$24);
                }
                target.set(workInfoAttachment2Name);
            }
        }
        
        /**
         * Unsets the "WorkInfoAttachment2Name" element
         */
        public void unsetWorkInfoAttachment2Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKINFOATTACHMENT2NAME$24, 0);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment2Data" element
         */
        public byte[] getWorkInfoAttachment2Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT2DATA$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment2Data" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetWorkInfoAttachment2Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT2DATA$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment2Data" element
         */
        public void setWorkInfoAttachment2Data(byte[] workInfoAttachment2Data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT2DATA$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT2DATA$26);
                }
                target.setByteArrayValue(workInfoAttachment2Data);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment2Data" element
         */
        public void xsetWorkInfoAttachment2Data(org.apache.xmlbeans.XmlBase64Binary workInfoAttachment2Data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT2DATA$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(WORKINFOATTACHMENT2DATA$26);
                }
                target.set(workInfoAttachment2Data);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment2OrigSize" element
         */
        public int getWorkInfoAttachment2OrigSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT2ORIGSIZE$28, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment2OrigSize" element
         */
        public org.apache.xmlbeans.XmlInt xgetWorkInfoAttachment2OrigSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT2ORIGSIZE$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment2OrigSize" element
         */
        public void setWorkInfoAttachment2OrigSize(int workInfoAttachment2OrigSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT2ORIGSIZE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT2ORIGSIZE$28);
                }
                target.setIntValue(workInfoAttachment2OrigSize);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment2OrigSize" element
         */
        public void xsetWorkInfoAttachment2OrigSize(org.apache.xmlbeans.XmlInt workInfoAttachment2OrigSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT2ORIGSIZE$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WORKINFOATTACHMENT2ORIGSIZE$28);
                }
                target.set(workInfoAttachment2OrigSize);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment3Name" element
         */
        public java.lang.String getWorkInfoAttachment3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT3NAME$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment3Name" element
         */
        public org.apache.xmlbeans.XmlString xgetWorkInfoAttachment3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT3NAME$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "WorkInfoAttachment3Name" element
         */
        public boolean isSetWorkInfoAttachment3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKINFOATTACHMENT3NAME$30) != 0;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment3Name" element
         */
        public void setWorkInfoAttachment3Name(java.lang.String workInfoAttachment3Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT3NAME$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT3NAME$30);
                }
                target.setStringValue(workInfoAttachment3Name);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment3Name" element
         */
        public void xsetWorkInfoAttachment3Name(org.apache.xmlbeans.XmlString workInfoAttachment3Name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKINFOATTACHMENT3NAME$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKINFOATTACHMENT3NAME$30);
                }
                target.set(workInfoAttachment3Name);
            }
        }
        
        /**
         * Unsets the "WorkInfoAttachment3Name" element
         */
        public void unsetWorkInfoAttachment3Name()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKINFOATTACHMENT3NAME$30, 0);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment3Data" element
         */
        public byte[] getWorkInfoAttachment3Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT3DATA$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment3Data" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetWorkInfoAttachment3Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT3DATA$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment3Data" element
         */
        public void setWorkInfoAttachment3Data(byte[] workInfoAttachment3Data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT3DATA$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT3DATA$32);
                }
                target.setByteArrayValue(workInfoAttachment3Data);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment3Data" element
         */
        public void xsetWorkInfoAttachment3Data(org.apache.xmlbeans.XmlBase64Binary workInfoAttachment3Data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(WORKINFOATTACHMENT3DATA$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(WORKINFOATTACHMENT3DATA$32);
                }
                target.set(workInfoAttachment3Data);
            }
        }
        
        /**
         * Gets the "WorkInfoAttachment3OrigSize" element
         */
        public int getWorkInfoAttachment3OrigSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT3ORIGSIZE$34, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "WorkInfoAttachment3OrigSize" element
         */
        public org.apache.xmlbeans.XmlInt xgetWorkInfoAttachment3OrigSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT3ORIGSIZE$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WorkInfoAttachment3OrigSize" element
         */
        public void setWorkInfoAttachment3OrigSize(int workInfoAttachment3OrigSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKINFOATTACHMENT3ORIGSIZE$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKINFOATTACHMENT3ORIGSIZE$34);
                }
                target.setIntValue(workInfoAttachment3OrigSize);
            }
        }
        
        /**
         * Sets (as xml) the "WorkInfoAttachment3OrigSize" element
         */
        public void xsetWorkInfoAttachment3OrigSize(org.apache.xmlbeans.XmlInt workInfoAttachment3OrigSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKINFOATTACHMENT3ORIGSIZE$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WORKINFOATTACHMENT3ORIGSIZE$34);
                }
                target.set(workInfoAttachment3OrigSize);
            }
        }
    }
}
