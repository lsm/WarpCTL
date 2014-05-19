/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_DISPLAY_PATH_INFO {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_DISPLAY_PATH_INFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_DISPLAY_PATH_INFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_DISPLAY_PATH_INFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_DISPLAY_PATH_INFO_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_DISPLAY_PATH_INFO_version_get(swigCPtr, this);
  }

  public void setCount(long value) {
    jnvapiJNI.NV_DISPLAY_PATH_INFO_count_set(swigCPtr, this, value);
  }

  public long getCount() {
    return jnvapiJNI.NV_DISPLAY_PATH_INFO_count_get(swigCPtr, this);
  }

  public void setPath(NV_DISPLAY_PATH value) {
    jnvapiJNI.NV_DISPLAY_PATH_INFO_path_set(swigCPtr, this, NV_DISPLAY_PATH.getCPtr(value), value);
  }

  public NV_DISPLAY_PATH getPath() {
    long cPtr = jnvapiJNI.NV_DISPLAY_PATH_INFO_path_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NV_DISPLAY_PATH(cPtr, false);
  }

  public NV_DISPLAY_PATH_INFO() {
    this(jnvapiJNI.new_NV_DISPLAY_PATH_INFO(), true);
  }

}
