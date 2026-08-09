class Combinations:

    @staticmethod
    def generate_combinations(
        nums: list[int],
        r: int
    ) -> list[list[int]]:

        result: list[list[int]] = []

        def __backtracking(
            state: list[int],
            idx: int,
            r: int
        ):
            # Successfully selected r elements
            if r == 0:
                result.append(state.copy())
                return

            # Ran out of elements before selecting r
            if idx >= len(nums):
                return

            for i in range(idx, len(nums)):
                state.append(nums[i])

                __backtracking(
                    state,
                    i + 1,
                    r - 1
                )

                state.pop()

        __backtracking([], 0, r)

        return result

    @staticmethod
    def generate_combinations_n(
        n: int,
        r: int
    ) -> list[list[int]]:

        nums: list[int] = []

        for i in range(1, n + 1):
            nums.append(i)

        return Combinations.generate_combinations(nums, r)