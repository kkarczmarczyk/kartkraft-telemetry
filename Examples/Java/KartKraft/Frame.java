// automatically generated by the FlatBuffers compiler, do not modify

package KartKraft;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Root object from which all data can be extracted. You must check if motion, dash etc exist before using as not every packet will include all data.
 */
public final class Frame extends Table {
  public static Frame getRootAsFrame(ByteBuffer _bb) { return getRootAsFrame(_bb, new Frame()); }
  public static Frame getRootAsFrame(ByteBuffer _bb, Frame obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Frame __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte version() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 1; }
  public float timestamp() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public Motion motion() { return motion(new Motion()); }
  public Motion motion(Motion obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Dashboard dash() { return dash(new Dashboard()); }
  public Dashboard dash(Dashboard obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public Session session() { return session(new Session()); }
  public Session session(Session obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createFrame(FlatBufferBuilder builder,
      byte version,
      float timestamp,
      int motionOffset,
      int dashOffset,
      int sessionOffset) {
    builder.startObject(5);
    Frame.addSession(builder, sessionOffset);
    Frame.addDash(builder, dashOffset);
    Frame.addMotion(builder, motionOffset);
    Frame.addTimestamp(builder, timestamp);
    Frame.addVersion(builder, version);
    return Frame.endFrame(builder);
  }

  public static void startFrame(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addVersion(FlatBufferBuilder builder, byte version) { builder.addByte(0, version, 1); }
  public static void addTimestamp(FlatBufferBuilder builder, float timestamp) { builder.addFloat(1, timestamp, 0.0f); }
  public static void addMotion(FlatBufferBuilder builder, int motionOffset) { builder.addOffset(2, motionOffset, 0); }
  public static void addDash(FlatBufferBuilder builder, int dashOffset) { builder.addOffset(3, dashOffset, 0); }
  public static void addSession(FlatBufferBuilder builder, int sessionOffset) { builder.addOffset(4, sessionOffset, 0); }
  public static int endFrame(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFrameBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFrameBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

