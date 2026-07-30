class BubbleSort:

    @staticmethod
    def __bubble_pass(arr: list[int], end: int) -> bool:
        swapped = False

        for j in range(end):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True

        return swapped

    @staticmethod
    def __recursive_sort(arr: list[int], end: int) -> None:
        if end <= 0:
            return

        if not BubbleSort.__bubble_pass(arr, end):
            return

        BubbleSort.__recursive_sort(arr, end - 1)

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        BubbleSort.__recursive_sort(arr, len(arr) - 1)

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        for end in range(len(arr) - 1, 0, -1):
            if not BubbleSort.__bubble_pass(arr, end):
                return