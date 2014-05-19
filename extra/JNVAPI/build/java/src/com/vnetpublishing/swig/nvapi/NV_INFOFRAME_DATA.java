/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_INFOFRAME_DATA {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_INFOFRAME_DATA(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_INFOFRAME_DATA obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_INFOFRAME_DATA(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_INFOFRAME_DATA_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_INFOFRAME_DATA_version_get(swigCPtr, this);
  }

  public void setSize(int value) {
    jnvapiJNI.NV_INFOFRAME_DATA_size_set(swigCPtr, this, value);
  }

  public int getSize() {
    return jnvapiJNI.NV_INFOFRAME_DATA_size_get(swigCPtr, this);
  }

  public void setCmd(short value) {
    jnvapiJNI.NV_INFOFRAME_DATA_cmd_set(swigCPtr, this, value);
  }

  public short getCmd() {
    return jnvapiJNI.NV_INFOFRAME_DATA_cmd_get(swigCPtr, this);
  }

  public void setType(short value) {
    jnvapiJNI.NV_INFOFRAME_DATA_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return jnvapiJNI.NV_INFOFRAME_DATA_type_get(swigCPtr, this);
  }

  public NV_INFOFRAME_DATA_infoframe getInfoframe() {
    long cPtr = jnvapiJNI.NV_INFOFRAME_DATA_infoframe_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NV_INFOFRAME_DATA_infoframe(cPtr, false);
  }

  public NV_INFOFRAME_DATA() {
    this(jnvapiJNI.new_NV_INFOFRAME_DATA(), true);
  }

}