// automatically generated by the FlatBuffers compiler, do not modify

package KartKraft;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Basic vehicle data for live timing. e.g. trackmap
 */
public final class Vehicle extends Table {
  public static Vehicle getRootAsVehicle(ByteBuffer _bb) { return getRootAsVehicle(_bb, new Vehicle()); }
  public static Vehicle getRootAsVehicle(ByteBuffer _bb, Vehicle obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Vehicle __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte version() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 1; }
  public byte state() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public float posX() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float posY() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float posZ() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float yaw() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public int sessionPos() { int o = __offset(16); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public Color color() { return color(new Color()); }
  public Color color(Color obj) { int o = __offset(18); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public float normalisedTrackPos() { int o = __offset(20); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static void startVehicle(FlatBufferBuilder builder) { builder.startObject(9); }
  public static void addVersion(FlatBufferBuilder builder, byte version) { builder.addByte(0, version, 1); }
  public static void addState(FlatBufferBuilder builder, byte state) { builder.addByte(1, state, 0); }
  public static void addPosX(FlatBufferBuilder builder, float posX) { builder.addFloat(2, posX, 0.0f); }
  public static void addPosY(FlatBufferBuilder builder, float posY) { builder.addFloat(3, posY, 0.0f); }
  public static void addPosZ(FlatBufferBuilder builder, float posZ) { builder.addFloat(4, posZ, 0.0f); }
  public static void addYaw(FlatBufferBuilder builder, float yaw) { builder.addFloat(5, yaw, 0.0f); }
  public static void addSessionPos(FlatBufferBuilder builder, int sessionPos) { builder.addInt(6, sessionPos, 0); }
  public static void addColor(FlatBufferBuilder builder, int colorOffset) { builder.addStruct(7, colorOffset, 0); }
  public static void addNormalisedTrackPos(FlatBufferBuilder builder, float normalisedTrackPos) { builder.addFloat(8, normalisedTrackPos, 0.0f); }
  public static int endVehicle(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

