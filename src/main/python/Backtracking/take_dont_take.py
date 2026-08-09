class TakeDontTake:

    class BinaryString:

        @staticmethod
        def generate_binary_strings(n: int) -> list[str]:
            result: list[str] = []

            def __backtracking(
                result: list[str],
                state: list[str],
                n: int
            ):
                if n <= 0:
                    result.append("".join(state))
                    return

                # Choice 0
                state.append('0')
                __backtracking(result, state, n - 1)
                state.pop()

                # Choice 1
                state.append('1')
                __backtracking(result, state, n - 1)
                state.pop()

            __backtracking(result, [], n)

            return result

    class Subsets:

        @staticmethod
        def generate_subsets(
                nums: list[int]
        ) -> list[list[int]]:

            result: list[list[int]] = []

            def __backtracking(
                state: list[int],
                idx: int
            ):
                if idx == len(nums):
                    result.append(state.copy())
                    return

                # Take nums[idx]
                state.append(nums[idx])
                __backtracking(state, idx + 1)
                state.pop()

                # Do not take nums[idx]
                __backtracking(state, idx + 1)

            __backtracking([], 0)

            return result