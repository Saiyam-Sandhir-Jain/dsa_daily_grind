from Enums import Easy, Medium, Hard


class Solutions:

    @staticmethod
    def easy():

        # Q1. Traffic Signal
        print("Q1. Traffic Signal:")

        signal = Easy.TrafficSignal.GREEN

        print(f"Current Signal: {signal.name}")
        print(f"Instruction: {signal.get_instruction()}")
        print()

        # Q2. Days of the Week
        print("Q2. Days of the Week:")

        day = Easy.Day.SATURDAY

        print(f"Current Day: {day.name}")
        print(f"Is Weekend: {day.is_weekend()}")
        print()

        # Q3. Compass Direction
        print("Q3. Robot Movement:")

        start = [0, 0]

        directions = [
            Easy.Direction.UP,
            Easy.Direction.UP,
            Easy.Direction.RIGHT,
            Easy.Direction.DOWN,
            Easy.Direction.LEFT,
        ]

        print(f"Start Position: {tuple(start)}")
        print(f"Directions: {[direction.name for direction in directions]}")

        end = Easy.Direction.move(start, directions)

        print(f"Final Position: {end}")
        print()

        # Q4. Chess Piece Color
        print("Q4. Chess Piece Color:")

        piece = Easy.Chess.BLACK

        print(f"The chosen piece is: {piece.name}")
        print(f"The opposite piece is: {piece.opposite().name}")
        print()

        # Q5. List Seasons
        print("Q5. List Seasons:")

        print("The seasons are:", end=' ')
        for season in Easy.Season.get_seasons():
            print(season, end=' ')
        print('\n')

        # Q6. Count Seasons
        print("Q6. Count Seasons:")

        print(f"The number of seasons are: {Easy.Season.count_seasons()}")
        print()

        # Q7. Game Menu
        print("Q7. Game Menu:")

        print(f"The game menu is:\n{Easy.GameMenu.renderMenu()}")
        print()

        # Q8. Game Command
        print("Q8. Game Command:")

        cmd = "ATTACK"
        print(f"The given command is: {cmd}")
        if(Easy.GameCommand.parse(cmd)):
            print("Commmand Executed")
        else:
            print("Invalid command passed")


    @staticmethod
    def medium():
        pass

    @staticmethod
    def hard():
        pass


def __run_section(func: callable):
    print(f"##### Enums ({func.__name__.capitalize()}) #####")
    func()
    print()


if __name__ == "__main__":

    functions = [
        Solutions.easy,
        Solutions.medium,
        Solutions.hard
    ]

    for function in functions:
        __run_section(function)