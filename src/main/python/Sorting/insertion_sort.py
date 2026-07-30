class InsertionSort:

    @staticmethod
    def __insert(arr: list[int], idx: int) -> None:
        temp = arr[idx]
        j = idx - 1

        while j >= 0 and arr[j] > temp:
            arr[j + 1] = arr[j]
            j -= 1

        arr[j + 1] = temp

    @staticmethod
    def __recursive_sort(arr: list[int], idx: int) -> None:
        if idx >= len(arr):
            return

        InsertionSort.__insert(arr, idx)
        InsertionSort.__recursive_sort(arr, idx + 1)

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        InsertionSort.__recursive_sort(arr, 1)

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        for idx in range(1, len(arr)):
            InsertionSort.__insert(arr, idx)