class SelectionSort:
    @staticmethod
    def __recursive_sort(arr:list[int], length:int, i:int) -> None:
        if (i >= length-1):
            return

        min_val, min_idx = arr[i], i
        for j in range(i+1, length):
            if (arr[j] < min_val):
                min_val = arr[j]
                min_idx = j
        if min_idx != i:
            arr[i], arr[min_idx] = arr[min_idx], arr[i]

        SelectionSort.__recursive_sort(arr, length, i+1)

    @staticmethod
    def recursive_sort(arr:list[int]) -> None:
        SelectionSort.__recursive_sort(arr, len(arr), 0)

    @staticmethod
    def iterative_sort(arr:list[int]) -> None:
        for i in range(0, len(arr)-1):
            min_val, min_idx = arr[i], i
            for j in range(i+1, len(arr)):
                if (arr[j] < min_val):
                    min_val = arr[j]
                    min_idx = j
            if min_idx != i:
                arr[i], arr[min_idx] = arr[min_idx], arr[i]