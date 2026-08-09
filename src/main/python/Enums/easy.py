from __future__ import annotations
from enum import Enum, auto

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

    class Day(Enum):
        MONDAY = 1
        TUESDAY = 2
        WEDNESDAY = 3
        THURSDAY = 4
        FRIDAY = 5
        SATURDAY = 6
        SUNDAY = 7

        def is_weekend(self) -> bool:
            return self in (Easy.Day.SATURDAY, Easy.Day.SUNDAY)

    class Direction(Enum):
        UP = (0, 1)
        DOWN = (0, -1)
        LEFT = (-1, 0)
        RIGHT = (1, 0)

        def __init__(self, dx: int, dy: int):
            self.dx = dx
            self.dy = dy

        @staticmethod
        def move(
            start: list[int],
            directions: list[Easy.Direction]
        ) -> tuple[int, int]:

            for direction in directions:
                start[0] += direction.dx
                start[1] += direction.dy

            return tuple(start)

    class Chess(Enum):
        WHITE = auto()
        BLACK = auto()

        def opposite(self) -> Easy.Chess:
            match self:
                case Easy.Chess.WHITE:
                    return Easy.Chess.BLACK

                case Easy.Chess.BLACK:
                    return Easy.Chess.WHITE

                case _:
                    raise AssertionError()

    class Season(Enum):
        SPRING = 1
        SUMMER = 2
        AUTUM = 3
        WINTER = 4

        @staticmethod
        def get_seasons() -> list[Easy.Season]:
            return [season.name for season in Easy.Season];

        @staticmethod
        def count_seasons() -> int:
            return len(Easy.Season);

    class GameMenu(Enum):
        NEW_GAME = 1
        LOAD_GAME = 2
        SETTINGS = 3
        EXIT = 4

        @staticmethod
        def renderMenu() -> str:
            menu = ""
            for option in Easy.GameMenu:
                name = option.name.replace("_", " ")
                menu += f"{option.value}. {name}\n"

            return menu

    class GameCommand(Enum):
        MOVE = auto()
        ATTACK = auto()
        DEFEND = auto()
        QUIT = auto()

        @staticmethod
        def parse(raw:str) -> Easy.GameCommand | None:
            try:
                return Easy.GameCommand[raw]
            except KeyError:
                return None 
        
