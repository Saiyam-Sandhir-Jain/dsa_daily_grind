from collections.abc import Callable
from dataclasses import dataclass

class Solutions:

    @staticmethod
    def bubble_sort() -> None:
        pass

    @staticmethod
    def selection_sort() -> None:
        pass

    @staticmethod
    def insertion_sort() -> None:
        pass

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