from __future__ import annotations


class TrieNode:
    def __init__(self, end_char: bool = False) -> None:
        self.map: dict[str, TrieNode] = {}
        self.end_char = end_char

    def get(self, char: str) -> TrieNode | None:
        return self.map.get(char)

    def get_or_modify(self, char: str) -> TrieNode:
        if char not in self.map:
            self.map[char] = TrieNode()
        return self.map[char]


class Trie:
    def __init__(self) -> None:
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        curr_node = self.root

        for char in word:
            curr_node = curr_node.get_or_modify(char)

        curr_node.end_char = True

    def search(self, word: str) -> bool:
        curr_node = self.root

        for char in word:
            if curr_node is None:
                return False
            curr_node = curr_node.get(char)

        return curr_node is not None and curr_node.end_char

    def prefix_search(self, prefix: str) -> bool:
        curr_node = self.root

        for char in prefix:
            if curr_node is None:
                return False
            curr_node = curr_node.get(char)

        return curr_node is not None