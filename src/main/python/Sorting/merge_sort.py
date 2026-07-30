class MergeSort:

    @staticmethod
    def __recursive_sort(arr: list[int], start: int, end: int) -> None:
        if start >= end:
            return

        mid = start + (end - start) // 2

        MergeSort.__recursive_sort(arr, start, mid)
        MergeSort.__recursive_sort(arr, mid + 1, end)

        right_half = arr[mid + 1:end + 1]

        l_ptr = mid
        r_ptr = len(right_half) - 1
        updater = end

        while l_ptr >= start and r_ptr >= 0:
            if right_half[r_ptr] >= arr[l_ptr]:
                arr[updater] = right_half[r_ptr]
                r_ptr -= 1
            else:
                arr[updater] = arr[l_ptr]
                l_ptr -= 1
            updater -= 1

        while r_ptr >= 0:
            arr[updater] = right_half[r_ptr]
            r_ptr -= 1
            updater -= 1

    @staticmethod
    def recursive_sort(arr: list[int]) -> None:
        if len(arr) <= 1:
            return

        MergeSort.__recursive_sort(arr, 0, len(arr) - 1)

    @staticmethod
    def __iterative_merge(arr: list[int], start: int, mid: int, end: int) -> None:
        right_half = arr[mid + 1:end + 1]

        l_ptr = mid
        r_ptr = len(right_half) - 1
        updater = end

        while l_ptr >= start and r_ptr >= 0:
            if right_half[r_ptr] >= arr[l_ptr]:
                arr[updater] = right_half[r_ptr]
                r_ptr -= 1
            else:
                arr[updater] = arr[l_ptr]
                l_ptr -= 1
            updater -= 1

        while r_ptr >= 0:
            arr[updater] = right_half[r_ptr]
            r_ptr -= 1
            updater -= 1

    @staticmethod
    def iterative_sort(arr: list[int]) -> None:
        n = len(arr)

        size = 1
        while size < n:

            left = 0
            while left < n:

                mid = min(left + size - 1, n - 1)
                right = min(left + 2 * size - 1, n - 1)

                if mid < right:
                    MergeSort.__iterative_merge(arr, left, mid, right)

                left += 2 * size

            size *= 2