/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOCAPS_driver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOCAPS_driver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOCAPS_driver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOCAPS_driver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMajorVersion(long value) {
    jnvapiJNI.NVVIOCAPS_driver_majorVersion_set(swigCPtr, this, value);
  }

  public long getMajorVersion() {
    return jnvapiJNI.NVVIOCAPS_driver_majorVersion_get(swigCPtr, this);
  }

  public void setMinorVersion(long value) {
    jnvapiJNI.NVVIOCAPS_driver_minorVersion_set(swigCPtr, this, value);
  }

  public long getMinorVersion() {
    return jnvapiJNI.NVVIOCAPS_driver_minorVersion_get(swigCPtr, this);
  }

  public NVVIOCAPS_driver() {
    this(jnvapiJNI.new_NVVIOCAPS_driver(), true);
  }

}