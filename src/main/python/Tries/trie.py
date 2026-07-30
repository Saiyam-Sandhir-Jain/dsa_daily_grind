from __future__ import annotations

class TrieNode:
    def __init__(self, end_char:bool = False) -> None:
        self.map = dict()
        self.end_char = end_char

    def get(self, char:str) -> TrieNode:
        return self.map.get(char)

    def get_or_modify(self, char:str) -> TrieNode:
        if char not in self.map:
            self.map[char] = TrieNode()
        return self.map[char]

class Trie:
    def __init__(self) -> None:
        self.root = TrieNode()

    def insert(self, word:str) -> None:
        if (len(word) == 0):
            self.root.end_char = True
            return
        
        currNode = self.root.get_or_modify(word[0])
        for i in range(1, len(word)):
            currNode = currNode.get_or_modify(word[i])
        currNode.end_char = True

    def search(self, word:str) -> bool:
        currNode = self.root
        for char in word:
            if currNode is None:
                return False
            currNode = currNode.get(char)

        return currNode.end_char

    def prefix_search(self, prefix:str) -> bool:
        currNode = self.root
        for char in prefix:
            if currNode is None:
                return False
            currNode = currNode.get(char)

        return True
