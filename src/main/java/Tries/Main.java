package main.java.Tries;

class Solutions {
    public static void TrieHashMap() {
        Trie hashTrie = new Trie();
        String[] words = {"hello", "world", "what", "the", "hell", "whose", "apples", "and", "bananas", "are", "those", "ban", "them"};
        for (String word : words)
            hashTrie.insert(word);

        System.out.printf("The word 'apple' exits in the list: %b\n", hashTrie.search("apple"));
        System.out.printf("The word 'apples' exists in the list: %b\n", hashTrie.search("apples"));
        System.out.printf("There are words with the prefix 'ba' in the list: %b\n", hashTrie.prefixSearch("ban"));
        System.out.printf("There are words with the prefix 'thi' in the list: %b\n", hashTrie.prefixSearch("thi"));
    }
    

    public static void TrieIIHashMap() {
        TrieII hashTrieII = new TrieII();
        String[] words = {"hello", "world", "what", "the", "hell", "whose", "apples", "and", "bananas", "are", "those", "ban", "them"};
        for (String word : words)
            hashTrieII.insert(word);

        System.out.printf("The word 'apple' exits in the list: %d\n", hashTrieII.countWordEqualTo("apple"));
        System.out.printf("The word 'apples' exists in the list: %d\n", hashTrieII.countWordEqualTo("apples"));
        System.out.printf("There are words with the prefix 'ba' in the list: %d\n", hashTrieII.countStartingWith("ban"));
        System.out.printf("There are words with the prefix 'thi' in the list: %d\n", hashTrieII.countStartingWith("thi"));
    }
}

public class Main {
    public static void main(String[] args) {
        // Tries Implementation (Hash Map)
        Solutions.TrieHashMap();
        System.out.println();

        // TrieII Implementation (Hash Map)
        Solutions.TrieIIHashMap();
        System.out.println();
    }
}
