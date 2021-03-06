/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.microfocus.pstl.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class People extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 840329323726146015L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"People\",\"namespace\":\"com.microfocus.pstl.avro\",\"fields\":[{\"name\":\"people\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Person\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.microfocus.pstl.avro.Person> people;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public People() {}

  /**
   * All-args constructor.
   * @param people The new value for people
   */
  public People(java.util.List<com.microfocus.pstl.avro.Person> people) {
    this.people = people;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return people;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: people = (java.util.List<com.microfocus.pstl.avro.Person>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'people' field.
   * @return The value of the 'people' field.
   */
  public java.util.List<com.microfocus.pstl.avro.Person> getPeople() {
    return people;
  }

  /**
   * Sets the value of the 'people' field.
   * @param value the value to set.
   */
  public void setPeople(java.util.List<com.microfocus.pstl.avro.Person> value) {
    this.people = value;
  }

  /**
   * Creates a new People RecordBuilder.
   * @return A new People RecordBuilder
   */
  public static com.microfocus.pstl.avro.People.Builder newBuilder() {
    return new com.microfocus.pstl.avro.People.Builder();
  }

  /**
   * Creates a new People RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new People RecordBuilder
   */
  public static com.microfocus.pstl.avro.People.Builder newBuilder(com.microfocus.pstl.avro.People.Builder other) {
    return new com.microfocus.pstl.avro.People.Builder(other);
  }

  /**
   * Creates a new People RecordBuilder by copying an existing People instance.
   * @param other The existing instance to copy.
   * @return A new People RecordBuilder
   */
  public static com.microfocus.pstl.avro.People.Builder newBuilder(com.microfocus.pstl.avro.People other) {
    return new com.microfocus.pstl.avro.People.Builder(other);
  }

  /**
   * RecordBuilder for People instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<People>
    implements org.apache.avro.data.RecordBuilder<People> {

    private java.util.List<com.microfocus.pstl.avro.Person> people;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.microfocus.pstl.avro.People.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.people)) {
        this.people = data().deepCopy(fields()[0].schema(), other.people);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing People instance
     * @param other The existing instance to copy.
     */
    private Builder(com.microfocus.pstl.avro.People other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.people)) {
        this.people = data().deepCopy(fields()[0].schema(), other.people);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'people' field.
      * @return The value.
      */
    public java.util.List<com.microfocus.pstl.avro.Person> getPeople() {
      return people;
    }

    /**
      * Sets the value of the 'people' field.
      * @param value The value of 'people'.
      * @return This builder.
      */
    public com.microfocus.pstl.avro.People.Builder setPeople(java.util.List<com.microfocus.pstl.avro.Person> value) {
      validate(fields()[0], value);
      this.people = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'people' field has been set.
      * @return True if the 'people' field has been set, false otherwise.
      */
    public boolean hasPeople() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'people' field.
      * @return This builder.
      */
    public com.microfocus.pstl.avro.People.Builder clearPeople() {
      people = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public People build() {
      try {
        People record = new People();
        record.people = fieldSetFlags()[0] ? this.people : (java.util.List<com.microfocus.pstl.avro.Person>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
