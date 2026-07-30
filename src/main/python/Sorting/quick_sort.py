class QuickSort:

    @staticmethod
    def __partition(arr: list[int], start: int, end: int) -> int:
        pivot = arr[start]
        i = start + 1
        j = end

        while True:

            while i <= end and arr[i] < pivot:
                i += 1

            while j > start and arr[j] > pivot:
                j -= 1

            if i >= j:
                break

            arr[i], arr[j] = arr[j], arr[i]
            i += 1
            j -= 1

        arr[start], arr[j] = arr[j], arr[start]
        return j

    @staticmethod
    def __recursive_sort(arr: list[int], start: int, end: int) -> None:
        if start >= end:
            return

        pivot = QuickSort.__partition(arr, start, end)

        QuickSort.__recursive_sort(arr, start, pivot - 1)
        QuickSort.__recursive_sort(arr, pivot + 1, end)

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        QuickSort.__recursive_sort(arr, 0, len(arr) - 1)

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        stack = [(0, len(arr) - 1)]

        while stack:
            start, end = stack.pop()

            if start >= end:
                continue

            pivot = QuickSort.__partition(arr, start, end)

            stack.append((start, pivot - 1))
            stack.append((pivot + 1, end))