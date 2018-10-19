/*
 * XML Type:  ListWOObjectQuery
 * Namespace: urn:HPD_IncidentInterface_WS
 * Java type: hpdIncidentInterfaceWS.ListWOObjectQuery
 *
 * Automatically generated - do not modify.
 */
package hpdIncidentInterfaceWS;


/**
 * An XML ListWOObjectQuery(@urn:HPD_IncidentInterface_WS).
 *
 * This is a complex type.
 */
public interface ListWOObjectQuery extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListWOObjectQuery.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAD5DAA27C5D338AA4FC28C570E8E039D").resolveHandle("listwoobjectquery20b6type");
    
    /**
     * Gets array of all "getListValues" elements
     */
    hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues[] getGetListValuesArray();
    
    /**
     * Gets ith "getListValues" element
     */
    hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues getGetListValuesArray(int i);
    
    /**
     * Returns number of "getListValues" element
     */
    int sizeOfGetListValuesArray();
    
    /**
     * Sets array of all "getListValues" element
     */
    void setGetListValuesArray(hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues[] getListValuesArray);
    
    /**
     * Sets ith "getListValues" element
     */
    void setGetListValuesArray(int i, hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues getListValues);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "getListValues" element
     */
    hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues insertNewGetListValues(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "getListValues" element
     */
    hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues addNewGetListValues();
    
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListValues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAD5DAA27C5D338AA4FC28C570E8E039D").resolveHandle("getlistvaluesf334elemtype");
        
        /**
         * Gets the "WorkInfoInstanceID" element
         */
        java.lang.String getWorkInfoInstanceID();
        
        /**
         * Gets (as xml) the "WorkInfoInstanceID" element
         */
        org.apache.xmlbeans.XmlString xgetWorkInfoInstanceID();
        
        /**
         * Sets the "WorkInfoInstanceID" element
         */
        void setWorkInfoInstanceID(java.lang.String workInfoInstanceID);
        
        /**
         * Sets (as xml) the "WorkInfoInstanceID" element
         */
        void xsetWorkInfoInstanceID(org.apache.xmlbeans.XmlString workInfoInstanceID);
        
        /**
         * Gets the "WorkInfoStatus" element
         */
        hpdIncidentInterfaceWS.WorkInfoStatusType.Enum getWorkInfoStatus();
        
        /**
         * Gets (as xml) the "WorkInfoStatus" element
         */
        hpdIncidentInterfaceWS.WorkInfoStatusType xgetWorkInfoStatus();
        
        /**
         * Sets the "WorkInfoStatus" element
         */
        void setWorkInfoStatus(hpdIncidentInterfaceWS.WorkInfoStatusType.Enum workInfoStatus);
        
        /**
         * Sets (as xml) the "WorkInfoStatus" element
         */
        void xsetWorkInfoStatus(hpdIncidentInterfaceWS.WorkInfoStatusType workInfoStatus);
        
        /**
         * Gets the "WorkInfoType" element
         */
        hpdIncidentInterfaceWS.WorkInfoTypeType.Enum getWorkInfoType();
        
        /**
         * Gets (as xml) the "WorkInfoType" element
         */
        hpdIncidentInterfaceWS.WorkInfoTypeType xgetWorkInfoType();
        
        /**
         * Tests for nil "WorkInfoType" element
         */
        boolean isNilWorkInfoType();
        
        /**
         * Sets the "WorkInfoType" element
         */
        void setWorkInfoType(hpdIncidentInterfaceWS.WorkInfoTypeType.Enum workInfoType);
        
        /**
         * Sets (as xml) the "WorkInfoType" element
         */
        void xsetWorkInfoType(hpdIncidentInterfaceWS.WorkInfoTypeType workInfoType);
        
        /**
         * Nils the "WorkInfoType" element
         */
        void setNilWorkInfoType();
        
        /**
         * Gets the "WorkInfoCommSource" element
         */
        hpdIncidentInterfaceWS.WorkInfoSourceType.Enum getWorkInfoCommSource();
        
        /**
         * Gets (as xml) the "WorkInfoCommSource" element
         */
        hpdIncidentInterfaceWS.WorkInfoSourceType xgetWorkInfoCommSource();
        
        /**
         * Tests for nil "WorkInfoCommSource" element
         */
        boolean isNilWorkInfoCommSource();
        
        /**
         * Sets the "WorkInfoCommSource" element
         */
        void setWorkInfoCommSource(hpdIncidentInterfaceWS.WorkInfoSourceType.Enum workInfoCommSource);
        
        /**
         * Sets (as xml) the "WorkInfoCommSource" element
         */
        void xsetWorkInfoCommSource(hpdIncidentInterfaceWS.WorkInfoSourceType workInfoCommSource);
        
        /**
         * Nils the "WorkInfoCommSource" element
         */
        void setNilWorkInfoCommSource();
        
        /**
         * Gets the "WorkInfoSummary" element
         */
        java.lang.String getWorkInfoSummary();
        
        /**
         * Gets (as xml) the "WorkInfoSummary" element
         */
        org.apache.xmlbeans.XmlString xgetWorkInfoSummary();
        
        /**
         * Sets the "WorkInfoSummary" element
         */
        void setWorkInfoSummary(java.lang.String workInfoSummary);
        
        /**
         * Sets (as xml) the "WorkInfoSummary" element
         */
        void xsetWorkInfoSummary(org.apache.xmlbeans.XmlString workInfoSummary);
        
        /**
         * Gets the "WorkInfoNotes" element
         */
        java.lang.String getWorkInfoNotes();
        
        /**
         * Gets (as xml) the "WorkInfoNotes" element
         */
        org.apache.xmlbeans.XmlString xgetWorkInfoNotes();
        
        /**
         * Sets the "WorkInfoNotes" element
         */
        void setWorkInfoNotes(java.lang.String workInfoNotes);
        
        /**
         * Sets (as xml) the "WorkInfoNotes" element
         */
        void xsetWorkInfoNotes(org.apache.xmlbeans.XmlString workInfoNotes);
        
        /**
         * Gets the "ParentID" element
         */
        java.lang.String getParentID();
        
        /**
         * Gets (as xml) the "ParentID" element
         */
        org.apache.xmlbeans.XmlString xgetParentID();
        
        /**
         * Sets the "ParentID" element
         */
        void setParentID(java.lang.String parentID);
        
        /**
         * Sets (as xml) the "ParentID" element
         */
        void xsetParentID(org.apache.xmlbeans.XmlString parentID);
        
        /**
         * Gets the "WorkInfoSecureLog" element
         */
        hpdIncidentInterfaceWS.VIPType.Enum getWorkInfoSecureLog();
        
        /**
         * Gets (as xml) the "WorkInfoSecureLog" element
         */
        hpdIncidentInterfaceWS.VIPType xgetWorkInfoSecureLog();
        
        /**
         * Tests for nil "WorkInfoSecureLog" element
         */
        boolean isNilWorkInfoSecureLog();
        
        /**
         * Sets the "WorkInfoSecureLog" element
         */
        void setWorkInfoSecureLog(hpdIncidentInterfaceWS.VIPType.Enum workInfoSecureLog);
        
        /**
         * Sets (as xml) the "WorkInfoSecureLog" element
         */
        void xsetWorkInfoSecureLog(hpdIncidentInterfaceWS.VIPType workInfoSecureLog);
        
        /**
         * Nils the "WorkInfoSecureLog" element
         */
        void setNilWorkInfoSecureLog();
        
        /**
         * Gets the "WorkInfoSubmitDate" element
         */
        java.util.Calendar getWorkInfoSubmitDate();
        
        /**
         * Gets (as xml) the "WorkInfoSubmitDate" element
         */
        org.apache.xmlbeans.XmlDateTime xgetWorkInfoSubmitDate();
        
        /**
         * True if has "WorkInfoSubmitDate" element
         */
        boolean isSetWorkInfoSubmitDate();
        
        /**
         * Sets the "WorkInfoSubmitDate" element
         */
        void setWorkInfoSubmitDate(java.util.Calendar workInfoSubmitDate);
        
        /**
         * Sets (as xml) the "WorkInfoSubmitDate" element
         */
        void xsetWorkInfoSubmitDate(org.apache.xmlbeans.XmlDateTime workInfoSubmitDate);
        
        /**
         * Unsets the "WorkInfoSubmitDate" element
         */
        void unsetWorkInfoSubmitDate();
        
        /**
         * Gets the "WorkInfoAttachment1Name" element
         */
        java.lang.String getWorkInfoAttachment1Name();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment1Name" element
         */
        org.apache.xmlbeans.XmlString xgetWorkInfoAttachment1Name();
        
        /**
         * True if has "WorkInfoAttachment1Name" element
         */
        boolean isSetWorkInfoAttachment1Name();
        
        /**
         * Sets the "WorkInfoAttachment1Name" element
         */
        void setWorkInfoAttachment1Name(java.lang.String workInfoAttachment1Name);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment1Name" element
         */
        void xsetWorkInfoAttachment1Name(org.apache.xmlbeans.XmlString workInfoAttachment1Name);
        
        /**
         * Unsets the "WorkInfoAttachment1Name" element
         */
        void unsetWorkInfoAttachment1Name();
        
        /**
         * Gets the "WorkInfoAttachment1Data" element
         */
        byte[] getWorkInfoAttachment1Data();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment1Data" element
         */
        org.apache.xmlbeans.XmlBase64Binary xgetWorkInfoAttachment1Data();
        
        /**
         * Sets the "WorkInfoAttachment1Data" element
         */
        void setWorkInfoAttachment1Data(byte[] workInfoAttachment1Data);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment1Data" element
         */
        void xsetWorkInfoAttachment1Data(org.apache.xmlbeans.XmlBase64Binary workInfoAttachment1Data);
        
        /**
         * Gets the "WorkInfoAttachment1OrigSize" element
         */
        int getWorkInfoAttachment1OrigSize();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment1OrigSize" element
         */
        org.apache.xmlbeans.XmlInt xgetWorkInfoAttachment1OrigSize();
        
        /**
         * Sets the "WorkInfoAttachment1OrigSize" element
         */
        void setWorkInfoAttachment1OrigSize(int workInfoAttachment1OrigSize);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment1OrigSize" element
         */
        void xsetWorkInfoAttachment1OrigSize(org.apache.xmlbeans.XmlInt workInfoAttachment1OrigSize);
        
        /**
         * Gets the "WorkInfoAttachment2Name" element
         */
        java.lang.String getWorkInfoAttachment2Name();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment2Name" element
         */
        org.apache.xmlbeans.XmlString xgetWorkInfoAttachment2Name();
        
        /**
         * True if has "WorkInfoAttachment2Name" element
         */
        boolean isSetWorkInfoAttachment2Name();
        
        /**
         * Sets the "WorkInfoAttachment2Name" element
         */
        void setWorkInfoAttachment2Name(java.lang.String workInfoAttachment2Name);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment2Name" element
         */
        void xsetWorkInfoAttachment2Name(org.apache.xmlbeans.XmlString workInfoAttachment2Name);
        
        /**
         * Unsets the "WorkInfoAttachment2Name" element
         */
        void unsetWorkInfoAttachment2Name();
        
        /**
         * Gets the "WorkInfoAttachment2Data" element
         */
        byte[] getWorkInfoAttachment2Data();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment2Data" element
         */
        org.apache.xmlbeans.XmlBase64Binary xgetWorkInfoAttachment2Data();
        
        /**
         * Sets the "WorkInfoAttachment2Data" element
         */
        void setWorkInfoAttachment2Data(byte[] workInfoAttachment2Data);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment2Data" element
         */
        void xsetWorkInfoAttachment2Data(org.apache.xmlbeans.XmlBase64Binary workInfoAttachment2Data);
        
        /**
         * Gets the "WorkInfoAttachment2OrigSize" element
         */
        int getWorkInfoAttachment2OrigSize();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment2OrigSize" element
         */
        org.apache.xmlbeans.XmlInt xgetWorkInfoAttachment2OrigSize();
        
        /**
         * Sets the "WorkInfoAttachment2OrigSize" element
         */
        void setWorkInfoAttachment2OrigSize(int workInfoAttachment2OrigSize);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment2OrigSize" element
         */
        void xsetWorkInfoAttachment2OrigSize(org.apache.xmlbeans.XmlInt workInfoAttachment2OrigSize);
        
        /**
         * Gets the "WorkInfoAttachment3Name" element
         */
        java.lang.String getWorkInfoAttachment3Name();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment3Name" element
         */
        org.apache.xmlbeans.XmlString xgetWorkInfoAttachment3Name();
        
        /**
         * True if has "WorkInfoAttachment3Name" element
         */
        boolean isSetWorkInfoAttachment3Name();
        
        /**
         * Sets the "WorkInfoAttachment3Name" element
         */
        void setWorkInfoAttachment3Name(java.lang.String workInfoAttachment3Name);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment3Name" element
         */
        void xsetWorkInfoAttachment3Name(org.apache.xmlbeans.XmlString workInfoAttachment3Name);
        
        /**
         * Unsets the "WorkInfoAttachment3Name" element
         */
        void unsetWorkInfoAttachment3Name();
        
        /**
         * Gets the "WorkInfoAttachment3Data" element
         */
        byte[] getWorkInfoAttachment3Data();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment3Data" element
         */
        org.apache.xmlbeans.XmlBase64Binary xgetWorkInfoAttachment3Data();
        
        /**
         * Sets the "WorkInfoAttachment3Data" element
         */
        void setWorkInfoAttachment3Data(byte[] workInfoAttachment3Data);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment3Data" element
         */
        void xsetWorkInfoAttachment3Data(org.apache.xmlbeans.XmlBase64Binary workInfoAttachment3Data);
        
        /**
         * Gets the "WorkInfoAttachment3OrigSize" element
         */
        int getWorkInfoAttachment3OrigSize();
        
        /**
         * Gets (as xml) the "WorkInfoAttachment3OrigSize" element
         */
        org.apache.xmlbeans.XmlInt xgetWorkInfoAttachment3OrigSize();
        
        /**
         * Sets the "WorkInfoAttachment3OrigSize" element
         */
        void setWorkInfoAttachment3OrigSize(int workInfoAttachment3OrigSize);
        
        /**
         * Sets (as xml) the "WorkInfoAttachment3OrigSize" element
         */
        void xsetWorkInfoAttachment3OrigSize(org.apache.xmlbeans.XmlInt workInfoAttachment3OrigSize);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues newInstance() {
              return (hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (hpdIncidentInterfaceWS.ListWOObjectQuery.GetListValues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static hpdIncidentInterfaceWS.ListWOObjectQuery newInstance() {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static hpdIncidentInterfaceWS.ListWOObjectQuery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (hpdIncidentInterfaceWS.ListWOObjectQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
