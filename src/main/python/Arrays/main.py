from Arrays import Easy

class Solutions:
    @staticmethod
    def easy() -> None:
        # Get Pascal's Triangle element
        row, col = 5, 3
        print(
            f"The element in Pascal's Triangle at row {row} and column {col}: "
            f"{Easy.get_pascals_triangle_element(row, col)}\n"
        )

        # Print Pascal's Triangle row
        row = 5
        print(f"Pascal's Triangle row {row}: ", end="")
        Easy.print_pascals_triangle_row(row)
        print()

        # Generate Pascal's Triangle
        rows = 5
        print(f"Pascal's Triangle ({rows} rows):")

        triangle = Easy.generate_pascals_triangle(rows)

        for row in triangle:
            print(*row)
        print()

    @staticmethod
    def medium() -> None:
        pass

    @staticmethod
    def hard() -> None:
        pass


if __name__ == "__main__":
    print("##### Easy Solutions #####")
    Solutions.easy()

    print("##### Medium Solutions #####")
    Solutions.medium()

    print("##### Hard Solutions ######")
    Solutions.hard()