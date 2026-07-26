from collections import deque

class Easy:

    @staticmethod
    def bfs_traversal(n:int, E:list[list[int]], initial_node:int) -> list:
        bfs_list = []

        if initial_node >= n:
            return bfs_list

        bfs_queue = deque()
        visited = [False]*n

        bfs_queue.append(initial_node)
        visited[initial_node] = True
        while bfs_queue:
            curr_node = bfs_queue.popleft()
            for node in E[curr_node]:
                if not visited[node]:
                    visited[node] = True
                    bfs_queue.append(node)
            bfs_list.append(curr_node)

        return bfs_list

    @staticmethod
    def dfs_traversal(n:int, E:list[list[int]], initial_node:int) -> list:
        dfs_list = []

        if initial_node >= n:
            return dfs_list

        stack = []
        visited = [False]*n

        stack.append(initial_node)
        visited[initial_node] = True
        while stack:
            curr_node = stack.pop()
            for node in E[curr_node]:
                if not visited[node]:
                    stack.append(node)
                    visited[node] = True
            dfs_list.append(curr_node)

        return dfs_list

    @staticmethod
    def count_connected_components() -> int:
        pass