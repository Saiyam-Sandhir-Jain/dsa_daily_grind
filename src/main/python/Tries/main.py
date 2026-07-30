from Tries import Trie

if __name__ == "__main__":
    # Tries Implementation (Hash Map)
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