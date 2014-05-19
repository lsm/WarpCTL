/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NVAPI_GSYNC_DISPLAY_SYNC_STATE {
  public final static NVAPI_GSYNC_DISPLAY_SYNC_STATE NVAPI_GSYNC_DISPLAY_SYNC_STATE_UNSYNCED = new NVAPI_GSYNC_DISPLAY_SYNC_STATE("NVAPI_GSYNC_DISPLAY_SYNC_STATE_UNSYNCED", jnvapiJNI.NVAPI_GSYNC_DISPLAY_SYNC_STATE_UNSYNCED_get());
  public final static NVAPI_GSYNC_DISPLAY_SYNC_STATE NVAPI_GSYNC_DISPLAY_SYNC_STATE_SLAVE = new NVAPI_GSYNC_DISPLAY_SYNC_STATE("NVAPI_GSYNC_DISPLAY_SYNC_STATE_SLAVE", jnvapiJNI.NVAPI_GSYNC_DISPLAY_SYNC_STATE_SLAVE_get());
  public final static NVAPI_GSYNC_DISPLAY_SYNC_STATE NVAPI_GSYNC_DISPLAY_SYNC_STATE_MASTER = new NVAPI_GSYNC_DISPLAY_SYNC_STATE("NVAPI_GSYNC_DISPLAY_SYNC_STATE_MASTER", jnvapiJNI.NVAPI_GSYNC_DISPLAY_SYNC_STATE_MASTER_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NVAPI_GSYNC_DISPLAY_SYNC_STATE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NVAPI_GSYNC_DISPLAY_SYNC_STATE.class + " with value " + swigValue);
  }

  private NVAPI_GSYNC_DISPLAY_SYNC_STATE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NVAPI_GSYNC_DISPLAY_SYNC_STATE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NVAPI_GSYNC_DISPLAY_SYNC_STATE(String swigName, NVAPI_GSYNC_DISPLAY_SYNC_STATE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NVAPI_GSYNC_DISPLAY_SYNC_STATE[] swigValues = { NVAPI_GSYNC_DISPLAY_SYNC_STATE_UNSYNCED, NVAPI_GSYNC_DISPLAY_SYNC_STATE_SLAVE, NVAPI_GSYNC_DISPLAY_SYNC_STATE_MASTER };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

