/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvml;

public class nvmlHwbcEntry_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected nvmlHwbcEntry_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(nvmlHwbcEntry_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvmlJNI.delete_nvmlHwbcEntry_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHwbcId(long value) {
    jnvmlJNI.nvmlHwbcEntry_t_hwbcId_set(swigCPtr, this, value);
  }

  public long getHwbcId() {
    return jnvmlJNI.nvmlHwbcEntry_t_hwbcId_get(swigCPtr, this);
  }

  public void setFirmwareVersion(String value) {
    jnvmlJNI.nvmlHwbcEntry_t_firmwareVersion_set(swigCPtr, this, value);
  }

  public String getFirmwareVersion() {
    return jnvmlJNI.nvmlHwbcEntry_t_firmwareVersion_get(swigCPtr, this);
  }

  public nvmlHwbcEntry_t() {
    this(jnvmlJNI.new_nvmlHwbcEntry_t(), true);
  }

}