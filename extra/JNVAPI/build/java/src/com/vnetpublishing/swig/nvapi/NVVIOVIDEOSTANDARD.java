/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NVVIOVIDEOSTANDARD {
  public final static NVVIOVIDEOSTANDARD NVVIOVIDEOSTANDARD_SMPTE259 = new NVVIOVIDEOSTANDARD("NVVIOVIDEOSTANDARD_SMPTE259");
  public final static NVVIOVIDEOSTANDARD NVVIOVIDEOSTANDARD_SMPTE260 = new NVVIOVIDEOSTANDARD("NVVIOVIDEOSTANDARD_SMPTE260");
  public final static NVVIOVIDEOSTANDARD NVVIOVIDEOSTANDARD_SMPTE274 = new NVVIOVIDEOSTANDARD("NVVIOVIDEOSTANDARD_SMPTE274");
  public final static NVVIOVIDEOSTANDARD NVVIOVIDEOSTANDARD_SMPTE295 = new NVVIOVIDEOSTANDARD("NVVIOVIDEOSTANDARD_SMPTE295");
  public final static NVVIOVIDEOSTANDARD NVVIOVIDEOSTANDARD_SMPTE296 = new NVVIOVIDEOSTANDARD("NVVIOVIDEOSTANDARD_SMPTE296");
  public final static NVVIOVIDEOSTANDARD NVVIOVIDEOSTANDARD_SMPTE372 = new NVVIOVIDEOSTANDARD("NVVIOVIDEOSTANDARD_SMPTE372");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NVVIOVIDEOSTANDARD swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NVVIOVIDEOSTANDARD.class + " with value " + swigValue);
  }

  private NVVIOVIDEOSTANDARD(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NVVIOVIDEOSTANDARD(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NVVIOVIDEOSTANDARD(String swigName, NVVIOVIDEOSTANDARD swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NVVIOVIDEOSTANDARD[] swigValues = { NVVIOVIDEOSTANDARD_SMPTE259, NVVIOVIDEOSTANDARD_SMPTE260, NVVIOVIDEOSTANDARD_SMPTE274, NVVIOVIDEOSTANDARD_SMPTE295, NVVIOVIDEOSTANDARD_SMPTE296, NVVIOVIDEOSTANDARD_SMPTE372 };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
