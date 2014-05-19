/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_MONITOR_COLOR_CAPS_V1 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_MONITOR_COLOR_CAPS_V1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_MONITOR_COLOR_CAPS_V1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_MONITOR_COLOR_CAPS_V1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_MONITOR_COLOR_CAPS_V1_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_MONITOR_COLOR_CAPS_V1_version_get(swigCPtr, this);
  }

  public void setColorFormat(NV_DP_COLOR_FORMAT value) {
    jnvapiJNI.NV_MONITOR_COLOR_CAPS_V1_colorFormat_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_COLOR_FORMAT getColorFormat() {
    return NV_DP_COLOR_FORMAT.swigToEnum(jnvapiJNI.NV_MONITOR_COLOR_CAPS_V1_colorFormat_get(swigCPtr, this));
  }

  public void setBackendBitDepths(NV_DP_BPC value) {
    jnvapiJNI.NV_MONITOR_COLOR_CAPS_V1_backendBitDepths_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_BPC getBackendBitDepths() {
    return NV_DP_BPC.swigToEnum(jnvapiJNI.NV_MONITOR_COLOR_CAPS_V1_backendBitDepths_get(swigCPtr, this));
  }

  public NV_MONITOR_COLOR_CAPS_V1() {
    this(jnvapiJNI.new_NV_MONITOR_COLOR_CAPS_V1(), true);
  }

}