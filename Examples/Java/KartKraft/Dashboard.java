// automatically generated by the FlatBuffers compiler, do not modify

package KartKraft;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Dash data for displaying state of current local/followed player
 */
public final class Dashboard extends Table {
  public static Dashboard getRootAsDashboard(ByteBuffer _bb) { return getRootAsDashboard(_bb, new Dashboard()); }
  public static Dashboard getRootAsDashboard(ByteBuffer _bb, Dashboard obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Dashboard __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float speed() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float rpm() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float steer() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float throttle() { int o = __offset(10); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float brake() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public byte gear() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public byte pos() { int o = __offset(16); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public float bestLap() { int o = __offset(18); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float currentLap() { int o = __offset(20); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float lastLap() { int o = __offset(22); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public int lapCount() { int o = __offset(24); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }

  public static int createDashboard(FlatBufferBuilder builder,
      float speed,
      float rpm,
      float steer,
      float throttle,
      float brake,
      byte gear,
      byte pos,
      float bestLap,
      float currentLap,
      float lastLap,
      int lapCount) {
    builder.startObject(11);
    Dashboard.addLastLap(builder, lastLap);
    Dashboard.addCurrentLap(builder, currentLap);
    Dashboard.addBestLap(builder, bestLap);
    Dashboard.addBrake(builder, brake);
    Dashboard.addThrottle(builder, throttle);
    Dashboard.addSteer(builder, steer);
    Dashboard.addRpm(builder, rpm);
    Dashboard.addSpeed(builder, speed);
    Dashboard.addLapCount(builder, lapCount);
    Dashboard.addPos(builder, pos);
    Dashboard.addGear(builder, gear);
    return Dashboard.endDashboard(builder);
  }

  public static void startDashboard(FlatBufferBuilder builder) { builder.startObject(11); }
  public static void addSpeed(FlatBufferBuilder builder, float speed) { builder.addFloat(0, speed, 0.0f); }
  public static void addRpm(FlatBufferBuilder builder, float rpm) { builder.addFloat(1, rpm, 0.0f); }
  public static void addSteer(FlatBufferBuilder builder, float steer) { builder.addFloat(2, steer, 0.0f); }
  public static void addThrottle(FlatBufferBuilder builder, float throttle) { builder.addFloat(3, throttle, 0.0f); }
  public static void addBrake(FlatBufferBuilder builder, float brake) { builder.addFloat(4, brake, 0.0f); }
  public static void addGear(FlatBufferBuilder builder, byte gear) { builder.addByte(5, gear, 0); }
  public static void addPos(FlatBufferBuilder builder, byte pos) { builder.addByte(6, pos, 0); }
  public static void addBestLap(FlatBufferBuilder builder, float bestLap) { builder.addFloat(7, bestLap, 0.0f); }
  public static void addCurrentLap(FlatBufferBuilder builder, float currentLap) { builder.addFloat(8, currentLap, 0.0f); }
  public static void addLastLap(FlatBufferBuilder builder, float lastLap) { builder.addFloat(9, lastLap, 0.0f); }
  public static void addLapCount(FlatBufferBuilder builder, int lapCount) { builder.addShort(10, (short)lapCount, (short)0); }
  public static int endDashboard(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

