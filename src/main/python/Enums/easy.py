from __future__ import annotations
from enum import Enum

class Easy:
    class TrafficSignal(Enum):
        RED = 1
        YELLOW = 2
        GREEN = 3

        def get_instruction(self) -> str:
            match self:
                case Easy.TrafficSignal.RED:
                    return "STOP"

                case Easy.TrafficSignal.YELLOW:
                    return "SLOW DOWN"

                case Easy.TrafficSignal.GREEN:
                    return "GO"

                case _:
                    raise AssertionError()
