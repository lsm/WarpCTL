/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLControllerMode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLControllerMode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLControllerMode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLControllerMode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIModifiers(int value) {
    jadl_sdkJNI.ADLControllerMode_iModifiers_set(swigCPtr, this, value);
  }

  public int getIModifiers() {
    return jadl_sdkJNI.ADLControllerMode_iModifiers_get(swigCPtr, this);
  }

  public void setIViewPositionCx(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewPositionCx_set(swigCPtr, this, value);
  }

  public int getIViewPositionCx() {
    return jadl_sdkJNI.ADLControllerMode_iViewPositionCx_get(swigCPtr, this);
  }

  public void setIViewPositionCy(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewPositionCy_set(swigCPtr, this, value);
  }

  public int getIViewPositionCy() {
    return jadl_sdkJNI.ADLControllerMode_iViewPositionCy_get(swigCPtr, this);
  }

  public void setIViewPanLockLeft(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewPanLockLeft_set(swigCPtr, this, value);
  }

  public int getIViewPanLockLeft() {
    return jadl_sdkJNI.ADLControllerMode_iViewPanLockLeft_get(swigCPtr, this);
  }

  public void setIViewPanLockRight(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewPanLockRight_set(swigCPtr, this, value);
  }

  public int getIViewPanLockRight() {
    return jadl_sdkJNI.ADLControllerMode_iViewPanLockRight_get(swigCPtr, this);
  }

  public void setIViewPanLockTop(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewPanLockTop_set(swigCPtr, this, value);
  }

  public int getIViewPanLockTop() {
    return jadl_sdkJNI.ADLControllerMode_iViewPanLockTop_get(swigCPtr, this);
  }

  public void setIViewPanLockBottom(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewPanLockBottom_set(swigCPtr, this, value);
  }

  public int getIViewPanLockBottom() {
    return jadl_sdkJNI.ADLControllerMode_iViewPanLockBottom_get(swigCPtr, this);
  }

  public void setIViewResolutionCx(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewResolutionCx_set(swigCPtr, this, value);
  }

  public int getIViewResolutionCx() {
    return jadl_sdkJNI.ADLControllerMode_iViewResolutionCx_get(swigCPtr, this);
  }

  public void setIViewResolutionCy(int value) {
    jadl_sdkJNI.ADLControllerMode_iViewResolutionCy_set(swigCPtr, this, value);
  }

  public int getIViewResolutionCy() {
    return jadl_sdkJNI.ADLControllerMode_iViewResolutionCy_get(swigCPtr, this);
  }

  public ADLControllerMode() {
    this(jadl_sdkJNI.new_ADLControllerMode(), true);
  }

}
