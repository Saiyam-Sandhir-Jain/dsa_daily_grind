class InsertionSort:
    @staticmethod
    def __recursive_sort(arr:list[int], length:int, i:int) -> None:
        if i >= length:
            return

        j, temp = i-1, arr[i]
        while (j >= 0 and arr[j] > temp):
            arr[j+1] = arr[j]
            j -= 1
        if (j+1 != i):
            arr[j+1] = temp

        InsertionSort.__recursive_sort(arr, length, i+1)

    @staticmethod
    def recursive_sort(arr:list[int]) -> None:
        InsertionSort.__recursive_sort(arr, len(arr), 1)

    @staticmethod
    def iterative_sort(arr:list[int]) -> None:
        for i in range(1, len(arr)):
            j, temp = i-1, arr[i]
            while (j >= 0 and arr[j] > temp):
                arr[j+1] = arr[j]
                j -= 1
            if (j+1 != i):
                arr[j+1] = temp