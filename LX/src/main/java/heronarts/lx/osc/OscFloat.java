/**
 * Copyright 2017- Mark C. Slee, Heron Arts LLC
 *
 * This file is part of the LX Studio software library. By using
 * LX, you agree to the terms of the LX Studio Software License
 * and Distribution Agreement, available at: http://lx.studio/license
 *
 * Please note that the LX license is not open-source. The license
 * allows for free, non-commercial use.
 *
 * HERON ARTS MAKES NO WARRANTY, EXPRESS, IMPLIED, STATUTORY, OR
 * OTHERWISE, AND SPECIFICALLY DISCLAIMS ANY WARRANTY OF
 * MERCHANTABILITY, NON-INFRINGEMENT, OR FITNESS FOR A PARTICULAR
 * PURPOSE, WITH RESPECT TO THE SOFTWARE.
 *
 * @author Mark C. Slee <mark@heronarts.com>
 */

package heronarts.lx.osc;

import java.nio.ByteBuffer;

public class OscFloat implements OscArgument {

  private float value;

  public OscFloat(float value) {
    this.value = value;
  }

  public OscFloat setValue(float value) {
    this.value = value;
    return this;
  }

  public float getValue() {
    return this.value;
  }

  public int getByteLength() {
    return 4;
  }

  @Override
  public char getTypeTag() {
    return OscTypeTag.FLOAT;
  }

  @Override
  public String toString() {
    return Float.toString(this.value);
  }

  @Override
  public void serialize(ByteBuffer buffer) {
    buffer.putFloat(this.value);
  }

  @Override
  public int toInt() {
    return (int) this.value;
  }

  @Override
  public float toFloat() {
    return this.value;
  }

  @Override
  public double toDouble() {
    return this.value;
  }

  @Override
  public boolean toBoolean() {
    return this.value > 0;
  }
}
