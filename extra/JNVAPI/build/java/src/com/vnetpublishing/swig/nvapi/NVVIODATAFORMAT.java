/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NVVIODATAFORMAT {
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_UNKNOWN = new NVVIODATAFORMAT("NVVIODATAFORMAT_UNKNOWN", jnvapiJNI.NVVIODATAFORMAT_UNKNOWN_get());
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R8G8B8_TO_YCRCB444 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R8G8B8_TO_YCRCB444");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R8G8B8A8_TO_YCRCBA4444 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R8G8B8A8_TO_YCRCBA4444");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R8G8B8Z10_TO_YCRCBZ4444 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R8G8B8Z10_TO_YCRCBZ4444");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R8G8B8_TO_YCRCB422 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R8G8B8_TO_YCRCB422");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R8G8B8A8_TO_YCRCBA4224 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R8G8B8A8_TO_YCRCBA4224");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R8G8B8Z10_TO_YCRCBZ4224 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R8G8B8Z10_TO_YCRCBZ4224");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X8X8X8_444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X8X8X8_444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X8X8X8A8_4444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X8X8X8A8_4444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X8X8X8Z10_4444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X8X8X8Z10_4444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X10X10X10_444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X10X10X10_444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X10X8X8_444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X10X8X8_444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X10X8X8A10_4444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X10X8X8A10_4444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X10X8X8Z10_4444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X10X8X8Z10_4444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_DUAL_R8G8B8_TO_DUAL_YCRCB422 = new NVVIODATAFORMAT("NVVIODATAFORMAT_DUAL_R8G8B8_TO_DUAL_YCRCB422");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_DUAL_X8X8X8_TO_DUAL_422_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_DUAL_X8X8X8_TO_DUAL_422_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R10G10B10_TO_YCRCB422 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R10G10B10_TO_YCRCB422");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R10G10B10_TO_YCRCB444 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R10G10B10_TO_YCRCB444");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X12X12X12_444_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X12X12X12_444_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_X12X12X12_422_PASSTHRU = new NVVIODATAFORMAT("NVVIODATAFORMAT_X12X12X12_422_PASSTHRU");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_Y10CR10CB10_TO_YCRCB422 = new NVVIODATAFORMAT("NVVIODATAFORMAT_Y10CR10CB10_TO_YCRCB422");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_Y8CR8CB8_TO_YCRCB422 = new NVVIODATAFORMAT("NVVIODATAFORMAT_Y8CR8CB8_TO_YCRCB422");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_Y10CR8CB8A10_TO_YCRCBA4224 = new NVVIODATAFORMAT("NVVIODATAFORMAT_Y10CR8CB8A10_TO_YCRCBA4224");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R10G10B10_TO_RGB444 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R10G10B10_TO_RGB444");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R12G12B12_TO_YCRCB444 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R12G12B12_TO_YCRCB444");
  public final static NVVIODATAFORMAT NVVIODATAFORMAT_R12G12B12_TO_YCRCB422 = new NVVIODATAFORMAT("NVVIODATAFORMAT_R12G12B12_TO_YCRCB422");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NVVIODATAFORMAT swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NVVIODATAFORMAT.class + " with value " + swigValue);
  }

  private NVVIODATAFORMAT(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NVVIODATAFORMAT(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NVVIODATAFORMAT(String swigName, NVVIODATAFORMAT swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NVVIODATAFORMAT[] swigValues = { NVVIODATAFORMAT_UNKNOWN, NVVIODATAFORMAT_R8G8B8_TO_YCRCB444, NVVIODATAFORMAT_R8G8B8A8_TO_YCRCBA4444, NVVIODATAFORMAT_R8G8B8Z10_TO_YCRCBZ4444, NVVIODATAFORMAT_R8G8B8_TO_YCRCB422, NVVIODATAFORMAT_R8G8B8A8_TO_YCRCBA4224, NVVIODATAFORMAT_R8G8B8Z10_TO_YCRCBZ4224, NVVIODATAFORMAT_X8X8X8_444_PASSTHRU, NVVIODATAFORMAT_X8X8X8A8_4444_PASSTHRU, NVVIODATAFORMAT_X8X8X8Z10_4444_PASSTHRU, NVVIODATAFORMAT_X10X10X10_444_PASSTHRU, NVVIODATAFORMAT_X10X8X8_444_PASSTHRU, NVVIODATAFORMAT_X10X8X8A10_4444_PASSTHRU, NVVIODATAFORMAT_X10X8X8Z10_4444_PASSTHRU, NVVIODATAFORMAT_DUAL_R8G8B8_TO_DUAL_YCRCB422, NVVIODATAFORMAT_DUAL_X8X8X8_TO_DUAL_422_PASSTHRU, NVVIODATAFORMAT_R10G10B10_TO_YCRCB422, NVVIODATAFORMAT_R10G10B10_TO_YCRCB444, NVVIODATAFORMAT_X12X12X12_444_PASSTHRU, NVVIODATAFORMAT_X12X12X12_422_PASSTHRU, NVVIODATAFORMAT_Y10CR10CB10_TO_YCRCB422, NVVIODATAFORMAT_Y8CR8CB8_TO_YCRCB422, NVVIODATAFORMAT_Y10CR8CB8A10_TO_YCRCBA4224, NVVIODATAFORMAT_R10G10B10_TO_RGB444, NVVIODATAFORMAT_R12G12B12_TO_YCRCB444, NVVIODATAFORMAT_R12G12B12_TO_YCRCB422 };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

