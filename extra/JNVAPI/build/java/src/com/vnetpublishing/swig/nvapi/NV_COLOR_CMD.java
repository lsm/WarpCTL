/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_COLOR_CMD {
  public final static NV_COLOR_CMD NV_COLOR_CMD_GET = new NV_COLOR_CMD("NV_COLOR_CMD_GET", jnvapiJNI.NV_COLOR_CMD_GET_get());
  public final static NV_COLOR_CMD NV_COLOR_CMD_SET = new NV_COLOR_CMD("NV_COLOR_CMD_SET");
  public final static NV_COLOR_CMD NV_COLOR_CMD_IS_SUPPORTED_COLOR = new NV_COLOR_CMD("NV_COLOR_CMD_IS_SUPPORTED_COLOR");
  public final static NV_COLOR_CMD NV_COLOR_CMD_GET_DEFAULT = new NV_COLOR_CMD("NV_COLOR_CMD_GET_DEFAULT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_COLOR_CMD swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_COLOR_CMD.class + " with value " + swigValue);
  }

  private NV_COLOR_CMD(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_COLOR_CMD(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_COLOR_CMD(String swigName, NV_COLOR_CMD swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_COLOR_CMD[] swigValues = { NV_COLOR_CMD_GET, NV_COLOR_CMD_SET, NV_COLOR_CMD_IS_SUPPORTED_COLOR, NV_COLOR_CMD_GET_DEFAULT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

