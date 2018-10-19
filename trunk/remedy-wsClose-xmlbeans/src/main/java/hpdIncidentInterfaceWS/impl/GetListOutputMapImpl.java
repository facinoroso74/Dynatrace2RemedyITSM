/*
 * XML Type:  GetListOutputMap
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.GetListOutputMap
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS.impl;
/**
 * An XML GetListOutputMap(@urn:HPD_IncidentInterface_WS).
 *
 * This is a complex type.
 */
public class GetListOutputMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.GetListOutputMap
{
    private static final long serialVersionUID = 1L;
    
    public GetListOutputMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTVALUES$0 = 
        new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "getListValues");
    
    
    /**
     * Gets array of all "getListValues" elements
     */
    public hpdIncidentInterfaceWS.GetListOutputMap.GetListValues[] getGetListValuesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GETLISTVALUES$0, targetList);
            hpdIncidentInterfaceWS.GetListOutputMap.GetListValues[] result = new hpdIncidentInterfaceWS.GetListOutputMap.GetListValues[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "getListValues" element
     */
    public hpdIncidentInterfaceWS.GetListOutputMap.GetListValues getGetListValuesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListOutputMap.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.GetListOutputMap.GetListValues)get_store().find_element_user(GETLISTVALUES$0, i);
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
    public void setGetListValuesArray(hpdIncidentInterfaceWS.GetListOutputMap.GetListValues[] getListValuesArray)
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
    public void setGetListValuesArray(int i, hpdIncidentInterfaceWS.GetListOutputMap.GetListValues getListValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListOutputMap.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.GetListOutputMap.GetListValues)get_store().find_element_user(GETLISTVALUES$0, i);
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
    public hpdIncidentInterfaceWS.GetListOutputMap.GetListValues insertNewGetListValues(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListOutputMap.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.GetListOutputMap.GetListValues)get_store().insert_element_user(GETLISTVALUES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getListValues" element
     */
    public hpdIncidentInterfaceWS.GetListOutputMap.GetListValues addNewGetListValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            hpdIncidentInterfaceWS.GetListOutputMap.GetListValues target = null;
            target = (hpdIncidentInterfaceWS.GetListOutputMap.GetListValues)get_store().add_element_user(GETLISTVALUES$0);
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
    public static class GetListValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements hpdIncidentInterfaceWS.GetListOutputMap.GetListValues
    {
        private static final long serialVersionUID = 1L;
        
        public GetListValuesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ASSIGNEDGROUP$0 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Assigned_Group");
        private static final javax.xml.namespace.QName ASSIGNEDGROUPSHIFTNAME$2 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Assigned_Group_Shift_Name");
        private static final javax.xml.namespace.QName ASSIGNEDSUPPORTCOMPANY$4 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Assigned_Support_Company");
        private static final javax.xml.namespace.QName ASSIGNEDSUPPORTORGANIZATION$6 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Assigned_Support_Organization");
        private static final javax.xml.namespace.QName ASSIGNEE$8 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Assignee");
        private static final javax.xml.namespace.QName CATEGORIZATIONTIER1$10 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Categorization_Tier_1");
        private static final javax.xml.namespace.QName CATEGORIZATIONTIER2$12 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Categorization_Tier_2");
        private static final javax.xml.namespace.QName CATEGORIZATIONTIER3$14 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Categorization_Tier_3");
        private static final javax.xml.namespace.QName CITY$16 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "City");
        private static final javax.xml.namespace.QName CLOSUREMANUFACTURER$18 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Closure_Manufacturer");
        private static final javax.xml.namespace.QName CLOSUREPRODUCTCATEGORYTIER1$20 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Closure_Product_Category_Tier1");
        private static final javax.xml.namespace.QName CLOSUREPRODUCTCATEGORYTIER2$22 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Closure_Product_Category_Tier2");
        private static final javax.xml.namespace.QName CLOSUREPRODUCTCATEGORYTIER3$24 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Closure_Product_Category_Tier3");
        private static final javax.xml.namespace.QName CLOSUREPRODUCTMODELVERSION$26 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Closure_Product_Model_Version");
        private static final javax.xml.namespace.QName CLOSUREPRODUCTNAME$28 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Closure_Product_Name");
        private static final javax.xml.namespace.QName COMPANY$30 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Company");
        private static final javax.xml.namespace.QName CONTACTCOMPANY$32 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Contact_Company");
        private static final javax.xml.namespace.QName CONTACTSENSITIVITY$34 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Contact_Sensitivity");
        private static final javax.xml.namespace.QName COUNTRY$36 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Country");
        private static final javax.xml.namespace.QName DEPARTMENT$38 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Department");
        private static final javax.xml.namespace.QName SUMMARY$40 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Summary");
        private static final javax.xml.namespace.QName NOTES$42 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Notes");
        private static final javax.xml.namespace.QName FIRSTNAME$44 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "First_Name");
        private static final javax.xml.namespace.QName IMPACT$46 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Impact");
        private static final javax.xml.namespace.QName INCIDENTNUMBER$48 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Incident_Number");
        private static final javax.xml.namespace.QName INTERNETEMAIL$50 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Internet_E-mail");
        private static final javax.xml.namespace.QName LASTNAME$52 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Last_Name");
        private static final javax.xml.namespace.QName MANUFACTURER$54 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Manufacturer");
        private static final javax.xml.namespace.QName MIDDLEINITIAL$56 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Middle_Initial");
        private static final javax.xml.namespace.QName ORGANIZATION$58 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Organization");
        private static final javax.xml.namespace.QName PHONENUMBER$60 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Phone_Number");
        private static final javax.xml.namespace.QName PRIORITY$62 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Priority");
        private static final javax.xml.namespace.QName PRIORITYWEIGHT$64 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Priority_Weight");
        private static final javax.xml.namespace.QName PRODUCTCATEGORIZATIONTIER1$66 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Product_Categorization_Tier_1");
        private static final javax.xml.namespace.QName PRODUCTCATEGORIZATIONTIER2$68 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Product_Categorization_Tier_2");
        private static final javax.xml.namespace.QName PRODUCTCATEGORIZATIONTIER3$70 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Product_Categorization_Tier_3");
        private static final javax.xml.namespace.QName PRODUCTMODELVERSION$72 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Product_Model_Version");
        private static final javax.xml.namespace.QName PRODUCTNAME$74 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Product_Name");
        private static final javax.xml.namespace.QName REGION$76 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Region");
        private static final javax.xml.namespace.QName REPORTEDSOURCE$78 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Reported_Source");
        private static final javax.xml.namespace.QName RESOLUTION$80 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Resolution");
        private static final javax.xml.namespace.QName RESOLUTIONCATEGORY$82 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Resolution_Category");
        private static final javax.xml.namespace.QName RESOLUTIONCATEGORYTIER2$84 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Resolution_Category_Tier_2");
        private static final javax.xml.namespace.QName RESOLUTIONCATEGORYTIER3$86 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Resolution_Category_Tier_3");
        private static final javax.xml.namespace.QName SERVICETYPE$88 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Service_Type");
        private static final javax.xml.namespace.QName SITE$90 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Site");
        private static final javax.xml.namespace.QName SITEGROUP$92 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Site_Group");
        private static final javax.xml.namespace.QName STATUS$94 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Status");
        private static final javax.xml.namespace.QName URGENCY$96 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Urgency");
        private static final javax.xml.namespace.QName VIP$98 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "VIP");
        private static final javax.xml.namespace.QName SERVICECI$100 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "ServiceCI");
        private static final javax.xml.namespace.QName SERVICECIRECONID$102 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "ServiceCI_ReconID");
        private static final javax.xml.namespace.QName HPDCI$104 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HPD_CI");
        private static final javax.xml.namespace.QName HPDCIRECONID$106 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HPD_CI_ReconID");
        private static final javax.xml.namespace.QName HPDCIFORMNAME$108 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "HPD_CI_FormName");
        private static final javax.xml.namespace.QName Z1DCIFORMNAME$110 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "z1D_CI_FormName");
        private static final javax.xml.namespace.QName REPORTEDDATE$112 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Reported_Date");
        private static final javax.xml.namespace.QName TARGETDATE$114 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Target_Date");
        private static final javax.xml.namespace.QName SUBMITDATE$116 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Submit_Date");
        private static final javax.xml.namespace.QName CLOSEDDATE$118 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Closed_Date");
        private static final javax.xml.namespace.QName REQUIREDRESOLUTIONDATE$120 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Required_Resolution_Date");
        private static final javax.xml.namespace.QName STATUSREASON$122 = 
            new javax.xml.namespace.QName("urn:HPD_IncidentInterface_WS", "Status_Reason");
        
        
        /**
         * Gets the "Assigned_Group" element
         */
        public java.lang.String getAssignedGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Assigned_Group" element
         */
        public org.apache.xmlbeans.XmlString xgetAssignedGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Assigned_Group" element
         */
        public void setAssignedGroup(java.lang.String assignedGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDGROUP$0);
                }
                target.setStringValue(assignedGroup);
            }
        }
        
        /**
         * Sets (as xml) the "Assigned_Group" element
         */
        public void xsetAssignedGroup(org.apache.xmlbeans.XmlString assignedGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUP$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDGROUP$0);
                }
                target.set(assignedGroup);
            }
        }
        
        /**
         * Gets the "Assigned_Group_Shift_Name" element
         */
        public java.lang.String getAssignedGroupShiftName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Assigned_Group_Shift_Name" element
         */
        public org.apache.xmlbeans.XmlString xgetAssignedGroupShiftName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Assigned_Group_Shift_Name" element
         */
        public boolean isSetAssignedGroupShiftName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ASSIGNEDGROUPSHIFTNAME$2) != 0;
            }
        }
        
        /**
         * Sets the "Assigned_Group_Shift_Name" element
         */
        public void setAssignedGroupShiftName(java.lang.String assignedGroupShiftName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDGROUPSHIFTNAME$2);
                }
                target.setStringValue(assignedGroupShiftName);
            }
        }
        
        /**
         * Sets (as xml) the "Assigned_Group_Shift_Name" element
         */
        public void xsetAssignedGroupShiftName(org.apache.xmlbeans.XmlString assignedGroupShiftName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDGROUPSHIFTNAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDGROUPSHIFTNAME$2);
                }
                target.set(assignedGroupShiftName);
            }
        }
        
        /**
         * Unsets the "Assigned_Group_Shift_Name" element
         */
        public void unsetAssignedGroupShiftName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ASSIGNEDGROUPSHIFTNAME$2, 0);
            }
        }
        
        /**
         * Gets the "Assigned_Support_Company" element
         */
        public java.lang.String getAssignedSupportCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Assigned_Support_Company" element
         */
        public org.apache.xmlbeans.XmlString xgetAssignedSupportCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Assigned_Support_Company" element
         */
        public void setAssignedSupportCompany(java.lang.String assignedSupportCompany)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDSUPPORTCOMPANY$4);
                }
                target.setStringValue(assignedSupportCompany);
            }
        }
        
        /**
         * Sets (as xml) the "Assigned_Support_Company" element
         */
        public void xsetAssignedSupportCompany(org.apache.xmlbeans.XmlString assignedSupportCompany)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTCOMPANY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDSUPPORTCOMPANY$4);
                }
                target.set(assignedSupportCompany);
            }
        }
        
        /**
         * Gets the "Assigned_Support_Organization" element
         */
        public java.lang.String getAssignedSupportOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Assigned_Support_Organization" element
         */
        public org.apache.xmlbeans.XmlString xgetAssignedSupportOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Assigned_Support_Organization" element
         */
        public void setAssignedSupportOrganization(java.lang.String assignedSupportOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDSUPPORTORGANIZATION$6);
                }
                target.setStringValue(assignedSupportOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "Assigned_Support_Organization" element
         */
        public void xsetAssignedSupportOrganization(org.apache.xmlbeans.XmlString assignedSupportOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDSUPPORTORGANIZATION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDSUPPORTORGANIZATION$6);
                }
                target.set(assignedSupportOrganization);
            }
        }
        
        /**
         * Gets the "Assignee" element
         */
        public java.lang.String getAssignee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Assignee" element
         */
        public org.apache.xmlbeans.XmlString xgetAssignee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Assignee" element
         */
        public void setAssignee(java.lang.String assignee)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEE$8);
                }
                target.setStringValue(assignee);
            }
        }
        
        /**
         * Sets (as xml) the "Assignee" element
         */
        public void xsetAssignee(org.apache.xmlbeans.XmlString assignee)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEE$8);
                }
                target.set(assignee);
            }
        }
        
        /**
         * Gets the "Categorization_Tier_1" element
         */
        public java.lang.String getCategorizationTier1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Categorization_Tier_1" element
         */
        public org.apache.xmlbeans.XmlString xgetCategorizationTier1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Categorization_Tier_1" element
         */
        public void setCategorizationTier1(java.lang.String categorizationTier1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIZATIONTIER1$10);
                }
                target.setStringValue(categorizationTier1);
            }
        }
        
        /**
         * Sets (as xml) the "Categorization_Tier_1" element
         */
        public void xsetCategorizationTier1(org.apache.xmlbeans.XmlString categorizationTier1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER1$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIZATIONTIER1$10);
                }
                target.set(categorizationTier1);
            }
        }
        
        /**
         * Gets the "Categorization_Tier_2" element
         */
        public java.lang.String getCategorizationTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Categorization_Tier_2" element
         */
        public org.apache.xmlbeans.XmlString xgetCategorizationTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Categorization_Tier_2" element
         */
        public void setCategorizationTier2(java.lang.String categorizationTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIZATIONTIER2$12);
                }
                target.setStringValue(categorizationTier2);
            }
        }
        
        /**
         * Sets (as xml) the "Categorization_Tier_2" element
         */
        public void xsetCategorizationTier2(org.apache.xmlbeans.XmlString categorizationTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER2$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIZATIONTIER2$12);
                }
                target.set(categorizationTier2);
            }
        }
        
        /**
         * Gets the "Categorization_Tier_3" element
         */
        public java.lang.String getCategorizationTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Categorization_Tier_3" element
         */
        public org.apache.xmlbeans.XmlString xgetCategorizationTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Categorization_Tier_3" element
         */
        public void setCategorizationTier3(java.lang.String categorizationTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORIZATIONTIER3$14);
                }
                target.setStringValue(categorizationTier3);
            }
        }
        
        /**
         * Sets (as xml) the "Categorization_Tier_3" element
         */
        public void xsetCategorizationTier3(org.apache.xmlbeans.XmlString categorizationTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORIZATIONTIER3$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORIZATIONTIER3$14);
                }
                target.set(categorizationTier3);
            }
        }
        
        /**
         * Gets the "City" element
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "City" element
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "City" element
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$16);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "City" element
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$16);
                }
                target.set(city);
            }
        }
        
        /**
         * Gets the "Closure_Manufacturer" element
         */
        public java.lang.String getClosureManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Closure_Manufacturer" element
         */
        public org.apache.xmlbeans.XmlString xgetClosureManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Closure_Manufacturer" element
         */
        public void setClosureManufacturer(java.lang.String closureManufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREMANUFACTURER$18);
                }
                target.setStringValue(closureManufacturer);
            }
        }
        
        /**
         * Sets (as xml) the "Closure_Manufacturer" element
         */
        public void xsetClosureManufacturer(org.apache.xmlbeans.XmlString closureManufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREMANUFACTURER$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREMANUFACTURER$18);
                }
                target.set(closureManufacturer);
            }
        }
        
        /**
         * Gets the "Closure_Product_Category_Tier1" element
         */
        public java.lang.String getClosureProductCategoryTier1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Closure_Product_Category_Tier1" element
         */
        public org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Closure_Product_Category_Tier1" element
         */
        public void setClosureProductCategoryTier1(java.lang.String closureProductCategoryTier1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER1$20);
                }
                target.setStringValue(closureProductCategoryTier1);
            }
        }
        
        /**
         * Sets (as xml) the "Closure_Product_Category_Tier1" element
         */
        public void xsetClosureProductCategoryTier1(org.apache.xmlbeans.XmlString closureProductCategoryTier1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER1$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER1$20);
                }
                target.set(closureProductCategoryTier1);
            }
        }
        
        /**
         * Gets the "Closure_Product_Category_Tier2" element
         */
        public java.lang.String getClosureProductCategoryTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Closure_Product_Category_Tier2" element
         */
        public org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Closure_Product_Category_Tier2" element
         */
        public void setClosureProductCategoryTier2(java.lang.String closureProductCategoryTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER2$22);
                }
                target.setStringValue(closureProductCategoryTier2);
            }
        }
        
        /**
         * Sets (as xml) the "Closure_Product_Category_Tier2" element
         */
        public void xsetClosureProductCategoryTier2(org.apache.xmlbeans.XmlString closureProductCategoryTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER2$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER2$22);
                }
                target.set(closureProductCategoryTier2);
            }
        }
        
        /**
         * Gets the "Closure_Product_Category_Tier3" element
         */
        public java.lang.String getClosureProductCategoryTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Closure_Product_Category_Tier3" element
         */
        public org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Closure_Product_Category_Tier3" element
         */
        public void setClosureProductCategoryTier3(java.lang.String closureProductCategoryTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER3$24);
                }
                target.setStringValue(closureProductCategoryTier3);
            }
        }
        
        /**
         * Sets (as xml) the "Closure_Product_Category_Tier3" element
         */
        public void xsetClosureProductCategoryTier3(org.apache.xmlbeans.XmlString closureProductCategoryTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTCATEGORYTIER3$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTCATEGORYTIER3$24);
                }
                target.set(closureProductCategoryTier3);
            }
        }
        
        /**
         * Gets the "Closure_Product_Model_Version" element
         */
        public java.lang.String getClosureProductModelVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Closure_Product_Model_Version" element
         */
        public org.apache.xmlbeans.XmlString xgetClosureProductModelVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Closure_Product_Model_Version" element
         */
        public void setClosureProductModelVersion(java.lang.String closureProductModelVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTMODELVERSION$26);
                }
                target.setStringValue(closureProductModelVersion);
            }
        }
        
        /**
         * Sets (as xml) the "Closure_Product_Model_Version" element
         */
        public void xsetClosureProductModelVersion(org.apache.xmlbeans.XmlString closureProductModelVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTMODELVERSION$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTMODELVERSION$26);
                }
                target.set(closureProductModelVersion);
            }
        }
        
        /**
         * Gets the "Closure_Product_Name" element
         */
        public java.lang.String getClosureProductName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Closure_Product_Name" element
         */
        public org.apache.xmlbeans.XmlString xgetClosureProductName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Closure_Product_Name" element
         */
        public void setClosureProductName(java.lang.String closureProductName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSUREPRODUCTNAME$28);
                }
                target.setStringValue(closureProductName);
            }
        }
        
        /**
         * Sets (as xml) the "Closure_Product_Name" element
         */
        public void xsetClosureProductName(org.apache.xmlbeans.XmlString closureProductName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLOSUREPRODUCTNAME$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLOSUREPRODUCTNAME$28);
                }
                target.set(closureProductName);
            }
        }
        
        /**
         * Gets the "Company" element
         */
        public java.lang.String getCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Company" element
         */
        public org.apache.xmlbeans.XmlString xgetCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Company" element
         */
        public void setCompany(java.lang.String company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANY$30);
                }
                target.setStringValue(company);
            }
        }
        
        /**
         * Sets (as xml) the "Company" element
         */
        public void xsetCompany(org.apache.xmlbeans.XmlString company)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANY$30);
                }
                target.set(company);
            }
        }
        
        /**
         * Gets the "Contact_Company" element
         */
        public java.lang.String getContactCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTCOMPANY$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Contact_Company" element
         */
        public org.apache.xmlbeans.XmlString xgetContactCompany()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTCOMPANY$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Contact_Company" element
         */
        public void setContactCompany(java.lang.String contactCompany)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTCOMPANY$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTCOMPANY$32);
                }
                target.setStringValue(contactCompany);
            }
        }
        
        /**
         * Sets (as xml) the "Contact_Company" element
         */
        public void xsetContactCompany(org.apache.xmlbeans.XmlString contactCompany)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTCOMPANY$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTCOMPANY$32);
                }
                target.set(contactCompany);
            }
        }
        
        /**
         * Gets the "Contact_Sensitivity" element
         */
        public hpdIncidentInterfaceWS.ContactSensitivityType.Enum getContactSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTSENSITIVITY$34, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.ContactSensitivityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Contact_Sensitivity" element
         */
        public hpdIncidentInterfaceWS.ContactSensitivityType xgetContactSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ContactSensitivityType target = null;
                target = (hpdIncidentInterfaceWS.ContactSensitivityType)get_store().find_element_user(CONTACTSENSITIVITY$34, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Contact_Sensitivity" element
         */
        public boolean isNilContactSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ContactSensitivityType target = null;
                target = (hpdIncidentInterfaceWS.ContactSensitivityType)get_store().find_element_user(CONTACTSENSITIVITY$34, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Contact_Sensitivity" element
         */
        public void setContactSensitivity(hpdIncidentInterfaceWS.ContactSensitivityType.Enum contactSensitivity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTSENSITIVITY$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTSENSITIVITY$34);
                }
                target.setEnumValue(contactSensitivity);
            }
        }
        
        /**
         * Sets (as xml) the "Contact_Sensitivity" element
         */
        public void xsetContactSensitivity(hpdIncidentInterfaceWS.ContactSensitivityType contactSensitivity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ContactSensitivityType target = null;
                target = (hpdIncidentInterfaceWS.ContactSensitivityType)get_store().find_element_user(CONTACTSENSITIVITY$34, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ContactSensitivityType)get_store().add_element_user(CONTACTSENSITIVITY$34);
                }
                target.set(contactSensitivity);
            }
        }
        
        /**
         * Nils the "Contact_Sensitivity" element
         */
        public void setNilContactSensitivity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ContactSensitivityType target = null;
                target = (hpdIncidentInterfaceWS.ContactSensitivityType)get_store().find_element_user(CONTACTSENSITIVITY$34, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ContactSensitivityType)get_store().add_element_user(CONTACTSENSITIVITY$34);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Country" element
         */
        public java.lang.String getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Country" element
         */
        public org.apache.xmlbeans.XmlString xgetCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Country" element
         */
        public void setCountry(java.lang.String country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$36);
                }
                target.setStringValue(country);
            }
        }
        
        /**
         * Sets (as xml) the "Country" element
         */
        public void xsetCountry(org.apache.xmlbeans.XmlString country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$36);
                }
                target.set(country);
            }
        }
        
        /**
         * Gets the "Department" element
         */
        public java.lang.String getDepartment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTMENT$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Department" element
         */
        public org.apache.xmlbeans.XmlString xgetDepartment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTMENT$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Department" element
         */
        public void setDepartment(java.lang.String department)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTMENT$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTMENT$38);
                }
                target.setStringValue(department);
            }
        }
        
        /**
         * Sets (as xml) the "Department" element
         */
        public void xsetDepartment(org.apache.xmlbeans.XmlString department)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTMENT$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPARTMENT$38);
                }
                target.set(department);
            }
        }
        
        /**
         * Gets the "Summary" element
         */
        public java.lang.String getSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Summary" element
         */
        public org.apache.xmlbeans.XmlString xgetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Summary" element
         */
        public void setSummary(java.lang.String summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUMMARY$40);
                }
                target.setStringValue(summary);
            }
        }
        
        /**
         * Sets (as xml) the "Summary" element
         */
        public void xsetSummary(org.apache.xmlbeans.XmlString summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARY$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUMMARY$40);
                }
                target.set(summary);
            }
        }
        
        /**
         * Gets the "Notes" element
         */
        public java.lang.String getNotes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Notes" element
         */
        public org.apache.xmlbeans.XmlString xgetNotes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Notes" element
         */
        public void setNotes(java.lang.String notes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTES$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTES$42);
                }
                target.setStringValue(notes);
            }
        }
        
        /**
         * Sets (as xml) the "Notes" element
         */
        public void xsetNotes(org.apache.xmlbeans.XmlString notes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTES$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTES$42);
                }
                target.set(notes);
            }
        }
        
        /**
         * Gets the "First_Name" element
         */
        public java.lang.String getFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "First_Name" element
         */
        public org.apache.xmlbeans.XmlString xgetFirstName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "First_Name" element
         */
        public void setFirstName(java.lang.String firstName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$44);
                }
                target.setStringValue(firstName);
            }
        }
        
        /**
         * Sets (as xml) the "First_Name" element
         */
        public void xsetFirstName(org.apache.xmlbeans.XmlString firstName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$44);
                }
                target.set(firstName);
            }
        }
        
        /**
         * Gets the "Impact" element
         */
        public hpdIncidentInterfaceWS.ImpactType.Enum getImpact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPACT$46, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.ImpactType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Impact" element
         */
        public hpdIncidentInterfaceWS.ImpactType xgetImpact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ImpactType target = null;
                target = (hpdIncidentInterfaceWS.ImpactType)get_store().find_element_user(IMPACT$46, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Impact" element
         */
        public boolean isNilImpact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ImpactType target = null;
                target = (hpdIncidentInterfaceWS.ImpactType)get_store().find_element_user(IMPACT$46, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Impact" element
         */
        public void setImpact(hpdIncidentInterfaceWS.ImpactType.Enum impact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPACT$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPACT$46);
                }
                target.setEnumValue(impact);
            }
        }
        
        /**
         * Sets (as xml) the "Impact" element
         */
        public void xsetImpact(hpdIncidentInterfaceWS.ImpactType impact)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ImpactType target = null;
                target = (hpdIncidentInterfaceWS.ImpactType)get_store().find_element_user(IMPACT$46, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ImpactType)get_store().add_element_user(IMPACT$46);
                }
                target.set(impact);
            }
        }
        
        /**
         * Nils the "Impact" element
         */
        public void setNilImpact()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ImpactType target = null;
                target = (hpdIncidentInterfaceWS.ImpactType)get_store().find_element_user(IMPACT$46, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ImpactType)get_store().add_element_user(IMPACT$46);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Incident_Number" element
         */
        public java.lang.String getIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$48, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$48, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNUMBER$48);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNUMBER$48);
                }
                target.set(incidentNumber);
            }
        }
        
        /**
         * Gets the "Internet_E-mail" element
         */
        public java.lang.String getInternetEMail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNETEMAIL$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Internet_E-mail" element
         */
        public org.apache.xmlbeans.XmlString xgetInternetEMail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNETEMAIL$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Internet_E-mail" element
         */
        public void setInternetEMail(java.lang.String internetEMail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNETEMAIL$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNETEMAIL$50);
                }
                target.setStringValue(internetEMail);
            }
        }
        
        /**
         * Sets (as xml) the "Internet_E-mail" element
         */
        public void xsetInternetEMail(org.apache.xmlbeans.XmlString internetEMail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNETEMAIL$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERNETEMAIL$50);
                }
                target.set(internetEMail);
            }
        }
        
        /**
         * Gets the "Last_Name" element
         */
        public java.lang.String getLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Last_Name" element
         */
        public org.apache.xmlbeans.XmlString xgetLastName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Last_Name" element
         */
        public void setLastName(java.lang.String lastName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$52);
                }
                target.setStringValue(lastName);
            }
        }
        
        /**
         * Sets (as xml) the "Last_Name" element
         */
        public void xsetLastName(org.apache.xmlbeans.XmlString lastName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$52);
                }
                target.set(lastName);
            }
        }
        
        /**
         * Gets the "Manufacturer" element
         */
        public java.lang.String getManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURER$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Manufacturer" element
         */
        public org.apache.xmlbeans.XmlString xgetManufacturer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURER$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Manufacturer" element
         */
        public void setManufacturer(java.lang.String manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUFACTURER$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUFACTURER$54);
                }
                target.setStringValue(manufacturer);
            }
        }
        
        /**
         * Sets (as xml) the "Manufacturer" element
         */
        public void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUFACTURER$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUFACTURER$54);
                }
                target.set(manufacturer);
            }
        }
        
        /**
         * Gets the "Middle_Initial" element
         */
        public java.lang.String getMiddleInitial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLEINITIAL$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Middle_Initial" element
         */
        public org.apache.xmlbeans.XmlString xgetMiddleInitial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLEINITIAL$56, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Middle_Initial" element
         */
        public void setMiddleInitial(java.lang.String middleInitial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLEINITIAL$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLEINITIAL$56);
                }
                target.setStringValue(middleInitial);
            }
        }
        
        /**
         * Sets (as xml) the "Middle_Initial" element
         */
        public void xsetMiddleInitial(org.apache.xmlbeans.XmlString middleInitial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLEINITIAL$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDDLEINITIAL$56);
                }
                target.set(middleInitial);
            }
        }
        
        /**
         * Gets the "Organization" element
         */
        public java.lang.String getOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Organization" element
         */
        public org.apache.xmlbeans.XmlString xgetOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$58, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Organization" element
         */
        public void setOrganization(java.lang.String organization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATION$58);
                }
                target.setStringValue(organization);
            }
        }
        
        /**
         * Sets (as xml) the "Organization" element
         */
        public void xsetOrganization(org.apache.xmlbeans.XmlString organization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATION$58);
                }
                target.set(organization);
            }
        }
        
        /**
         * Gets the "Phone_Number" element
         */
        public java.lang.String getPhoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Phone_Number" element
         */
        public org.apache.xmlbeans.XmlString xgetPhoneNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Phone_Number" element
         */
        public void setPhoneNumber(java.lang.String phoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONENUMBER$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONENUMBER$60);
                }
                target.setStringValue(phoneNumber);
            }
        }
        
        /**
         * Sets (as xml) the "Phone_Number" element
         */
        public void xsetPhoneNumber(org.apache.xmlbeans.XmlString phoneNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONENUMBER$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONENUMBER$60);
                }
                target.set(phoneNumber);
            }
        }
        
        /**
         * Gets the "Priority" element
         */
        public hpdIncidentInterfaceWS.PriorityType.Enum getPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$62, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.PriorityType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Priority" element
         */
        public hpdIncidentInterfaceWS.PriorityType xgetPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.PriorityType target = null;
                target = (hpdIncidentInterfaceWS.PriorityType)get_store().find_element_user(PRIORITY$62, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Priority" element
         */
        public boolean isNilPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.PriorityType target = null;
                target = (hpdIncidentInterfaceWS.PriorityType)get_store().find_element_user(PRIORITY$62, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Priority" element
         */
        public void setPriority(hpdIncidentInterfaceWS.PriorityType.Enum priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$62);
                }
                target.setEnumValue(priority);
            }
        }
        
        /**
         * Sets (as xml) the "Priority" element
         */
        public void xsetPriority(hpdIncidentInterfaceWS.PriorityType priority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.PriorityType target = null;
                target = (hpdIncidentInterfaceWS.PriorityType)get_store().find_element_user(PRIORITY$62, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.PriorityType)get_store().add_element_user(PRIORITY$62);
                }
                target.set(priority);
            }
        }
        
        /**
         * Nils the "Priority" element
         */
        public void setNilPriority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.PriorityType target = null;
                target = (hpdIncidentInterfaceWS.PriorityType)get_store().find_element_user(PRIORITY$62, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.PriorityType)get_store().add_element_user(PRIORITY$62);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Priority_Weight" element
         */
        public int getPriorityWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITYWEIGHT$64, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Priority_Weight" element
         */
        public org.apache.xmlbeans.XmlInt xgetPriorityWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITYWEIGHT$64, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Priority_Weight" element
         */
        public boolean isNilPriorityWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITYWEIGHT$64, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Priority_Weight" element
         */
        public void setPriorityWeight(int priorityWeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITYWEIGHT$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITYWEIGHT$64);
                }
                target.setIntValue(priorityWeight);
            }
        }
        
        /**
         * Sets (as xml) the "Priority_Weight" element
         */
        public void xsetPriorityWeight(org.apache.xmlbeans.XmlInt priorityWeight)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITYWEIGHT$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIORITYWEIGHT$64);
                }
                target.set(priorityWeight);
            }
        }
        
        /**
         * Nils the "Priority_Weight" element
         */
        public void setNilPriorityWeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITYWEIGHT$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIORITYWEIGHT$64);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Product_Categorization_Tier_1" element
         */
        public java.lang.String getProductCategorizationTier1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$66, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Product_Categorization_Tier_1" element
         */
        public org.apache.xmlbeans.XmlString xgetProductCategorizationTier1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$66, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Product_Categorization_Tier_1" element
         */
        public void setProductCategorizationTier1(java.lang.String productCategorizationTier1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER1$66);
                }
                target.setStringValue(productCategorizationTier1);
            }
        }
        
        /**
         * Sets (as xml) the "Product_Categorization_Tier_1" element
         */
        public void xsetProductCategorizationTier1(org.apache.xmlbeans.XmlString productCategorizationTier1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER1$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER1$66);
                }
                target.set(productCategorizationTier1);
            }
        }
        
        /**
         * Gets the "Product_Categorization_Tier_2" element
         */
        public java.lang.String getProductCategorizationTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$68, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Product_Categorization_Tier_2" element
         */
        public org.apache.xmlbeans.XmlString xgetProductCategorizationTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$68, 0);
                return target;
            }
        }
        
        /**
         * True if has "Product_Categorization_Tier_2" element
         */
        public boolean isSetProductCategorizationTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRODUCTCATEGORIZATIONTIER2$68) != 0;
            }
        }
        
        /**
         * Sets the "Product_Categorization_Tier_2" element
         */
        public void setProductCategorizationTier2(java.lang.String productCategorizationTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER2$68);
                }
                target.setStringValue(productCategorizationTier2);
            }
        }
        
        /**
         * Sets (as xml) the "Product_Categorization_Tier_2" element
         */
        public void xsetProductCategorizationTier2(org.apache.xmlbeans.XmlString productCategorizationTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER2$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER2$68);
                }
                target.set(productCategorizationTier2);
            }
        }
        
        /**
         * Unsets the "Product_Categorization_Tier_2" element
         */
        public void unsetProductCategorizationTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRODUCTCATEGORIZATIONTIER2$68, 0);
            }
        }
        
        /**
         * Gets the "Product_Categorization_Tier_3" element
         */
        public java.lang.String getProductCategorizationTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$70, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Product_Categorization_Tier_3" element
         */
        public org.apache.xmlbeans.XmlString xgetProductCategorizationTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$70, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Product_Categorization_Tier_3" element
         */
        public void setProductCategorizationTier3(java.lang.String productCategorizationTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER3$70);
                }
                target.setStringValue(productCategorizationTier3);
            }
        }
        
        /**
         * Sets (as xml) the "Product_Categorization_Tier_3" element
         */
        public void xsetProductCategorizationTier3(org.apache.xmlbeans.XmlString productCategorizationTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCATEGORIZATIONTIER3$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCATEGORIZATIONTIER3$70);
                }
                target.set(productCategorizationTier3);
            }
        }
        
        /**
         * Gets the "Product_Model_Version" element
         */
        public java.lang.String getProductModelVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTMODELVERSION$72, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Product_Model_Version" element
         */
        public org.apache.xmlbeans.XmlString xgetProductModelVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTMODELVERSION$72, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Product_Model_Version" element
         */
        public void setProductModelVersion(java.lang.String productModelVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTMODELVERSION$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTMODELVERSION$72);
                }
                target.setStringValue(productModelVersion);
            }
        }
        
        /**
         * Sets (as xml) the "Product_Model_Version" element
         */
        public void xsetProductModelVersion(org.apache.xmlbeans.XmlString productModelVersion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTMODELVERSION$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTMODELVERSION$72);
                }
                target.set(productModelVersion);
            }
        }
        
        /**
         * Gets the "Product_Name" element
         */
        public java.lang.String getProductName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Product_Name" element
         */
        public org.apache.xmlbeans.XmlString xgetProductName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$74, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Product_Name" element
         */
        public void setProductName(java.lang.String productName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$74);
                }
                target.setStringValue(productName);
            }
        }
        
        /**
         * Sets (as xml) the "Product_Name" element
         */
        public void xsetProductName(org.apache.xmlbeans.XmlString productName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$74);
                }
                target.set(productName);
            }
        }
        
        /**
         * Gets the "Region" element
         */
        public java.lang.String getRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$76, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Region" element
         */
        public org.apache.xmlbeans.XmlString xgetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$76, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Region" element
         */
        public void setRegion(java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$76);
                }
                target.setStringValue(region);
            }
        }
        
        /**
         * Sets (as xml) the "Region" element
         */
        public void xsetRegion(org.apache.xmlbeans.XmlString region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$76);
                }
                target.set(region);
            }
        }
        
        /**
         * Gets the "Reported_Source" element
         */
        public hpdIncidentInterfaceWS.ReportedSourceType.Enum getReportedSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTEDSOURCE$78, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.ReportedSourceType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Reported_Source" element
         */
        public hpdIncidentInterfaceWS.ReportedSourceType xgetReportedSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ReportedSourceType target = null;
                target = (hpdIncidentInterfaceWS.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$78, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Reported_Source" element
         */
        public boolean isNilReportedSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ReportedSourceType target = null;
                target = (hpdIncidentInterfaceWS.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$78, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Reported_Source" element
         */
        public void setReportedSource(hpdIncidentInterfaceWS.ReportedSourceType.Enum reportedSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTEDSOURCE$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTEDSOURCE$78);
                }
                target.setEnumValue(reportedSource);
            }
        }
        
        /**
         * Sets (as xml) the "Reported_Source" element
         */
        public void xsetReportedSource(hpdIncidentInterfaceWS.ReportedSourceType reportedSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ReportedSourceType target = null;
                target = (hpdIncidentInterfaceWS.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$78, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ReportedSourceType)get_store().add_element_user(REPORTEDSOURCE$78);
                }
                target.set(reportedSource);
            }
        }
        
        /**
         * Nils the "Reported_Source" element
         */
        public void setNilReportedSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ReportedSourceType target = null;
                target = (hpdIncidentInterfaceWS.ReportedSourceType)get_store().find_element_user(REPORTEDSOURCE$78, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ReportedSourceType)get_store().add_element_user(REPORTEDSOURCE$78);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Resolution" element
         */
        public java.lang.String getResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$80, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Resolution" element
         */
        public org.apache.xmlbeans.XmlString xgetResolution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTION$80, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Resolution" element
         */
        public void setResolution(java.lang.String resolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTION$80);
                }
                target.setStringValue(resolution);
            }
        }
        
        /**
         * Sets (as xml) the "Resolution" element
         */
        public void xsetResolution(org.apache.xmlbeans.XmlString resolution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTION$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTION$80);
                }
                target.set(resolution);
            }
        }
        
        /**
         * Gets the "Resolution_Category" element
         */
        public java.lang.String getResolutionCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORY$82, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Resolution_Category" element
         */
        public org.apache.xmlbeans.XmlString xgetResolutionCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORY$82, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Resolution_Category" element
         */
        public void setResolutionCategory(java.lang.String resolutionCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORY$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTIONCATEGORY$82);
                }
                target.setStringValue(resolutionCategory);
            }
        }
        
        /**
         * Sets (as xml) the "Resolution_Category" element
         */
        public void xsetResolutionCategory(org.apache.xmlbeans.XmlString resolutionCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORY$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTIONCATEGORY$82);
                }
                target.set(resolutionCategory);
            }
        }
        
        /**
         * Gets the "Resolution_Category_Tier_2" element
         */
        public java.lang.String getResolutionCategoryTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$84, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Resolution_Category_Tier_2" element
         */
        public org.apache.xmlbeans.XmlString xgetResolutionCategoryTier2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$84, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Resolution_Category_Tier_2" element
         */
        public void setResolutionCategoryTier2(java.lang.String resolutionCategoryTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTIONCATEGORYTIER2$84);
                }
                target.setStringValue(resolutionCategoryTier2);
            }
        }
        
        /**
         * Sets (as xml) the "Resolution_Category_Tier_2" element
         */
        public void xsetResolutionCategoryTier2(org.apache.xmlbeans.XmlString resolutionCategoryTier2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER2$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTIONCATEGORYTIER2$84);
                }
                target.set(resolutionCategoryTier2);
            }
        }
        
        /**
         * Gets the "Resolution_Category_Tier_3" element
         */
        public java.lang.String getResolutionCategoryTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$86, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Resolution_Category_Tier_3" element
         */
        public org.apache.xmlbeans.XmlString xgetResolutionCategoryTier3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$86, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Resolution_Category_Tier_3" element
         */
        public void setResolutionCategoryTier3(java.lang.String resolutionCategoryTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTIONCATEGORYTIER3$86);
                }
                target.setStringValue(resolutionCategoryTier3);
            }
        }
        
        /**
         * Sets (as xml) the "Resolution_Category_Tier_3" element
         */
        public void xsetResolutionCategoryTier3(org.apache.xmlbeans.XmlString resolutionCategoryTier3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOLUTIONCATEGORYTIER3$86, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOLUTIONCATEGORYTIER3$86);
                }
                target.set(resolutionCategoryTier3);
            }
        }
        
        /**
         * Gets the "Service_Type" element
         */
        public hpdIncidentInterfaceWS.ServiceTypeType.Enum getServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPE$88, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.ServiceTypeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Service_Type" element
         */
        public hpdIncidentInterfaceWS.ServiceTypeType xgetServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ServiceTypeType target = null;
                target = (hpdIncidentInterfaceWS.ServiceTypeType)get_store().find_element_user(SERVICETYPE$88, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Service_Type" element
         */
        public boolean isNilServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ServiceTypeType target = null;
                target = (hpdIncidentInterfaceWS.ServiceTypeType)get_store().find_element_user(SERVICETYPE$88, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Service_Type" element
         */
        public void setServiceType(hpdIncidentInterfaceWS.ServiceTypeType.Enum serviceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICETYPE$88, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICETYPE$88);
                }
                target.setEnumValue(serviceType);
            }
        }
        
        /**
         * Sets (as xml) the "Service_Type" element
         */
        public void xsetServiceType(hpdIncidentInterfaceWS.ServiceTypeType serviceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ServiceTypeType target = null;
                target = (hpdIncidentInterfaceWS.ServiceTypeType)get_store().find_element_user(SERVICETYPE$88, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ServiceTypeType)get_store().add_element_user(SERVICETYPE$88);
                }
                target.set(serviceType);
            }
        }
        
        /**
         * Nils the "Service_Type" element
         */
        public void setNilServiceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.ServiceTypeType target = null;
                target = (hpdIncidentInterfaceWS.ServiceTypeType)get_store().find_element_user(SERVICETYPE$88, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.ServiceTypeType)get_store().add_element_user(SERVICETYPE$88);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "Site" element
         */
        public java.lang.String getSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITE$90, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Site" element
         */
        public org.apache.xmlbeans.XmlString xgetSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITE$90, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Site" element
         */
        public void setSite(java.lang.String site)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITE$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITE$90);
                }
                target.setStringValue(site);
            }
        }
        
        /**
         * Sets (as xml) the "Site" element
         */
        public void xsetSite(org.apache.xmlbeans.XmlString site)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITE$90, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITE$90);
                }
                target.set(site);
            }
        }
        
        /**
         * Gets the "Site_Group" element
         */
        public java.lang.String getSiteGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEGROUP$92, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Site_Group" element
         */
        public org.apache.xmlbeans.XmlString xgetSiteGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEGROUP$92, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Site_Group" element
         */
        public void setSiteGroup(java.lang.String siteGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEGROUP$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEGROUP$92);
                }
                target.setStringValue(siteGroup);
            }
        }
        
        /**
         * Sets (as xml) the "Site_Group" element
         */
        public void xsetSiteGroup(org.apache.xmlbeans.XmlString siteGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEGROUP$92, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITEGROUP$92);
                }
                target.set(siteGroup);
            }
        }
        
        /**
         * Gets the "Status" element
         */
        public hpdIncidentInterfaceWS.StatusType.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$94, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.StatusType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" element
         */
        public hpdIncidentInterfaceWS.StatusType xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.StatusType target = null;
                target = (hpdIncidentInterfaceWS.StatusType)get_store().find_element_user(STATUS$94, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Status" element
         */
        public void setStatus(hpdIncidentInterfaceWS.StatusType.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$94, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$94);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" element
         */
        public void xsetStatus(hpdIncidentInterfaceWS.StatusType status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.StatusType target = null;
                target = (hpdIncidentInterfaceWS.StatusType)get_store().find_element_user(STATUS$94, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.StatusType)get_store().add_element_user(STATUS$94);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "Urgency" element
         */
        public hpdIncidentInterfaceWS.UrgencyType.Enum getUrgency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URGENCY$96, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.UrgencyType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Urgency" element
         */
        public hpdIncidentInterfaceWS.UrgencyType xgetUrgency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.UrgencyType target = null;
                target = (hpdIncidentInterfaceWS.UrgencyType)get_store().find_element_user(URGENCY$96, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Urgency" element
         */
        public boolean isNilUrgency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.UrgencyType target = null;
                target = (hpdIncidentInterfaceWS.UrgencyType)get_store().find_element_user(URGENCY$96, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Urgency" element
         */
        public void setUrgency(hpdIncidentInterfaceWS.UrgencyType.Enum urgency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URGENCY$96, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URGENCY$96);
                }
                target.setEnumValue(urgency);
            }
        }
        
        /**
         * Sets (as xml) the "Urgency" element
         */
        public void xsetUrgency(hpdIncidentInterfaceWS.UrgencyType urgency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.UrgencyType target = null;
                target = (hpdIncidentInterfaceWS.UrgencyType)get_store().find_element_user(URGENCY$96, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.UrgencyType)get_store().add_element_user(URGENCY$96);
                }
                target.set(urgency);
            }
        }
        
        /**
         * Nils the "Urgency" element
         */
        public void setNilUrgency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.UrgencyType target = null;
                target = (hpdIncidentInterfaceWS.UrgencyType)get_store().find_element_user(URGENCY$96, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.UrgencyType)get_store().add_element_user(URGENCY$96);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "VIP" element
         */
        public hpdIncidentInterfaceWS.VIPType.Enum getVIP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIP$98, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.VIPType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "VIP" element
         */
        public hpdIncidentInterfaceWS.VIPType xgetVIP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(VIP$98, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "VIP" element
         */
        public boolean isNilVIP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(VIP$98, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "VIP" element
         */
        public void setVIP(hpdIncidentInterfaceWS.VIPType.Enum vip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VIP$98, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VIP$98);
                }
                target.setEnumValue(vip);
            }
        }
        
        /**
         * Sets (as xml) the "VIP" element
         */
        public void xsetVIP(hpdIncidentInterfaceWS.VIPType vip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(VIP$98, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.VIPType)get_store().add_element_user(VIP$98);
                }
                target.set(vip);
            }
        }
        
        /**
         * Nils the "VIP" element
         */
        public void setNilVIP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.VIPType target = null;
                target = (hpdIncidentInterfaceWS.VIPType)get_store().find_element_user(VIP$98, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.VIPType)get_store().add_element_user(VIP$98);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "ServiceCI" element
         */
        public java.lang.String getServiceCI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECI$100, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ServiceCI" element
         */
        public org.apache.xmlbeans.XmlString xgetServiceCI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECI$100, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ServiceCI" element
         */
        public void setServiceCI(java.lang.String serviceCI)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECI$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECI$100);
                }
                target.setStringValue(serviceCI);
            }
        }
        
        /**
         * Sets (as xml) the "ServiceCI" element
         */
        public void xsetServiceCI(org.apache.xmlbeans.XmlString serviceCI)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECI$100, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECI$100);
                }
                target.set(serviceCI);
            }
        }
        
        /**
         * Gets the "ServiceCI_ReconID" element
         */
        public java.lang.String getServiceCIReconID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECIRECONID$102, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ServiceCI_ReconID" element
         */
        public org.apache.xmlbeans.XmlString xgetServiceCIReconID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECIRECONID$102, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ServiceCI_ReconID" element
         */
        public void setServiceCIReconID(java.lang.String serviceCIReconID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECIRECONID$102, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECIRECONID$102);
                }
                target.setStringValue(serviceCIReconID);
            }
        }
        
        /**
         * Sets (as xml) the "ServiceCI_ReconID" element
         */
        public void xsetServiceCIReconID(org.apache.xmlbeans.XmlString serviceCIReconID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECIRECONID$102, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECIRECONID$102);
                }
                target.set(serviceCIReconID);
            }
        }
        
        /**
         * Gets the "HPD_CI" element
         */
        public java.lang.String getHPDCI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCI$104, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HPD_CI" element
         */
        public org.apache.xmlbeans.XmlString xgetHPDCI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCI$104, 0);
                return target;
            }
        }
        
        /**
         * Sets the "HPD_CI" element
         */
        public void setHPDCI(java.lang.String hpdci)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCI$104, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HPDCI$104);
                }
                target.setStringValue(hpdci);
            }
        }
        
        /**
         * Sets (as xml) the "HPD_CI" element
         */
        public void xsetHPDCI(org.apache.xmlbeans.XmlString hpdci)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCI$104, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HPDCI$104);
                }
                target.set(hpdci);
            }
        }
        
        /**
         * Gets the "HPD_CI_ReconID" element
         */
        public java.lang.String getHPDCIReconID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIRECONID$106, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HPD_CI_ReconID" element
         */
        public org.apache.xmlbeans.XmlString xgetHPDCIReconID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIRECONID$106, 0);
                return target;
            }
        }
        
        /**
         * Sets the "HPD_CI_ReconID" element
         */
        public void setHPDCIReconID(java.lang.String hpdciReconID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIRECONID$106, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HPDCIRECONID$106);
                }
                target.setStringValue(hpdciReconID);
            }
        }
        
        /**
         * Sets (as xml) the "HPD_CI_ReconID" element
         */
        public void xsetHPDCIReconID(org.apache.xmlbeans.XmlString hpdciReconID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIRECONID$106, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HPDCIRECONID$106);
                }
                target.set(hpdciReconID);
            }
        }
        
        /**
         * Gets the "HPD_CI_FormName" element
         */
        public java.lang.String getHPDCIFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIFORMNAME$108, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HPD_CI_FormName" element
         */
        public org.apache.xmlbeans.XmlString xgetHPDCIFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIFORMNAME$108, 0);
                return target;
            }
        }
        
        /**
         * Sets the "HPD_CI_FormName" element
         */
        public void setHPDCIFormName(java.lang.String hpdciFormName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HPDCIFORMNAME$108, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HPDCIFORMNAME$108);
                }
                target.setStringValue(hpdciFormName);
            }
        }
        
        /**
         * Sets (as xml) the "HPD_CI_FormName" element
         */
        public void xsetHPDCIFormName(org.apache.xmlbeans.XmlString hpdciFormName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HPDCIFORMNAME$108, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HPDCIFORMNAME$108);
                }
                target.set(hpdciFormName);
            }
        }
        
        /**
         * Gets the "z1D_CI_FormName" element
         */
        public java.lang.String getZ1DCIFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z1DCIFORMNAME$110, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "z1D_CI_FormName" element
         */
        public org.apache.xmlbeans.XmlString xgetZ1DCIFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(Z1DCIFORMNAME$110, 0);
                return target;
            }
        }
        
        /**
         * Sets the "z1D_CI_FormName" element
         */
        public void setZ1DCIFormName(java.lang.String z1DCIFormName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z1DCIFORMNAME$110, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Z1DCIFORMNAME$110);
                }
                target.setStringValue(z1DCIFormName);
            }
        }
        
        /**
         * Sets (as xml) the "z1D_CI_FormName" element
         */
        public void xsetZ1DCIFormName(org.apache.xmlbeans.XmlString z1DCIFormName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(Z1DCIFORMNAME$110, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(Z1DCIFORMNAME$110);
                }
                target.set(z1DCIFormName);
            }
        }
        
        /**
         * Gets the "Reported_Date" element
         */
        public java.util.Calendar getReportedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTEDDATE$112, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Reported_Date" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetReportedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REPORTEDDATE$112, 0);
                return target;
            }
        }
        
        /**
         * True if has "Reported_Date" element
         */
        public boolean isSetReportedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTEDDATE$112) != 0;
            }
        }
        
        /**
         * Sets the "Reported_Date" element
         */
        public void setReportedDate(java.util.Calendar reportedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTEDDATE$112, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTEDDATE$112);
                }
                target.setCalendarValue(reportedDate);
            }
        }
        
        /**
         * Sets (as xml) the "Reported_Date" element
         */
        public void xsetReportedDate(org.apache.xmlbeans.XmlDateTime reportedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REPORTEDDATE$112, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REPORTEDDATE$112);
                }
                target.set(reportedDate);
            }
        }
        
        /**
         * Unsets the "Reported_Date" element
         */
        public void unsetReportedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTEDDATE$112, 0);
            }
        }
        
        /**
         * Gets the "Target_Date" element
         */
        public java.util.Calendar getTargetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDATE$114, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Target_Date" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetTargetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TARGETDATE$114, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Target_Date" element
         */
        public boolean isNilTargetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TARGETDATE$114, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "Target_Date" element
         */
        public boolean isSetTargetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TARGETDATE$114) != 0;
            }
        }
        
        /**
         * Sets the "Target_Date" element
         */
        public void setTargetDate(java.util.Calendar targetDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDATE$114, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETDATE$114);
                }
                target.setCalendarValue(targetDate);
            }
        }
        
        /**
         * Sets (as xml) the "Target_Date" element
         */
        public void xsetTargetDate(org.apache.xmlbeans.XmlDateTime targetDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TARGETDATE$114, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TARGETDATE$114);
                }
                target.set(targetDate);
            }
        }
        
        /**
         * Nils the "Target_Date" element
         */
        public void setNilTargetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TARGETDATE$114, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TARGETDATE$114);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "Target_Date" element
         */
        public void unsetTargetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TARGETDATE$114, 0);
            }
        }
        
        /**
         * Gets the "Submit_Date" element
         */
        public java.util.Calendar getSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBMITDATE$116, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Submit_Date" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SUBMITDATE$116, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Submit_Date" element
         */
        public boolean isNilSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SUBMITDATE$116, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "Submit_Date" element
         */
        public boolean isSetSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBMITDATE$116) != 0;
            }
        }
        
        /**
         * Sets the "Submit_Date" element
         */
        public void setSubmitDate(java.util.Calendar submitDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBMITDATE$116, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBMITDATE$116);
                }
                target.setCalendarValue(submitDate);
            }
        }
        
        /**
         * Sets (as xml) the "Submit_Date" element
         */
        public void xsetSubmitDate(org.apache.xmlbeans.XmlDateTime submitDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SUBMITDATE$116, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SUBMITDATE$116);
                }
                target.set(submitDate);
            }
        }
        
        /**
         * Nils the "Submit_Date" element
         */
        public void setNilSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SUBMITDATE$116, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SUBMITDATE$116);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "Submit_Date" element
         */
        public void unsetSubmitDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBMITDATE$116, 0);
            }
        }
        
        /**
         * Gets the "Closed_Date" element
         */
        public java.util.Calendar getClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDDATE$118, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Closed_Date" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDDATE$118, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Closed_Date" element
         */
        public boolean isNilClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDDATE$118, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "Closed_Date" element
         */
        public boolean isSetClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLOSEDDATE$118) != 0;
            }
        }
        
        /**
         * Sets the "Closed_Date" element
         */
        public void setClosedDate(java.util.Calendar closedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDDATE$118, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSEDDATE$118);
                }
                target.setCalendarValue(closedDate);
            }
        }
        
        /**
         * Sets (as xml) the "Closed_Date" element
         */
        public void xsetClosedDate(org.apache.xmlbeans.XmlDateTime closedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDDATE$118, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLOSEDDATE$118);
                }
                target.set(closedDate);
            }
        }
        
        /**
         * Nils the "Closed_Date" element
         */
        public void setNilClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CLOSEDDATE$118, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CLOSEDDATE$118);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "Closed_Date" element
         */
        public void unsetClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLOSEDDATE$118, 0);
            }
        }
        
        /**
         * Gets the "Required_Resolution_Date" element
         */
        public java.util.Calendar getRequiredResolutionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIREDRESOLUTIONDATE$120, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Required_Resolution_Date" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetRequiredResolutionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUIREDRESOLUTIONDATE$120, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Required_Resolution_Date" element
         */
        public boolean isNilRequiredResolutionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUIREDRESOLUTIONDATE$120, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "Required_Resolution_Date" element
         */
        public boolean isSetRequiredResolutionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUIREDRESOLUTIONDATE$120) != 0;
            }
        }
        
        /**
         * Sets the "Required_Resolution_Date" element
         */
        public void setRequiredResolutionDate(java.util.Calendar requiredResolutionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIREDRESOLUTIONDATE$120, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUIREDRESOLUTIONDATE$120);
                }
                target.setCalendarValue(requiredResolutionDate);
            }
        }
        
        /**
         * Sets (as xml) the "Required_Resolution_Date" element
         */
        public void xsetRequiredResolutionDate(org.apache.xmlbeans.XmlDateTime requiredResolutionDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUIREDRESOLUTIONDATE$120, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REQUIREDRESOLUTIONDATE$120);
                }
                target.set(requiredResolutionDate);
            }
        }
        
        /**
         * Nils the "Required_Resolution_Date" element
         */
        public void setNilRequiredResolutionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUIREDRESOLUTIONDATE$120, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REQUIREDRESOLUTIONDATE$120);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "Required_Resolution_Date" element
         */
        public void unsetRequiredResolutionDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUIREDRESOLUTIONDATE$120, 0);
            }
        }
        
        /**
         * Gets the "Status_Reason" element
         */
        public hpdIncidentInterfaceWS.StatusReasonType.Enum getStatusReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSREASON$122, 0);
                if (target == null)
                {
                    return null;
                }
                return (hpdIncidentInterfaceWS.StatusReasonType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status_Reason" element
         */
        public hpdIncidentInterfaceWS.StatusReasonType xgetStatusReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.StatusReasonType target = null;
                target = (hpdIncidentInterfaceWS.StatusReasonType)get_store().find_element_user(STATUSREASON$122, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Status_Reason" element
         */
        public boolean isNilStatusReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.StatusReasonType target = null;
                target = (hpdIncidentInterfaceWS.StatusReasonType)get_store().find_element_user(STATUSREASON$122, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "Status_Reason" element
         */
        public boolean isSetStatusReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUSREASON$122) != 0;
            }
        }
        
        /**
         * Sets the "Status_Reason" element
         */
        public void setStatusReason(hpdIncidentInterfaceWS.StatusReasonType.Enum statusReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSREASON$122, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSREASON$122);
                }
                target.setEnumValue(statusReason);
            }
        }
        
        /**
         * Sets (as xml) the "Status_Reason" element
         */
        public void xsetStatusReason(hpdIncidentInterfaceWS.StatusReasonType statusReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.StatusReasonType target = null;
                target = (hpdIncidentInterfaceWS.StatusReasonType)get_store().find_element_user(STATUSREASON$122, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.StatusReasonType)get_store().add_element_user(STATUSREASON$122);
                }
                target.set(statusReason);
            }
        }
        
        /**
         * Nils the "Status_Reason" element
         */
        public void setNilStatusReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                hpdIncidentInterfaceWS.StatusReasonType target = null;
                target = (hpdIncidentInterfaceWS.StatusReasonType)get_store().find_element_user(STATUSREASON$122, 0);
                if (target == null)
                {
                    target = (hpdIncidentInterfaceWS.StatusReasonType)get_store().add_element_user(STATUSREASON$122);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "Status_Reason" element
         */
        public void unsetStatusReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUSREASON$122, 0);
            }
        }
    }
}
