package main.java.Tries;

import java.util.Map;
import java.util.HashMap;

class TrieNode {
    private Map<Character, TrieNode> map;
    boolean isEnd;

    public TrieNode() {
        this.map = new HashMap<>();
        this.isEnd = false;
    }

    public TrieNode getOrModify(char c) {
        return this.map.computeIfAbsent(c, k -> new TrieNode());
    }

    public TrieNode get(char c) {
        return this.map.get(c);
    }
}

public class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {          
        TrieNode currNode = this.root;
        for (int i = 0; i < word.length(); i++) {
            currNode = currNode.getOrModify(word.charAt(i));
        } currNode.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode currNode = this.root;
        for (int i = 0; i < word.length() && currNode != null; i++) {
            currNode = currNode.get(word.charAt(i));
        }

        if (currNode == null)
            return false;
        return currNode.isEnd;
    }

    public boolean prefixSearch(String prefix) {
        TrieNode currNode = this.root;
        for (int i = 0; i < prefix.length() && currNode != null; i++) {
            currNode = currNode.get(prefix.charAt(i));
        }

        return currNode != null;
    }
}
