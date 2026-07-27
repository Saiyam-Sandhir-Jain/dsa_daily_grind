class QuickSort:

    @classmethod
    def _recursive_sort(cls, arr: list[int], s: int, e: int) -> None:
        if s >= e:
            return
        
        pivot = arr[s]
        i, j = s + 1, e

        while i <= j:
            while i <= e and arr[i] <= pivot:
                i += 1
            while j > s and arr[j] >= pivot:
                j -= 1
            if i <= j:
                arr[i], arr[j] = arr[j], arr[i]

        arr[s], arr[j] = arr[j], arr[s]

        # Recursively sort halves
        cls._recursive_sort(arr, s, j - 1)  # left half
        cls._recursive_sort(arr, j + 1, e)  # right half

    @classmethod
    def recursive_sort(cls, arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        cls._recursive_sort(arr, 0, len(arr) - 1)

    @classmethod
    def iterative_sort(cls, arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        stack = [(0, len(arr) - 1)]

        while len(stack) > 0:
            s, e = stack.pop()

            if s >= e:
                continue

            pivot = arr[s]
            i, j = s + 1, e

            while i <= j:
                while i <= e and arr[i] <= pivot:
                    i += 1
                while j > s and arr[j] >= pivot:
                    j -= 1
                if i <= j:
                    arr[i], arr[j] = arr[j], arr[i]

            arr[s], arr[j] = arr[j], arr[s]

            stack.append((s, j - 1))
            stack.append((j + 1, e))

