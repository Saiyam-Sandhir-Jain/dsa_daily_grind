from Strings import Easy, Medium, Hard

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

def __runSection(func:callable):
    print(f"##### String ({func.__name__.capitalize()}) #####")
    func()
    print()

if __name__ == "__main__":
    functions = [
        Solutions.easy,
        Solutions.medium,
        Solutions.hard
    ]

    for function in functions:
        __runSection(function)