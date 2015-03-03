/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.security.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"unchecked", "serial", "rawtypes", "unused"}) public class TAuthenticationKey implements org.apache.thrift.TBase<TAuthenticationKey, TAuthenticationKey._Fields>, java.io.Serializable, Cloneable, Comparable<TAuthenticationKey> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAuthenticationKey");

  private static final org.apache.thrift.protocol.TField SECRET_FIELD_DESC = new org.apache.thrift.protocol.TField("secret", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KEY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("keyId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EXPIRATION_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("expirationDate", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField CREATION_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("creationDate", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAuthenticationKeyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAuthenticationKeyTupleSchemeFactory());
  }

  public ByteBuffer secret; // required
  public int keyId; // optional
  public long expirationDate; // optional
  public long creationDate; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SECRET((short)1, "secret"),
    KEY_ID((short)2, "keyId"),
    EXPIRATION_DATE((short)3, "expirationDate"),
    CREATION_DATE((short)4, "creationDate");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SECRET
          return SECRET;
        case 2: // KEY_ID
          return KEY_ID;
        case 3: // EXPIRATION_DATE
          return EXPIRATION_DATE;
        case 4: // CREATION_DATE
          return CREATION_DATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __KEYID_ISSET_ID = 0;
  private static final int __EXPIRATIONDATE_ISSET_ID = 1;
  private static final int __CREATIONDATE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.KEY_ID,_Fields.EXPIRATION_DATE,_Fields.CREATION_DATE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SECRET, new org.apache.thrift.meta_data.FieldMetaData("secret", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.KEY_ID, new org.apache.thrift.meta_data.FieldMetaData("keyId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXPIRATION_DATE, new org.apache.thrift.meta_data.FieldMetaData("expirationDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CREATION_DATE, new org.apache.thrift.meta_data.FieldMetaData("creationDate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAuthenticationKey.class, metaDataMap);
  }

  public TAuthenticationKey() {
  }

  public TAuthenticationKey(
    ByteBuffer secret)
  {
    this();
    this.secret = secret;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAuthenticationKey(TAuthenticationKey other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSecret()) {
      this.secret = org.apache.thrift.TBaseHelper.copyBinary(other.secret);
;
    }
    this.keyId = other.keyId;
    this.expirationDate = other.expirationDate;
    this.creationDate = other.creationDate;
  }

  public TAuthenticationKey deepCopy() {
    return new TAuthenticationKey(this);
  }

  @Override
  public void clear() {
    this.secret = null;
    setKeyIdIsSet(false);
    this.keyId = 0;
    setExpirationDateIsSet(false);
    this.expirationDate = 0;
    setCreationDateIsSet(false);
    this.creationDate = 0;
  }

  public byte[] getSecret() {
    setSecret(org.apache.thrift.TBaseHelper.rightSize(secret));
    return secret == null ? null : secret.array();
  }

  public ByteBuffer bufferForSecret() {
    return secret;
  }

  public TAuthenticationKey setSecret(byte[] secret) {
    setSecret(secret == null ? (ByteBuffer)null : ByteBuffer.wrap(secret));
    return this;
  }

  public TAuthenticationKey setSecret(ByteBuffer secret) {
    this.secret = secret;
    return this;
  }

  public void unsetSecret() {
    this.secret = null;
  }

  /** Returns true if field secret is set (has been assigned a value) and false otherwise */
  public boolean isSetSecret() {
    return this.secret != null;
  }

  public void setSecretIsSet(boolean value) {
    if (!value) {
      this.secret = null;
    }
  }

  public int getKeyId() {
    return this.keyId;
  }

  public TAuthenticationKey setKeyId(int keyId) {
    this.keyId = keyId;
    setKeyIdIsSet(true);
    return this;
  }

  public void unsetKeyId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __KEYID_ISSET_ID);
  }

  /** Returns true if field keyId is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyId() {
    return EncodingUtils.testBit(__isset_bitfield, __KEYID_ISSET_ID);
  }

  public void setKeyIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __KEYID_ISSET_ID, value);
  }

  public long getExpirationDate() {
    return this.expirationDate;
  }

  public TAuthenticationKey setExpirationDate(long expirationDate) {
    this.expirationDate = expirationDate;
    setExpirationDateIsSet(true);
    return this;
  }

  public void unsetExpirationDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPIRATIONDATE_ISSET_ID);
  }

  /** Returns true if field expirationDate is set (has been assigned a value) and false otherwise */
  public boolean isSetExpirationDate() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPIRATIONDATE_ISSET_ID);
  }

  public void setExpirationDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPIRATIONDATE_ISSET_ID, value);
  }

  public long getCreationDate() {
    return this.creationDate;
  }

  public TAuthenticationKey setCreationDate(long creationDate) {
    this.creationDate = creationDate;
    setCreationDateIsSet(true);
    return this;
  }

  public void unsetCreationDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATIONDATE_ISSET_ID);
  }

  /** Returns true if field creationDate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationDate() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATIONDATE_ISSET_ID);
  }

  public void setCreationDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATIONDATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SECRET:
      if (value == null) {
        unsetSecret();
      } else {
        setSecret((ByteBuffer)value);
      }
      break;

    case KEY_ID:
      if (value == null) {
        unsetKeyId();
      } else {
        setKeyId((Integer)value);
      }
      break;

    case EXPIRATION_DATE:
      if (value == null) {
        unsetExpirationDate();
      } else {
        setExpirationDate((Long)value);
      }
      break;

    case CREATION_DATE:
      if (value == null) {
        unsetCreationDate();
      } else {
        setCreationDate((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SECRET:
      return getSecret();

    case KEY_ID:
      return Integer.valueOf(getKeyId());

    case EXPIRATION_DATE:
      return Long.valueOf(getExpirationDate());

    case CREATION_DATE:
      return Long.valueOf(getCreationDate());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SECRET:
      return isSetSecret();
    case KEY_ID:
      return isSetKeyId();
    case EXPIRATION_DATE:
      return isSetExpirationDate();
    case CREATION_DATE:
      return isSetCreationDate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAuthenticationKey)
      return this.equals((TAuthenticationKey)that);
    return false;
  }

  public boolean equals(TAuthenticationKey that) {
    if (that == null)
      return false;

    boolean this_present_secret = true && this.isSetSecret();
    boolean that_present_secret = true && that.isSetSecret();
    if (this_present_secret || that_present_secret) {
      if (!(this_present_secret && that_present_secret))
        return false;
      if (!this.secret.equals(that.secret))
        return false;
    }

    boolean this_present_keyId = true && this.isSetKeyId();
    boolean that_present_keyId = true && that.isSetKeyId();
    if (this_present_keyId || that_present_keyId) {
      if (!(this_present_keyId && that_present_keyId))
        return false;
      if (this.keyId != that.keyId)
        return false;
    }

    boolean this_present_expirationDate = true && this.isSetExpirationDate();
    boolean that_present_expirationDate = true && that.isSetExpirationDate();
    if (this_present_expirationDate || that_present_expirationDate) {
      if (!(this_present_expirationDate && that_present_expirationDate))
        return false;
      if (this.expirationDate != that.expirationDate)
        return false;
    }

    boolean this_present_creationDate = true && this.isSetCreationDate();
    boolean that_present_creationDate = true && that.isSetCreationDate();
    if (this_present_creationDate || that_present_creationDate) {
      if (!(this_present_creationDate && that_present_creationDate))
        return false;
      if (this.creationDate != that.creationDate)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TAuthenticationKey other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSecret()).compareTo(other.isSetSecret());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecret()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secret, other.secret);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeyId()).compareTo(other.isSetKeyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyId, other.keyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpirationDate()).compareTo(other.isSetExpirationDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpirationDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expirationDate, other.expirationDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreationDate()).compareTo(other.isSetCreationDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationDate, other.creationDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TAuthenticationKey(");
    boolean first = true;

    sb.append("secret:");
    if (this.secret == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.secret, sb);
    }
    first = false;
    if (isSetKeyId()) {
      if (!first) sb.append(", ");
      sb.append("keyId:");
      sb.append(this.keyId);
      first = false;
    }
    if (isSetExpirationDate()) {
      if (!first) sb.append(", ");
      sb.append("expirationDate:");
      sb.append(this.expirationDate);
      first = false;
    }
    if (isSetCreationDate()) {
      if (!first) sb.append(", ");
      sb.append("creationDate:");
      sb.append(this.creationDate);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAuthenticationKeyStandardSchemeFactory implements SchemeFactory {
    public TAuthenticationKeyStandardScheme getScheme() {
      return new TAuthenticationKeyStandardScheme();
    }
  }

  private static class TAuthenticationKeyStandardScheme extends StandardScheme<TAuthenticationKey> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAuthenticationKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SECRET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.secret = iprot.readBinary();
              struct.setSecretIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.keyId = iprot.readI32();
              struct.setKeyIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPIRATION_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expirationDate = iprot.readI64();
              struct.setExpirationDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATION_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationDate = iprot.readI64();
              struct.setCreationDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAuthenticationKey struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.secret != null) {
        oprot.writeFieldBegin(SECRET_FIELD_DESC);
        oprot.writeBinary(struct.secret);
        oprot.writeFieldEnd();
      }
      if (struct.isSetKeyId()) {
        oprot.writeFieldBegin(KEY_ID_FIELD_DESC);
        oprot.writeI32(struct.keyId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetExpirationDate()) {
        oprot.writeFieldBegin(EXPIRATION_DATE_FIELD_DESC);
        oprot.writeI64(struct.expirationDate);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreationDate()) {
        oprot.writeFieldBegin(CREATION_DATE_FIELD_DESC);
        oprot.writeI64(struct.creationDate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAuthenticationKeyTupleSchemeFactory implements SchemeFactory {
    public TAuthenticationKeyTupleScheme getScheme() {
      return new TAuthenticationKeyTupleScheme();
    }
  }

  private static class TAuthenticationKeyTupleScheme extends TupleScheme<TAuthenticationKey> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAuthenticationKey struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSecret()) {
        optionals.set(0);
      }
      if (struct.isSetKeyId()) {
        optionals.set(1);
      }
      if (struct.isSetExpirationDate()) {
        optionals.set(2);
      }
      if (struct.isSetCreationDate()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSecret()) {
        oprot.writeBinary(struct.secret);
      }
      if (struct.isSetKeyId()) {
        oprot.writeI32(struct.keyId);
      }
      if (struct.isSetExpirationDate()) {
        oprot.writeI64(struct.expirationDate);
      }
      if (struct.isSetCreationDate()) {
        oprot.writeI64(struct.creationDate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAuthenticationKey struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.secret = iprot.readBinary();
        struct.setSecretIsSet(true);
      }
      if (incoming.get(1)) {
        struct.keyId = iprot.readI32();
        struct.setKeyIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.expirationDate = iprot.readI64();
        struct.setExpirationDateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.creationDate = iprot.readI64();
        struct.setCreationDateIsSet(true);
      }
    }
  }

}
