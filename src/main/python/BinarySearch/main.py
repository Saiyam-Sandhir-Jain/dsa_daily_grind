from BinarySearch import Classic, Bound, Answers, Matrix

class Solutions:
    @staticmethod
    def classic():
        pass

    @staticmethod
    def bound():
        pass

    @staticmethod
    def answers():
        pass

    @staticmethod
    def matrix():
        pass

def __runSection(func:callable):
    print(f"##### Binary Search ({func.__name__.capitalize()}) #####")
    func()
    print()

if __name__ == "__main__":
    functions = [Solutions.classic, Solutions.bound, Solutions.answers, Solutions.matrix]
    for func in functions:
        __runSection(func)