from collections.abc import Callable
from dataclasses import dataclass

from Sorting import (
    BubbleSort,
    SelectionSort,
    InsertionSort
)

class Solutions:

    @staticmethod
    def bubble_sort() -> None:
        # Iterative sort
        arr = [1, 10, -9, 0, 5, 3]
        print(f"The give array is: {arr}")
        BubbleSort.iterative_sort(arr)
        print(f"The given array after iterative bubble sort: {arr}")
        print()

        # Recursive sort
        arr = [1, 10, -9, 0, 5, 3]
        print(f"The given array is: {arr}")
        BubbleSort.recursive_sort(arr)
        print(f"The given array after recursive bubble sort: {arr}")
        

    @staticmethod
    def selection_sort() -> None:
        # Iterative sort
        arr = [1, 10, -9, 0, 5, 3]
        print(f"The give array is: {arr}")
        SelectionSort.iterative_sort(arr)
        print(f"The given array after iterative selection sort: {arr}")
        print()

        # Recursive sort
        arr = [1, 10, -9, 0, 5, 3]
        print(f"The given array is: {arr}")
        SelectionSort.recursive_sort(arr)
        print(f"The given array after recursive selection sort: {arr}")

    @staticmethod
    def insertion_sort() -> None:
        # Iterative sort
        arr = [1, 10, -9, 0, 5, 3]
        print(f"The give array is: {arr}")
        InsertionSort.iterative_sort(arr)
        print(f"The given array after iterative insertion sort: {arr}")
        print()

        # Recursive sort
        arr = [1, 10, -9, 0, 5, 3]
        print(f"The given array is: {arr}")
        InsertionSort.recursive_sort(arr)
        print(f"The given array after recursive insertion sort: {arr}")

    @staticmethod
    def merge_sort() -> None:
        pass

    @staticmethod
    def quick_sort() -> None:
        pass

@dataclass
class Section:

    title: str
    action: Callable[[], None]

def __run_section(section: Section) -> None:
    print(f"##### {section.title} #####")
    section.action()
    print()

def main() -> None:
    functions = [
        Solutions.bubble_sort,
        Solutions.selection_sort,
        Solutions.insertion_sort,
        Solutions.merge_sort,
        Solutions.quick_sort
    ]

    for function in functions:
        __run_section(
            Section(
                function.__name__.replace("_", " ").title(), 
                function
            )
        )
    
if __name__ == "__main__":
    main()