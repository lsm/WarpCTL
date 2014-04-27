/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public final class ADLMultiChannelSplitStateFlag {
  public final static ADLMultiChannelSplitStateFlag ADLMultiChannelSplit_Unitialized = new ADLMultiChannelSplitStateFlag("ADLMultiChannelSplit_Unitialized", jadl_sdkJNI.ADLMultiChannelSplit_Unitialized_get());
  public final static ADLMultiChannelSplitStateFlag ADLMultiChannelSplit_Disabled = new ADLMultiChannelSplitStateFlag("ADLMultiChannelSplit_Disabled", jadl_sdkJNI.ADLMultiChannelSplit_Disabled_get());
  public final static ADLMultiChannelSplitStateFlag ADLMultiChannelSplit_Enabled = new ADLMultiChannelSplitStateFlag("ADLMultiChannelSplit_Enabled", jadl_sdkJNI.ADLMultiChannelSplit_Enabled_get());
  public final static ADLMultiChannelSplitStateFlag ADLMultiChannelSplit_SaveProfile = new ADLMultiChannelSplitStateFlag("ADLMultiChannelSplit_SaveProfile", jadl_sdkJNI.ADLMultiChannelSplit_SaveProfile_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ADLMultiChannelSplitStateFlag swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ADLMultiChannelSplitStateFlag.class + " with value " + swigValue);
  }

  private ADLMultiChannelSplitStateFlag(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ADLMultiChannelSplitStateFlag(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ADLMultiChannelSplitStateFlag(String swigName, ADLMultiChannelSplitStateFlag swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ADLMultiChannelSplitStateFlag[] swigValues = { ADLMultiChannelSplit_Unitialized, ADLMultiChannelSplit_Disabled, ADLMultiChannelSplit_Enabled, ADLMultiChannelSplit_SaveProfile };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
