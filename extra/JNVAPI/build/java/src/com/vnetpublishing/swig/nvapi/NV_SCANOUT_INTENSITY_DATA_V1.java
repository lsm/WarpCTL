/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_SCANOUT_INTENSITY_DATA_V1 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_SCANOUT_INTENSITY_DATA_V1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_SCANOUT_INTENSITY_DATA_V1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_SCANOUT_INTENSITY_DATA_V1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_version_get(swigCPtr, this);
  }

  public void setWidth(long value) {
    jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_width_set(swigCPtr, this, value);
  }

  public long getWidth() {
    return jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_width_get(swigCPtr, this);
  }

  public void setHeight(long value) {
    jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_height_set(swigCPtr, this, value);
  }

  public long getHeight() {
    return jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_height_get(swigCPtr, this);
  }

  public void setBlendingTexture(SWIGTYPE_p_float value) {
    jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_blendingTexture_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getBlendingTexture() {
    long cPtr = jnvapiJNI.NV_SCANOUT_INTENSITY_DATA_V1_blendingTexture_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public NV_SCANOUT_INTENSITY_DATA_V1() {
    this(jnvapiJNI.new_NV_SCANOUT_INTENSITY_DATA_V1(), true);
  }

}
