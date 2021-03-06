/*
 * An XML document type.
 * Localname: statusoverviewdashlet
 * Namespace: 
 * Java type: noNamespace.StatusoverviewdashletDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one statusoverviewdashlet(@) element.
 *
 * This is a complex type.
 */
public interface StatusoverviewdashletDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusoverviewdashletDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("statusoverviewdashlet94a5doctype");
    
    /**
     * Gets the "statusoverviewdashlet" element
     */
    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet getStatusoverviewdashlet();
    
    /**
     * Sets the "statusoverviewdashlet" element
     */
    void setStatusoverviewdashlet(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet statusoverviewdashlet);
    
    /**
     * Appends and returns a new empty "statusoverviewdashlet" element
     */
    noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet addNewStatusoverviewdashlet();
    
    /**
     * An XML statusoverviewdashlet(@).
     *
     * This is a complex type.
     */
    public interface Statusoverviewdashlet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Statusoverviewdashlet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("statusoverviewdashlet889felemtype");
        
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
         * Gets the "agentsoverviewrecords" element
         */
        noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords getAgentsoverviewrecords();
        
        /**
         * True if has "agentsoverviewrecords" element
         */
        boolean isSetAgentsoverviewrecords();
        
        /**
         * Sets the "agentsoverviewrecords" element
         */
        void setAgentsoverviewrecords(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords agentsoverviewrecords);
        
        /**
         * Appends and returns a new empty "agentsoverviewrecords" element
         */
        noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords addNewAgentsoverviewrecords();
        
        /**
         * Unsets the "agentsoverviewrecords" element
         */
        void unsetAgentsoverviewrecords();
        
        /**
         * Gets the "statustaskmonitorrecords" element
         */
        noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords getStatustaskmonitorrecords();
        
        /**
         * True if has "statustaskmonitorrecords" element
         */
        boolean isSetStatustaskmonitorrecords();
        
        /**
         * Sets the "statustaskmonitorrecords" element
         */
        void setStatustaskmonitorrecords(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords statustaskmonitorrecords);
        
        /**
         * Appends and returns a new empty "statustaskmonitorrecords" element
         */
        noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords addNewStatustaskmonitorrecords();
        
        /**
         * Unsets the "statustaskmonitorrecords" element
         */
        void unsetStatustaskmonitorrecords();
        
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
         * An XML agentsoverviewrecords(@).
         *
         * This is a complex type.
         */
        public interface Agentsoverviewrecords extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Agentsoverviewrecords.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("agentsoverviewrecords43f6elemtype");
            
            /**
             * Gets array of all "agentsoverviewrecord" elements
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord[] getAgentsoverviewrecordArray();
            
            /**
             * Gets ith "agentsoverviewrecord" element
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord getAgentsoverviewrecordArray(int i);
            
            /**
             * Returns number of "agentsoverviewrecord" element
             */
            int sizeOfAgentsoverviewrecordArray();
            
            /**
             * Sets array of all "agentsoverviewrecord" element
             */
            void setAgentsoverviewrecordArray(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord[] agentsoverviewrecordArray);
            
            /**
             * Sets ith "agentsoverviewrecord" element
             */
            void setAgentsoverviewrecordArray(int i, noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord agentsoverviewrecord);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "agentsoverviewrecord" element
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord insertNewAgentsoverviewrecord(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "agentsoverviewrecord" element
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord addNewAgentsoverviewrecord();
            
            /**
             * Removes the ith "agentsoverviewrecord" element
             */
            void removeAgentsoverviewrecord(int i);
            
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
             * An XML agentsoverviewrecord(@).
             *
             * This is a complex type.
             */
            public interface Agentsoverviewrecord extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Agentsoverviewrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("agentsoverviewrecord3f1aelemtype");
                
                /**
                 * Gets array of all "agentsoverviewrecord" elements
                 */
                noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord[] getAgentsoverviewrecordArray();
                
                /**
                 * Gets ith "agentsoverviewrecord" element
                 */
                noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord getAgentsoverviewrecordArray(int i);
                
                /**
                 * Returns number of "agentsoverviewrecord" element
                 */
                int sizeOfAgentsoverviewrecordArray();
                
                /**
                 * Sets array of all "agentsoverviewrecord" element
                 */
                void setAgentsoverviewrecordArray(noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord[] agentsoverviewrecordArray);
                
                /**
                 * Sets ith "agentsoverviewrecord" element
                 */
                void setAgentsoverviewrecordArray(int i, noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord agentsoverviewrecord);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "agentsoverviewrecord" element
                 */
                noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord insertNewAgentsoverviewrecord(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "agentsoverviewrecord" element
                 */
                noNamespace.AgentsoverviewrecordDocument.Agentsoverviewrecord addNewAgentsoverviewrecord();
                
                /**
                 * Removes the ith "agentsoverviewrecord" element
                 */
                void removeAgentsoverviewrecord(int i);
                
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
                 * Gets the "host" attribute
                 */
                java.lang.String getHost();
                
                /**
                 * Gets (as xml) the "host" attribute
                 */
                org.apache.xmlbeans.XmlString xgetHost();
                
                /**
                 * True if has "host" attribute
                 */
                boolean isSetHost();
                
                /**
                 * Sets the "host" attribute
                 */
                void setHost(java.lang.String host);
                
                /**
                 * Sets (as xml) the "host" attribute
                 */
                void xsetHost(org.apache.xmlbeans.XmlString host);
                
                /**
                 * Unsets the "host" attribute
                 */
                void unsetHost();
                
                /**
                 * Gets the "hot" attribute
                 */
                java.lang.String getHot();
                
                /**
                 * Gets (as xml) the "hot" attribute
                 */
                org.apache.xmlbeans.XmlString xgetHot();
                
                /**
                 * True if has "hot" attribute
                 */
                boolean isSetHot();
                
                /**
                 * Sets the "hot" attribute
                 */
                void setHot(java.lang.String hot);
                
                /**
                 * Sets (as xml) the "hot" attribute
                 */
                void xsetHot(org.apache.xmlbeans.XmlString hot);
                
                /**
                 * Unsets the "hot" attribute
                 */
                void unsetHot();
                
                /**
                 * Gets the "system" attribute
                 */
                java.lang.String getSystem();
                
                /**
                 * Gets (as xml) the "system" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSystem();
                
                /**
                 * True if has "system" attribute
                 */
                boolean isSetSystem();
                
                /**
                 * Sets the "system" attribute
                 */
                void setSystem(java.lang.String system);
                
                /**
                 * Sets (as xml) the "system" attribute
                 */
                void xsetSystem(org.apache.xmlbeans.XmlString system);
                
                /**
                 * Unsets the "system" attribute
                 */
                void unsetSystem();
                
                /**
                 * Gets the "mapping" attribute
                 */
                java.lang.String getMapping();
                
                /**
                 * Gets (as xml) the "mapping" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMapping();
                
                /**
                 * True if has "mapping" attribute
                 */
                boolean isSetMapping();
                
                /**
                 * Sets the "mapping" attribute
                 */
                void setMapping(java.lang.String mapping);
                
                /**
                 * Sets (as xml) the "mapping" attribute
                 */
                void xsetMapping(org.apache.xmlbeans.XmlString mapping);
                
                /**
                 * Unsets the "mapping" attribute
                 */
                void unsetMapping();
                
                /**
                 * Gets the "group" attribute
                 */
                java.lang.String getGroup();
                
                /**
                 * Gets (as xml) the "group" attribute
                 */
                org.apache.xmlbeans.XmlString xgetGroup();
                
                /**
                 * True if has "group" attribute
                 */
                boolean isSetGroup();
                
                /**
                 * Sets the "group" attribute
                 */
                void setGroup(java.lang.String group);
                
                /**
                 * Sets (as xml) the "group" attribute
                 */
                void xsetGroup(org.apache.xmlbeans.XmlString group);
                
                /**
                 * Unsets the "group" attribute
                 */
                void unsetGroup();
                
                /**
                 * Gets the "technology" attribute
                 */
                java.lang.String getTechnology();
                
                /**
                 * Gets (as xml) the "technology" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTechnology();
                
                /**
                 * True if has "technology" attribute
                 */
                boolean isSetTechnology();
                
                /**
                 * Sets the "technology" attribute
                 */
                void setTechnology(java.lang.String technology);
                
                /**
                 * Sets (as xml) the "technology" attribute
                 */
                void xsetTechnology(org.apache.xmlbeans.XmlString technology);
                
                /**
                 * Unsets the "technology" attribute
                 */
                void unsetTechnology();
                
                /**
                 * Gets the "started" attribute
                 */
                java.util.Calendar getStarted();
                
                /**
                 * Gets (as xml) the "started" attribute
                 */
                org.apache.xmlbeans.XmlDateTime xgetStarted();
                
                /**
                 * True if has "started" attribute
                 */
                boolean isSetStarted();
                
                /**
                 * Sets the "started" attribute
                 */
                void setStarted(java.util.Calendar started);
                
                /**
                 * Sets (as xml) the "started" attribute
                 */
                void xsetStarted(org.apache.xmlbeans.XmlDateTime started);
                
                /**
                 * Unsets the "started" attribute
                 */
                void unsetStarted();
                
                /**
                 * Gets the "eventcount" attribute
                 */
                java.math.BigInteger getEventcount();
                
                /**
                 * Gets (as xml) the "eventcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetEventcount();
                
                /**
                 * True if has "eventcount" attribute
                 */
                boolean isSetEventcount();
                
                /**
                 * Sets the "eventcount" attribute
                 */
                void setEventcount(java.math.BigInteger eventcount);
                
                /**
                 * Sets (as xml) the "eventcount" attribute
                 */
                void xsetEventcount(org.apache.xmlbeans.XmlInteger eventcount);
                
                /**
                 * Unsets the "eventcount" attribute
                 */
                void unsetEventcount();
                
                /**
                 * Gets the "classloadcount" attribute
                 */
                java.math.BigInteger getClassloadcount();
                
                /**
                 * Gets (as xml) the "classloadcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetClassloadcount();
                
                /**
                 * True if has "classloadcount" attribute
                 */
                boolean isSetClassloadcount();
                
                /**
                 * Sets the "classloadcount" attribute
                 */
                void setClassloadcount(java.math.BigInteger classloadcount);
                
                /**
                 * Sets (as xml) the "classloadcount" attribute
                 */
                void xsetClassloadcount(org.apache.xmlbeans.XmlInteger classloadcount);
                
                /**
                 * Unsets the "classloadcount" attribute
                 */
                void unsetClassloadcount();
                
                /**
                 * Gets the "totalclassloadcount" attribute
                 */
                java.math.BigInteger getTotalclassloadcount();
                
                /**
                 * Gets (as xml) the "totalclassloadcount" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetTotalclassloadcount();
                
                /**
                 * True if has "totalclassloadcount" attribute
                 */
                boolean isSetTotalclassloadcount();
                
                /**
                 * Sets the "totalclassloadcount" attribute
                 */
                void setTotalclassloadcount(java.math.BigInteger totalclassloadcount);
                
                /**
                 * Sets (as xml) the "totalclassloadcount" attribute
                 */
                void xsetTotalclassloadcount(org.apache.xmlbeans.XmlInteger totalclassloadcount);
                
                /**
                 * Unsets the "totalclassloadcount" attribute
                 */
                void unsetTotalclassloadcount();
                
                /**
                 * Gets the "totalexecpaths" attribute
                 */
                java.math.BigInteger getTotalexecpaths();
                
                /**
                 * Gets (as xml) the "totalexecpaths" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetTotalexecpaths();
                
                /**
                 * True if has "totalexecpaths" attribute
                 */
                boolean isSetTotalexecpaths();
                
                /**
                 * Sets the "totalexecpaths" attribute
                 */
                void setTotalexecpaths(java.math.BigInteger totalexecpaths);
                
                /**
                 * Sets (as xml) the "totalexecpaths" attribute
                 */
                void xsetTotalexecpaths(org.apache.xmlbeans.XmlInteger totalexecpaths);
                
                /**
                 * Unsets the "totalexecpaths" attribute
                 */
                void unsetTotalexecpaths();
                
                /**
                 * Gets the "totalexectime" attribute
                 */
                double getTotalexectime();
                
                /**
                 * Gets (as xml) the "totalexectime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalexectime();
                
                /**
                 * True if has "totalexectime" attribute
                 */
                boolean isSetTotalexectime();
                
                /**
                 * Sets the "totalexectime" attribute
                 */
                void setTotalexectime(double totalexectime);
                
                /**
                 * Sets (as xml) the "totalexectime" attribute
                 */
                void xsetTotalexectime(org.apache.xmlbeans.XmlDouble totalexectime);
                
                /**
                 * Unsets the "totalexectime" attribute
                 */
                void unsetTotalexectime();
                
                /**
                 * Gets the "totalcputime" attribute
                 */
                double getTotalcputime();
                
                /**
                 * Gets (as xml) the "totalcputime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetTotalcputime();
                
                /**
                 * True if has "totalcputime" attribute
                 */
                boolean isSetTotalcputime();
                
                /**
                 * Sets the "totalcputime" attribute
                 */
                void setTotalcputime(double totalcputime);
                
                /**
                 * Sets (as xml) the "totalcputime" attribute
                 */
                void xsetTotalcputime(org.apache.xmlbeans.XmlDouble totalcputime);
                
                /**
                 * Unsets the "totalcputime" attribute
                 */
                void unsetTotalcputime();
                
                /**
                 * Gets the "connection" attribute
                 */
                java.lang.String getConnection();
                
                /**
                 * Gets (as xml) the "connection" attribute
                 */
                org.apache.xmlbeans.XmlString xgetConnection();
                
                /**
                 * True if has "connection" attribute
                 */
                boolean isSetConnection();
                
                /**
                 * Sets the "connection" attribute
                 */
                void setConnection(java.lang.String connection);
                
                /**
                 * Sets (as xml) the "connection" attribute
                 */
                void xsetConnection(org.apache.xmlbeans.XmlString connection);
                
                /**
                 * Unsets the "connection" attribute
                 */
                void unsetConnection();
                
                /**
                 * Gets the "license" attribute
                 */
                java.lang.String getLicense();
                
                /**
                 * Gets (as xml) the "license" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLicense();
                
                /**
                 * True if has "license" attribute
                 */
                boolean isSetLicense();
                
                /**
                 * Sets the "license" attribute
                 */
                void setLicense(java.lang.String license);
                
                /**
                 * Sets (as xml) the "license" attribute
                 */
                void xsetLicense(org.apache.xmlbeans.XmlString license);
                
                /**
                 * Unsets the "license" attribute
                 */
                void unsetLicense();
                
                /**
                 * Gets the "capture" attribute
                 */
                java.lang.String getCapture();
                
                /**
                 * Gets (as xml) the "capture" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCapture();
                
                /**
                 * True if has "capture" attribute
                 */
                boolean isSetCapture();
                
                /**
                 * Sets the "capture" attribute
                 */
                void setCapture(java.lang.String capture);
                
                /**
                 * Sets (as xml) the "capture" attribute
                 */
                void xsetCapture(org.apache.xmlbeans.XmlString capture);
                
                /**
                 * Unsets the "capture" attribute
                 */
                void unsetCapture();
                
                /**
                 * Gets the "totalskippedevents" attribute
                 */
                java.math.BigInteger getTotalskippedevents();
                
                /**
                 * Gets (as xml) the "totalskippedevents" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetTotalskippedevents();
                
                /**
                 * True if has "totalskippedevents" attribute
                 */
                boolean isSetTotalskippedevents();
                
                /**
                 * Sets the "totalskippedevents" attribute
                 */
                void setTotalskippedevents(java.math.BigInteger totalskippedevents);
                
                /**
                 * Sets (as xml) the "totalskippedevents" attribute
                 */
                void xsetTotalskippedevents(org.apache.xmlbeans.XmlInteger totalskippedevents);
                
                /**
                 * Unsets the "totalskippedevents" attribute
                 */
                void unsetTotalskippedevents();
                
                /**
                 * Gets the "totalskippedpurepaths" attribute
                 */
                java.math.BigInteger getTotalskippedpurepaths();
                
                /**
                 * Gets (as xml) the "totalskippedpurepaths" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetTotalskippedpurepaths();
                
                /**
                 * True if has "totalskippedpurepaths" attribute
                 */
                boolean isSetTotalskippedpurepaths();
                
                /**
                 * Sets the "totalskippedpurepaths" attribute
                 */
                void setTotalskippedpurepaths(java.math.BigInteger totalskippedpurepaths);
                
                /**
                 * Sets (as xml) the "totalskippedpurepaths" attribute
                 */
                void xsetTotalskippedpurepaths(org.apache.xmlbeans.XmlInteger totalskippedpurepaths);
                
                /**
                 * Unsets the "totalskippedpurepaths" attribute
                 */
                void unsetTotalskippedpurepaths();
                
                /**
                 * Gets the "instrumentortimemillisavg" attribute
                 */
                double getInstrumentortimemillisavg();
                
                /**
                 * Gets (as xml) the "instrumentortimemillisavg" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetInstrumentortimemillisavg();
                
                /**
                 * True if has "instrumentortimemillisavg" attribute
                 */
                boolean isSetInstrumentortimemillisavg();
                
                /**
                 * Sets the "instrumentortimemillisavg" attribute
                 */
                void setInstrumentortimemillisavg(double instrumentortimemillisavg);
                
                /**
                 * Sets (as xml) the "instrumentortimemillisavg" attribute
                 */
                void xsetInstrumentortimemillisavg(org.apache.xmlbeans.XmlDouble instrumentortimemillisavg);
                
                /**
                 * Unsets the "instrumentortimemillisavg" attribute
                 */
                void unsetInstrumentortimemillisavg();
                
                /**
                 * Gets the "instrumentortimemillismax" attribute
                 */
                double getInstrumentortimemillismax();
                
                /**
                 * Gets (as xml) the "instrumentortimemillismax" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetInstrumentortimemillismax();
                
                /**
                 * True if has "instrumentortimemillismax" attribute
                 */
                boolean isSetInstrumentortimemillismax();
                
                /**
                 * Sets the "instrumentortimemillismax" attribute
                 */
                void setInstrumentortimemillismax(double instrumentortimemillismax);
                
                /**
                 * Sets (as xml) the "instrumentortimemillismax" attribute
                 */
                void xsetInstrumentortimemillismax(org.apache.xmlbeans.XmlDouble instrumentortimemillismax);
                
                /**
                 * Unsets the "instrumentortimemillismax" attribute
                 */
                void unsetInstrumentortimemillismax();
                
                /**
                 * Gets the "collector" attribute
                 */
                java.lang.String getCollector();
                
                /**
                 * Gets (as xml) the "collector" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCollector();
                
                /**
                 * True if has "collector" attribute
                 */
                boolean isSetCollector();
                
                /**
                 * Sets the "collector" attribute
                 */
                void setCollector(java.lang.String collector);
                
                /**
                 * Sets (as xml) the "collector" attribute
                 */
                void xsetCollector(org.apache.xmlbeans.XmlString collector);
                
                /**
                 * Unsets the "collector" attribute
                 */
                void unsetCollector();
                
                /**
                 * Gets the "systemid" attribute
                 */
                java.math.BigInteger getSystemid();
                
                /**
                 * Gets (as xml) the "systemid" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSystemid();
                
                /**
                 * True if has "systemid" attribute
                 */
                boolean isSetSystemid();
                
                /**
                 * Sets the "systemid" attribute
                 */
                void setSystemid(java.math.BigInteger systemid);
                
                /**
                 * Sets (as xml) the "systemid" attribute
                 */
                void xsetSystemid(org.apache.xmlbeans.XmlInteger systemid);
                
                /**
                 * Unsets the "systemid" attribute
                 */
                void unsetSystemid();
                
                /**
                 * Gets the "bytessent" attribute
                 */
                java.math.BigInteger getBytessent();
                
                /**
                 * Gets (as xml) the "bytessent" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytessent();
                
                /**
                 * True if has "bytessent" attribute
                 */
                boolean isSetBytessent();
                
                /**
                 * Sets the "bytessent" attribute
                 */
                void setBytessent(java.math.BigInteger bytessent);
                
                /**
                 * Sets (as xml) the "bytessent" attribute
                 */
                void xsetBytessent(org.apache.xmlbeans.XmlInteger bytessent);
                
                /**
                 * Unsets the "bytessent" attribute
                 */
                void unsetBytessent();
                
                /**
                 * Gets the "bytesreceived" attribute
                 */
                java.math.BigInteger getBytesreceived();
                
                /**
                 * Gets (as xml) the "bytesreceived" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesreceived();
                
                /**
                 * True if has "bytesreceived" attribute
                 */
                boolean isSetBytesreceived();
                
                /**
                 * Sets the "bytesreceived" attribute
                 */
                void setBytesreceived(java.math.BigInteger bytesreceived);
                
                /**
                 * Sets (as xml) the "bytesreceived" attribute
                 */
                void xsetBytesreceived(org.apache.xmlbeans.XmlInteger bytesreceived);
                
                /**
                 * Unsets the "bytesreceived" attribute
                 */
                void unsetBytesreceived();
                
                /**
                 * Gets the "mps" attribute
                 */
                java.lang.String getMps();
                
                /**
                 * Gets (as xml) the "mps" attribute
                 */
                org.apache.xmlbeans.XmlString xgetMps();
                
                /**
                 * True if has "mps" attribute
                 */
                boolean isSetMps();
                
                /**
                 * Sets the "mps" attribute
                 */
                void setMps(java.lang.String mps);
                
                /**
                 * Sets (as xml) the "mps" attribute
                 */
                void xsetMps(org.apache.xmlbeans.XmlString mps);
                
                /**
                 * Unsets the "mps" attribute
                 */
                void unsetMps();
                
                /**
                 * Gets the "tps" attribute
                 */
                java.lang.String getTps();
                
                /**
                 * Gets (as xml) the "tps" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTps();
                
                /**
                 * True if has "tps" attribute
                 */
                boolean isSetTps();
                
                /**
                 * Sets the "tps" attribute
                 */
                void setTps(java.lang.String tps);
                
                /**
                 * Sets (as xml) the "tps" attribute
                 */
                void xsetTps(org.apache.xmlbeans.XmlString tps);
                
                /**
                 * Unsets the "tps" attribute
                 */
                void unsetTps();
                
                /**
                 * Gets the "purepathlength" attribute
                 */
                java.math.BigInteger getPurepathlength();
                
                /**
                 * Gets (as xml) the "purepathlength" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetPurepathlength();
                
                /**
                 * True if has "purepathlength" attribute
                 */
                boolean isSetPurepathlength();
                
                /**
                 * Sets the "purepathlength" attribute
                 */
                void setPurepathlength(java.math.BigInteger purepathlength);
                
                /**
                 * Sets (as xml) the "purepathlength" attribute
                 */
                void xsetPurepathlength(org.apache.xmlbeans.XmlInteger purepathlength);
                
                /**
                 * Unsets the "purepathlength" attribute
                 */
                void unsetPurepathlength();
                
                /**
                 * Gets the "completedpurepaths" attribute
                 */
                java.math.BigInteger getCompletedpurepaths();
                
                /**
                 * Gets (as xml) the "completedpurepaths" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetCompletedpurepaths();
                
                /**
                 * True if has "completedpurepaths" attribute
                 */
                boolean isSetCompletedpurepaths();
                
                /**
                 * Sets the "completedpurepaths" attribute
                 */
                void setCompletedpurepaths(java.math.BigInteger completedpurepaths);
                
                /**
                 * Sets (as xml) the "completedpurepaths" attribute
                 */
                void xsetCompletedpurepaths(org.apache.xmlbeans.XmlInteger completedpurepaths);
                
                /**
                 * Unsets the "completedpurepaths" attribute
                 */
                void unsetCompletedpurepaths();
                
                /**
                 * Gets the "skippedevents" attribute
                 */
                java.math.BigInteger getSkippedevents();
                
                /**
                 * Gets (as xml) the "skippedevents" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetSkippedevents();
                
                /**
                 * True if has "skippedevents" attribute
                 */
                boolean isSetSkippedevents();
                
                /**
                 * Sets the "skippedevents" attribute
                 */
                void setSkippedevents(java.math.BigInteger skippedevents);
                
                /**
                 * Sets (as xml) the "skippedevents" attribute
                 */
                void xsetSkippedevents(org.apache.xmlbeans.XmlInteger skippedevents);
                
                /**
                 * Unsets the "skippedevents" attribute
                 */
                void unsetSkippedevents();
                
                /**
                 * Gets the "queueusedsize" attribute
                 */
                double getQueueusedsize();
                
                /**
                 * Gets (as xml) the "queueusedsize" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetQueueusedsize();
                
                /**
                 * True if has "queueusedsize" attribute
                 */
                boolean isSetQueueusedsize();
                
                /**
                 * Sets the "queueusedsize" attribute
                 */
                void setQueueusedsize(double queueusedsize);
                
                /**
                 * Sets (as xml) the "queueusedsize" attribute
                 */
                void xsetQueueusedsize(org.apache.xmlbeans.XmlDouble queueusedsize);
                
                /**
                 * Unsets the "queueusedsize" attribute
                 */
                void unsetQueueusedsize();
                
                /**
                 * Gets the "queuecommittedsize" attribute
                 */
                double getQueuecommittedsize();
                
                /**
                 * Gets (as xml) the "queuecommittedsize" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetQueuecommittedsize();
                
                /**
                 * True if has "queuecommittedsize" attribute
                 */
                boolean isSetQueuecommittedsize();
                
                /**
                 * Sets the "queuecommittedsize" attribute
                 */
                void setQueuecommittedsize(double queuecommittedsize);
                
                /**
                 * Sets (as xml) the "queuecommittedsize" attribute
                 */
                void xsetQueuecommittedsize(org.apache.xmlbeans.XmlDouble queuecommittedsize);
                
                /**
                 * Unsets the "queuecommittedsize" attribute
                 */
                void unsetQueuecommittedsize();
                
                /**
                 * Gets the "instrumentationoverhead" attribute
                 */
                java.math.BigInteger getInstrumentationoverhead();
                
                /**
                 * Gets (as xml) the "instrumentationoverhead" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetInstrumentationoverhead();
                
                /**
                 * True if has "instrumentationoverhead" attribute
                 */
                boolean isSetInstrumentationoverhead();
                
                /**
                 * Sets the "instrumentationoverhead" attribute
                 */
                void setInstrumentationoverhead(java.math.BigInteger instrumentationoverhead);
                
                /**
                 * Sets (as xml) the "instrumentationoverhead" attribute
                 */
                void xsetInstrumentationoverhead(org.apache.xmlbeans.XmlInteger instrumentationoverhead);
                
                /**
                 * Unsets the "instrumentationoverhead" attribute
                 */
                void unsetInstrumentationoverhead();
                
                /**
                 * Gets the "bytesreadfromagent" attribute
                 */
                java.math.BigInteger getBytesreadfromagent();
                
                /**
                 * Gets (as xml) the "bytesreadfromagent" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetBytesreadfromagent();
                
                /**
                 * True if has "bytesreadfromagent" attribute
                 */
                boolean isSetBytesreadfromagent();
                
                /**
                 * Sets the "bytesreadfromagent" attribute
                 */
                void setBytesreadfromagent(java.math.BigInteger bytesreadfromagent);
                
                /**
                 * Sets (as xml) the "bytesreadfromagent" attribute
                 */
                void xsetBytesreadfromagent(org.apache.xmlbeans.XmlInteger bytesreadfromagent);
                
                /**
                 * Unsets the "bytesreadfromagent" attribute
                 */
                void unsetBytesreadfromagent();
                
                /**
                 * Gets the "purepathlifetime" attribute
                 */
                double getPurepathlifetime();
                
                /**
                 * Gets (as xml) the "purepathlifetime" attribute
                 */
                org.apache.xmlbeans.XmlDouble xgetPurepathlifetime();
                
                /**
                 * True if has "purepathlifetime" attribute
                 */
                boolean isSetPurepathlifetime();
                
                /**
                 * Sets the "purepathlifetime" attribute
                 */
                void setPurepathlifetime(double purepathlifetime);
                
                /**
                 * Sets (as xml) the "purepathlifetime" attribute
                 */
                void xsetPurepathlifetime(org.apache.xmlbeans.XmlDouble purepathlifetime);
                
                /**
                 * Unsets the "purepathlifetime" attribute
                 */
                void unsetPurepathlifetime();
                
                /**
                 * Gets the "concurrentpurepaths" attribute
                 */
                java.math.BigInteger getConcurrentpurepaths();
                
                /**
                 * Gets (as xml) the "concurrentpurepaths" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetConcurrentpurepaths();
                
                /**
                 * True if has "concurrentpurepaths" attribute
                 */
                boolean isSetConcurrentpurepaths();
                
                /**
                 * Sets the "concurrentpurepaths" attribute
                 */
                void setConcurrentpurepaths(java.math.BigInteger concurrentpurepaths);
                
                /**
                 * Sets (as xml) the "concurrentpurepaths" attribute
                 */
                void xsetConcurrentpurepaths(org.apache.xmlbeans.XmlInteger concurrentpurepaths);
                
                /**
                 * Unsets the "concurrentpurepaths" attribute
                 */
                void unsetConcurrentpurepaths();
                
                /**
                 * Gets the "virtual" attribute
                 */
                java.util.Calendar getVirtual();
                
                /**
                 * Gets (as xml) the "virtual" attribute
                 */
                org.apache.xmlbeans.XmlDateTime xgetVirtual();
                
                /**
                 * True if has "virtual" attribute
                 */
                boolean isSetVirtual();
                
                /**
                 * Sets the "virtual" attribute
                 */
                void setVirtual(java.util.Calendar virtual);
                
                /**
                 * Sets (as xml) the "virtual" attribute
                 */
                void xsetVirtual(org.apache.xmlbeans.XmlDateTime virtual);
                
                /**
                 * Unsets the "virtual" attribute
                 */
                void unsetVirtual();
                
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
                 * Gets the "bootstrapped" attribute
                 */
                java.lang.String getBootstrapped();
                
                /**
                 * Gets (as xml) the "bootstrapped" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBootstrapped();
                
                /**
                 * True if has "bootstrapped" attribute
                 */
                boolean isSetBootstrapped();
                
                /**
                 * Sets the "bootstrapped" attribute
                 */
                void setBootstrapped(java.lang.String bootstrapped);
                
                /**
                 * Sets (as xml) the "bootstrapped" attribute
                 */
                void xsetBootstrapped(org.apache.xmlbeans.XmlString bootstrapped);
                
                /**
                 * Unsets the "bootstrapped" attribute
                 */
                void unsetBootstrapped();
                
                /**
                 * Gets the "agentid" attribute
                 */
                java.lang.String getAgentid();
                
                /**
                 * Gets (as xml) the "agentid" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgentid();
                
                /**
                 * True if has "agentid" attribute
                 */
                boolean isSetAgentid();
                
                /**
                 * Sets the "agentid" attribute
                 */
                void setAgentid(java.lang.String agentid);
                
                /**
                 * Sets (as xml) the "agentid" attribute
                 */
                void xsetAgentid(org.apache.xmlbeans.XmlString agentid);
                
                /**
                 * Unsets the "agentid" attribute
                 */
                void unsetAgentid();
                
                /**
                 * Gets the "cache_hits" attribute
                 */
                java.math.BigInteger getCacheHits();
                
                /**
                 * Gets (as xml) the "cache_hits" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetCacheHits();
                
                /**
                 * True if has "cache_hits" attribute
                 */
                boolean isSetCacheHits();
                
                /**
                 * Sets the "cache_hits" attribute
                 */
                void setCacheHits(java.math.BigInteger cacheHits);
                
                /**
                 * Sets (as xml) the "cache_hits" attribute
                 */
                void xsetCacheHits(org.apache.xmlbeans.XmlInteger cacheHits);
                
                /**
                 * Unsets the "cache_hits" attribute
                 */
                void unsetCacheHits();
                
                /**
                 * Gets the "cache_misss" attribute
                 */
                java.math.BigInteger getCacheMisss();
                
                /**
                 * Gets (as xml) the "cache_misss" attribute
                 */
                org.apache.xmlbeans.XmlInteger xgetCacheMisss();
                
                /**
                 * True if has "cache_misss" attribute
                 */
                boolean isSetCacheMisss();
                
                /**
                 * Sets the "cache_misss" attribute
                 */
                void setCacheMisss(java.math.BigInteger cacheMisss);
                
                /**
                 * Sets (as xml) the "cache_misss" attribute
                 */
                void xsetCacheMisss(org.apache.xmlbeans.XmlInteger cacheMisss);
                
                /**
                 * Unsets the "cache_misss" attribute
                 */
                void unsetCacheMisss();
                
                /**
                 * Gets the "technologydesc" attribute
                 */
                java.lang.String getTechnologydesc();
                
                /**
                 * Gets (as xml) the "technologydesc" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTechnologydesc();
                
                /**
                 * True if has "technologydesc" attribute
                 */
                boolean isSetTechnologydesc();
                
                /**
                 * Sets the "technologydesc" attribute
                 */
                void setTechnologydesc(java.lang.String technologydesc);
                
                /**
                 * Sets (as xml) the "technologydesc" attribute
                 */
                void xsetTechnologydesc(org.apache.xmlbeans.XmlString technologydesc);
                
                /**
                 * Unsets the "technologydesc" attribute
                 */
                void unsetTechnologydesc();
                
                /**
                 * Gets the "hotdesc" attribute
                 */
                java.lang.String getHotdesc();
                
                /**
                 * Gets (as xml) the "hotdesc" attribute
                 */
                org.apache.xmlbeans.XmlString xgetHotdesc();
                
                /**
                 * True if has "hotdesc" attribute
                 */
                boolean isSetHotdesc();
                
                /**
                 * Sets the "hotdesc" attribute
                 */
                void setHotdesc(java.lang.String hotdesc);
                
                /**
                 * Sets (as xml) the "hotdesc" attribute
                 */
                void xsetHotdesc(org.apache.xmlbeans.XmlString hotdesc);
                
                /**
                 * Unsets the "hotdesc" attribute
                 */
                void unsetHotdesc();
                
                /**
                 * Gets the "boostrapversion" attribute
                 */
                java.lang.String getBoostrapversion();
                
                /**
                 * Gets (as xml) the "boostrapversion" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBoostrapversion();
                
                /**
                 * True if has "boostrapversion" attribute
                 */
                boolean isSetBoostrapversion();
                
                /**
                 * Sets the "boostrapversion" attribute
                 */
                void setBoostrapversion(java.lang.String boostrapversion);
                
                /**
                 * Sets (as xml) the "boostrapversion" attribute
                 */
                void xsetBoostrapversion(org.apache.xmlbeans.XmlString boostrapversion);
                
                /**
                 * Unsets the "boostrapversion" attribute
                 */
                void unsetBoostrapversion();
                
                /**
                 * Gets the "os" attribute
                 */
                java.lang.String getOs();
                
                /**
                 * Gets (as xml) the "os" attribute
                 */
                org.apache.xmlbeans.XmlString xgetOs();
                
                /**
                 * True if has "os" attribute
                 */
                boolean isSetOs();
                
                /**
                 * Sets the "os" attribute
                 */
                void setOs(java.lang.String os);
                
                /**
                 * Sets (as xml) the "os" attribute
                 */
                void xsetOs(org.apache.xmlbeans.XmlString os);
                
                /**
                 * Unsets the "os" attribute
                 */
                void unsetOs();
                
                /**
                 * Gets the "osarch" attribute
                 */
                java.lang.String getOsarch();
                
                /**
                 * Gets (as xml) the "osarch" attribute
                 */
                org.apache.xmlbeans.XmlString xgetOsarch();
                
                /**
                 * True if has "osarch" attribute
                 */
                boolean isSetOsarch();
                
                /**
                 * Sets the "osarch" attribute
                 */
                void setOsarch(java.lang.String osarch);
                
                /**
                 * Sets (as xml) the "osarch" attribute
                 */
                void xsetOsarch(org.apache.xmlbeans.XmlString osarch);
                
                /**
                 * Unsets the "osarch" attribute
                 */
                void unsetOsarch();
                
                /**
                 * Gets the "techversion" attribute
                 */
                java.lang.String getTechversion();
                
                /**
                 * Gets (as xml) the "techversion" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTechversion();
                
                /**
                 * True if has "techversion" attribute
                 */
                boolean isSetTechversion();
                
                /**
                 * Sets the "techversion" attribute
                 */
                void setTechversion(java.lang.String techversion);
                
                /**
                 * Sets (as xml) the "techversion" attribute
                 */
                void xsetTechversion(org.apache.xmlbeans.XmlString techversion);
                
                /**
                 * Unsets the "techversion" attribute
                 */
                void unsetTechversion();
                
                /**
                 * Gets the "extended_agent_state" attribute
                 */
                java.lang.String getExtendedAgentState();
                
                /**
                 * Gets (as xml) the "extended_agent_state" attribute
                 */
                org.apache.xmlbeans.XmlString xgetExtendedAgentState();
                
                /**
                 * True if has "extended_agent_state" attribute
                 */
                boolean isSetExtendedAgentState();
                
                /**
                 * Sets the "extended_agent_state" attribute
                 */
                void setExtendedAgentState(java.lang.String extendedAgentState);
                
                /**
                 * Sets (as xml) the "extended_agent_state" attribute
                 */
                void xsetExtendedAgentState(org.apache.xmlbeans.XmlString extendedAgentState);
                
                /**
                 * Unsets the "extended_agent_state" attribute
                 */
                void unsetExtendedAgentState();
                
                /**
                 * Gets the "statustext" attribute
                 */
                java.lang.String getStatustext();
                
                /**
                 * Gets (as xml) the "statustext" attribute
                 */
                org.apache.xmlbeans.XmlString xgetStatustext();
                
                /**
                 * True if has "statustext" attribute
                 */
                boolean isSetStatustext();
                
                /**
                 * Sets the "statustext" attribute
                 */
                void setStatustext(java.lang.String statustext);
                
                /**
                 * Sets (as xml) the "statustext" attribute
                 */
                void xsetStatustext(org.apache.xmlbeans.XmlString statustext);
                
                /**
                 * Unsets the "statustext" attribute
                 */
                void unsetStatustext();
                
                /**
                 * Gets the "agent_platform" attribute
                 */
                java.lang.String getAgentPlatform();
                
                /**
                 * Gets (as xml) the "agent_platform" attribute
                 */
                org.apache.xmlbeans.XmlString xgetAgentPlatform();
                
                /**
                 * True if has "agent_platform" attribute
                 */
                boolean isSetAgentPlatform();
                
                /**
                 * Sets the "agent_platform" attribute
                 */
                void setAgentPlatform(java.lang.String agentPlatform);
                
                /**
                 * Sets (as xml) the "agent_platform" attribute
                 */
                void xsetAgentPlatform(org.apache.xmlbeans.XmlString agentPlatform);
                
                /**
                 * Unsets the "agent_platform" attribute
                 */
                void unsetAgentPlatform();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord newInstance() {
                      return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords.Agentsoverviewrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords newInstance() {
                  return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Agentsoverviewrecords) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML statustaskmonitorrecords(@).
         *
         * This is a complex type.
         */
        public interface Statustaskmonitorrecords extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Statustaskmonitorrecords.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("statustaskmonitorrecords810aelemtype");
            
            /**
             * Gets array of all "statustaskmonitorrecord" elements
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord[] getStatustaskmonitorrecordArray();
            
            /**
             * Gets ith "statustaskmonitorrecord" element
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord getStatustaskmonitorrecordArray(int i);
            
            /**
             * Returns number of "statustaskmonitorrecord" element
             */
            int sizeOfStatustaskmonitorrecordArray();
            
            /**
             * Sets array of all "statustaskmonitorrecord" element
             */
            void setStatustaskmonitorrecordArray(noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord[] statustaskmonitorrecordArray);
            
            /**
             * Sets ith "statustaskmonitorrecord" element
             */
            void setStatustaskmonitorrecordArray(int i, noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord statustaskmonitorrecord);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "statustaskmonitorrecord" element
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord insertNewStatustaskmonitorrecord(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "statustaskmonitorrecord" element
             */
            noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord addNewStatustaskmonitorrecord();
            
            /**
             * Removes the ith "statustaskmonitorrecord" element
             */
            void removeStatustaskmonitorrecord(int i);
            
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
             * An XML statustaskmonitorrecord(@).
             *
             * This is a complex type.
             */
            public interface Statustaskmonitorrecord extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Statustaskmonitorrecord.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s077FE01C5958DDF2656717A4B9B0A6F5").resolveHandle("statustaskmonitorrecord4f7aelemtype");
                
                /**
                 * Gets array of all "statustaskmonitorrecord" elements
                 */
                noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[] getStatustaskmonitorrecordArray();
                
                /**
                 * Gets ith "statustaskmonitorrecord" element
                 */
                noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord getStatustaskmonitorrecordArray(int i);
                
                /**
                 * Returns number of "statustaskmonitorrecord" element
                 */
                int sizeOfStatustaskmonitorrecordArray();
                
                /**
                 * Sets array of all "statustaskmonitorrecord" element
                 */
                void setStatustaskmonitorrecordArray(noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord[] statustaskmonitorrecordArray);
                
                /**
                 * Sets ith "statustaskmonitorrecord" element
                 */
                void setStatustaskmonitorrecordArray(int i, noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord statustaskmonitorrecord);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "statustaskmonitorrecord" element
                 */
                noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord insertNewStatustaskmonitorrecord(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "statustaskmonitorrecord" element
                 */
                noNamespace.StatustaskmonitorrecordDocument.Statustaskmonitorrecord addNewStatustaskmonitorrecord();
                
                /**
                 * Removes the ith "statustaskmonitorrecord" element
                 */
                void removeStatustaskmonitorrecord(int i);
                
                /**
                 * Gets the "header" attribute
                 */
                java.lang.String getHeader();
                
                /**
                 * Gets (as xml) the "header" attribute
                 */
                org.apache.xmlbeans.XmlString xgetHeader();
                
                /**
                 * True if has "header" attribute
                 */
                boolean isSetHeader();
                
                /**
                 * Sets the "header" attribute
                 */
                void setHeader(java.lang.String header);
                
                /**
                 * Sets (as xml) the "header" attribute
                 */
                void xsetHeader(org.apache.xmlbeans.XmlString header);
                
                /**
                 * Unsets the "header" attribute
                 */
                void unsetHeader();
                
                /**
                 * Gets the "id" attribute
                 */
                java.lang.String getId();
                
                /**
                 * Gets (as xml) the "id" attribute
                 */
                org.apache.xmlbeans.XmlString xgetId();
                
                /**
                 * True if has "id" attribute
                 */
                boolean isSetId();
                
                /**
                 * Sets the "id" attribute
                 */
                void setId(java.lang.String id);
                
                /**
                 * Sets (as xml) the "id" attribute
                 */
                void xsetId(org.apache.xmlbeans.XmlString id);
                
                /**
                 * Unsets the "id" attribute
                 */
                void unsetId();
                
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
                 * Gets the "status" attribute
                 */
                java.lang.String getStatus();
                
                /**
                 * Gets (as xml) the "status" attribute
                 */
                org.apache.xmlbeans.XmlString xgetStatus();
                
                /**
                 * True if has "status" attribute
                 */
                boolean isSetStatus();
                
                /**
                 * Sets the "status" attribute
                 */
                void setStatus(java.lang.String status);
                
                /**
                 * Sets (as xml) the "status" attribute
                 */
                void xsetStatus(org.apache.xmlbeans.XmlString status);
                
                /**
                 * Unsets the "status" attribute
                 */
                void unsetStatus();
                
                /**
                 * Gets the "lastrun" attribute
                 */
                java.util.Calendar getLastrun();
                
                /**
                 * Gets (as xml) the "lastrun" attribute
                 */
                org.apache.xmlbeans.XmlDateTime xgetLastrun();
                
                /**
                 * True if has "lastrun" attribute
                 */
                boolean isSetLastrun();
                
                /**
                 * Sets the "lastrun" attribute
                 */
                void setLastrun(java.util.Calendar lastrun);
                
                /**
                 * Sets (as xml) the "lastrun" attribute
                 */
                void xsetLastrun(org.apache.xmlbeans.XmlDateTime lastrun);
                
                /**
                 * Unsets the "lastrun" attribute
                 */
                void unsetLastrun();
                
                /**
                 * Gets the "lastrunresult" attribute
                 */
                java.lang.String getLastrunresult();
                
                /**
                 * Gets (as xml) the "lastrunresult" attribute
                 */
                org.apache.xmlbeans.XmlString xgetLastrunresult();
                
                /**
                 * True if has "lastrunresult" attribute
                 */
                boolean isSetLastrunresult();
                
                /**
                 * Sets the "lastrunresult" attribute
                 */
                void setLastrunresult(java.lang.String lastrunresult);
                
                /**
                 * Sets (as xml) the "lastrunresult" attribute
                 */
                void xsetLastrunresult(org.apache.xmlbeans.XmlString lastrunresult);
                
                /**
                 * Unsets the "lastrunresult" attribute
                 */
                void unsetLastrunresult();
                
                /**
                 * Gets the "nextrun" attribute
                 */
                java.util.Calendar getNextrun();
                
                /**
                 * Gets (as xml) the "nextrun" attribute
                 */
                org.apache.xmlbeans.XmlDateTime xgetNextrun();
                
                /**
                 * True if has "nextrun" attribute
                 */
                boolean isSetNextrun();
                
                /**
                 * Sets the "nextrun" attribute
                 */
                void setNextrun(java.util.Calendar nextrun);
                
                /**
                 * Sets (as xml) the "nextrun" attribute
                 */
                void xsetNextrun(org.apache.xmlbeans.XmlDateTime nextrun);
                
                /**
                 * Unsets the "nextrun" attribute
                 */
                void unsetNextrun();
                
                /**
                 * Gets the "currentrun" attribute
                 */
                java.lang.String getCurrentrun();
                
                /**
                 * Gets (as xml) the "currentrun" attribute
                 */
                org.apache.xmlbeans.XmlString xgetCurrentrun();
                
                /**
                 * True if has "currentrun" attribute
                 */
                boolean isSetCurrentrun();
                
                /**
                 * Sets the "currentrun" attribute
                 */
                void setCurrentrun(java.lang.String currentrun);
                
                /**
                 * Sets (as xml) the "currentrun" attribute
                 */
                void xsetCurrentrun(org.apache.xmlbeans.XmlString currentrun);
                
                /**
                 * Unsets the "currentrun" attribute
                 */
                void unsetCurrentrun();
                
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
                 * Gets the "schedule" attribute
                 */
                java.lang.String getSchedule();
                
                /**
                 * Gets (as xml) the "schedule" attribute
                 */
                org.apache.xmlbeans.XmlString xgetSchedule();
                
                /**
                 * True if has "schedule" attribute
                 */
                boolean isSetSchedule();
                
                /**
                 * Sets the "schedule" attribute
                 */
                void setSchedule(java.lang.String schedule);
                
                /**
                 * Sets (as xml) the "schedule" attribute
                 */
                void xsetSchedule(org.apache.xmlbeans.XmlString schedule);
                
                /**
                 * Unsets the "schedule" attribute
                 */
                void unsetSchedule();
                
                /**
                 * Gets the "target" attribute
                 */
                java.lang.String getTarget();
                
                /**
                 * Gets (as xml) the "target" attribute
                 */
                org.apache.xmlbeans.XmlString xgetTarget();
                
                /**
                 * True if has "target" attribute
                 */
                boolean isSetTarget();
                
                /**
                 * Sets the "target" attribute
                 */
                void setTarget(java.lang.String target);
                
                /**
                 * Sets (as xml) the "target" attribute
                 */
                void xsetTarget(org.apache.xmlbeans.XmlString target);
                
                /**
                 * Unsets the "target" attribute
                 */
                void unsetTarget();
                
                /**
                 * Gets the "pluginstate" attribute
                 */
                java.lang.String getPluginstate();
                
                /**
                 * Gets (as xml) the "pluginstate" attribute
                 */
                org.apache.xmlbeans.XmlString xgetPluginstate();
                
                /**
                 * True if has "pluginstate" attribute
                 */
                boolean isSetPluginstate();
                
                /**
                 * Sets the "pluginstate" attribute
                 */
                void setPluginstate(java.lang.String pluginstate);
                
                /**
                 * Sets (as xml) the "pluginstate" attribute
                 */
                void xsetPluginstate(org.apache.xmlbeans.XmlString pluginstate);
                
                /**
                 * Unsets the "pluginstate" attribute
                 */
                void unsetPluginstate();
                
                /**
                 * Gets the "businesshours" attribute
                 */
                java.lang.String getBusinesshours();
                
                /**
                 * Gets (as xml) the "businesshours" attribute
                 */
                org.apache.xmlbeans.XmlString xgetBusinesshours();
                
                /**
                 * True if has "businesshours" attribute
                 */
                boolean isSetBusinesshours();
                
                /**
                 * Sets the "businesshours" attribute
                 */
                void setBusinesshours(java.lang.String businesshours);
                
                /**
                 * Sets (as xml) the "businesshours" attribute
                 */
                void xsetBusinesshours(org.apache.xmlbeans.XmlString businesshours);
                
                /**
                 * Unsets the "businesshours" attribute
                 */
                void unsetBusinesshours();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord newInstance() {
                      return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords.Statustaskmonitorrecord) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords newInstance() {
                  return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet.Statustaskmonitorrecords) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet newInstance() {
              return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.StatusoverviewdashletDocument.Statusoverviewdashlet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.StatusoverviewdashletDocument newInstance() {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.StatusoverviewdashletDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.StatusoverviewdashletDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.StatusoverviewdashletDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.StatusoverviewdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.StatusoverviewdashletDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.StatusoverviewdashletDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
