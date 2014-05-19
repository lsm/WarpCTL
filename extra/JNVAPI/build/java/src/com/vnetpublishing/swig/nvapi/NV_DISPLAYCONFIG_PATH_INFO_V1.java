/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_DISPLAYCONFIG_PATH_INFO_V1 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_DISPLAYCONFIG_PATH_INFO_V1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_DISPLAYCONFIG_PATH_INFO_V1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_DISPLAYCONFIG_PATH_INFO_V1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_version_get(swigCPtr, this);
  }

  public void setReserved_sourceId(long value) {
    jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_reserved_sourceId_set(swigCPtr, this, value);
  }

  public long getReserved_sourceId() {
    return jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_reserved_sourceId_get(swigCPtr, this);
  }

  public void setTargetInfoCount(long value) {
    jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_targetInfoCount_set(swigCPtr, this, value);
  }

  public long getTargetInfoCount() {
    return jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_targetInfoCount_get(swigCPtr, this);
  }

  public void setTargetInfo(NV_DISPLAYCONFIG_PATH_TARGET_INFO_V1 value) {
    jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_targetInfo_set(swigCPtr, this, NV_DISPLAYCONFIG_PATH_TARGET_INFO_V1.getCPtr(value), value);
  }

  public NV_DISPLAYCONFIG_PATH_TARGET_INFO_V1 getTargetInfo() {
    long cPtr = jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_targetInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NV_DISPLAYCONFIG_PATH_TARGET_INFO_V1(cPtr, false);
  }

  public void setSourceModeInfo(NV_DISPLAYCONFIG_SOURCE_MODE_INFO_V1 value) {
    jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_sourceModeInfo_set(swigCPtr, this, NV_DISPLAYCONFIG_SOURCE_MODE_INFO_V1.getCPtr(value), value);
  }

  public NV_DISPLAYCONFIG_SOURCE_MODE_INFO_V1 getSourceModeInfo() {
    long cPtr = jnvapiJNI.NV_DISPLAYCONFIG_PATH_INFO_V1_sourceModeInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NV_DISPLAYCONFIG_SOURCE_MODE_INFO_V1(cPtr, false);
  }

  public NV_DISPLAYCONFIG_PATH_INFO_V1() {
    this(jnvapiJNI.new_NV_DISPLAYCONFIG_PATH_INFO_V1(), true);
  }

}
