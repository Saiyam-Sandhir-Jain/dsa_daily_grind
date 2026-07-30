class BubbleSort:
    @staticmethod
    def __recursive_sort(arr:list[int], length:int, i:int) -> None:
        if i <= 0:
            return

        swapped = False
        for j in range(0, i):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True

        if not swapped:
            return

        BubbleSort.__recursive_sort(arr, length, i-1)

    @staticmethod
    def recursive_sort(arr:list[int]) -> None:
        BubbleSort.__recursive_sort(arr, len(arr), len(arr)-1)

            

    @staticmethod
    def iterative_sort(arr:list[int]) -> None:
        for i in range(len(arr)-1, 0, -1):
            swapped = False
            for j in range(0, i):
                if arr[j] > arr[j+1]:
                    arr[j], arr[j+1] = arr[j+1], arr[j]
                    swapped = True
            if not swapped:
                return