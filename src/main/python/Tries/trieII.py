from __future__ import annotations

class TrieNode:
    def __init__(self) -> None:
        self.map: dict[str, TrieNode] = {}
        self.prefix_count = 0
        self.end_count = 0

    def get(self, char: str) -> TrieNode | None:
        return self.map.get(char)

    def get_or_modify(self, char: str) -> TrieNode:
        if char not in self.map:
            self.map[char] = TrieNode()

        self.map[char].prefix_count += 1
        return self.map[char]


class TrieII:
    def __init__(self) -> None:
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        curr_node = self.root

        for char in word:
            curr_node = curr_node.get_or_modify(char)

        curr_node.end_count += 1

    def count_word_equal_to(self, word: str) -> int:
        curr_node = self.root

        for char in word:
            if curr_node is None:
                return 0
            curr_node = curr_node.get(char)

        return 0 if curr_node is None else curr_node.end_count

    def count_starting_with(self, prefix: str) -> int:
        curr_node = self.root

        for char in prefix:
            if curr_node is None:
                return 0
            curr_node = curr_node.get(char)

        return 0 if curr_node is None else curr_node.prefix_count

    def erase(self, word: str) -> None:
        if self.count_word_equal_to(word) == 0:
            return

        curr_node = self.root

        for char in word:
            curr_node = curr_node.get(char)
            curr_node.prefix_count -= 1

        curr_node.end_count -= 1