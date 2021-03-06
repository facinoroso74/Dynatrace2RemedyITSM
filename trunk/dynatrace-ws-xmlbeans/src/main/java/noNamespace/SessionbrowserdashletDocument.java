/*
 * An XML document type.
 * Localname: sessionbrowserdashlet
 * Namespace: 
 * Java type: noNamespace.SessionbrowserdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one sessionbrowserdashlet(@) element.
 *
 * This is a complex type.
 */
public interface SessionbrowserdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SessionbrowserdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("sessionbrowserdashlet9a5edoctype");
    
    /**
     * Gets the "sessionbrowserdashlet" element
     */
    noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet getSessionbrowserdashlet();
    
    /**
     * Sets the "sessionbrowserdashlet" element
     */
    void setSessionbrowserdashlet(noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet sessionbrowserdashlet);
    
    /**
     * Appends and returns a new empty "sessionbrowserdashlet" element
     */
    noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet addNewSessionbrowserdashlet();
    
    /**
     * An XML sessionbrowserdashlet(@).
     *
     * This is a complex type.
     */
    public interface Sessionbrowserdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sessionbrowserdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("sessionbrowserdashlet3911elemtype");
        
        /**
         * Gets the "source" element
         */
        noNamespace.SourceType getSource();
        
        /**
         * True if has "source" element
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(noNamespace.SourceType source);
        
        /**
         * Appends and returns a new empty "source" element
         */
        noNamespace.SourceType addNewSource();
        
        /**
         * Unsets the "source" element
         */
        void unsetSource();
        
        /**
         * Gets the "comparesource" element
         */
        noNamespace.SourceType getComparesource();
        
        /**
         * True if has "comparesource" element
         */
        boolean isSetComparesource();
        
        /**
         * Sets the "comparesource" element
         */
        void setComparesource(noNamespace.SourceType comparesource);
        
        /**
         * Appends and returns a new empty "comparesource" element
         */
        noNamespace.SourceType addNewComparesource();
        
        /**
         * Unsets the "comparesource" element
         */
        void unsetComparesource();
        
        /**
         * Gets the "storedsessions" element
         */
        noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions getStoredsessions();
        
        /**
         * True if has "storedsessions" element
         */
        boolean isSetStoredsessions();
        
        /**
         * Sets the "storedsessions" element
         */
        void setStoredsessions(noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions storedsessions);
        
        /**
         * Appends and returns a new empty "storedsessions" element
         */
        noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions addNewStoredsessions();
        
        /**
         * Unsets the "storedsessions" element
         */
        void unsetStoredsessions();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "displaysource" attribute
         */
        java.lang.String getDisplaysource();
        
        /**
         * Gets (as xml) the "displaysource" attribute
         */
        org.apache.xmlbeans.XmlString xgetDisplaysource();
        
        /**
         * Sets the "displaysource" attribute
         */
        void setDisplaysource(java.lang.String displaysource);
        
        /**
         * Sets (as xml) the "displaysource" attribute
         */
        void xsetDisplaysource(org.apache.xmlbeans.XmlString displaysource);
        
        /**
         * An XML storedsessions(@).
         *
         * This is a complex type.
         */
        public interface Storedsessions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Storedsessions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("storedsessions8eddelemtype");
            
            /**
             * Gets array of all "storedsession" elements
             */
            noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession[] getStoredsessionArray();
            
            /**
             * Gets ith "storedsession" element
             */
            noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession getStoredsessionArray(int i);
            
            /**
             * Returns number of "storedsession" element
             */
            int sizeOfStoredsessionArray();
            
            /**
             * Sets array of all "storedsession" element
             */
            void setStoredsessionArray(noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession[] storedsessionArray);
            
            /**
             * Sets ith "storedsession" element
             */
            void setStoredsessionArray(int i, noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession storedsession);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "storedsession" element
             */
            noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession insertNewStoredsession(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "storedsession" element
             */
            noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession addNewStoredsession();
            
            /**
             * Removes the ith "storedsession" element
             */
            void removeStoredsession(int i);
            
            /**
             * Gets the "structuretype" attribute
             */
            java.lang.String getStructuretype();
            
            /**
             * Gets (as xml) the "structuretype" attribute
             */
            org.apache.xmlbeans.XmlString xgetStructuretype();
            
            /**
             * Sets the "structuretype" attribute
             */
            void setStructuretype(java.lang.String structuretype);
            
            /**
             * Sets (as xml) the "structuretype" attribute
             */
            void xsetStructuretype(org.apache.xmlbeans.XmlString structuretype);
            
            /**
             * An XML storedsession(@).
             *
             * This is a complex type.
             */
            public interface Storedsession extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Storedsession.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("storedsession24aeelemtype");
                
                /**
                 * Gets array of all "storedsession" elements
                 */
                noNamespace.StoredsessionDocument.Storedsession[] getStoredsessionArray();
                
                /**
                 * Gets ith "storedsession" element
                 */
                noNamespace.StoredsessionDocument.Storedsession getStoredsessionArray(int i);
                
                /**
                 * Returns number of "storedsession" element
                 */
                int sizeOfStoredsessionArray();
                
                /**
                 * Sets array of all "storedsession" element
                 */
                void setStoredsessionArray(noNamespace.StoredsessionDocument.Storedsession[] storedsessionArray);
                
                /**
                 * Sets ith "storedsession" element
                 */
                void setStoredsessionArray(int i, noNamespace.StoredsessionDocument.Storedsession storedsession);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "storedsession" element
                 */
                noNamespace.StoredsessionDocument.Storedsession insertNewStoredsession(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "storedsession" element
                 */
                noNamespace.StoredsessionDocument.Storedsession addNewStoredsession();
                
                /**
                 * Removes the ith "storedsession" element
                 */
                void removeStoredsession(int i);
                
                /**
                 * Gets the "name" attribute
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * True if has "name" attribute
                 */
                boolean isSetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * Unsets the "name" attribute
                 */
                void unsetName();
                
                /**
                 * Gets the "description" attribute
                 */
                java.lang.String getDescription();
                
                /**
                 * Gets (as xml) the "description" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDescription();
                
                /**
                 * True if has "description" attribute
                 */
                boolean isSetDescription();
                
                /**
                 * Sets the "description" attribute
                 */
                void setDescription(java.lang.String description);
                
                /**
                 * Sets (as xml) the "description" attribute
                 */
                void xsetDescription(org.apache.xmlbeans.XmlString description);
                
                /**
                 * Unsets the "description" attribute
                 */
                void unsetDescription();
                
                /**
                 * Gets the "type" attribute
                 */
                java.lang.String getType();
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                org.apache.xmlbeans.XmlString xgetType();
                
                /**
                 * True if has "type" attribute
                 */
                boolean isSetType();
                
                /**
                 * Sets the "type" attribute
                 */
                void setType(java.lang.String type);
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                void xsetType(org.apache.xmlbeans.XmlString type);
                
                /**
                 * Unsets the "type" attribute
                 */
                void unsetType();
                
                /**
                 * Gets the "system_profile" attribute
                 */
                java.lang.String getSystemProfile();
                
                /**
                 * Gets (as xml) the "system_profile" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSystemProfile();
                
                /**
                 * True if has "system_profile" attribute
                 */
                boolean isSetSystemProfile();
                
                /**
                 * Sets the "system_profile" attribute
                 */
                void setSystemProfile(java.lang.String systemProfile);
                
                /**
                 * Sets (as xml) the "system_profile" attribute
                 */
                void xsetSystemProfile(org.apache.xmlbeans.XmlString systemProfile);
                
                /**
                 * Unsets the "system_profile" attribute
                 */
                void unsetSystemProfile();
                
                /**
                 * Gets the "size" attribute
                 */
                java.lang.String getSize();
                
                /**
                 * Gets (as xml) the "size" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSize();
                
                /**
                 * True if has "size" attribute
                 */
                boolean isSetSize();
                
                /**
                 * Sets the "size" attribute
                 */
                void setSize(java.lang.String size);
                
                /**
                 * Sets (as xml) the "size" attribute
                 */
                void xsetSize(org.apache.xmlbeans.XmlString size);
                
                /**
                 * Unsets the "size" attribute
                 */
                void unsetSize();
                
                /**
                 * Gets the "del_lock" attribute
                 */
                java.lang.String getDelLock();
                
                /**
                 * Gets (as xml) the "del_lock" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDelLock();
                
                /**
                 * True if has "del_lock" attribute
                 */
                boolean isSetDelLock();
                
                /**
                 * Sets the "del_lock" attribute
                 */
                void setDelLock(java.lang.String delLock);
                
                /**
                 * Sets (as xml) the "del_lock" attribute
                 */
                void xsetDelLock(org.apache.xmlbeans.XmlString delLock);
                
                /**
                 * Unsets the "del_lock" attribute
                 */
                void unsetDelLock();
                
                /**
                 * Gets the "directory" attribute
                 */
                java.lang.String getDirectory();
                
                /**
                 * Gets (as xml) the "directory" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDirectory();
                
                /**
                 * True if has "directory" attribute
                 */
                boolean isSetDirectory();
                
                /**
                 * Sets the "directory" attribute
                 */
                void setDirectory(java.lang.String directory);
                
                /**
                 * Sets (as xml) the "directory" attribute
                 */
                void xsetDirectory(org.apache.xmlbeans.XmlString directory);
                
                /**
                 * Unsets the "directory" attribute
                 */
                void unsetDirectory();
                
                /**
                 * Gets the "state" attribute
                 */
                java.lang.String getState();
                
                /**
                 * Gets (as xml) the "state" attribute
                 */
                org.apache.xmlbeans.XmlString xgetState();
                
                /**
                 * True if has "state" attribute
                 */
                boolean isSetState();
                
                /**
                 * Sets the "state" attribute
                 */
                void setState(java.lang.String state);
                
                /**
                 * Sets (as xml) the "state" attribute
                 */
                void xsetState(org.apache.xmlbeans.XmlString state);
                
                /**
                 * Unsets the "state" attribute
                 */
                void unsetState();
                
                /**
                 * Gets the "begin_date" attribute
                 */
                java.util.Calendar getBeginDate();
                
                /**
                 * Gets (as xml) the "begin_date" attribute
                 */
                org.apache.xmlbeans.XmlDateTime xgetBeginDate();
                
                /**
                 * True if has "begin_date" attribute
                 */
                boolean isSetBeginDate();
                
                /**
                 * Sets the "begin_date" attribute
                 */
                void setBeginDate(java.util.Calendar beginDate);
                
                /**
                 * Sets (as xml) the "begin_date" attribute
                 */
                void xsetBeginDate(org.apache.xmlbeans.XmlDateTime beginDate);
                
                /**
                 * Unsets the "begin_date" attribute
                 */
                void unsetBeginDate();
                
                /**
                 * Gets the "duration" attribute
                 */
                java.lang.String getDuration();
                
                /**
                 * Gets (as xml) the "duration" attribute
                 */
                org.apache.xmlbeans.XmlString xgetDuration();
                
                /**
                 * True if has "duration" attribute
                 */
                boolean isSetDuration();
                
                /**
                 * Sets the "duration" attribute
                 */
                void setDuration(java.lang.String duration);
                
                /**
                 * Sets (as xml) the "duration" attribute
                 */
                void xsetDuration(org.apache.xmlbeans.XmlString duration);
                
                /**
                 * Unsets the "duration" attribute
                 */
                void unsetDuration();
                
                /**
                 * Gets the "version" attribute
                 */
                java.lang.String getVersion();
                
                /**
                 * Gets (as xml) the "version" attribute
                 */
                org.apache.xmlbeans.XmlString xgetVersion();
                
                /**
                 * True if has "version" attribute
                 */
                boolean isSetVersion();
                
                /**
                 * Sets the "version" attribute
                 */
                void setVersion(java.lang.String version);
                
                /**
                 * Sets (as xml) the "version" attribute
                 */
                void xsetVersion(org.apache.xmlbeans.XmlString version);
                
                /**
                 * Unsets the "version" attribute
                 */
                void unsetVersion();
                
                /**
                 * Gets the "labels" attribute
                 */
                java.lang.String getLabels();
                
                /**
                 * Gets (as xml) the "labels" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLabels();
                
                /**
                 * True if has "labels" attribute
                 */
                boolean isSetLabels();
                
                /**
                 * Sets the "labels" attribute
                 */
                void setLabels(java.lang.String labels);
                
                /**
                 * Sets (as xml) the "labels" attribute
                 */
                void xsetLabels(org.apache.xmlbeans.XmlString labels);
                
                /**
                 * Unsets the "labels" attribute
                 */
                void unsetLabels();
                
                /**
                 * Gets the "recording_type" attribute
                 */
                java.lang.String getRecordingType();
                
                /**
                 * Gets (as xml) the "recording_type" attribute
                 */
                org.apache.xmlbeans.XmlString xgetRecordingType();
                
                /**
                 * True if has "recording_type" attribute
                 */
                boolean isSetRecordingType();
                
                /**
                 * Sets the "recording_type" attribute
                 */
                void setRecordingType(java.lang.String recordingType);
                
                /**
                 * Sets (as xml) the "recording_type" attribute
                 */
                void xsetRecordingType(org.apache.xmlbeans.XmlString recordingType);
                
                /**
                 * Unsets the "recording_type" attribute
                 */
                void unsetRecordingType();
                
                /**
                 * Gets the "agent" attribute
                 */
                java.lang.String getAgent();
                
                /**
                 * Gets (as xml) the "agent" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgent();
                
                /**
                 * True if has "agent" attribute
                 */
                boolean isSetAgent();
                
                /**
                 * Sets the "agent" attribute
                 */
                void setAgent(java.lang.String agent);
                
                /**
                 * Sets (as xml) the "agent" attribute
                 */
                void xsetAgent(org.apache.xmlbeans.XmlString agent);
                
                /**
                 * Unsets the "agent" attribute
                 */
                void unsetAgent();
                
                /**
                 * Gets the "numPurePaths" attribute
                 */
                java.math.BigInteger getNumPurePaths();
                
                /**
                 * Gets (as xml) the "numPurePaths" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetNumPurePaths();
                
                /**
                 * True if has "numPurePaths" attribute
                 */
                boolean isSetNumPurePaths();
                
                /**
                 * Sets the "numPurePaths" attribute
                 */
                void setNumPurePaths(java.math.BigInteger numPurePaths);
                
                /**
                 * Sets (as xml) the "numPurePaths" attribute
                 */
                void xsetNumPurePaths(org.apache.xmlbeans.XmlInteger numPurePaths);
                
                /**
                 * Unsets the "numPurePaths" attribute
                 */
                void unsetNumPurePaths();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession newInstance() {
                      return (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions.Storedsession) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions newInstance() {
                  return (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet.Storedsessions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet newInstance() {
              return (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.SessionbrowserdashletDocument.Sessionbrowserdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.SessionbrowserdashletDocument newInstance() {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.SessionbrowserdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.SessionbrowserdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.SessionbrowserdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.SessionbrowserdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.SessionbrowserdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.SessionbrowserdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
