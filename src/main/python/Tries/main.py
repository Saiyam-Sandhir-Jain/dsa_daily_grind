from Tries import Trie, TrieII

class Solutions:
    @staticmethod
    def trie_hash_map() -> None:
        trie = Trie()

        words = [
            "hello", "world", "what", "the", "hell",
            "whose", "apples", "and", "bananas",
            "are", "those", "ban", "them"
        ]

        for word in words:
            trie.insert(word)

        print(f"The word 'apple' exists in the list: {trie.search('apple')}")
        print(f"The word 'apples' exists in the list: {trie.search('apples')}")
        print(f"There are words with the prefix 'ban' in the list: {trie.prefix_search('ban')}")
        print(f"There are words with the prefix 'thi' in the list: {trie.prefix_search('thi')}")

    @staticmethod
    def trie_ii_hash_map() -> None:
        trie = TrieII()

        words = [
            "hello", "world", "what", "the", "hell",
            "whose", "apples", "and", "bananas",
            "are", "those", "ban", "them"
        ]

        for word in words:
            trie.insert(word)

        print(f"The word 'apple' occurs: {trie.count_word_equal_to('apple')}")
        print(f"The word 'apples' occurs: {trie.count_word_equal_to('apples')}")
        print(f"Words starting with 'ban': {trie.count_starting_with('ban')}")
        print(f"Words starting with 'thi': {trie.count_starting_with('thi')}")


if __name__ == "__main__":
    # Trie Implementation (Hash Map)
    Solutions.trie_hash_map()

    print()

    # Trie II Implementation (Hash Map)
    Solutions.trie_ii_hash_map()