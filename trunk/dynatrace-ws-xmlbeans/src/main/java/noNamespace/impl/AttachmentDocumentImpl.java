/*
 * An XML document type.
 * Localname: attachment
 * Namespace: 
 * Java type: noNamespace.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one attachment(@) element.
 *
 * This is a complex type.
 */
public class AttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AttachmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("", "attachment");
    
    
    /**
     * Gets the "attachment" element
     */
    public noNamespace.AttachmentDocument.Attachment getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AttachmentDocument.Attachment target = null;
            target = (noNamespace.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attachment" element
     */
    public void setAttachment(noNamespace.AttachmentDocument.Attachment attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AttachmentDocument.Attachment target = null;
            target = (noNamespace.AttachmentDocument.Attachment)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                target = (noNamespace.AttachmentDocument.Attachment)get_store().add_element_user(ATTACHMENT$0);
            }
            target.set(attachment);
        }
    }
    
    /**
     * Appends and returns a new empty "attachment" element
     */
    public noNamespace.AttachmentDocument.Attachment addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AttachmentDocument.Attachment target = null;
            target = (noNamespace.AttachmentDocument.Attachment)get_store().add_element_user(ATTACHMENT$0);
            return target;
        }
    }
    /**
     * An XML attachment(@).
     *
     * This is a complex type.
     */
    public static class AttachmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AttachmentDocument.Attachment
    {
        private static final long serialVersionUID = 1L;
        
        public AttachmentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTACHMENT$0 = 
            new javax.xml.namespace.QName("", "attachment");
        private static final javax.xml.namespace.QName PROPERTY$2 = 
            new javax.xml.namespace.QName("", "property");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets array of all "attachment" elements
         */
        public org.apache.xmlbeans.XmlObject[] getAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTACHMENT$0, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "attachment" element
         */
        public org.apache.xmlbeans.XmlObject getAttachmentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "attachment" element
         */
        public int sizeOfAttachmentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENT$0);
            }
        }
        
        /**
         * Sets array of all "attachment" element
         */
        public void setAttachmentArray(org.apache.xmlbeans.XmlObject[] attachmentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attachmentArray, ATTACHMENT$0);
            }
        }
        
        /**
         * Sets ith "attachment" element
         */
        public void setAttachmentArray(int i, org.apache.xmlbeans.XmlObject attachment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attachment);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attachment" element
         */
        public org.apache.xmlbeans.XmlObject insertNewAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ATTACHMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attachment" element
         */
        public org.apache.xmlbeans.XmlObject addNewAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "attachment" element
         */
        public void removeAttachment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENT$0, i);
            }
        }
        
        /**
         * Gets array of all "property" elements
         */
        public noNamespace.AttachmentDocument.Attachment.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$2, targetList);
                noNamespace.AttachmentDocument.Attachment.Property[] result = new noNamespace.AttachmentDocument.Attachment.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "property" element
         */
        public noNamespace.AttachmentDocument.Attachment.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment.Property target = null;
                target = (noNamespace.AttachmentDocument.Attachment.Property)get_store().find_element_user(PROPERTY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$2);
            }
        }
        
        /**
         * Sets array of all "property" element
         */
        public void setPropertyArray(noNamespace.AttachmentDocument.Attachment.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$2);
            }
        }
        
        /**
         * Sets ith "property" element
         */
        public void setPropertyArray(int i, noNamespace.AttachmentDocument.Attachment.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment.Property target = null;
                target = (noNamespace.AttachmentDocument.Attachment.Property)get_store().find_element_user(PROPERTY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        public noNamespace.AttachmentDocument.Attachment.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment.Property target = null;
                target = (noNamespace.AttachmentDocument.Attachment.Property)get_store().insert_element_user(PROPERTY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        public noNamespace.AttachmentDocument.Attachment.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AttachmentDocument.Attachment.Property target = null;
                target = (noNamespace.AttachmentDocument.Attachment.Property)get_store().add_element_user(PROPERTY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$2, i);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$4) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$4);
            }
        }
        /**
         * An XML property(@).
         *
         * This is a complex type.
         */
        public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AttachmentDocument.Attachment.Property
        {
            private static final long serialVersionUID = 1L;
            
            public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName KEY$0 = 
                new javax.xml.namespace.QName("", "key");
            private static final javax.xml.namespace.QName VALUE$2 = 
                new javax.xml.namespace.QName("", "value");
            
            
            /**
             * Gets the "key" attribute
             */
            public java.lang.String getKey()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "key" attribute
             */
            public org.apache.xmlbeans.XmlString xgetKey()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                    return target;
                }
            }
            
            /**
             * True if has "key" attribute
             */
            public boolean isSetKey()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(KEY$0) != null;
                }
            }
            
            /**
             * Sets the "key" attribute
             */
            public void setKey(java.lang.String key)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$0);
                    }
                    target.setStringValue(key);
                }
            }
            
            /**
             * Sets (as xml) the "key" attribute
             */
            public void xsetKey(org.apache.xmlbeans.XmlString key)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$0);
                    }
                    target.set(key);
                }
            }
            
            /**
             * Unsets the "key" attribute
             */
            public void unsetKey()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(KEY$0);
                }
            }
            
            /**
             * Gets the "value" attribute
             */
            public java.lang.String getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "value" attribute
             */
            public org.apache.xmlbeans.XmlString xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                    return target;
                }
            }
            
            /**
             * True if has "value" attribute
             */
            public boolean isSetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALUE$2) != null;
                }
            }
            
            /**
             * Sets the "value" attribute
             */
            public void setValue(java.lang.String value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                    }
                    target.setStringValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "value" attribute
             */
            public void xsetValue(org.apache.xmlbeans.XmlString value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                    }
                    target.set(value);
                }
            }
            
            /**
             * Unsets the "value" attribute
             */
            public void unsetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALUE$2);
                }
            }
        }
    }
}
