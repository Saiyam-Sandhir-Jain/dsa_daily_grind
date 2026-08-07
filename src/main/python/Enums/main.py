from Enums import Easy, Medium, Hard

class Solutions:
    @staticmethod
    def easy():
        pass

    @staticmethod
    def medium():
        pass

    @staticmethod
    def hard():
        pass

def __run_section(func:callable):
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