from Recursion import Linear, NonLinear, LinkedList, Stack, Subsequences, DivideConquer

class Solutions:
    @staticmethod
    def linear():
        pass

    @staticmethod
    def non_linear():
        pass

    @staticmethod
    def divide_conquer():
        pass

    @staticmethod
    def linked_list():
        pass

    @staticmethod
    def stack():
        pass

    @staticmethod
    def subsequences():
        pass

def __runSection(func:callable):
    print(f"##### Recursion ({func.__name__.capitalize()}) #####")
    func()
    print()

if __name__ == "__main__":
    functions = [
        Solutions.linear,
        Solutions.non_linear,
        Solutions.divide_conquer,
        Solutions.linked_list,
        Solutions.stack,
        Solutions.subsequences
    ]

    for func in functions:
        __runSection(func)