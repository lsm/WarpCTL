/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NvSBox {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NvSBox(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NvSBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NvSBox(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSX(int value) {
    jnvapiJNI.NvSBox_sX_set(swigCPtr, this, value);
  }

  public int getSX() {
    return jnvapiJNI.NvSBox_sX_get(swigCPtr, this);
  }

  public void setSY(int value) {
    jnvapiJNI.NvSBox_sY_set(swigCPtr, this, value);
  }

  public int getSY() {
    return jnvapiJNI.NvSBox_sY_get(swigCPtr, this);
  }

  public void setSWidth(int value) {
    jnvapiJNI.NvSBox_sWidth_set(swigCPtr, this, value);
  }

  public int getSWidth() {
    return jnvapiJNI.NvSBox_sWidth_get(swigCPtr, this);
  }

  public void setSHeight(int value) {
    jnvapiJNI.NvSBox_sHeight_set(swigCPtr, this, value);
  }

  public int getSHeight() {
    return jnvapiJNI.NvSBox_sHeight_get(swigCPtr, this);
  }

  public NvSBox() {
    this(jnvapiJNI.new_NvSBox(), true);
  }

}