from Sorting import *

if __name__ == "__main__":
    # Selection Sort => Iterative
    print("Selection Sort: Iterative")
    arr = [3, 4, 2, 1]
    print(f"Array before sorting: {arr}")
    SelectionSort.iterative_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Selection Sort => Recursive
    print("Selection Sort: Recursive")
    arr = [3, 4, 2, 1]
    print(f"Array before sorting: {arr}")
    SelectionSort.recursive_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Insertion Sort => Iterative
    print("Insertion Sort: Iterative")
    arr = [3, 4, 2, 1]
    print(f"Array before sorting: {arr}")
    InsertionSort.iterative_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Insertion Sort => Recursive
    print("Insertion Sort: Recursive")
    arr = [3, 4, 2, 1]
    print(f"Array before sorting: {arr}")
    InsertionSort.recursive_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Bubble Sort => Iterative
    print("Bubble Sort: Iterative")
    arr = [3, 4, 2, 1]
    print(f"Array before sorting: {arr}")
    BubbleSort.iterative_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Bubble Sort => Recursive
    print("Bubble Sort: Recursive")
    arr = [3, 4, 2, 1]
    print(f"Array before sorting: {arr}")
    BubbleSort.recursive_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Merge Sort => Iterative
    print("Merge Sort: Iterative")
    arr = [1, 0, 2, 9, 3, 8, 4, 8]
    print(f"Array before sorting: {arr}")
    MergeSort.iterative_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Merge Sort => Recursive
    print("Merge Sort: Recursive")
    arr = [3, 4, 2, 1, 0]
    print(f"Array before sorting: {arr}")
    MergeSort.recursive_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Quick Sort => Iterative
    print("Quick Sort: Iterative")
    arr = [1, 0, 2, 9, 3, 8, 4, 8]
    print(f"Array before sorting: {arr}")
    QuickSort.iterative_sort(arr)
    print(f"Array after sorting: {arr}\n")

    # Quick Sort => Recursive
    print("Quick Sort: Recursive")
    arr = [1, 0, 2, 9, 3, 8, 4, 8]
    print(f"Array before sorting: {arr}")
    QuickSort.recursive_sort(arr)
    print(f"Array after sorting: {arr}\n")