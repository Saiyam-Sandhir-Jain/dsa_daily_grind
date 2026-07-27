from collections import deque

class Medium:

    class Number_of_Provinces:

        def __init__(self, n: int):
            self._visited = [False] * n

        def _bfs_traversal(self, adj_matrix: list[list[int]], start: int) -> None:
            n = len(adj_matrix)

            q = deque([start])
            self._visited[start] = True

            while q:
                curr = q.popleft()

                for node in range(n):
                    if (
                        adj_matrix[curr][node] == 1
                        and not self._visited[node]
                    ):
                        self._visited[node] = True
                        q.append(node)

        @staticmethod
        def calculate(adj_matrix: list[list[int]]) -> int:
            n = len(adj_matrix)

            solver = Medium.Number_of_Provinces(n)

            provinces = 0

            for node in range(n):
                if not solver._visited[node]:
                    solver._bfs_traversal(adj_matrix, node)
                    provinces += 1

            return provinces