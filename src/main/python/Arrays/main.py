from Arrays import Easy

class Solutions:
    @staticmethod
    def easy() -> None:
        # Get pascal's triangle's element
        row, col = 5, 3
        print(f"The element in pascal's triangle at row {row} and column {col}: {Easy.get_pascals_triangle_element(row, col)}\n")

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