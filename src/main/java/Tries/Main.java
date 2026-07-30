package main.java.Tries;

public class Main {
    public static void main(String[] args) {
        // Tries Implementation (Hash Map)
        {
            Trie hashTrie = new Trie();
            String[] words = {"hello", "world", "what", "the", "hell", "whose", "apples", "and", "bananas", "are", "those", "ban", "them"};
            for (String word : words)
                hashTrie.insert(word);

            System.out.printf("The word 'apple' exits in the list: %b\n", hashTrie.search("apple"));
            System.out.printf("The word 'apples' exists in the list: %b\n", hashTrie.search("apples"));
            System.out.printf("There are words with the prefix 'ba' in the list: %b\n", hashTrie.prefixSearch("ban"));
            System.out.printf("There are words with the prefix 'thi' in the list: %b\n", hashTrie.prefixSearch("thi"));
        }
    }
}
