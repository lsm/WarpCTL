/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_GPU_PERF_PSTATES_INFO_V1_pstates {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_GPU_PERF_PSTATES_INFO_V1_pstates(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_GPU_PERF_PSTATES_INFO_V1_pstates obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_GPU_PERF_PSTATES_INFO_V1_pstates(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPstateId(NV_GPU_PERF_PSTATE_ID value) {
    jnvapiJNI.NV_GPU_PERF_PSTATES_INFO_V1_pstates_pstateId_set(swigCPtr, this, value.swigValue());
  }

  public NV_GPU_PERF_PSTATE_ID getPstateId() {
    return NV_GPU_PERF_PSTATE_ID.swigToEnum(jnvapiJNI.NV_GPU_PERF_PSTATES_INFO_V1_pstates_pstateId_get(swigCPtr, this));
  }

  public void setFlags(long value) {
    jnvapiJNI.NV_GPU_PERF_PSTATES_INFO_V1_pstates_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return jnvapiJNI.NV_GPU_PERF_PSTATES_INFO_V1_pstates_flags_get(swigCPtr, this);
  }

  public NV_GPU_PERF_PSTATES_INFO_V1_pstates_clocks getClocks() {
    long cPtr = jnvapiJNI.NV_GPU_PERF_PSTATES_INFO_V1_pstates_clocks_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NV_GPU_PERF_PSTATES_INFO_V1_pstates_clocks(cPtr, false);
  }

  public NV_GPU_PERF_PSTATES_INFO_V1_pstates() {
    this(jnvapiJNI.new_NV_GPU_PERF_PSTATES_INFO_V1_pstates(), true);
  }

}
