/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_STEREO_ACTIVE_EYE {
  public final static NV_STEREO_ACTIVE_EYE NVAPI_STEREO_EYE_RIGHT = new NV_STEREO_ACTIVE_EYE("NVAPI_STEREO_EYE_RIGHT", jnvapiJNI.NVAPI_STEREO_EYE_RIGHT_get());
  public final static NV_STEREO_ACTIVE_EYE NVAPI_STEREO_EYE_LEFT = new NV_STEREO_ACTIVE_EYE("NVAPI_STEREO_EYE_LEFT", jnvapiJNI.NVAPI_STEREO_EYE_LEFT_get());
  public final static NV_STEREO_ACTIVE_EYE NVAPI_STEREO_EYE_MONO = new NV_STEREO_ACTIVE_EYE("NVAPI_STEREO_EYE_MONO", jnvapiJNI.NVAPI_STEREO_EYE_MONO_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_STEREO_ACTIVE_EYE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_STEREO_ACTIVE_EYE.class + " with value " + swigValue);
  }

  private NV_STEREO_ACTIVE_EYE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_STEREO_ACTIVE_EYE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_STEREO_ACTIVE_EYE(String swigName, NV_STEREO_ACTIVE_EYE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_STEREO_ACTIVE_EYE[] swigValues = { NVAPI_STEREO_EYE_RIGHT, NVAPI_STEREO_EYE_LEFT, NVAPI_STEREO_EYE_MONO };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

