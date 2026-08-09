from Backtracking import TakeDontTake, Combinations

class Solutions:

    @staticmethod
    def take_dont_take():
        # Q1. Generate Binary Strings
        print("Q1. Generate Binary Strings:")

        n = 5

        result = TakeDontTake.BinaryString.generate_binary_strings(n)

        print(f"n = {n}")
        print(f"Binary Strings: {result}")

        print()

        # Q2. Generate Subsets (leetcode 78)
        print("Q1. Generate Subsets:")

        nums = [1, 2, 3]

        result = TakeDontTake.Subsets.generate_subsets(nums)

        print(f"Input: {nums}")
        print(f"Subsets: {result}")

        print()

    @staticmethod
    def combinations():
        # Q1. Generate Combinations from Array
        print("Q1. Generate Combinations from Array:")

        nums = [1, 2, 3, 4]
        r = 2

        result = Combinations.generate_combinations(
            nums,
            r
        )

        print(f"Input: {nums}")
        print(f"r = {r}")
        print(f"Combinations: {result}")

        print()

        # Q2. Generate Combinations from 1 to n (leetcode 77)
        print("Q2. Generate Combinations from 1 to n:")

        n = 4
        r = 2

        result = Combinations.generate_combinations_n(
            n,
            r
        )

        print(f"n = {n}")
        print(f"r = {r}")
        print(f"Combinations: {result}")

        print()


def __run_section(func: callable):
    print(
        f"##### Backtracking "
        f"({func.__name__.replace('_', ' ').title()}) #####"
    )

    func()

    print()


if __name__ == "__main__":

    functions = [
        Solutions.take_dont_take,
        Solutions.combinations,
    ]

    for func in functions:
        __run_section(func)