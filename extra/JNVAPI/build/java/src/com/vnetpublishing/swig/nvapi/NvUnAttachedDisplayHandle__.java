/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NvUnAttachedDisplayHandle__ {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NvUnAttachedDisplayHandle__(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NvUnAttachedDisplayHandle__ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NvUnAttachedDisplayHandle__(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUnused(int value) {
    jnvapiJNI.NvUnAttachedDisplayHandle___unused_set(swigCPtr, this, value);
  }

  public int getUnused() {
    return jnvapiJNI.NvUnAttachedDisplayHandle___unused_get(swigCPtr, this);
  }

  public NvUnAttachedDisplayHandle__() {
    this(jnvapiJNI.new_NvUnAttachedDisplayHandle__(), true);
  }

}
