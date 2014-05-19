/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVDRS_BINARY_SETTING {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVDRS_BINARY_SETTING(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVDRS_BINARY_SETTING obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVDRS_BINARY_SETTING(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setValueLength(long value) {
    jnvapiJNI.NVDRS_BINARY_SETTING_valueLength_set(swigCPtr, this, value);
  }

  public long getValueLength() {
    return jnvapiJNI.NVDRS_BINARY_SETTING_valueLength_get(swigCPtr, this);
  }

  public void setValueData(short[] value) {
    jnvapiJNI.NVDRS_BINARY_SETTING_valueData_set(swigCPtr, this, value);
  }

  public short[] getValueData() {
    return jnvapiJNI.NVDRS_BINARY_SETTING_valueData_get(swigCPtr, this);
  }

  public NVDRS_BINARY_SETTING() {
    this(jnvapiJNI.new_NVDRS_BINARY_SETTING(), true);
  }

}
