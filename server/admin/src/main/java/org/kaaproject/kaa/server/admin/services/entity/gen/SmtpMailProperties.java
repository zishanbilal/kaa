/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.admin.services.entity.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SmtpMailProperties extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SmtpMailProperties\",\"namespace\":\"org.kaaproject.kaa.server.admin.services.entity.gen\",\"fields\":[{\"name\":\"mailFrom\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"Kaa <admin@kaaproject.org>\",\"displayName\":\"From address\",\"maxLength\":1000},{\"name\":\"smtpProtocol\",\"type\":{\"type\":\"enum\",\"name\":\"SmtpProtocol\",\"symbols\":[\"SMTP\",\"SMTPS\"]},\"default\":\"SMTP\",\"displayName\":\"SMTP protocol\",\"displayNames\":[\"SMTP\",\"SMTPS\"]},{\"name\":\"smtpHost\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"localhost\",\"displayName\":\"SMTP Host\"},{\"name\":\"smtpPort\",\"type\":\"int\",\"default\":25,\"displayName\":\"SMTP Port\"},{\"name\":\"timeout\",\"type\":[\"int\",\"null\"],\"default\":10000,\"displayName\":\"Timeout\",\"optional\":true},{\"name\":\"enableTls\",\"type\":[\"boolean\",\"null\"],\"default\":false,\"displayName\":\"TLS\",\"optional\":true},{\"name\":\"username\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"default\":\"\",\"displayName\":\"Username\",\"optional\":true},{\"name\":\"password\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"default\":\"\",\"displayName\":\"Password\",\"optional\":true,\"inputType\":\"password\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String mailFrom;
   private org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol smtpProtocol;
   private java.lang.String smtpHost;
   private int smtpPort;
   private java.lang.Integer timeout;
   private java.lang.Boolean enableTls;
   private java.lang.String username;
   private java.lang.String password;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public SmtpMailProperties() {}

  /**
   * All-args constructor.
   */
  public SmtpMailProperties(java.lang.String mailFrom, org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol smtpProtocol, java.lang.String smtpHost, java.lang.Integer smtpPort, java.lang.Integer timeout, java.lang.Boolean enableTls, java.lang.String username, java.lang.String password) {
    this.mailFrom = mailFrom;
    this.smtpProtocol = smtpProtocol;
    this.smtpHost = smtpHost;
    this.smtpPort = smtpPort;
    this.timeout = timeout;
    this.enableTls = enableTls;
    this.username = username;
    this.password = password;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mailFrom;
    case 1: return smtpProtocol;
    case 2: return smtpHost;
    case 3: return smtpPort;
    case 4: return timeout;
    case 5: return enableTls;
    case 6: return username;
    case 7: return password;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mailFrom = (java.lang.String)value$; break;
    case 1: smtpProtocol = (org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol)value$; break;
    case 2: smtpHost = (java.lang.String)value$; break;
    case 3: smtpPort = (java.lang.Integer)value$; break;
    case 4: timeout = (java.lang.Integer)value$; break;
    case 5: enableTls = (java.lang.Boolean)value$; break;
    case 6: username = (java.lang.String)value$; break;
    case 7: password = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'mailFrom' field.
   */
  public java.lang.String getMailFrom() {
    return mailFrom;
  }

  /**
   * Sets the value of the 'mailFrom' field.
   * @param value the value to set.
   */
  public void setMailFrom(java.lang.String value) {
    this.mailFrom = value;
  }

  /**
   * Gets the value of the 'smtpProtocol' field.
   */
  public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol getSmtpProtocol() {
    return smtpProtocol;
  }

  /**
   * Sets the value of the 'smtpProtocol' field.
   * @param value the value to set.
   */
  public void setSmtpProtocol(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol value) {
    this.smtpProtocol = value;
  }

  /**
   * Gets the value of the 'smtpHost' field.
   */
  public java.lang.String getSmtpHost() {
    return smtpHost;
  }

  /**
   * Sets the value of the 'smtpHost' field.
   * @param value the value to set.
   */
  public void setSmtpHost(java.lang.String value) {
    this.smtpHost = value;
  }

  /**
   * Gets the value of the 'smtpPort' field.
   */
  public java.lang.Integer getSmtpPort() {
    return smtpPort;
  }

  /**
   * Sets the value of the 'smtpPort' field.
   * @param value the value to set.
   */
  public void setSmtpPort(java.lang.Integer value) {
    this.smtpPort = value;
  }

  /**
   * Gets the value of the 'timeout' field.
   */
  public java.lang.Integer getTimeout() {
    return timeout;
  }

  /**
   * Sets the value of the 'timeout' field.
   * @param value the value to set.
   */
  public void setTimeout(java.lang.Integer value) {
    this.timeout = value;
  }

  /**
   * Gets the value of the 'enableTls' field.
   */
  public java.lang.Boolean getEnableTls() {
    return enableTls;
  }

  /**
   * Sets the value of the 'enableTls' field.
   * @param value the value to set.
   */
  public void setEnableTls(java.lang.Boolean value) {
    this.enableTls = value;
  }

  /**
   * Gets the value of the 'username' field.
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Sets the value of the 'username' field.
   * @param value the value to set.
   */
  public void setUsername(java.lang.String value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'password' field.
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Sets the value of the 'password' field.
   * @param value the value to set.
   */
  public void setPassword(java.lang.String value) {
    this.password = value;
  }

  /** Creates a new SmtpMailProperties RecordBuilder */
  public static org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder newBuilder() {
    return new org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder();
  }
  
  /** Creates a new SmtpMailProperties RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder newBuilder(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder other) {
    return new org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder(other);
  }
  
  /** Creates a new SmtpMailProperties RecordBuilder by copying an existing SmtpMailProperties instance */
  public static org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder newBuilder(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties other) {
    return new org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder(other);
  }
  
  /**
   * RecordBuilder for SmtpMailProperties instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SmtpMailProperties>
    implements org.apache.avro.data.RecordBuilder<SmtpMailProperties> {

    private java.lang.String mailFrom;
    private org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol smtpProtocol;
    private java.lang.String smtpHost;
    private int smtpPort;
    private java.lang.Integer timeout;
    private java.lang.Boolean enableTls;
    private java.lang.String username;
    private java.lang.String password;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mailFrom)) {
        this.mailFrom = data().deepCopy(fields()[0].schema(), other.mailFrom);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.smtpProtocol)) {
        this.smtpProtocol = data().deepCopy(fields()[1].schema(), other.smtpProtocol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.smtpHost)) {
        this.smtpHost = data().deepCopy(fields()[2].schema(), other.smtpHost);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.smtpPort)) {
        this.smtpPort = data().deepCopy(fields()[3].schema(), other.smtpPort);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timeout)) {
        this.timeout = data().deepCopy(fields()[4].schema(), other.timeout);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.enableTls)) {
        this.enableTls = data().deepCopy(fields()[5].schema(), other.enableTls);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.username)) {
        this.username = data().deepCopy(fields()[6].schema(), other.username);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.password)) {
        this.password = data().deepCopy(fields()[7].schema(), other.password);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing SmtpMailProperties instance */
    private Builder(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties other) {
            super(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.SCHEMA$);
      if (isValidValue(fields()[0], other.mailFrom)) {
        this.mailFrom = data().deepCopy(fields()[0].schema(), other.mailFrom);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.smtpProtocol)) {
        this.smtpProtocol = data().deepCopy(fields()[1].schema(), other.smtpProtocol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.smtpHost)) {
        this.smtpHost = data().deepCopy(fields()[2].schema(), other.smtpHost);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.smtpPort)) {
        this.smtpPort = data().deepCopy(fields()[3].schema(), other.smtpPort);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timeout)) {
        this.timeout = data().deepCopy(fields()[4].schema(), other.timeout);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.enableTls)) {
        this.enableTls = data().deepCopy(fields()[5].schema(), other.enableTls);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.username)) {
        this.username = data().deepCopy(fields()[6].schema(), other.username);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.password)) {
        this.password = data().deepCopy(fields()[7].schema(), other.password);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'mailFrom' field */
    public java.lang.String getMailFrom() {
      return mailFrom;
    }
    
    /** Sets the value of the 'mailFrom' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setMailFrom(java.lang.String value) {
      validate(fields()[0], value);
      this.mailFrom = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'mailFrom' field has been set */
    public boolean hasMailFrom() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'mailFrom' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearMailFrom() {
      mailFrom = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'smtpProtocol' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol getSmtpProtocol() {
      return smtpProtocol;
    }
    
    /** Sets the value of the 'smtpProtocol' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setSmtpProtocol(org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol value) {
      validate(fields()[1], value);
      this.smtpProtocol = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'smtpProtocol' field has been set */
    public boolean hasSmtpProtocol() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'smtpProtocol' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearSmtpProtocol() {
      smtpProtocol = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'smtpHost' field */
    public java.lang.String getSmtpHost() {
      return smtpHost;
    }
    
    /** Sets the value of the 'smtpHost' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setSmtpHost(java.lang.String value) {
      validate(fields()[2], value);
      this.smtpHost = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'smtpHost' field has been set */
    public boolean hasSmtpHost() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'smtpHost' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearSmtpHost() {
      smtpHost = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'smtpPort' field */
    public java.lang.Integer getSmtpPort() {
      return smtpPort;
    }
    
    /** Sets the value of the 'smtpPort' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setSmtpPort(int value) {
      validate(fields()[3], value);
      this.smtpPort = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'smtpPort' field has been set */
    public boolean hasSmtpPort() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'smtpPort' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearSmtpPort() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'timeout' field */
    public java.lang.Integer getTimeout() {
      return timeout;
    }
    
    /** Sets the value of the 'timeout' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setTimeout(java.lang.Integer value) {
      validate(fields()[4], value);
      this.timeout = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'timeout' field has been set */
    public boolean hasTimeout() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'timeout' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearTimeout() {
      timeout = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'enableTls' field */
    public java.lang.Boolean getEnableTls() {
      return enableTls;
    }
    
    /** Sets the value of the 'enableTls' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setEnableTls(java.lang.Boolean value) {
      validate(fields()[5], value);
      this.enableTls = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'enableTls' field has been set */
    public boolean hasEnableTls() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'enableTls' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearEnableTls() {
      enableTls = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'username' field */
    public java.lang.String getUsername() {
      return username;
    }
    
    /** Sets the value of the 'username' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setUsername(java.lang.String value) {
      validate(fields()[6], value);
      this.username = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'username' field has been set */
    public boolean hasUsername() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'username' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearUsername() {
      username = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'password' field */
    public java.lang.String getPassword() {
      return password;
    }
    
    /** Sets the value of the 'password' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder setPassword(java.lang.String value) {
      validate(fields()[7], value);
      this.password = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'password' field has been set */
    public boolean hasPassword() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'password' field */
    public org.kaaproject.kaa.server.admin.services.entity.gen.SmtpMailProperties.Builder clearPassword() {
      password = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public SmtpMailProperties build() {
      try {
        SmtpMailProperties record = new SmtpMailProperties();
        record.mailFrom = fieldSetFlags()[0] ? this.mailFrom : (java.lang.String) defaultValue(fields()[0]);
        record.smtpProtocol = fieldSetFlags()[1] ? this.smtpProtocol : (org.kaaproject.kaa.server.admin.services.entity.gen.SmtpProtocol) defaultValue(fields()[1]);
        record.smtpHost = fieldSetFlags()[2] ? this.smtpHost : (java.lang.String) defaultValue(fields()[2]);
        record.smtpPort = fieldSetFlags()[3] ? this.smtpPort : (java.lang.Integer) defaultValue(fields()[3]);
        record.timeout = fieldSetFlags()[4] ? this.timeout : (java.lang.Integer) defaultValue(fields()[4]);
        record.enableTls = fieldSetFlags()[5] ? this.enableTls : (java.lang.Boolean) defaultValue(fields()[5]);
        record.username = fieldSetFlags()[6] ? this.username : (java.lang.String) defaultValue(fields()[6]);
        record.password = fieldSetFlags()[7] ? this.password : (java.lang.String) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}