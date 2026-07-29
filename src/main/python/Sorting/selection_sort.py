import sys

class SelectionSort:
    @staticmethod
    def iterative_sort(arr:list[int]) -> None:
        min_value = -sys.maxsize-1