from Graphs import Easy, Medium, Hard

class Solutions:
    @staticmethod
    def easy() -> None:
        # BFS Traversal
        print("BFS Traversal on a Graph")
        n = 5
        E = [
            [1, 2],       # 0
            [0, 2, 3, 4], # 1
            [0, 1],       # 2
            [1, 4],       # 3
            [1, 3]        # 4
        ]
        initial_node = 4
        print(f"With initial node as {initial_node} the bfs traversal gives the following list: {Easy.bfs_traversal(n, E, initial_node)}\n")

        # DFS Traversal
        print("DFS Traversal on a Graph")
        n = 6
        E = [
            [1, 2],    # 0
            [0, 3, 4], # 1
            [0, 5],    # 2
            [1],       # 3
            [1],       # 4
            [2]        # 5
        ]
        initial_node = 2
        print(f"With initial node as {initial_node} the dfs traversal gives the following list: {Easy.dfs_traversal(n, E, initial_node)}\n")

    @staticmethod
    def medium() -> None:
        # Number of Provinces (leetcode: 547)
        print("Number of Provices")
        adj_matrix = [
            [1, 1, 0], # 0
            [1, 1, 0], # 1
            [0, 0, 1]
        ]
        print(f"The number of provinces are: {Medium.Number_of_Provinces.calculate(adj_matrix)}\n")

    @staticmethod
    def hard() -> None:
        pass

if __name__ == "__main__" :
    print("##### Easy Solutions #####");
    Solutions.easy();
        
    print("##### Medium Solutions #####");
    Solutions.medium();

    print("##### Hard Solutons #####");
    Solutions.hard();