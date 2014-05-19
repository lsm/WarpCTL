/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_DISPLAY_PORT_CONFIG {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_DISPLAY_PORT_CONFIG(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_DISPLAY_PORT_CONFIG obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_DISPLAY_PORT_CONFIG(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_DISPLAY_PORT_CONFIG_version_get(swigCPtr, this);
  }

  public void setLinkRate(NV_DP_LINK_RATE value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_linkRate_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_LINK_RATE getLinkRate() {
    return NV_DP_LINK_RATE.swigToEnum(jnvapiJNI.NV_DISPLAY_PORT_CONFIG_linkRate_get(swigCPtr, this));
  }

  public void setLaneCount(NV_DP_LANE_COUNT value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_laneCount_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_LANE_COUNT getLaneCount() {
    return NV_DP_LANE_COUNT.swigToEnum(jnvapiJNI.NV_DISPLAY_PORT_CONFIG_laneCount_get(swigCPtr, this));
  }

  public void setColorFormat(NV_DP_COLOR_FORMAT value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_colorFormat_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_COLOR_FORMAT getColorFormat() {
    return NV_DP_COLOR_FORMAT.swigToEnum(jnvapiJNI.NV_DISPLAY_PORT_CONFIG_colorFormat_get(swigCPtr, this));
  }

  public void setDynamicRange(NV_DP_DYNAMIC_RANGE value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_dynamicRange_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_DYNAMIC_RANGE getDynamicRange() {
    return NV_DP_DYNAMIC_RANGE.swigToEnum(jnvapiJNI.NV_DISPLAY_PORT_CONFIG_dynamicRange_get(swigCPtr, this));
  }

  public void setColorimetry(NV_DP_COLORIMETRY value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_colorimetry_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_COLORIMETRY getColorimetry() {
    return NV_DP_COLORIMETRY.swigToEnum(jnvapiJNI.NV_DISPLAY_PORT_CONFIG_colorimetry_get(swigCPtr, this));
  }

  public void setBpc(NV_DP_BPC value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_bpc_set(swigCPtr, this, value.swigValue());
  }

  public NV_DP_BPC getBpc() {
    return NV_DP_BPC.swigToEnum(jnvapiJNI.NV_DISPLAY_PORT_CONFIG_bpc_get(swigCPtr, this));
  }

  public void setIsHPD(long value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isHPD_set(swigCPtr, this, value);
  }

  public long getIsHPD() {
    return jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isHPD_get(swigCPtr, this);
  }

  public void setIsSetDeferred(long value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isSetDeferred_set(swigCPtr, this, value);
  }

  public long getIsSetDeferred() {
    return jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isSetDeferred_get(swigCPtr, this);
  }

  public void setIsChromaLpfOff(long value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isChromaLpfOff_set(swigCPtr, this, value);
  }

  public long getIsChromaLpfOff() {
    return jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isChromaLpfOff_get(swigCPtr, this);
  }

  public void setIsDitherOff(long value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isDitherOff_set(swigCPtr, this, value);
  }

  public long getIsDitherOff() {
    return jnvapiJNI.NV_DISPLAY_PORT_CONFIG_isDitherOff_get(swigCPtr, this);
  }

  public void setTestLinkTrain(long value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_testLinkTrain_set(swigCPtr, this, value);
  }

  public long getTestLinkTrain() {
    return jnvapiJNI.NV_DISPLAY_PORT_CONFIG_testLinkTrain_get(swigCPtr, this);
  }

  public void setTestColorChange(long value) {
    jnvapiJNI.NV_DISPLAY_PORT_CONFIG_testColorChange_set(swigCPtr, this, value);
  }

  public long getTestColorChange() {
    return jnvapiJNI.NV_DISPLAY_PORT_CONFIG_testColorChange_get(swigCPtr, this);
  }

  public NV_DISPLAY_PORT_CONFIG() {
    this(jnvapiJNI.new_NV_DISPLAY_PORT_CONFIG(), true);
  }

}
