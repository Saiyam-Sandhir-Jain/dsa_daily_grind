class SelectionSort:

    @staticmethod
    def __select(arr: list[int], start: int) -> None:
        min_idx = start

        for j in range(start + 1, len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j

        if min_idx != start:
            arr[start], arr[min_idx] = arr[min_idx], arr[start]

    @staticmethod
    def __recursive_sort(arr: list[int], start: int) -> None:
        if start >= len(arr) - 1:
            return

        SelectionSort.__select(arr, start)
        SelectionSort.__recursive_sort(arr, start + 1)

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        SelectionSort.__recursive_sort(arr, 0)

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        for start in range(len(arr) - 1):
            SelectionSort.__select(arr, start)