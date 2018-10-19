/*
 * XML Type:  GetListOutputMap
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.GetListOutputMap
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS;


/**
 * An XML GetListOutputMap(@urn:HPD_IncidentInterface_WS).
 *
 * This is a complex type.
 */
public interface GetListOutputMap extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListOutputMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAD5DAA27C5D338AA4FC28C570E8E039D").resolveHandle("getlistoutputmapdf90type");
    
    /**
     * Gets array of all "getListValues" elements
     */
    hpdIncidentInterfaceWS.GetListOutputMap.GetListValues[] getGetListValuesArray();
    
    /**
     * Gets ith "getListValues" element
     */
    hpdIncidentInterfaceWS.GetListOutputMap.GetListValues getGetListValuesArray(int i);
    
    /**
     * Returns number of "getListValues" element
     */
    int sizeOfGetListValuesArray();
    
    /**
     * Sets array of all "getListValues" element
     */
    void setGetListValuesArray(hpdIncidentInterfaceWS.GetListOutputMap.GetListValues[] getListValuesArray);
    
    /**
     * Sets ith "getListValues" element
     */
    void setGetListValuesArray(int i, hpdIncidentInterfaceWS.GetListOutputMap.GetListValues getListValues);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getListValues" element
     */
    hpdIncidentInterfaceWS.GetListOutputMap.GetListValues insertNewGetListValues(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getListValues" element
     */
    hpdIncidentInterfaceWS.GetListOutputMap.GetListValues addNewGetListValues();
    
    /**
     * Removes the ith "getListValues" element
     */
    void removeGetListValues(int i);
    
    /**
     * An XML getListValues(@urn:HPD_IncidentInterface_WS).
     *
     * This is a complex type.
     */
    public interface GetListValues extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAD5DAA27C5D338AA4FC28C570E8E039D").resolveHandle("getlistvaluesc552elemtype");
        
        /**
         * Gets the "Assigned_Group" element
         */
        java.lang.String getAssignedGroup();
        
        /**
         * Gets (as xml) the "Assigned_Group" element
         */
        org.apache.xmlbeans.XmlString xgetAssignedGroup();
        
        /**
         * Sets the "Assigned_Group" element
         */
        void setAssignedGroup(java.lang.String assignedGroup);
        
        /**
         * Sets (as xml) the "Assigned_Group" element
         */
        void xsetAssignedGroup(org.apache.xmlbeans.XmlString assignedGroup);
        
        /**
         * Gets the "Assigned_Group_Shift_Name" element
         */
        java.lang.String getAssignedGroupShiftName();
        
        /**
         * Gets (as xml) the "Assigned_Group_Shift_Name" element
         */
        org.apache.xmlbeans.XmlString xgetAssignedGroupShiftName();
        
        /**
         * True if has "Assigned_Group_Shift_Name" element
         */
        boolean isSetAssignedGroupShiftName();
        
        /**
         * Sets the "Assigned_Group_Shift_Name" element
         */
        void setAssignedGroupShiftName(java.lang.String assignedGroupShiftName);
        
        /**
         * Sets (as xml) the "Assigned_Group_Shift_Name" element
         */
        void xsetAssignedGroupShiftName(org.apache.xmlbeans.XmlString assignedGroupShiftName);
        
        /**
         * Unsets the "Assigned_Group_Shift_Name" element
         */
        void unsetAssignedGroupShiftName();
        
        /**
         * Gets the "Assigned_Support_Company" element
         */
        java.lang.String getAssignedSupportCompany();
        
        /**
         * Gets (as xml) the "Assigned_Support_Company" element
         */
        org.apache.xmlbeans.XmlString xgetAssignedSupportCompany();
        
        /**
         * Sets the "Assigned_Support_Company" element
         */
        void setAssignedSupportCompany(java.lang.String assignedSupportCompany);
        
        /**
         * Sets (as xml) the "Assigned_Support_Company" element
         */
        void xsetAssignedSupportCompany(org.apache.xmlbeans.XmlString assignedSupportCompany);
        
        /**
         * Gets the "Assigned_Support_Organization" element
         */
        java.lang.String getAssignedSupportOrganization();
        
        /**
         * Gets (as xml) the "Assigned_Support_Organization" element
         */
        org.apache.xmlbeans.XmlString xgetAssignedSupportOrganization();
        
        /**
         * Sets the "Assigned_Support_Organization" element
         */
        void setAssignedSupportOrganization(java.lang.String assignedSupportOrganization);
        
        /**
         * Sets (as xml) the "Assigned_Support_Organization" element
         */
        void xsetAssignedSupportOrganization(org.apache.xmlbeans.XmlString assignedSupportOrganization);
        
        /**
         * Gets the "Assignee" element
         */
        java.lang.String getAssignee();
        
        /**
         * Gets (as xml) the "Assignee" element
         */
        org.apache.xmlbeans.XmlString xgetAssignee();
        
        /**
         * Sets the "Assignee" element
         */
        void setAssignee(java.lang.String assignee);
        
        /**
         * Sets (as xml) the "Assignee" element
         */
        void xsetAssignee(org.apache.xmlbeans.XmlString assignee);
        
        /**
         * Gets the "Categorization_Tier_1" element
         */
        java.lang.String getCategorizationTier1();
        
        /**
         * Gets (as xml) the "Categorization_Tier_1" element
         */
        org.apache.xmlbeans.XmlString xgetCategorizationTier1();
        
        /**
         * Sets the "Categorization_Tier_1" element
         */
        void setCategorizationTier1(java.lang.String categorizationTier1);
        
        /**
         * Sets (as xml) the "Categorization_Tier_1" element
         */
        void xsetCategorizationTier1(org.apache.xmlbeans.XmlString categorizationTier1);
        
        /**
         * Gets the "Categorization_Tier_2" element
         */
        java.lang.String getCategorizationTier2();
        
        /**
         * Gets (as xml) the "Categorization_Tier_2" element
         */
        org.apache.xmlbeans.XmlString xgetCategorizationTier2();
        
        /**
         * Sets the "Categorization_Tier_2" element
         */
        void setCategorizationTier2(java.lang.String categorizationTier2);
        
        /**
         * Sets (as xml) the "Categorization_Tier_2" element
         */
        void xsetCategorizationTier2(org.apache.xmlbeans.XmlString categorizationTier2);
        
        /**
         * Gets the "Categorization_Tier_3" element
         */
        java.lang.String getCategorizationTier3();
        
        /**
         * Gets (as xml) the "Categorization_Tier_3" element
         */
        org.apache.xmlbeans.XmlString xgetCategorizationTier3();
        
        /**
         * Sets the "Categorization_Tier_3" element
         */
        void setCategorizationTier3(java.lang.String categorizationTier3);
        
        /**
         * Sets (as xml) the "Categorization_Tier_3" element
         */
        void xsetCategorizationTier3(org.apache.xmlbeans.XmlString categorizationTier3);
        
        /**
         * Gets the "City" element
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "City" element
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * Sets the "City" element
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "City" element
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Gets the "Closure_Manufacturer" element
         */
        java.lang.String getClosureManufacturer();
        
        /**
         * Gets (as xml) the "Closure_Manufacturer" element
         */
        org.apache.xmlbeans.XmlString xgetClosureManufacturer();
        
        /**
         * Sets the "Closure_Manufacturer" element
         */
        void setClosureManufacturer(java.lang.String closureManufacturer);
        
        /**
         * Sets (as xml) the "Closure_Manufacturer" element
         */
        void xsetClosureManufacturer(org.apache.xmlbeans.XmlString closureManufacturer);
        
        /**
         * Gets the "Closure_Product_Category_Tier1" element
         */
        java.lang.String getClosureProductCategoryTier1();
        
        /**
         * Gets (as xml) the "Closure_Product_Category_Tier1" element
         */
        org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier1();
        
        /**
         * Sets the "Closure_Product_Category_Tier1" element
         */
        void setClosureProductCategoryTier1(java.lang.String closureProductCategoryTier1);
        
        /**
         * Sets (as xml) the "Closure_Product_Category_Tier1" element
         */
        void xsetClosureProductCategoryTier1(org.apache.xmlbeans.XmlString closureProductCategoryTier1);
        
        /**
         * Gets the "Closure_Product_Category_Tier2" element
         */
        java.lang.String getClosureProductCategoryTier2();
        
        /**
         * Gets (as xml) the "Closure_Product_Category_Tier2" element
         */
        org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier2();
        
        /**
         * Sets the "Closure_Product_Category_Tier2" element
         */
        void setClosureProductCategoryTier2(java.lang.String closureProductCategoryTier2);
        
        /**
         * Sets (as xml) the "Closure_Product_Category_Tier2" element
         */
        void xsetClosureProductCategoryTier2(org.apache.xmlbeans.XmlString closureProductCategoryTier2);
        
        /**
         * Gets the "Closure_Product_Category_Tier3" element
         */
        java.lang.String getClosureProductCategoryTier3();
        
        /**
         * Gets (as xml) the "Closure_Product_Category_Tier3" element
         */
        org.apache.xmlbeans.XmlString xgetClosureProductCategoryTier3();
        
        /**
         * Sets the "Closure_Product_Category_Tier3" element
         */
        void setClosureProductCategoryTier3(java.lang.String closureProductCategoryTier3);
        
        /**
         * Sets (as xml) the "Closure_Product_Category_Tier3" element
         */
        void xsetClosureProductCategoryTier3(org.apache.xmlbeans.XmlString closureProductCategoryTier3);
        
        /**
         * Gets the "Closure_Product_Model_Version" element
         */
        java.lang.String getClosureProductModelVersion();
        
        /**
         * Gets (as xml) the "Closure_Product_Model_Version" element
         */
        org.apache.xmlbeans.XmlString xgetClosureProductModelVersion();
        
        /**
         * Sets the "Closure_Product_Model_Version" element
         */
        void setClosureProductModelVersion(java.lang.String closureProductModelVersion);
        
        /**
         * Sets (as xml) the "Closure_Product_Model_Version" element
         */
        void xsetClosureProductModelVersion(org.apache.xmlbeans.XmlString closureProductModelVersion);
        
        /**
         * Gets the "Closure_Product_Name" element
         */
        java.lang.String getClosureProductName();
        
        /**
         * Gets (as xml) the "Closure_Product_Name" element
         */
        org.apache.xmlbeans.XmlString xgetClosureProductName();
        
        /**
         * Sets the "Closure_Product_Name" element
         */
        void setClosureProductName(java.lang.String closureProductName);
        
        /**
         * Sets (as xml) the "Closure_Product_Name" element
         */
        void xsetClosureProductName(org.apache.xmlbeans.XmlString closureProductName);
        
        /**
         * Gets the "Company" element
         */
        java.lang.String getCompany();
        
        /**
         * Gets (as xml) the "Company" element
         */
        org.apache.xmlbeans.XmlString xgetCompany();
        
        /**
         * Sets the "Company" element
         */
        void setCompany(java.lang.String company);
        
        /**
         * Sets (as xml) the "Company" element
         */
        void xsetCompany(org.apache.xmlbeans.XmlString company);
        
        /**
         * Gets the "Contact_Company" element
         */
        java.lang.String getContactCompany();
        
        /**
         * Gets (as xml) the "Contact_Company" element
         */
        org.apache.xmlbeans.XmlString xgetContactCompany();
        
        /**
         * Sets the "Contact_Company" element
         */
        void setContactCompany(java.lang.String contactCompany);
        
        /**
         * Sets (as xml) the "Contact_Company" element
         */
        void xsetContactCompany(org.apache.xmlbeans.XmlString contactCompany);
        
        /**
         * Gets the "Contact_Sensitivity" element
         */
        hpdIncidentInterfaceWS.ContactSensitivityType.Enum getContactSensitivity();
        
        /**
         * Gets (as xml) the "Contact_Sensitivity" element
         */
        hpdIncidentInterfaceWS.ContactSensitivityType xgetContactSensitivity();
        
        /**
         * Tests for nil "Contact_Sensitivity" element
         */
        boolean isNilContactSensitivity();
        
        /**
         * Sets the "Contact_Sensitivity" element
         */
        void setContactSensitivity(hpdIncidentInterfaceWS.ContactSensitivityType.Enum contactSensitivity);
        
        /**
         * Sets (as xml) the "Contact_Sensitivity" element
         */
        void xsetContactSensitivity(hpdIncidentInterfaceWS.ContactSensitivityType contactSensitivity);
        
        /**
         * Nils the "Contact_Sensitivity" element
         */
        void setNilContactSensitivity();
        
        /**
         * Gets the "Country" element
         */
        java.lang.String getCountry();
        
        /**
         * Gets (as xml) the "Country" element
         */
        org.apache.xmlbeans.XmlString xgetCountry();
        
        /**
         * Sets the "Country" element
         */
        void setCountry(java.lang.String country);
        
        /**
         * Sets (as xml) the "Country" element
         */
        void xsetCountry(org.apache.xmlbeans.XmlString country);
        
        /**
         * Gets the "Department" element
         */
        java.lang.String getDepartment();
        
        /**
         * Gets (as xml) the "Department" element
         */
        org.apache.xmlbeans.XmlString xgetDepartment();
        
        /**
         * Sets the "Department" element
         */
        void setDepartment(java.lang.String department);
        
        /**
         * Sets (as xml) the "Department" element
         */
        void xsetDepartment(org.apache.xmlbeans.XmlString department);
        
        /**
         * Gets the "Summary" element
         */
        java.lang.String getSummary();
        
        /**
         * Gets (as xml) the "Summary" element
         */
        org.apache.xmlbeans.XmlString xgetSummary();
        
        /**
         * Sets the "Summary" element
         */
        void setSummary(java.lang.String summary);
        
        /**
         * Sets (as xml) the "Summary" element
         */
        void xsetSummary(org.apache.xmlbeans.XmlString summary);
        
        /**
         * Gets the "Notes" element
         */
        java.lang.String getNotes();
        
        /**
         * Gets (as xml) the "Notes" element
         */
        org.apache.xmlbeans.XmlString xgetNotes();
        
        /**
         * Sets the "Notes" element
         */
        void setNotes(java.lang.String notes);
        
        /**
         * Sets (as xml) the "Notes" element
         */
        void xsetNotes(org.apache.xmlbeans.XmlString notes);
        
        /**
         * Gets the "First_Name" element
         */
        java.lang.String getFirstName();
        
        /**
         * Gets (as xml) the "First_Name" element
         */
        org.apache.xmlbeans.XmlString xgetFirstName();
        
        /**
         * Sets the "First_Name" element
         */
        void setFirstName(java.lang.String firstName);
        
        /**
         * Sets (as xml) the "First_Name" element
         */
        void xsetFirstName(org.apache.xmlbeans.XmlString firstName);
        
        /**
         * Gets the "Impact" element
         */
        hpdIncidentInterfaceWS.ImpactType.Enum getImpact();
        
        /**
         * Gets (as xml) the "Impact" element
         */
        hpdIncidentInterfaceWS.ImpactType xgetImpact();
        
        /**
         * Tests for nil "Impact" element
         */
        boolean isNilImpact();
        
        /**
         * Sets the "Impact" element
         */
        void setImpact(hpdIncidentInterfaceWS.ImpactType.Enum impact);
        
        /**
         * Sets (as xml) the "Impact" element
         */
        void xsetImpact(hpdIncidentInterfaceWS.ImpactType impact);
        
        /**
         * Nils the "Impact" element
         */
        void setNilImpact();
        
        /**
         * Gets the "Incident_Number" element
         */
        java.lang.String getIncidentNumber();
        
        /**
         * Gets (as xml) the "Incident_Number" element
         */
        org.apache.xmlbeans.XmlString xgetIncidentNumber();
        
        /**
         * Sets the "Incident_Number" element
         */
        void setIncidentNumber(java.lang.String incidentNumber);
        
        /**
         * Sets (as xml) the "Incident_Number" element
         */
        void xsetIncidentNumber(org.apache.xmlbeans.XmlString incidentNumber);
        
        /**
         * Gets the "Internet_E-mail" element
         */
        java.lang.String getInternetEMail();
        
        /**
         * Gets (as xml) the "Internet_E-mail" element
         */
        org.apache.xmlbeans.XmlString xgetInternetEMail();
        
        /**
         * Sets the "Internet_E-mail" element
         */
        void setInternetEMail(java.lang.String internetEMail);
        
        /**
         * Sets (as xml) the "Internet_E-mail" element
         */
        void xsetInternetEMail(org.apache.xmlbeans.XmlString internetEMail);
        
        /**
         * Gets the "Last_Name" element
         */
        java.lang.String getLastName();
        
        /**
         * Gets (as xml) the "Last_Name" element
         */
        org.apache.xmlbeans.XmlString xgetLastName();
        
        /**
         * Sets the "Last_Name" element
         */
        void setLastName(java.lang.String lastName);
        
        /**
         * Sets (as xml) the "Last_Name" element
         */
        void xsetLastName(org.apache.xmlbeans.XmlString lastName);
        
        /**
         * Gets the "Manufacturer" element
         */
        java.lang.String getManufacturer();
        
        /**
         * Gets (as xml) the "Manufacturer" element
         */
        org.apache.xmlbeans.XmlString xgetManufacturer();
        
        /**
         * Sets the "Manufacturer" element
         */
        void setManufacturer(java.lang.String manufacturer);
        
        /**
         * Sets (as xml) the "Manufacturer" element
         */
        void xsetManufacturer(org.apache.xmlbeans.XmlString manufacturer);
        
        /**
         * Gets the "Middle_Initial" element
         */
        java.lang.String getMiddleInitial();
        
        /**
         * Gets (as xml) the "Middle_Initial" element
         */
        org.apache.xmlbeans.XmlString xgetMiddleInitial();
        
        /**
         * Sets the "Middle_Initial" element
         */
        void setMiddleInitial(java.lang.String middleInitial);
        
        /**
         * Sets (as xml) the "Middle_Initial" element
         */
        void xsetMiddleInitial(org.apache.xmlbeans.XmlString middleInitial);
        
        /**
         * Gets the "Organization" element
         */
        java.lang.String getOrganization();
        
        /**
         * Gets (as xml) the "Organization" element
         */
        org.apache.xmlbeans.XmlString xgetOrganization();
        
        /**
         * Sets the "Organization" element
         */
        void setOrganization(java.lang.String organization);
        
        /**
         * Sets (as xml) the "Organization" element
         */
        void xsetOrganization(org.apache.xmlbeans.XmlString organization);
        
        /**
         * Gets the "Phone_Number" element
         */
        java.lang.String getPhoneNumber();
        
        /**
         * Gets (as xml) the "Phone_Number" element
         */
        org.apache.xmlbeans.XmlString xgetPhoneNumber();
        
        /**
         * Sets the "Phone_Number" element
         */
        void setPhoneNumber(java.lang.String phoneNumber);
        
        /**
         * Sets (as xml) the "Phone_Number" element
         */
        void xsetPhoneNumber(org.apache.xmlbeans.XmlString phoneNumber);
        
        /**
         * Gets the "Priority" element
         */
        hpdIncidentInterfaceWS.PriorityType.Enum getPriority();
        
        /**
         * Gets (as xml) the "Priority" element
         */
        hpdIncidentInterfaceWS.PriorityType xgetPriority();
        
        /**
         * Tests for nil "Priority" element
         */
        boolean isNilPriority();
        
        /**
         * Sets the "Priority" element
         */
        void setPriority(hpdIncidentInterfaceWS.PriorityType.Enum priority);
        
        /**
         * Sets (as xml) the "Priority" element
         */
        void xsetPriority(hpdIncidentInterfaceWS.PriorityType priority);
        
        /**
         * Nils the "Priority" element
         */
        void setNilPriority();
        
        /**
         * Gets the "Priority_Weight" element
         */
        int getPriorityWeight();
        
        /**
         * Gets (as xml) the "Priority_Weight" element
         */
        org.apache.xmlbeans.XmlInt xgetPriorityWeight();
        
        /**
         * Tests for nil "Priority_Weight" element
         */
        boolean isNilPriorityWeight();
        
        /**
         * Sets the "Priority_Weight" element
         */
        void setPriorityWeight(int priorityWeight);
        
        /**
         * Sets (as xml) the "Priority_Weight" element
         */
        void xsetPriorityWeight(org.apache.xmlbeans.XmlInt priorityWeight);
        
        /**
         * Nils the "Priority_Weight" element
         */
        void setNilPriorityWeight();
        
        /**
         * Gets the "Product_Categorization_Tier_1" element
         */
        java.lang.String getProductCategorizationTier1();
        
        /**
         * Gets (as xml) the "Product_Categorization_Tier_1" element
         */
        org.apache.xmlbeans.XmlString xgetProductCategorizationTier1();
        
        /**
         * Sets the "Product_Categorization_Tier_1" element
         */
        void setProductCategorizationTier1(java.lang.String productCategorizationTier1);
        
        /**
         * Sets (as xml) the "Product_Categorization_Tier_1" element
         */
        void xsetProductCategorizationTier1(org.apache.xmlbeans.XmlString productCategorizationTier1);
        
        /**
         * Gets the "Product_Categorization_Tier_2" element
         */
        java.lang.String getProductCategorizationTier2();
        
        /**
         * Gets (as xml) the "Product_Categorization_Tier_2" element
         */
        org.apache.xmlbeans.XmlString xgetProductCategorizationTier2();
        
        /**
         * True if has "Product_Categorization_Tier_2" element
         */
        boolean isSetProductCategorizationTier2();
        
        /**
         * Sets the "Product_Categorization_Tier_2" element
         */
        void setProductCategorizationTier2(java.lang.String productCategorizationTier2);
        
        /**
         * Sets (as xml) the "Product_Categorization_Tier_2" element
         */
        void xsetProductCategorizationTier2(org.apache.xmlbeans.XmlString productCategorizationTier2);
        
        /**
         * Unsets the "Product_Categorization_Tier_2" element
         */
        void unsetProductCategorizationTier2();
        
        /**
         * Gets the "Product_Categorization_Tier_3" element
         */
        java.lang.String getProductCategorizationTier3();
        
        /**
         * Gets (as xml) the "Product_Categorization_Tier_3" element
         */
        org.apache.xmlbeans.XmlString xgetProductCategorizationTier3();
        
        /**
         * Sets the "Product_Categorization_Tier_3" element
         */
        void setProductCategorizationTier3(java.lang.String productCategorizationTier3);
        
        /**
         * Sets (as xml) the "Product_Categorization_Tier_3" element
         */
        void xsetProductCategorizationTier3(org.apache.xmlbeans.XmlString productCategorizationTier3);
        
        /**
         * Gets the "Product_Model_Version" element
         */
        java.lang.String getProductModelVersion();
        
        /**
         * Gets (as xml) the "Product_Model_Version" element
         */
        org.apache.xmlbeans.XmlString xgetProductModelVersion();
        
        /**
         * Sets the "Product_Model_Version" element
         */
        void setProductModelVersion(java.lang.String productModelVersion);
        
        /**
         * Sets (as xml) the "Product_Model_Version" element
         */
        void xsetProductModelVersion(org.apache.xmlbeans.XmlString productModelVersion);
        
        /**
         * Gets the "Product_Name" element
         */
        java.lang.String getProductName();
        
        /**
         * Gets (as xml) the "Product_Name" element
         */
        org.apache.xmlbeans.XmlString xgetProductName();
        
        /**
         * Sets the "Product_Name" element
         */
        void setProductName(java.lang.String productName);
        
        /**
         * Sets (as xml) the "Product_Name" element
         */
        void xsetProductName(org.apache.xmlbeans.XmlString productName);
        
        /**
         * Gets the "Region" element
         */
        java.lang.String getRegion();
        
        /**
         * Gets (as xml) the "Region" element
         */
        org.apache.xmlbeans.XmlString xgetRegion();
        
        /**
         * Sets the "Region" element
         */
        void setRegion(java.lang.String region);
        
        /**
         * Sets (as xml) the "Region" element
         */
        void xsetRegion(org.apache.xmlbeans.XmlString region);
        
        /**
         * Gets the "Reported_Source" element
         */
        hpdIncidentInterfaceWS.ReportedSourceType.Enum getReportedSource();
        
        /**
         * Gets (as xml) the "Reported_Source" element
         */
        hpdIncidentInterfaceWS.ReportedSourceType xgetReportedSource();
        
        /**
         * Tests for nil "Reported_Source" element
         */
        boolean isNilReportedSource();
        
        /**
         * Sets the "Reported_Source" element
         */
        void setReportedSource(hpdIncidentInterfaceWS.ReportedSourceType.Enum reportedSource);
        
        /**
         * Sets (as xml) the "Reported_Source" element
         */
        void xsetReportedSource(hpdIncidentInterfaceWS.ReportedSourceType reportedSource);
        
        /**
         * Nils the "Reported_Source" element
         */
        void setNilReportedSource();
        
        /**
         * Gets the "Resolution" element
         */
        java.lang.String getResolution();
        
        /**
         * Gets (as xml) the "Resolution" element
         */
        org.apache.xmlbeans.XmlString xgetResolution();
        
        /**
         * Sets the "Resolution" element
         */
        void setResolution(java.lang.String resolution);
        
        /**
         * Sets (as xml) the "Resolution" element
         */
        void xsetResolution(org.apache.xmlbeans.XmlString resolution);
        
        /**
         * Gets the "Resolution_Category" element
         */
        java.lang.String getResolutionCategory();
        
        /**
         * Gets (as xml) the "Resolution_Category" element
         */
        org.apache.xmlbeans.XmlString xgetResolutionCategory();
        
        /**
         * Sets the "Resolution_Category" element
         */
        void setResolutionCategory(java.lang.String resolutionCategory);
        
        /**
         * Sets (as xml) the "Resolution_Category" element
         */
        void xsetResolutionCategory(org.apache.xmlbeans.XmlString resolutionCategory);
        
        /**
         * Gets the "Resolution_Category_Tier_2" element
         */
        java.lang.String getResolutionCategoryTier2();
        
        /**
         * Gets (as xml) the "Resolution_Category_Tier_2" element
         */
        org.apache.xmlbeans.XmlString xgetResolutionCategoryTier2();
        
        /**
         * Sets the "Resolution_Category_Tier_2" element
         */
        void setResolutionCategoryTier2(java.lang.String resolutionCategoryTier2);
        
        /**
         * Sets (as xml) the "Resolution_Category_Tier_2" element
         */
        void xsetResolutionCategoryTier2(org.apache.xmlbeans.XmlString resolutionCategoryTier2);
        
        /**
         * Gets the "Resolution_Category_Tier_3" element
         */
        java.lang.String getResolutionCategoryTier3();
        
        /**
         * Gets (as xml) the "Resolution_Category_Tier_3" element
         */
        org.apache.xmlbeans.XmlString xgetResolutionCategoryTier3();
        
        /**
         * Sets the "Resolution_Category_Tier_3" element
         */
        void setResolutionCategoryTier3(java.lang.String resolutionCategoryTier3);
        
        /**
         * Sets (as xml) the "Resolution_Category_Tier_3" element
         */
        void xsetResolutionCategoryTier3(org.apache.xmlbeans.XmlString resolutionCategoryTier3);
        
        /**
         * Gets the "Service_Type" element
         */
        hpdIncidentInterfaceWS.ServiceTypeType.Enum getServiceType();
        
        /**
         * Gets (as xml) the "Service_Type" element
         */
        hpdIncidentInterfaceWS.ServiceTypeType xgetServiceType();
        
        /**
         * Tests for nil "Service_Type" element
         */
        boolean isNilServiceType();
        
        /**
         * Sets the "Service_Type" element
         */
        void setServiceType(hpdIncidentInterfaceWS.ServiceTypeType.Enum serviceType);
        
        /**
         * Sets (as xml) the "Service_Type" element
         */
        void xsetServiceType(hpdIncidentInterfaceWS.ServiceTypeType serviceType);
        
        /**
         * Nils the "Service_Type" element
         */
        void setNilServiceType();
        
        /**
         * Gets the "Site" element
         */
        java.lang.String getSite();
        
        /**
         * Gets (as xml) the "Site" element
         */
        org.apache.xmlbeans.XmlString xgetSite();
        
        /**
         * Sets the "Site" element
         */
        void setSite(java.lang.String site);
        
        /**
         * Sets (as xml) the "Site" element
         */
        void xsetSite(org.apache.xmlbeans.XmlString site);
        
        /**
         * Gets the "Site_Group" element
         */
        java.lang.String getSiteGroup();
        
        /**
         * Gets (as xml) the "Site_Group" element
         */
        org.apache.xmlbeans.XmlString xgetSiteGroup();
        
        /**
         * Sets the "Site_Group" element
         */
        void setSiteGroup(java.lang.String siteGroup);
        
        /**
         * Sets (as xml) the "Site_Group" element
         */
        void xsetSiteGroup(org.apache.xmlbeans.XmlString siteGroup);
        
        /**
         * Gets the "Status" element
         */
        hpdIncidentInterfaceWS.StatusType.Enum getStatus();
        
        /**
         * Gets (as xml) the "Status" element
         */
        hpdIncidentInterfaceWS.StatusType xgetStatus();
        
        /**
         * Sets the "Status" element
         */
        void setStatus(hpdIncidentInterfaceWS.StatusType.Enum status);
        
        /**
         * Sets (as xml) the "Status" element
         */
        void xsetStatus(hpdIncidentInterfaceWS.StatusType status);
        
        /**
         * Gets the "Urgency" element
         */
        hpdIncidentInterfaceWS.UrgencyType.Enum getUrgency();
        
        /**
         * Gets (as xml) the "Urgency" element
         */
        hpdIncidentInterfaceWS.UrgencyType xgetUrgency();
        
        /**
         * Tests for nil "Urgency" element
         */
        boolean isNilUrgency();
        
        /**
         * Sets the "Urgency" element
         */
        void setUrgency(hpdIncidentInterfaceWS.UrgencyType.Enum urgency);
        
        /**
         * Sets (as xml) the "Urgency" element
         */
        void xsetUrgency(hpdIncidentInterfaceWS.UrgencyType urgency);
        
        /**
         * Nils the "Urgency" element
         */
        void setNilUrgency();
        
        /**
         * Gets the "VIP" element
         */
        hpdIncidentInterfaceWS.VIPType.Enum getVIP();
        
        /**
         * Gets (as xml) the "VIP" element
         */
        hpdIncidentInterfaceWS.VIPType xgetVIP();
        
        /**
         * Tests for nil "VIP" element
         */
        boolean isNilVIP();
        
        /**
         * Sets the "VIP" element
         */
        void setVIP(hpdIncidentInterfaceWS.VIPType.Enum vip);
        
        /**
         * Sets (as xml) the "VIP" element
         */
        void xsetVIP(hpdIncidentInterfaceWS.VIPType vip);
        
        /**
         * Nils the "VIP" element
         */
        void setNilVIP();
        
        /**
         * Gets the "ServiceCI" element
         */
        java.lang.String getServiceCI();
        
        /**
         * Gets (as xml) the "ServiceCI" element
         */
        org.apache.xmlbeans.XmlString xgetServiceCI();
        
        /**
         * Sets the "ServiceCI" element
         */
        void setServiceCI(java.lang.String serviceCI);
        
        /**
         * Sets (as xml) the "ServiceCI" element
         */
        void xsetServiceCI(org.apache.xmlbeans.XmlString serviceCI);
        
        /**
         * Gets the "ServiceCI_ReconID" element
         */
        java.lang.String getServiceCIReconID();
        
        /**
         * Gets (as xml) the "ServiceCI_ReconID" element
         */
        org.apache.xmlbeans.XmlString xgetServiceCIReconID();
        
        /**
         * Sets the "ServiceCI_ReconID" element
         */
        void setServiceCIReconID(java.lang.String serviceCIReconID);
        
        /**
         * Sets (as xml) the "ServiceCI_ReconID" element
         */
        void xsetServiceCIReconID(org.apache.xmlbeans.XmlString serviceCIReconID);
        
        /**
         * Gets the "HPD_CI" element
         */
        java.lang.String getHPDCI();
        
        /**
         * Gets (as xml) the "HPD_CI" element
         */
        org.apache.xmlbeans.XmlString xgetHPDCI();
        
        /**
         * Sets the "HPD_CI" element
         */
        void setHPDCI(java.lang.String hpdci);
        
        /**
         * Sets (as xml) the "HPD_CI" element
         */
        void xsetHPDCI(org.apache.xmlbeans.XmlString hpdci);
        
        /**
         * Gets the "HPD_CI_ReconID" element
         */
        java.lang.String getHPDCIReconID();
        
        /**
         * Gets (as xml) the "HPD_CI_ReconID" element
         */
        org.apache.xmlbeans.XmlString xgetHPDCIReconID();
        
        /**
         * Sets the "HPD_CI_ReconID" element
         */
        void setHPDCIReconID(java.lang.String hpdciReconID);
        
        /**
         * Sets (as xml) the "HPD_CI_ReconID" element
         */
        void xsetHPDCIReconID(org.apache.xmlbeans.XmlString hpdciReconID);
        
        /**
         * Gets the "HPD_CI_FormName" element
         */
        java.lang.String getHPDCIFormName();
        
        /**
         * Gets (as xml) the "HPD_CI_FormName" element
         */
        org.apache.xmlbeans.XmlString xgetHPDCIFormName();
        
        /**
         * Sets the "HPD_CI_FormName" element
         */
        void setHPDCIFormName(java.lang.String hpdciFormName);
        
        /**
         * Sets (as xml) the "HPD_CI_FormName" element
         */
        void xsetHPDCIFormName(org.apache.xmlbeans.XmlString hpdciFormName);
        
        /**
         * Gets the "z1D_CI_FormName" element
         */
        java.lang.String getZ1DCIFormName();
        
        /**
         * Gets (as xml) the "z1D_CI_FormName" element
         */
        org.apache.xmlbeans.XmlString xgetZ1DCIFormName();
        
        /**
         * Sets the "z1D_CI_FormName" element
         */
        void setZ1DCIFormName(java.lang.String z1DCIFormName);
        
        /**
         * Sets (as xml) the "z1D_CI_FormName" element
         */
        void xsetZ1DCIFormName(org.apache.xmlbeans.XmlString z1DCIFormName);
        
        /**
         * Gets the "Reported_Date" element
         */
        java.util.Calendar getReportedDate();
        
        /**
         * Gets (as xml) the "Reported_Date" element
         */
        org.apache.xmlbeans.XmlDateTime xgetReportedDate();
        
        /**
         * True if has "Reported_Date" element
         */
        boolean isSetReportedDate();
        
        /**
         * Sets the "Reported_Date" element
         */
        void setReportedDate(java.util.Calendar reportedDate);
        
        /**
         * Sets (as xml) the "Reported_Date" element
         */
        void xsetReportedDate(org.apache.xmlbeans.XmlDateTime reportedDate);
        
        /**
         * Unsets the "Reported_Date" element
         */
        void unsetReportedDate();
        
        /**
         * Gets the "Target_Date" element
         */
        java.util.Calendar getTargetDate();
        
        /**
         * Gets (as xml) the "Target_Date" element
         */
        org.apache.xmlbeans.XmlDateTime xgetTargetDate();
        
        /**
         * Tests for nil "Target_Date" element
         */
        boolean isNilTargetDate();
        
        /**
         * True if has "Target_Date" element
         */
        boolean isSetTargetDate();
        
        /**
         * Sets the "Target_Date" element
         */
        void setTargetDate(java.util.Calendar targetDate);
        
        /**
         * Sets (as xml) the "Target_Date" element
         */
        void xsetTargetDate(org.apache.xmlbeans.XmlDateTime targetDate);
        
        /**
         * Nils the "Target_Date" element
         */
        void setNilTargetDate();
        
        /**
         * Unsets the "Target_Date" element
         */
        void unsetTargetDate();
        
        /**
         * Gets the "Submit_Date" element
         */
        java.util.Calendar getSubmitDate();
        
        /**
         * Gets (as xml) the "Submit_Date" element
         */
        org.apache.xmlbeans.XmlDateTime xgetSubmitDate();
        
        /**
         * Tests for nil "Submit_Date" element
         */
        boolean isNilSubmitDate();
        
        /**
         * True if has "Submit_Date" element
         */
        boolean isSetSubmitDate();
        
        /**
         * Sets the "Submit_Date" element
         */
        void setSubmitDate(java.util.Calendar submitDate);
        
        /**
         * Sets (as xml) the "Submit_Date" element
         */
        void xsetSubmitDate(org.apache.xmlbeans.XmlDateTime submitDate);
        
        /**
         * Nils the "Submit_Date" element
         */
        void setNilSubmitDate();
        
        /**
         * Unsets the "Submit_Date" element
         */
        void unsetSubmitDate();
        
        /**
         * Gets the "Closed_Date" element
         */
        java.util.Calendar getClosedDate();
        
        /**
         * Gets (as xml) the "Closed_Date" element
         */
        org.apache.xmlbeans.XmlDateTime xgetClosedDate();
        
        /**
         * Tests for nil "Closed_Date" element
         */
        boolean isNilClosedDate();
        
        /**
         * True if has "Closed_Date" element
         */
        boolean isSetClosedDate();
        
        /**
         * Sets the "Closed_Date" element
         */
        void setClosedDate(java.util.Calendar closedDate);
        
        /**
         * Sets (as xml) the "Closed_Date" element
         */
        void xsetClosedDate(org.apache.xmlbeans.XmlDateTime closedDate);
        
        /**
         * Nils the "Closed_Date" element
         */
        void setNilClosedDate();
        
        /**
         * Unsets the "Closed_Date" element
         */
        void unsetClosedDate();
        
        /**
         * Gets the "Required_Resolution_Date" element
         */
        java.util.Calendar getRequiredResolutionDate();
        
        /**
         * Gets (as xml) the "Required_Resolution_Date" element
         */
        org.apache.xmlbeans.XmlDateTime xgetRequiredResolutionDate();
        
        /**
         * Tests for nil "Required_Resolution_Date" element
         */
        boolean isNilRequiredResolutionDate();
        
        /**
         * True if has "Required_Resolution_Date" element
         */
        boolean isSetRequiredResolutionDate();
        
        /**
         * Sets the "Required_Resolution_Date" element
         */
        void setRequiredResolutionDate(java.util.Calendar requiredResolutionDate);
        
        /**
         * Sets (as xml) the "Required_Resolution_Date" element
         */
        void xsetRequiredResolutionDate(org.apache.xmlbeans.XmlDateTime requiredResolutionDate);
        
        /**
         * Nils the "Required_Resolution_Date" element
         */
        void setNilRequiredResolutionDate();
        
        /**
         * Unsets the "Required_Resolution_Date" element
         */
        void unsetRequiredResolutionDate();
        
        /**
         * Gets the "Status_Reason" element
         */
        hpdIncidentInterfaceWS.StatusReasonType.Enum getStatusReason();
        
        /**
         * Gets (as xml) the "Status_Reason" element
         */
        hpdIncidentInterfaceWS.StatusReasonType xgetStatusReason();
        
        /**
         * Tests for nil "Status_Reason" element
         */
        boolean isNilStatusReason();
        
        /**
         * True if has "Status_Reason" element
         */
        boolean isSetStatusReason();
        
        /**
         * Sets the "Status_Reason" element
         */
        void setStatusReason(hpdIncidentInterfaceWS.StatusReasonType.Enum statusReason);
        
        /**
         * Sets (as xml) the "Status_Reason" element
         */
        void xsetStatusReason(hpdIncidentInterfaceWS.StatusReasonType statusReason);
        
        /**
         * Nils the "Status_Reason" element
         */
        void setNilStatusReason();
        
        /**
         * Unsets the "Status_Reason" element
         */
        void unsetStatusReason();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static hpdIncidentInterfaceWS.GetListOutputMap.GetListValues newInstance() {
              return (hpdIncidentInterfaceWS.GetListOutputMap.GetListValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static hpdIncidentInterfaceWS.GetListOutputMap.GetListValues newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (hpdIncidentInterfaceWS.GetListOutputMap.GetListValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static hpdIncidentInterfaceWS.GetListOutputMap newInstance() {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceWS.GetListOutputMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceWS.GetListOutputMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
