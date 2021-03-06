/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public final class ADLThreadingModel {
  public final static ADLThreadingModel ADL_THREADING_UNLOCKED = new ADLThreadingModel("ADL_THREADING_UNLOCKED", jadl_sdkJNI.ADL_THREADING_UNLOCKED_get());
  public final static ADLThreadingModel ADL_THREADING_LOCKED = new ADLThreadingModel("ADL_THREADING_LOCKED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ADLThreadingModel swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ADLThreadingModel.class + " with value " + swigValue);
  }

  private ADLThreadingModel(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ADLThreadingModel(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ADLThreadingModel(String swigName, ADLThreadingModel swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ADLThreadingModel[] swigValues = { ADL_THREADING_UNLOCKED, ADL_THREADING_LOCKED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

