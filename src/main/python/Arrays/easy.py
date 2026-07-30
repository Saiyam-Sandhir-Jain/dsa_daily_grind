class Easy:
    @staticmethod
    def get_pascals_triangle_element(row:int, col:int) -> int:
        n, m = row-1, col-1
        element = 1
        for i in range(0, m):
            element *= n-i
            element //= i+1

        return element