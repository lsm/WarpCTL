/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NVVIOBITSPERCOMPONENT {
  public final static NVVIOBITSPERCOMPONENT NVVIOBITSPERCOMPONENT_UNKNOWN = new NVVIOBITSPERCOMPONENT("NVVIOBITSPERCOMPONENT_UNKNOWN");
  public final static NVVIOBITSPERCOMPONENT NVVIOBITSPERCOMPONENT_8 = new NVVIOBITSPERCOMPONENT("NVVIOBITSPERCOMPONENT_8");
  public final static NVVIOBITSPERCOMPONENT NVVIOBITSPERCOMPONENT_10 = new NVVIOBITSPERCOMPONENT("NVVIOBITSPERCOMPONENT_10");
  public final static NVVIOBITSPERCOMPONENT NVVIOBITSPERCOMPONENT_12 = new NVVIOBITSPERCOMPONENT("NVVIOBITSPERCOMPONENT_12");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NVVIOBITSPERCOMPONENT swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NVVIOBITSPERCOMPONENT.class + " with value " + swigValue);
  }

  private NVVIOBITSPERCOMPONENT(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NVVIOBITSPERCOMPONENT(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NVVIOBITSPERCOMPONENT(String swigName, NVVIOBITSPERCOMPONENT swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NVVIOBITSPERCOMPONENT[] swigValues = { NVVIOBITSPERCOMPONENT_UNKNOWN, NVVIOBITSPERCOMPONENT_8, NVVIOBITSPERCOMPONENT_10, NVVIOBITSPERCOMPONENT_12 };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
