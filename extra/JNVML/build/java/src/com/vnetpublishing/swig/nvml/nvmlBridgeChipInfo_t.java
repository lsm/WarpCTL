/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvml;

public class nvmlBridgeChipInfo_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected nvmlBridgeChipInfo_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(nvmlBridgeChipInfo_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvmlJNI.delete_nvmlBridgeChipInfo_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(nvmlBridgeChipType_t value) {
    jnvmlJNI.nvmlBridgeChipInfo_t_type_set(swigCPtr, this, value.swigValue());
  }

  public nvmlBridgeChipType_t getType() {
    return nvmlBridgeChipType_t.swigToEnum(jnvmlJNI.nvmlBridgeChipInfo_t_type_get(swigCPtr, this));
  }

  public void setFwVersion(long value) {
    jnvmlJNI.nvmlBridgeChipInfo_t_fwVersion_set(swigCPtr, this, value);
  }

  public long getFwVersion() {
    return jnvmlJNI.nvmlBridgeChipInfo_t_fwVersion_get(swigCPtr, this);
  }

  public nvmlBridgeChipInfo_t() {
    this(jnvmlJNI.new_nvmlBridgeChipInfo_t(), true);
  }

}
