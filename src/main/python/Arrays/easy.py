class Easy:
    @staticmethod
    def get_pascals_triangle_element(row: int, col: int) -> int:
        n, m = row - 1, col - 1
        element = 1

        for i in range(m):
            element *= (n - i)
            element //= (i + 1)

        return element

    @staticmethod
    def print_pascals_triangle_row(row: int) -> None:
        n = row - 1
        element = 1

        for i in range(row):
            print(element, end=" ")
            element *= (n - i)
            element //= (i + 1)

        print()

    @staticmethod
    def generate_pascals_triangle(num_rows: int) -> list[list[int]]:
        if num_rows <= 0:
            return []

        triangle = [[1]]

        for row_idx in range(1, num_rows):
            row = [1]
            prev_row = triangle[row_idx - 1]

            for j in range(row_idx - 1):
                row.append(prev_row[j] + prev_row[j + 1])

            row.append(1)
            triangle.append(row)

        return triangle