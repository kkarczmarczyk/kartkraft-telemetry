# automatically generated by the FlatBuffers compiler, do not modify

# namespace: KartKraft

import flatbuffers

# /// Dash data for displaying state of current local/followed player
class Dashboard(object):
    __slots__ = ['_tab']

    @classmethod
    def GetRootAsDashboard(cls, buf, offset):
        n = flatbuffers.encode.Get(flatbuffers.packer.uoffset, buf, offset)
        x = Dashboard()
        x.Init(buf, n + offset)
        return x

    # Dashboard
    def Init(self, buf, pos):
        self._tab = flatbuffers.table.Table(buf, pos)

    # Dashboard
    def Speed(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(4))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def Rpm(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(6))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def Steer(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(8))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def Throttle(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(10))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def Brake(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(12))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def Gear(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(14))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int8Flags, o + self._tab.Pos)
        return 0

    # Dashboard
    def Pos(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(16))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Int8Flags, o + self._tab.Pos)
        return 0

    # Dashboard
    def BestLap(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(18))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def CurrentLap(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(20))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def LastLap(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(22))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Float32Flags, o + self._tab.Pos)
        return 0.0

    # Dashboard
    def LapCount(self):
        o = flatbuffers.number_types.UOffsetTFlags.py_type(self._tab.Offset(24))
        if o != 0:
            return self._tab.Get(flatbuffers.number_types.Uint16Flags, o + self._tab.Pos)
        return 0

def DashboardStart(builder): builder.StartObject(11)
def DashboardAddSpeed(builder, speed): builder.PrependFloat32Slot(0, speed, 0.0)
def DashboardAddRpm(builder, rpm): builder.PrependFloat32Slot(1, rpm, 0.0)
def DashboardAddSteer(builder, steer): builder.PrependFloat32Slot(2, steer, 0.0)
def DashboardAddThrottle(builder, throttle): builder.PrependFloat32Slot(3, throttle, 0.0)
def DashboardAddBrake(builder, brake): builder.PrependFloat32Slot(4, brake, 0.0)
def DashboardAddGear(builder, gear): builder.PrependInt8Slot(5, gear, 0)
def DashboardAddPos(builder, pos): builder.PrependInt8Slot(6, pos, 0)
def DashboardAddBestLap(builder, bestLap): builder.PrependFloat32Slot(7, bestLap, 0.0)
def DashboardAddCurrentLap(builder, currentLap): builder.PrependFloat32Slot(8, currentLap, 0.0)
def DashboardAddLastLap(builder, lastLap): builder.PrependFloat32Slot(9, lastLap, 0.0)
def DashboardAddLapCount(builder, lapCount): builder.PrependUint16Slot(10, lapCount, 0)
def DashboardEnd(builder): return builder.EndObject()
