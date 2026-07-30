from Sorting import *
from typing import Callable

SortFunction = Callable[[list[int]], None]


def __print_arr(arr: list[int], sorting_func: SortFunction) -> None:
    print(f"Array before sorting: {arr}")
    sorting_func(arr)
    print(f"Array after sorting: {arr}\n")


if __name__ == "__main__":
    print("Selection Sort: Iterative")
    __print_arr([3, 4, 2, 1], SelectionSort.iterative_sort)

    print("Selection Sort: Recursive")
    __print_arr([3, 4, 2, 1], SelectionSort.recursive_sort)

    print("Insertion Sort: Iterative")
    __print_arr([3, 4, 2, 1], InsertionSort.iterative_sort)

    print("Insertion Sort: Recursive")
    __print_arr([3, 4, 2, 1], InsertionSort.recursive_sort)

    print("Bubble Sort: Iterative")
    __print_arr([3, 4, 2, 1], BubbleSort.iterative_sort)

    print("Bubble Sort: Recursive")
    __print_arr([3, 4, 2, 1], BubbleSort.recursive_sort)

    print("Merge Sort: Iterative")
    __print_arr([1, 0, 2, 9, 3, 8, 4, 8], MergeSort.iterative_sort)

    print("Merge Sort: Recursive")
    __print_arr([3, 4, 2, 1, 0], MergeSort.recursive_sort)

    print("Quick Sort: Iterative")
    __print_arr([1, 0, 2, 9, 3, 8, 4, 8], QuickSort.iterative_sort)

    print("Quick Sort: Recursive")
    __print_arr([1, 0, 2, 9, 3, 8, 4, 8], QuickSort.recursive_sort)