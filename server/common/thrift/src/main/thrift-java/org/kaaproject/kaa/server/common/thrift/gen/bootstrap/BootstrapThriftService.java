/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.bootstrap;

import org.apache.commons.lang3.builder.HashCodeBuilder;
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

public class BootstrapThriftService {

  public interface Iface extends org.kaaproject.kaa.server.common.thrift.gen.cli.CliThriftService.Iface {

    /**
     * Set Operations Servers List
     * 
     * @param operationsServersList
     */
    public void onOperationsServerListUpdate(List<ThriftOperationsServer> operationsServersList) throws org.apache.thrift.TException;

  }

  public interface AsyncIface extends org.kaaproject.kaa.server.common.thrift.gen.cli.CliThriftService .AsyncIface {

    public void onOperationsServerListUpdate(List<ThriftOperationsServer> operationsServersList, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.kaaproject.kaa.server.common.thrift.gen.cli.CliThriftService.Client implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void onOperationsServerListUpdate(List<ThriftOperationsServer> operationsServersList) throws org.apache.thrift.TException
    {
      send_onOperationsServerListUpdate(operationsServersList);
      recv_onOperationsServerListUpdate();
    }

    public void send_onOperationsServerListUpdate(List<ThriftOperationsServer> operationsServersList) throws org.apache.thrift.TException
    {
      onOperationsServerListUpdate_args args = new onOperationsServerListUpdate_args();
      args.setOperationsServersList(operationsServersList);
      sendBase("onOperationsServerListUpdate", args);
    }

    public void recv_onOperationsServerListUpdate() throws org.apache.thrift.TException
    {
      onOperationsServerListUpdate_result result = new onOperationsServerListUpdate_result();
      receiveBase(result, "onOperationsServerListUpdate");
      return;
    }

  }
  public static class AsyncClient extends org.kaaproject.kaa.server.common.thrift.gen.cli.CliThriftService.AsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void onOperationsServerListUpdate(List<ThriftOperationsServer> operationsServersList, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      onOperationsServerListUpdate_call method_call = new onOperationsServerListUpdate_call(operationsServersList, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class onOperationsServerListUpdate_call extends org.apache.thrift.async.TAsyncMethodCall {
      private List<ThriftOperationsServer> operationsServersList;
      public onOperationsServerListUpdate_call(List<ThriftOperationsServer> operationsServersList, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.operationsServersList = operationsServersList;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("onOperationsServerListUpdate", org.apache.thrift.protocol.TMessageType.CALL, 0));
        onOperationsServerListUpdate_args args = new onOperationsServerListUpdate_args();
        args.setOperationsServersList(operationsServersList);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_onOperationsServerListUpdate();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.kaaproject.kaa.server.common.thrift.gen.cli.CliThriftService.Processor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("onOperationsServerListUpdate", new onOperationsServerListUpdate());
      return processMap;
    }

    public static class onOperationsServerListUpdate<I extends Iface> extends org.apache.thrift.ProcessFunction<I, onOperationsServerListUpdate_args> {
      public onOperationsServerListUpdate() {
        super("onOperationsServerListUpdate");
      }

      public onOperationsServerListUpdate_args getEmptyArgsInstance() {
        return new onOperationsServerListUpdate_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public onOperationsServerListUpdate_result getResult(I iface, onOperationsServerListUpdate_args args) throws org.apache.thrift.TException {
        onOperationsServerListUpdate_result result = new onOperationsServerListUpdate_result();
        iface.onOperationsServerListUpdate(args.operationsServersList);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.kaaproject.kaa.server.common.thrift.gen.cli.CliThriftService.AsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("onOperationsServerListUpdate", new onOperationsServerListUpdate());
      return processMap;
    }

    public static class onOperationsServerListUpdate<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, onOperationsServerListUpdate_args, Void> {
      public onOperationsServerListUpdate() {
        super("onOperationsServerListUpdate");
      }

      public onOperationsServerListUpdate_args getEmptyArgsInstance() {
        return new onOperationsServerListUpdate_args();
      }

      public AsyncMethodCallback<Void> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            onOperationsServerListUpdate_result result = new onOperationsServerListUpdate_result();
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            onOperationsServerListUpdate_result result = new onOperationsServerListUpdate_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, onOperationsServerListUpdate_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws TException {
        iface.onOperationsServerListUpdate(args.operationsServersList,resultHandler);
      }
    }

  }

  public static class onOperationsServerListUpdate_args implements org.apache.thrift.TBase<onOperationsServerListUpdate_args, onOperationsServerListUpdate_args._Fields>, java.io.Serializable, Cloneable, Comparable<onOperationsServerListUpdate_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("onOperationsServerListUpdate_args");

    private static final org.apache.thrift.protocol.TField OPERATIONS_SERVERS_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("operationsServersList", org.apache.thrift.protocol.TType.LIST, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new onOperationsServerListUpdate_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new onOperationsServerListUpdate_argsTupleSchemeFactory());
    }

    public List<ThriftOperationsServer> operationsServersList; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      OPERATIONS_SERVERS_LIST((short)1, "operationsServersList");

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
          case 1: // OPERATIONS_SERVERS_LIST
            return OPERATIONS_SERVERS_LIST;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.OPERATIONS_SERVERS_LIST, new org.apache.thrift.meta_data.FieldMetaData("operationsServersList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST          , "serversList")));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(onOperationsServerListUpdate_args.class, metaDataMap);
    }

    public onOperationsServerListUpdate_args() {
    }

    public onOperationsServerListUpdate_args(
      List<ThriftOperationsServer> operationsServersList)
    {
      this();
      this.operationsServersList = operationsServersList;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public onOperationsServerListUpdate_args(onOperationsServerListUpdate_args other) {
      if (other.isSetOperationsServersList()) {
        this.operationsServersList = other.operationsServersList;
      }
    }

    public onOperationsServerListUpdate_args deepCopy() {
      return new onOperationsServerListUpdate_args(this);
    }

    @Override
    public void clear() {
      this.operationsServersList = null;
    }

    public int getOperationsServersListSize() {
      return (this.operationsServersList == null) ? 0 : this.operationsServersList.size();
    }

    public java.util.Iterator<ThriftOperationsServer> getOperationsServersListIterator() {
      return (this.operationsServersList == null) ? null : this.operationsServersList.iterator();
    }

    public void addToOperationsServersList(ThriftOperationsServer elem) {
      if (this.operationsServersList == null) {
        this.operationsServersList = new ArrayList<ThriftOperationsServer>();
      }
      this.operationsServersList.add(elem);
    }

    public List<ThriftOperationsServer> getOperationsServersList() {
      return this.operationsServersList;
    }

    public onOperationsServerListUpdate_args setOperationsServersList(List<ThriftOperationsServer> operationsServersList) {
      this.operationsServersList = operationsServersList;
      return this;
    }

    public void unsetOperationsServersList() {
      this.operationsServersList = null;
    }

    /** Returns true if field operationsServersList is set (has been assigned a value) and false otherwise */
    public boolean isSetOperationsServersList() {
      return this.operationsServersList != null;
    }

    public void setOperationsServersListIsSet(boolean value) {
      if (!value) {
        this.operationsServersList = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case OPERATIONS_SERVERS_LIST:
        if (value == null) {
          unsetOperationsServersList();
        } else {
          setOperationsServersList((List<ThriftOperationsServer>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case OPERATIONS_SERVERS_LIST:
        return getOperationsServersList();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case OPERATIONS_SERVERS_LIST:
        return isSetOperationsServersList();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof onOperationsServerListUpdate_args)
        return this.equals((onOperationsServerListUpdate_args)that);
      return false;
    }

    public boolean equals(onOperationsServerListUpdate_args that) {
      if (that == null)
        return false;

      boolean this_present_operationsServersList = true && this.isSetOperationsServersList();
      boolean that_present_operationsServersList = true && that.isSetOperationsServersList();
      if (this_present_operationsServersList || that_present_operationsServersList) {
        if (!(this_present_operationsServersList && that_present_operationsServersList))
          return false;
        if (!this.operationsServersList.equals(that.operationsServersList))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      HashCodeBuilder builder = new HashCodeBuilder();

      boolean present_operationsServersList = true && (isSetOperationsServersList());
      builder.append(present_operationsServersList);
      if (present_operationsServersList)
        builder.append(operationsServersList);

      return builder.toHashCode();
    }

    @Override
    public int compareTo(onOperationsServerListUpdate_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetOperationsServersList()).compareTo(other.isSetOperationsServersList());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetOperationsServersList()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationsServersList, other.operationsServersList);
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
      StringBuilder sb = new StringBuilder("onOperationsServerListUpdate_args(");
      boolean first = true;

      sb.append("operationsServersList:");
      if (this.operationsServersList == null) {
        sb.append("null");
      } else {
        sb.append(this.operationsServersList);
      }
      first = false;
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class onOperationsServerListUpdate_argsStandardSchemeFactory implements SchemeFactory {
      public onOperationsServerListUpdate_argsStandardScheme getScheme() {
        return new onOperationsServerListUpdate_argsStandardScheme();
      }
    }

    private static class onOperationsServerListUpdate_argsStandardScheme extends StandardScheme<onOperationsServerListUpdate_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, onOperationsServerListUpdate_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // OPERATIONS_SERVERS_LIST
              if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                {
                  org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                  struct.operationsServersList = new ArrayList<ThriftOperationsServer>(_list0.size);
                  for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                  {
                    ThriftOperationsServer _elem2;
                    _elem2 = new ThriftOperationsServer();
                    _elem2.read(iprot);
                    struct.operationsServersList.add(_elem2);
                  }
                  iprot.readListEnd();
                }
                struct.setOperationsServersListIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, onOperationsServerListUpdate_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.operationsServersList != null) {
          oprot.writeFieldBegin(OPERATIONS_SERVERS_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.operationsServersList.size()));
            for (ThriftOperationsServer _iter3 : struct.operationsServersList)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class onOperationsServerListUpdate_argsTupleSchemeFactory implements SchemeFactory {
      public onOperationsServerListUpdate_argsTupleScheme getScheme() {
        return new onOperationsServerListUpdate_argsTupleScheme();
      }
    }

    private static class onOperationsServerListUpdate_argsTupleScheme extends TupleScheme<onOperationsServerListUpdate_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, onOperationsServerListUpdate_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetOperationsServersList()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetOperationsServersList()) {
          {
            oprot.writeI32(struct.operationsServersList.size());
            for (ThriftOperationsServer _iter4 : struct.operationsServersList)
            {
              _iter4.write(oprot);
            }
          }
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, onOperationsServerListUpdate_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            struct.operationsServersList = new ArrayList<ThriftOperationsServer>(_list5.size);
            for (int _i6 = 0; _i6 < _list5.size; ++_i6)
            {
              ThriftOperationsServer _elem7;
              _elem7 = new ThriftOperationsServer();
              _elem7.read(iprot);
              struct.operationsServersList.add(_elem7);
            }
          }
          struct.setOperationsServersListIsSet(true);
        }
      }
    }

  }

  public static class onOperationsServerListUpdate_result implements org.apache.thrift.TBase<onOperationsServerListUpdate_result, onOperationsServerListUpdate_result._Fields>, java.io.Serializable, Cloneable, Comparable<onOperationsServerListUpdate_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("onOperationsServerListUpdate_result");


    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new onOperationsServerListUpdate_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new onOperationsServerListUpdate_resultTupleSchemeFactory());
    }


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(onOperationsServerListUpdate_result.class, metaDataMap);
    }

    public onOperationsServerListUpdate_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public onOperationsServerListUpdate_result(onOperationsServerListUpdate_result other) {
    }

    public onOperationsServerListUpdate_result deepCopy() {
      return new onOperationsServerListUpdate_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof onOperationsServerListUpdate_result)
        return this.equals((onOperationsServerListUpdate_result)that);
      return false;
    }

    public boolean equals(onOperationsServerListUpdate_result that) {
      if (that == null)
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      HashCodeBuilder builder = new HashCodeBuilder();

      return builder.toHashCode();
    }

    @Override
    public int compareTo(onOperationsServerListUpdate_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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
      StringBuilder sb = new StringBuilder("onOperationsServerListUpdate_result(");
      boolean first = true;

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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class onOperationsServerListUpdate_resultStandardSchemeFactory implements SchemeFactory {
      public onOperationsServerListUpdate_resultStandardScheme getScheme() {
        return new onOperationsServerListUpdate_resultStandardScheme();
      }
    }

    private static class onOperationsServerListUpdate_resultStandardScheme extends StandardScheme<onOperationsServerListUpdate_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, onOperationsServerListUpdate_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, onOperationsServerListUpdate_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class onOperationsServerListUpdate_resultTupleSchemeFactory implements SchemeFactory {
      public onOperationsServerListUpdate_resultTupleScheme getScheme() {
        return new onOperationsServerListUpdate_resultTupleScheme();
      }
    }

    private static class onOperationsServerListUpdate_resultTupleScheme extends TupleScheme<onOperationsServerListUpdate_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, onOperationsServerListUpdate_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, onOperationsServerListUpdate_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
      }
    }

  }

}
