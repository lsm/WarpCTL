/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOGAMMARAMP8 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOGAMMARAMP8(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOGAMMARAMP8 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOGAMMARAMP8(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setURed(int[] value) {
    jnvapiJNI.NVVIOGAMMARAMP8_uRed_set(swigCPtr, this, value);
  }

  public int[] getURed() {
    return jnvapiJNI.NVVIOGAMMARAMP8_uRed_get(swigCPtr, this);
  }

  public void setUGreen(int[] value) {
    jnvapiJNI.NVVIOGAMMARAMP8_uGreen_set(swigCPtr, this, value);
  }

  public int[] getUGreen() {
    return jnvapiJNI.NVVIOGAMMARAMP8_uGreen_get(swigCPtr, this);
  }

  public void setUBlue(int[] value) {
    jnvapiJNI.NVVIOGAMMARAMP8_uBlue_set(swigCPtr, this, value);
  }

  public int[] getUBlue() {
    return jnvapiJNI.NVVIOGAMMARAMP8_uBlue_get(swigCPtr, this);
  }

  public NVVIOGAMMARAMP8() {
    this(jnvapiJNI.new_NVVIOGAMMARAMP8(), true);
  }

}
