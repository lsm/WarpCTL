/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NvSourceHandle__ {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NvSourceHandle__(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NvSourceHandle__ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NvSourceHandle__(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUnused(int value) {
    jnvapiJNI.NvSourceHandle___unused_set(swigCPtr, this, value);
  }

  public int getUnused() {
    return jnvapiJNI.NvSourceHandle___unused_get(swigCPtr, this);
  }

  public NvSourceHandle__() {
    this(jnvapiJNI.new_NvSourceHandle__(), true);
  }

}
