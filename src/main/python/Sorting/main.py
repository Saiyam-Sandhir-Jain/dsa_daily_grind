from Sorting import QuickSort

if __name__ == "__main__":
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