/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_TIMING_INPUT {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_TIMING_INPUT(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_TIMING_INPUT obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_TIMING_INPUT(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_TIMING_INPUT_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_TIMING_INPUT_version_get(swigCPtr, this);
  }

  public void setWidth(long value) {
    jnvapiJNI.NV_TIMING_INPUT_width_set(swigCPtr, this, value);
  }

  public long getWidth() {
    return jnvapiJNI.NV_TIMING_INPUT_width_get(swigCPtr, this);
  }

  public void setHeight(long value) {
    jnvapiJNI.NV_TIMING_INPUT_height_set(swigCPtr, this, value);
  }

  public long getHeight() {
    return jnvapiJNI.NV_TIMING_INPUT_height_get(swigCPtr, this);
  }

  public void setRr(float value) {
    jnvapiJNI.NV_TIMING_INPUT_rr_set(swigCPtr, this, value);
  }

  public float getRr() {
    return jnvapiJNI.NV_TIMING_INPUT_rr_get(swigCPtr, this);
  }

  public void setFlag(NV_TIMING_FLAG value) {
    jnvapiJNI.NV_TIMING_INPUT_flag_set(swigCPtr, this, NV_TIMING_FLAG.getCPtr(value), value);
  }

  public NV_TIMING_FLAG getFlag() {
    long cPtr = jnvapiJNI.NV_TIMING_INPUT_flag_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NV_TIMING_FLAG(cPtr, false);
  }

  public void setType(NV_TIMING_OVERRIDE value) {
    jnvapiJNI.NV_TIMING_INPUT_type_set(swigCPtr, this, value.swigValue());
  }

  public NV_TIMING_OVERRIDE getType() {
    return NV_TIMING_OVERRIDE.swigToEnum(jnvapiJNI.NV_TIMING_INPUT_type_get(swigCPtr, this));
  }

  public NV_TIMING_INPUT() {
    this(jnvapiJNI.new_NV_TIMING_INPUT(), true);
  }

}
