/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_GPU_DYNAMIC_PSTATES_INFO_EX {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_GPU_DYNAMIC_PSTATES_INFO_EX(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_GPU_DYNAMIC_PSTATES_INFO_EX obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_GPU_DYNAMIC_PSTATES_INFO_EX(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_GPU_DYNAMIC_PSTATES_INFO_EX_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_GPU_DYNAMIC_PSTATES_INFO_EX_version_get(swigCPtr, this);
  }

  public void setFlags(long value) {
    jnvapiJNI.NV_GPU_DYNAMIC_PSTATES_INFO_EX_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return jnvapiJNI.NV_GPU_DYNAMIC_PSTATES_INFO_EX_flags_get(swigCPtr, this);
  }

  public NV_GPU_DYNAMIC_PSTATES_INFO_EX_utilization getUtilization() {
    long cPtr = jnvapiJNI.NV_GPU_DYNAMIC_PSTATES_INFO_EX_utilization_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NV_GPU_DYNAMIC_PSTATES_INFO_EX_utilization(cPtr, false);
  }

  public NV_GPU_DYNAMIC_PSTATES_INFO_EX() {
    this(jnvapiJNI.new_NV_GPU_DYNAMIC_PSTATES_INFO_EX(), true);
  }

}