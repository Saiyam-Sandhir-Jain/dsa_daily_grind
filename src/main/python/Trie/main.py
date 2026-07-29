from Trie import Trie

if __name__ == "__main__":
    word_list = ["apple", "apps", "banana", "banned", ""]
    trie = Trie()

    for word in word_list:
        trie.insert(word)

    print(trie.search("apple"))
    print(trie.search(""))
    print(trie.search("ban"))
    print(trie.prefix_search("app"))
    print(trie.prefix_search(""))
    print(trie.prefix_search("ban"))