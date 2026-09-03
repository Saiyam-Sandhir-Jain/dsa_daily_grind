from .utility import swap

class SelectionSort:

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        for p in range(0, len(arr)-1):
            min_val_idx = p
            for i in range(min_val_idx+1, len(arr)):
                if (arr[i] < arr[min_val_idx]):
                    min_val_idx = i

            if min_val_idx != p:
                swap(arr, min_val_idx, p)
        
    @staticmethod
    def __recursive_sort(arr: list[int], p: int) -> None:
        if p >= len(arr)-1:
            return

        min_val_idx = p
        for i in range(min_val_idx+1, len(arr)):
            if (arr[i] < arr[min_val_idx]):
                min_val_idx = i

        if min_val_idx != p:
            swap(arr, min_val_idx, p)

        SelectionSort.__recursive_sort(arr, p+1)

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        SelectionSort.__recursive_sort(arr, 0)