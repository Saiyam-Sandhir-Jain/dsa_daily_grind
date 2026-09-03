from .utility import swap


class BubbleSort:

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        for end in range(len(arr), 1, -1):
            swapped = False

            for i in range(1, end):
                if arr[i] < arr[i - 1]:
                    swap(arr, i, i - 1)
                    swapped = True

            if not swapped:
                break

    @staticmethod
    def __recursive_func(arr: list[int], end: int) -> None:
        if end <= 1:
            return

        swapped = False

        for i in range(1, end):
            if arr[i] < arr[i - 1]:
                swap(arr, i, i - 1)
                swapped = True

        if not swapped:
            return

        BubbleSort.__recursive_func(arr, end - 1)

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        BubbleSort.__recursive_func(arr, len(arr))