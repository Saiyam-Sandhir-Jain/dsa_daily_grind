class InsertionSort:

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        for i in range(1, len(arr)):
            j = i - 1
            temp = arr[i]

            while j >= 0 and arr[j] > temp:
                arr[j + 1] = arr[j]
                j -= 1

            arr[j + 1] = temp

    @staticmethod
    def recursive_func(arr: list[int], i: int) -> None:
        if i >= len(arr):
            return

        j = i - 1
        temp = arr[i]

        while j >= 0 and arr[j] > temp:
            arr[j + 1] = arr[j]
            j -= 1

        arr[j + 1] = temp

        InsertionSort.recursive_func(arr, i + 1)

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        InsertionSort.recursive_func(arr, 1)